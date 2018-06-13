package com.globbypotato.rockhounding_rocks.compat.crafttweaker;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.machines.recipes.CarvingBenchRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CarvingBenchRecipe;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.rockhounding_rocks.CarvingBench")
public class CarvingRecipes extends CTSupport{
	public static String name = "Carving Bench";
	public static ArrayList<CarvingBenchRecipe> recipeList = CarvingBenchRecipes.carving_bench_recipes;

	@ZenMethod
    public static void add(IItemStack input, int code, IItemStack output) {
        if(input == null || output == null) {error(name); return;}

        CarvingBenchRecipe recipe = new CarvingBenchRecipe(toStack(input), code, toStack(output));
        CraftTweakerAPI.apply(new Add(recipe));
    }

    private static class Add implements IAction{
        private final CarvingBenchRecipe recipe;

        public Add(CarvingBenchRecipe recipe){
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