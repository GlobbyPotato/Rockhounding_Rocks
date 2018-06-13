package com.globbypotato.rockhounding_rocks.compat.crafttweaker;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.machines.recipes.SculptingBenchRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.SculptingBenchRecipe;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.rockhounding_rocks.SculptingBench")
public class SculptingRecipes extends CTSupport{
	public static String name = "Sculpting Bench";
	public static ArrayList<SculptingBenchRecipe> recipeList = SculptingBenchRecipes.sculpting_bench_recipes;

	@ZenMethod
    public static void add(IItemStack input, int code, IItemStack output) {
        if(input == null || output == null) {error(name); return;}

        SculptingBenchRecipe recipe = new SculptingBenchRecipe(toStack(input), code, toStack(output));
        CraftTweakerAPI.apply(new Add(recipe));
    }

    private static class Add implements IAction{
        private final SculptingBenchRecipe recipe;

        public Add(SculptingBenchRecipe recipe){
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