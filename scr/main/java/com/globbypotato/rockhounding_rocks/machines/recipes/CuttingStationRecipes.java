package com.globbypotato.rockhounding_rocks.machines.recipes;

import net.minecraft.item.ItemStack;

public class CuttingStationRecipes {

	private ItemStack input;
	private ItemStack output;
	private int logic;

	public CuttingStationRecipes(ItemStack input, int logic, ItemStack output){
		this.input = input;
		this.output = output;
		this.logic = logic;
	}

	public ItemStack getInput(){
		return this.input.copy();
	}

	public ItemStack getOutput(){
		return this.output.copy();
	}

	public int getLogic(){
		return this.logic;
	}
}