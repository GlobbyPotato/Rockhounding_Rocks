package com.globbypotato.rockhounding_rocks.machines.tileentity;

import java.util.ArrayList;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.utils.CoreUtils;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;
import com.globbypotato.rockhounding_rocks.machines.recipes.StoneRammerRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.StoneRammerRecipe;

import net.minecraft.item.ItemStack;

public class TEStoneRammerAnimated extends TileEntityIO{

	StoneRammerRecipe currentRecipe = null;

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

	private boolean canStackOutput() {
		return hasPlatform() && this.output.canSetOrStack(platformOutput(), currentRecipe.getOutput());
	}


	//----------------------- PROCESS -----------------------
	@Override
	public void update() {
		if(!world.isRemote){
			checkCurrentState();

			if(platformInput().isEmpty()){
				currentRecipe = null;
				this.cooktime = 0;
			}

			if(currentRecipe == null){
				currentRecipe = getCurrentRecipe();
				this.cooktime = 0;
			}else{
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
			}
		}
	}

	private void process() {
		platformGetOutput().setOrStack(TERockPlatform.OUTPUT_SLOT, currentRecipe.getOutput());
		platformGetInput().decrementSlot(TERockPlatform.INPUT_SLOT);
		currentRecipe = null;
	}

	private void checkCurrentState() {
		if(!hasSpinningWheel(this.world, this.pos, isFacingAt(270))){
			int oldFacing = getFacing().getIndex();
			swapState(this.world, this.pos, oldFacing, EnumMachines.STONE_RAMMER.ordinal());
		}
	}

}