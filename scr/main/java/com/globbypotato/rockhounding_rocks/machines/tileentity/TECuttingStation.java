package com.globbypotato.rockhounding_rocks.machines.tileentity;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TemplateStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityFueledTank;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler.WriteMode;
import com.globbypotato.rockhounding_core.utils.CoreUtils;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CuttingStationRecipe;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.capability.templates.FluidHandlerConcatenate;
import net.minecraftforge.items.ItemStackHandler;

public class TECuttingStation extends TileEntityFueledTank{

	public static int inputSlots = 4;
	public static int outputSlots = 1;
	public static int templateSlots = 21;
	private ItemStackHandler template = new TemplateStackHandler(templateSlots);

	public static final int WATER_SLOT = 3;

	public FluidTank inputTank;

	public int cutSelector;
	public static int consumedWater = 100;

	public TECuttingStation() {
		super(inputSlots, outputSlots, templateSlots);

		this.inputTank = new FluidTank(Fluid.BUCKET_VOLUME * 10){
			@Override
			public boolean canFillFluidType(FluidStack fluid){
		        return fluid.getFluid() == FluidRegistry.WATER;
			}
		};
		this.inputTank.setTileEntity(this);
		this.inputTank.setCanFill(true);
		this.inputTank.setCanDrain(false);

		this.input =  new MachineStackHandler(inputSlots, this){
			@SuppressWarnings("synthetic-access")
			@Override
			public ItemStack insertItem(int slot, ItemStack insertingStack, boolean simulate){
				if (slot == fuelID() && isGatedPowerSource(insertingStack)){
					return super.insertItem(slot, insertingStack, simulate);
				}
				if(slot == INPUT_SLOT && inputHasRecipe(insertingStack) ){
					return super.insertItem(slot, insertingStack, simulate);
				}
				if(slot == CONSUMABLE_SLOT && CoreUtils.hasConsumable(ToolUtils.blade, insertingStack)){
					return super.insertItem(slot, insertingStack, simulate);
				}
				if(slot == WATER_SLOT && handleBucket(insertingStack, FluidRegistry.WATER)){
					return super.insertItem(slot, insertingStack, simulate);
				}
				return insertingStack;
			}
		};
		this.automationInput = new WrappedItemHandler(this.input, WriteMode.IN);
		this.markDirtyClient();
	}



	//----------------------- I/O -----------------------
	@Override
	public void readFromNBT(NBTTagCompound compound){
		super.readFromNBT(compound);
		this.cutSelector = compound.getInteger("CutSelector");
		this.inputTank.readFromNBT(compound.getCompoundTag("InputTank"));
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
		compound.setInteger("CutSelector", this.cutSelector);

		NBTTagCompound inputTankNBT = new NBTTagCompound();
		this.inputTank.writeToNBT(inputTankNBT);
		compound.setTag("InputTank", inputTankNBT);

		return compound;
	}

	@Override
	public FluidHandlerConcatenate getCombinedTank(){
		return new FluidHandlerConcatenate(this.lavaTank, this.inputTank);
	}



	//----------------------- SLOTS -----------------------
	public ItemStack inputSlot(){
		return this.input.getStackInSlot(INPUT_SLOT);
	}

	public ItemStack bladeSlot(){
		return this.input.getStackInSlot(CONSUMABLE_SLOT);
	}



	//----------------------- HANDLER -----------------------
	public ItemStackHandler getTemplate(){
		return this.template;
	}

	@Override
	public int getGUIHeight() {
		return 232;
	}

	public static String getName(){
		return "cutting_station";
	}

	@Override
	public int fuelID() {
		return 1;
	}



	//----------------------- CUSTOM -----------------------
	public boolean inputHasRecipe(ItemStack stack) {
		if(!stack.isEmpty()){
			for(CuttingStationRecipe recipe: CuttingStationRecipes.cutting_station_recipes){
				if(recipe.getLogic() == this.cutSelector && stack.isItemEqual(recipe.getInput())){
					return true;
				}
			}
		}
		return false;
	}

	public int getConsumedWater(){
		int efficiencyLevel = CoreUtils.getEnchantmentLevel(Enchantments.EFFICIENCY, bladeSlot());
		return efficiencyLevel > 0 ? consumedWater / efficiencyLevel : consumedWater;
	}

	public int getCookTimeMax(){
		return getMachineSpeed() > 10 ? getMachineSpeed() : 10;
	}

	public int getMachineSpeed(){
		int sharpnessLevel = CoreUtils.getEnchantmentLevel(Enchantments.SHARPNESS, bladeSlot());
        return sharpnessLevel > 0 ? ModConfig.speedCuttingStation / sharpnessLevel : ModConfig.speedCuttingStation;
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update(){
		if(!this.world.isRemote){
			handleSupplies();

			emptyContainer(WATER_SLOT, this.inputTank);

			if(!inputSlot().isEmpty()){
				if(canCarveBlock()){
					this.cooktime++;
					this.powerCount--;
					if(getCooktime() >= getCookTimeMax()) {
						this.cooktime = 0;
						carveBlock();
					}
					this.markDirtyClient();
				}else{
					tickOff();
				}
			}else{
				tickOff();
			}
		}
	}

	private void handleSupplies() {
		fuelHandler(this.input.getStackInSlot(fuelID()));
		lavaHandler();
	}

	private boolean canCarveBlock() {
		return inputHasRecipe(inputSlot())
			&& getPower() >= getCookTimeMax()
			&& CoreUtils.hasConsumable(ToolUtils.blade, bladeSlot())
			&& this.input.canDrainFluid(this.inputTank.getFluid(), waterStack(), getConsumedWater())
			&& this.output.canSetOrStack(this.output.getStackInSlot(OUTPUT_SLOT), getRecipeOutput(inputSlot()));
	}

	private static FluidStack waterStack(){
		return new FluidStack(FluidRegistry.WATER, 1000);
	}

	public ItemStack getRecipeOutput(ItemStack inputStack){
		if(!inputStack.isEmpty()){
			for(CuttingStationRecipe recipe: CuttingStationRecipes.cutting_station_recipes){
				if(recipe.getLogic() == this.cutSelector && inputStack.isItemEqual(recipe.getInput())){
					return recipe.getOutput();
				}
			}
		}
		return ItemStack.EMPTY;
	}

	private void carveBlock() {
		ItemStack recipeOutput = getRecipeOutput(inputSlot());
		int unbreakingLevel = CoreUtils.getEnchantmentLevel(Enchantments.UNBREAKING, bladeSlot());
		this.output.setOrStack(OUTPUT_SLOT, recipeOutput);
		this.input.drainOrCleanFluid(this.inputTank, getConsumedWater(), false);
		this.input.decrementSlot(INPUT_SLOT);
		this.input.damageUnbreakingSlot(unbreakingLevel, CONSUMABLE_SLOT);
	}

}