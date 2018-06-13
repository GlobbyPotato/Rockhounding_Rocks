package com.globbypotato.rockhounding_rocks.machines.recipes;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.machines.recipes.io.RockVendorFee;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RockVendorFees extends BaseRecipes{
	public static ArrayList<RockVendorFee> rock_vendor_fees = new ArrayList<RockVendorFee>();

	public static void machineRecipes() {
		rock_vendor_fees.add(new RockVendorFee(new ItemStack(Items.IRON_NUGGET), 1));
		rock_vendor_fees.add(new RockVendorFee(new ItemStack(Items.GOLD_NUGGET), 2));
		rock_vendor_fees.add(new RockVendorFee(new ItemStack(Items.IRON_INGOT), 9));
		rock_vendor_fees.add(new RockVendorFee(new ItemStack(Items.GHAST_TEAR), 16));
		rock_vendor_fees.add(new RockVendorFee(new ItemStack(Items.GOLD_INGOT), 18));
		rock_vendor_fees.add(new RockVendorFee(new ItemStack(Items.EMERALD), 24));
		rock_vendor_fees.add(new RockVendorFee(new ItemStack(Items.DIAMOND), 32));
	}

}