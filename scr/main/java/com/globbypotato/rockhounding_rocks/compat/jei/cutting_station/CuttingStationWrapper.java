package com.globbypotato.rockhounding_rocks.compat.jei.cutting_station;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CuttingStationRecipe;

import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.item.ItemStack;

public class CuttingStationWrapper extends RHRecipeWrapper<CuttingStationRecipe> {
	
	public CuttingStationWrapper(@Nonnull CuttingStationRecipe recipe) {
		super(recipe);
	}

	public static List<CuttingStationWrapper> getRecipes() {
		List<CuttingStationWrapper> recipes = new ArrayList<>();
		for (CuttingStationRecipe recipe : CuttingStationRecipes.cutting_station_recipes) {
			if(!recipe.getInput().isEmpty() && !recipe.getOutput().isEmpty()){
				recipes.add(new CuttingStationWrapper(recipe));
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
	public List<ItemStack> getPattern() {
		return Collections.singletonList(new ItemStack(ModItems.PATTERN_ITEMS, 1, getRecipe().getLogic()));
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInputs(ItemStack.class, Arrays.asList(getInputs(), getPattern()));
		ingredients.setOutputs(ItemStack.class, getOutputs());
	}

}