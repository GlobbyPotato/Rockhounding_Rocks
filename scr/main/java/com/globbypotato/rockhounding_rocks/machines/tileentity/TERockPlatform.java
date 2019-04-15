package com.globbypotato.rockhounding_rocks.machines.tileentity;

import java.util.ArrayList;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityInv;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler.WriteMode;
import com.globbypotato.rockhounding_rocks.machines.recipes.StoneRammerRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.StoneRammerRecipe;

import net.minecraft.item.ItemStack;

public class TERockPlatform extends TileEntityInv {

	public static int inputSlots = 1;
	public static int outputSlots = 1;

	public TERockPlatform() {
		super(inputSlots, outputSlots, 0, 0);

		this.input =  new MachineStackHandler(inputSlots, this){
			@Override
			public ItemStack insertItem(int slot, ItemStack insertingStack, boolean simulate){
				if(slot == INPUT_SLOT ){
					return super.insertItem(slot, insertingStack, simulate);
				}
				return insertingStack;
			}
		};
		this.automationInput = new WrappedItemHandler(this.input, WriteMode.IN);
	}



	// ----------------------- SLOTS -----------------------
	public ItemStack inputSlot(){
		return this.input.getStackInSlot(INPUT_SLOT);
	}
	
	public ItemStack outputSlot(){
		return this.output.getStackInSlot(OUTPUT_SLOT);
	}	



	//----------------------- HANDLER -----------------------
	public static String getName(){
		return "rock_platform";
	}



	//----------------------- RECIPE -----------------------
	public ArrayList<StoneRammerRecipe> recipeList(){
		return StoneRammerRecipes.stone_rammer_recipes;
	}

	public StoneRammerRecipe getRecipeList(int x){
		return recipeList().get(x);
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update() {
		if(!world.isRemote){
			if(!inputSlot().isEmpty() || !outputSlot().isEmpty()){
				this.markDirtyClient();
			}
		}
	}

}