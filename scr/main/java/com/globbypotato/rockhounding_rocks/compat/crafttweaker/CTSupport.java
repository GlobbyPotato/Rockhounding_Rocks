package com.globbypotato.rockhounding_rocks.compat.crafttweaker;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.liquid.ILiquidStack;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;

public class CTSupport {
	public static void init() {
		if (Loader.isModLoaded("crafttweaker")) {
			CTSupport.loadSupport();
	    }
	}

    public static void loadSupport() {
        CraftTweakerAPI.registerClass(CutterRecipes.class);
        CraftTweakerAPI.registerClass(VendorRecipes.class);
        CraftTweakerAPI.registerClass(RammerRecipes.class);
        CraftTweakerAPI.registerClass(CarvingRecipes.class);
        CraftTweakerAPI.registerClass(SculptingRecipes.class);
    }

    public static String addCaption(String name) {
		return "Adding a recipe for the " + name;
	}

    public static String removeCaption(String name) {
		return "Removing a recipe for the " + name;
	}

    public static void error(String name) {
    	CraftTweakerAPI.logError("Invalid recipe detected for " + name);
    }

    public static ItemStack toStack(IItemStack iStack){
		if(iStack == null){
			return ItemStack.EMPTY;
		}
		return (ItemStack) iStack.getInternal();
    }

    public static FluidStack toFluid(ILiquidStack iStack){
		if (iStack == null) {
			return null;
		}
		return (FluidStack) iStack.getInternal();
    }

    public static FluidStack getFluid(ILiquidStack fluid, int amount){
		if (fluid == null) {
			return null;
		}
		return new FluidStack(toFluid(fluid), amount);
    }
}