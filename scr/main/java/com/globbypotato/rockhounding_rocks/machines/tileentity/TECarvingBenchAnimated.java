package com.globbypotato.rockhounding_rocks.machines.tileentity;

import java.util.ArrayList;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.utils.CoreUtils;
import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;
import com.globbypotato.rockhounding_rocks.machines.recipes.CarvingBenchRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CarvingBenchRecipe;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TECarvingBenchAnimated extends TileEntityIO{

    public int rotation;

	public TECarvingBenchAnimated() {
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
		return "carving_bench_animated";
	}



	//----------------------- CUSTOM -----------------------
	public int getRolling(){
		return this.rotation;
	}

	public int getCooktimeMax(){
		return 100;
	}



	//----------------------- RECIPE -----------------------
	public ArrayList<CarvingBenchRecipe> recipeList(){
		return CarvingBenchRecipes.carving_bench_recipes;
	}

	public CarvingBenchRecipe getRecipeList(int x){
		return recipeList().get(x);
	}

	public CarvingBenchRecipe getCurrentRecipe(){
		if(!platformInput().isEmpty()){
			for(int x = 0; x < recipeList().size(); x++){
				if(CoreUtils.isMatchingIngredient(platformInput(), getRecipeList(x).getInput())){
					if(hasValidTools()){
						if(getRecipeList(x).getPattern() == getRack().patternSlot().getItemDamage()){
							return getRecipeList(x);
						}
					}
				}
			}
		}
		return null;
	}

	public boolean isValidRecipe() {
		return getCurrentRecipe() != null;
	}

	private ItemStack recipeOutput() {
		return isValidRecipe() ? getCurrentRecipe().getOutput() : ItemStack.EMPTY;
	}

	private int recipePattern() {
		return isValidRecipe() ? getCurrentRecipe().getPattern() : 0;
	}

	private boolean canStackOutput() {
		return hasPlatform() && this.output.canSetOrStack(platformOutput(), recipeOutput());
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update() {
		if(!world.isRemote){
			checkCurrentState();

			if(isValidRecipe()){
				if(canStackOutput()){
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
			}else{
				tickOff();
			}
		}
	}

	private boolean hasValidTools() {
		return hasRack() 
			&& !getRack().patternSlot().isEmpty() && getRack().patternSlot().getItem() == ModItems.PATTERN_CARDS
			&& !getRack().toolSlot().isEmpty() && getRack().toolSlot().isItemEqualIgnoreDurability(ToolUtils.dummy);
	}

	private void process() {
		int unbreakingLevel = CoreUtils.getEnchantmentLevel(Enchantments.UNBREAKING, getRack().toolSlot());
		platformGetOutput().setOrStack(TERockPlatform.OUTPUT_SLOT, recipeOutput());
		((MachineStackHandler)getRack().getInput()).damageUnbreakingSlot(unbreakingLevel, TECarvingRack.TOOL_SLOT);
		platformGetInput().decrementSlot(TERockPlatform.INPUT_SLOT);
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
			swapState(this.world, this.pos, oldFacing, EnumMachines.CARVING_BENCH.ordinal());
		}
	}

}