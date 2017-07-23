package com.globbypotato.rockhounding_rocks.integration;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;

public class SupportUtils {
	private static String rhChemistryID = "rockhounding_chemistry";

	// MOD CHECK
	public static boolean rhChemistryLoaded(){return Loader.isModLoaded(rhChemistryID);}

	public static ItemStack basicLogic(){
		if(rhChemistryLoaded()){
			Item logic = Item.REGISTRY.getObject(new ResourceLocation(rhChemistryID + ":" + "miscItems"));
			return new ItemStack(logic, 1, 0);
		}
		return null;
	}

	public static ItemStack ironCasing(){
		if(rhChemistryLoaded()){
			Item casing = Item.REGISTRY.getObject(new ResourceLocation(rhChemistryID + ":" + "miscItems"));
			return new ItemStack(casing, 1, 42);
		}
		return null;
	}

	public static ItemStack cabinet(){
		if(rhChemistryLoaded()){
			Item cabinet = Item.REGISTRY.getObject(new ResourceLocation(rhChemistryID + ":" + "miscItems"));
			return new ItemStack(cabinet,1, 1);
		}
		return null;
	}

}