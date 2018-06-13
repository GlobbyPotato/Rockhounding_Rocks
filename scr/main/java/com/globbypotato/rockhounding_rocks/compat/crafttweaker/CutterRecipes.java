package com.globbypotato.rockhounding_rocks.compat.crafttweaker;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CuttingStationRecipe;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.rockhounding_rocks.CuttingStation")
public class CutterRecipes extends CTSupport{
	public static String name = "Cutting Station";
	public static ArrayList<CuttingStationRecipe> recipeList = CuttingStationRecipes.cutting_station_recipes;

	@ZenMethod
    public static void add(IItemStack input, int code, IItemStack output) {
        if(input == null || output == null) {error(name); return;}

        CuttingStationRecipe recipe = new CuttingStationRecipe(toStack(input), code, toStack(output));
        CraftTweakerAPI.apply(new Add(recipe));
    }

    private static class Add implements IAction{
        private final CuttingStationRecipe recipe;

        public Add(CuttingStationRecipe recipe){
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