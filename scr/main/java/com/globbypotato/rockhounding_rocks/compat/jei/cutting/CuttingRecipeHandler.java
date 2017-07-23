package com.globbypotato.rockhounding_rocks.compat.jei.cutting;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeUID;
import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

public class CuttingRecipeHandler implements IRecipeHandler<CuttingRecipeWrapper> {

	@Nonnull
	@Override
	public Class<CuttingRecipeWrapper> getRecipeClass() {
		return CuttingRecipeWrapper.class;
	}

	@Nonnull
	@Override
	public String getRecipeCategoryUid() {
		return RHRecipeUID.CUTTING;
	}

	@Nonnull
	@Override
	public String getRecipeCategoryUid(@Nonnull CuttingRecipeWrapper recipe) {
		return RHRecipeUID.CUTTING;
	}

	@Nonnull
	@Override
	public IRecipeWrapper getRecipeWrapper(@Nonnull CuttingRecipeWrapper recipe) {
		return recipe;
	}

	@Override
	public boolean isRecipeValid(@Nonnull CuttingRecipeWrapper wrapper) {
		CuttingStationRecipes recipe = wrapper.getRecipe();
		if (recipe.getInput() == null) {
			return false;
		}

		if (recipe.getOutput() == null) {
			return false;
		}
		return true;
	}
}