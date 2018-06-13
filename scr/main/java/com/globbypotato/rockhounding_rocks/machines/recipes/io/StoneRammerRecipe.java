package com.globbypotato.rockhounding_rocks.machines.recipes.io;

import net.minecraft.item.ItemStack;

public class StoneRammerRecipe {

	private ItemStack input;
	private ItemStack output;

	public StoneRammerRecipe(ItemStack input, ItemStack output){
		this.input = input;
		this.output = output;
	}

	public ItemStack getInput(){
		return this.input.copy();
	}

	public ItemStack getOutput(){
		return this.output.copy();
	}

}