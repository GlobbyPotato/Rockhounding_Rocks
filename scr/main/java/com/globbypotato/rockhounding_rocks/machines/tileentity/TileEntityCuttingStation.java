package com.globbypotato.rockhounding_rocks.machines.tileentity;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TemplateStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityMachineTank;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler.WriteMode;
import com.globbypotato.rockhounding_core.utils.CoreUtils;
import com.globbypotato.rockhounding_core.utils.FuelUtils;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.machines.gui.GuiCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.capability.templates.FluidHandlerConcatenate;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityCuttingStation extends TileEntityMachineTank{

	private ItemStackHandler template = new TemplateStackHandler(19);

	public static final int WATER_SLOT = 3;

	public FluidTank inputTank;

	public int cutSelector;
	public static int consumedWater = 50;

	public static int totInput = 4;
	public static int totOutput = 1;
	
	public TileEntityCuttingStation() {
		super(totInput, totOutput, 1);

		inputTank = new FluidTank(Fluid.BUCKET_VOLUME * 10){
			@Override
			public boolean canFillFluidType(FluidStack fluid){
		        return fluid.getFluid() == FluidRegistry.WATER;
			}
		};
		inputTank.setTileEntity(this);
		inputTank.setCanFill(true);
		inputTank.setCanDrain(false);

		input =  new MachineStackHandler(totInput, this){
			@Override
			public ItemStack insertItem(int slot, ItemStack insertingStack, boolean simulate){
				if (slot == FUEL_SLOT && CoreUtils.isPowerSource(insertingStack)){
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
		automationInput = new WrappedItemHandler(input, WriteMode.IN);
		this.markDirtyClient();
	}



	//----------------------- HANDLER -----------------------
	public ItemStackHandler getTemplate(){
		return this.template;
	}

	public int getCookTimeMax(){
		return ModConfig.speedCuttingStation;
	}

	@Override
	public int getGUIHeight() {
		return GuiCuttingStation.HEIGHT;
	}



	//----------------------- CUSTOM -----------------------
	private boolean inputHasRecipe(ItemStack stack) {
		if(stack != null){
			for(CuttingStationRecipes recipe: MachineRecipes.cuttingRecipes){
				if(recipe.getLogic() == this.cutSelector && stack.isItemEqual(recipe.getInput())){
					return true;
				}
			}
		}
		return false;
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

	public FluidHandlerConcatenate getCombinedTank(){
		return new FluidHandlerConcatenate(lavaTank, inputTank);
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update(){
		acceptEnergy();
		fuelHandler(input.getStackInSlot(FUEL_SLOT));
		lavaHandler();

		if(!worldObj.isRemote){
			emptyContainer(WATER_SLOT, inputTank);
			if(canCarveBlock()){
				cookTime++;
				powerCount--;
				if(cookTime >= getCookTimeMax()) {
					cookTime = 0;
					carveBlock();
				}
			}
			this.markDirtyClient();
		}
	}

	private boolean canCarveBlock() {
		return this.getPower() >= getCookTimeMax()
			&& (inputTank.getFluid() != null && inputTank.getFluid().getFluid() == FluidRegistry.WATER && inputTank.getFluidAmount() > consumedWater)
			&& CoreUtils.hasConsumable(ToolUtils.blade, input.getStackInSlot(CONSUMABLE_SLOT))
			&& output.canSetOrStack(output.getStackInSlot(OUTPUT_SLOT), getRecipeOutput(input.getStackInSlot(INPUT_SLOT))) 
			&& inputHasRecipe(input.getStackInSlot(INPUT_SLOT));
	}

	public ItemStack getRecipeOutput(ItemStack inputStack){
		if(inputStack != null){
			for(CuttingStationRecipes recipe: MachineRecipes.cuttingRecipes){
				if(recipe.getLogic() == this.cutSelector && inputStack.isItemEqual(recipe.getInput())){
					return recipe.getOutput();
				}
			}
		}
		return null;
	}

	private void carveBlock() {
		ItemStack recipeOutput = getRecipeOutput(input.getStackInSlot(INPUT_SLOT));
		output.setOrStack(OUTPUT_SLOT, recipeOutput);
		input.drainOrClean(inputTank, consumedWater, false);
		input.decrementSlot(INPUT_SLOT);
		input.damageSlot(CONSUMABLE_SLOT);
	}

}