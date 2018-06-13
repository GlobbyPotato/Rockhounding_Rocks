package com.globbypotato.rockhounding_rocks.machines.recipes.io;

import net.minecraft.item.ItemStack;

public class RockVendorFee {

	private ItemStack input;
	private int output;

	public RockVendorFee(ItemStack input, int output){
		this.input = input;
		this.output = output;
	}

	public ItemStack getInput(){
		return this.input.copy();
	}

	public int getOutput() {
		return this.output;
	}

}