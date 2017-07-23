package com.globbypotato.rockhounding_rocks.machines.recipes;

import net.minecraft.item.ItemStack;

public class RockVendorFees {

	private ItemStack input;
	private int output;
	private boolean canOredict;;

	public RockVendorFees(ItemStack input, boolean canOredict, int output){
		this.input = input;
		this.output = output;
		this.canOredict = canOredict;
	}

	public ItemStack getInput(){
		return this.input.copy();
	}

	public int getOutput() {
		return this.output;
	}
	
	public boolean canOredict() {
		return this.canOredict;
	}

}