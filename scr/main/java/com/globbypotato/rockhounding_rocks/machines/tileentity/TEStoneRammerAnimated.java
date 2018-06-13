package com.globbypotato.rockhounding_rocks.machines.tileentity;

import java.util.ArrayList;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.utils.CoreUtils;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;
import com.globbypotato.rockhounding_rocks.machines.recipes.StoneRammerRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.StoneRammerRecipe;

import net.minecraft.item.ItemStack;

public class TEStoneRammerAnimated extends TileEntityIO{

	public TEStoneRammerAnimated() {
		super(0, 0, 0);
	}



	//----------------------- SLOTS -----------------------
	public ItemStack platformOutput() {
		return hasPlatform() ? outputSlot(getFacing().getOpposite()) : ItemStack.EMPTY;
	}

	public ItemStack platformInput() {
		return hasPlatform() ? inputSlot(getFacing().getOpposite()) : ItemStack.EMPTY;
	}

	public boolean hasPlatform() {
		return isValidPlatform(getFacing().getOpposite());
	}

	public MachineStackHandler platformGetInput(){
		return getPlatformInput(getFacing().getOpposite());
	}

	public MachineStackHandler platformGetOutput(){
		return getPlatformOutput(getFacing().getOpposite());
	}



	//----------------------- HANDLER -----------------------
	public static String getName(){
		return "stone_rammer_animated";
	}

	public int getCooktimeMax(){
		return 200;
	}



	//----------------------- RECIPE -----------------------
	public ArrayList<StoneRammerRecipe> recipeList(){
		return StoneRammerRecipes.stone_rammer_recipes;
	}

	public StoneRammerRecipe getRecipeList(int x){
		return recipeList().get(x);
	}

	public StoneRammerRecipe getCurrentRecipe(){
		if(!platformInput().isEmpty()){
			for(int x = 0; x < recipeList().size(); x++){
				if(CoreUtils.isMatchingIngredient(platformInput(), getRecipeList(x).getInput())){
					return getRecipeList(x);
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

	private boolean canProcess() {
		return isValidRecipe()
			&& canStackOutput();
	}

	private void process() {
		platformGetOutput().setOrStack(TERockPlatform.OUTPUT_SLOT, recipeOutput());
		platformGetInput().decrementSlot(TERockPlatform.INPUT_SLOT);
	}

	private void checkCurrentState() {
		if(!hasSpinningWheel(this.world, this.pos, isFacingAt(270))){
			int oldFacing = getFacing().getIndex();
			swapState(this.world, this.pos, oldFacing, EnumMachines.STONE_RAMMER.ordinal());
		}
	}

}