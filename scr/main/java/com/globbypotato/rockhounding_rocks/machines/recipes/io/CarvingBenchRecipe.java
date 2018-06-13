package com.globbypotato.rockhounding_rocks.machines.recipes.io;

import net.minecraft.item.ItemStack;

public class CarvingBenchRecipe {

	private ItemStack input, output;
	private int pattern;

	public CarvingBenchRecipe(ItemStack input, int pattern, ItemStack output){
		this.input = input;
		this.output = output;
		this.pattern = pattern;
	}

	public ItemStack getInput(){
		return this.input.copy();
	}

	public ItemStack getOutput(){
		return this.output.copy();
	}

	public int getPattern(){
		return this.pattern;
	}

}