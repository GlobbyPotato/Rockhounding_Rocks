package com.globbypotato.rockhounding_rocks.compat.jei.sculpting_bench;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.recipes.SculptingBenchRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.SculptingBenchRecipe;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.item.ItemStack;

public class SculptingBenchWrapper extends RHRecipeWrapper<SculptingBenchRecipe> {
	
	public SculptingBenchWrapper(@Nonnull SculptingBenchRecipe recipe) {
		super(recipe);
	}

	public static List<SculptingBenchWrapper> getRecipes() {
		List<SculptingBenchWrapper> recipes = new ArrayList<>();
		for (SculptingBenchRecipe recipe : SculptingBenchRecipes.sculpting_bench_recipes) {
			if(!recipe.getInput().isEmpty() && !recipe.getOutput().isEmpty()){
				recipes.add(new SculptingBenchWrapper(recipe));
			}
		}
		return recipes;
	}

	@Nonnull
	public List<ItemStack> getInputs() {
		return Collections.singletonList(getRecipe().getInput());
	}

	@Nonnull
	public List<ItemStack> getOutputs() {
		return Collections.singletonList(getRecipe().getOutput());
	}

	@Nonnull
	public List<ItemStack> getTools() {
		List<ItemStack> outputs = new ArrayList<ItemStack>();
		outputs.add(ToolUtils.dummy);
		return outputs;
	}

	@Nonnull
	public List<ItemStack> getPattern() {
		return Collections.singletonList(new ItemStack(ModItems.SCULPTING_CARDS, 1, getRecipe().getPattern()));
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInputs(ItemStack.class, Arrays.asList(getInputs(), getPattern(), getTools()));
		ingredients.setOutputs(ItemStack.class, getOutputs());
	}

}