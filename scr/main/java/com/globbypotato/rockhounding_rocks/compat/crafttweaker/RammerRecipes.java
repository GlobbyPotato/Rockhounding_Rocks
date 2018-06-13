package com.globbypotato.rockhounding_rocks.compat.crafttweaker;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.machines.recipes.StoneRammerRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.StoneRammerRecipe;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.rockhounding_rocks.StoneRammer")
public class RammerRecipes extends CTSupport{
	public static String name = "Stone Rammer";
	public static ArrayList<StoneRammerRecipe> recipeList = StoneRammerRecipes.stone_rammer_recipes;

	@ZenMethod
    public static void add(IItemStack input, IItemStack output) {
        if(input == null || output == null) {error(name); return;}

        StoneRammerRecipe recipe = new StoneRammerRecipe(toStack(input), toStack(output));
        CraftTweakerAPI.apply(new Add(recipe));
    }

    private static class Add implements IAction{
        private final StoneRammerRecipe recipe;

        public Add(StoneRammerRecipe recipe){
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