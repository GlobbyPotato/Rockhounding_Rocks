package com.globbypotato.rockhounding_rocks.integration.crafttweaker;

import minetweaker.MineTweakerAPI;
import minetweaker.api.item.IItemStack;
import minetweaker.api.liquid.ILiquidStack;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;

public class CTSupport {

	public static void init() {
		if (Loader.isModLoaded("MineTweaker3")) {
			CTSupport.loadSupport();
	    }
	}

    public static void loadSupport() {
        MineTweakerAPI.registerClass(CutterRecipes.class);
        MineTweakerAPI.registerClass(VendorRecipes.class);
    }

    public static ItemStack toStack(IItemStack iStack){
		if(iStack == null){
			return null;
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