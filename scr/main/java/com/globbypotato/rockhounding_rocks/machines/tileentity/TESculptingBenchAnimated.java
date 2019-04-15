package com.globbypotato.rockhounding_rocks.machines.tileentity;

import java.util.ArrayList;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.utils.CoreUtils;
import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;
import com.globbypotato.rockhounding_rocks.machines.recipes.SculptingBenchRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.SculptingBenchRecipe;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TESculptingBenchAnimated extends TileEntityIO{

    public int rotation;
    SculptingBenchRecipe currentRecipe = null;

	public TESculptingBenchAnimated() {
		super(0, 0, 0);
	}



	//----------------------- I/O -----------------------
	@Override
	public void readFromNBT(NBTTagCompound compound){
		super.readFromNBT(compound);
		this.rotation = compound.getInteger("Rolling");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
		compound.setInteger("Rolling", getRolling());
		return compound;
	}



	//----------------------- SLOTS -----------------------
	public ItemStack platformInput() {
		return hasPlatform() ? inputSlot(getFacing()) : ItemStack.EMPTY;
	}

	public ItemStack platformOutput() {
		return hasPlatform() ? outputSlot(getFacing()) : ItemStack.EMPTY;
	}

	public boolean hasPlatform() {
		return isValidPlatform(getFacing());
	}

	public MachineStackHandler platformGetInput(){
		return getPlatformInput(getFacing());
	}

	public MachineStackHandler platformGetOutput(){
		return getPlatformOutput(getFacing());
	}



	//----------------------- HANDLER -----------------------
	public static String getName(){
		return "sculpting_bench_animated";
	}



	//----------------------- CUSTOM -----------------------
	public int getRolling(){
		return this.rotation;
	}

	public int getCooktimeMax(){
		return 100;
	}



	//----------------------- RECIPE -----------------------
	public ArrayList<SculptingBenchRecipe> recipeList(){
		return SculptingBenchRecipes.sculpting_bench_recipes;
	}

	public SculptingBenchRecipe getRecipeList(int x){
		return recipeList().get(x);
	}

	public SculptingBenchRecipe getCurrentRecipe(){
		if(!platformInput().isEmpty()){
			for(int x = 0; x < recipeList().size(); x++){
				if(CoreUtils.isMatchingIngredient(platformInput(), getRecipeList(x).getInput())){
					if(hasPattern()){
						if(getRecipeList(x).getPattern() == getRack().patternSlot().getItemDamage()){
							return getRecipeList(x);
						}
					}
				}
			}
		}
		return null;
	}

	private boolean canStackOutput() {
		return hasPlatform() && this.output.canSetOrStack(platformOutput(), currentRecipe.getOutput());
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update() {
		if(!world.isRemote){
			checkCurrentState();

			if(platformInput().isEmpty() || !hasPattern()){
				currentRecipe = null;
				this.cooktime = 0;
			}

			if(currentRecipe == null){
				currentRecipe = getCurrentRecipe();
				this.cooktime = 0;
			}else{
				if(canStackOutput() && hasDummy()){
					handleRotation();
					this.cooktime++;
					if(getCooktime() >= getCooktimeMax()) {
						this.cooktime = 0;
						process();
					}
					this.markDirtyClient();
				}else{
					tickOff();
				}
			}
		}
	}

	private boolean hasPattern() {
		return hasRack() 
			&& !getRack().patternSlot().isEmpty() && getRack().patternSlot().getItem() == ModItems.SCULPTING_CARDS;
	}

	private boolean hasDummy() {
		return hasRack() 
			&& !getRack().toolSlot().isEmpty() && getRack().toolSlot().isItemEqualIgnoreDurability(ToolUtils.dummy);
	}

	private void process() {
		int unbreakingLevel = CoreUtils.getEnchantmentLevel(Enchantments.UNBREAKING, getRack().toolSlot());
		platformGetOutput().setOrStack(TERockPlatform.OUTPUT_SLOT, currentRecipe.getOutput());
		((MachineStackHandler)getRack().getInput()).damageUnbreakingSlot(unbreakingLevel, TECarvingRack.TOOL_SLOT);
		platformGetInput().decrementSlot(TERockPlatform.INPUT_SLOT);
		currentRecipe = null;
	}

	private void handleRotation() {
		this.rotation += 7;
		if(getRolling() >= 359){
			this.rotation = 0;
		}
	}

	private void checkCurrentState() {
		if(!hasSpinningWheel(this.world, this.pos, isFacingAt(270))){
			int oldFacing = getFacing().getIndex();
			swapState(this.world, this.pos, oldFacing, EnumMachines.SCULPTING_BENCH.ordinal());
		}
	}

}