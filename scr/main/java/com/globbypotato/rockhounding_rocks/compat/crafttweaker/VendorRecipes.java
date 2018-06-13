package com.globbypotato.rockhounding_rocks.compat.crafttweaker;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.RockVendorFee;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.rockhounding_rocks.RockVendor")
public class VendorRecipes extends CTSupport{
	public static String name = "Rock Vending System";
	public static ArrayList<RockVendorFee> recipeList = RockVendorFees.rock_vendor_fees;

    @ZenMethod
    public static void add(IItemStack input, int quantity) {
        if(input == null) {error(name); return;}

        RockVendorFee recipe = new RockVendorFee(toStack(input), quantity);
        CraftTweakerAPI.apply(new Add(recipe));
    }

    private static class Add implements IAction{
        private final RockVendorFee recipe;

        public Add(RockVendorFee recipe){
            this.recipe = recipe;
        }

        @Override
        public void apply(){
        	recipeList.add(this.recipe);
        }

        @Override
        public String describe(){
            return addCaption(name);
        }
    }
}