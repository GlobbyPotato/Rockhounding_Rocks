package com.globbypotato.rockhounding_rocks.compat.jei.vendor;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeUID;
import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

public class VendorRecipeHandler implements IRecipeHandler<VendorRecipeWrapper> {

	@Nonnull
	@Override
	public Class<VendorRecipeWrapper> getRecipeClass() {
		return VendorRecipeWrapper.class;
	}

	@Nonnull
	@Override
	public String getRecipeCategoryUid() {
		return RHRecipeUID.VENDOR;
	}

	@Nonnull
	@Override
	public String getRecipeCategoryUid(@Nonnull VendorRecipeWrapper recipe) {
		return RHRecipeUID.VENDOR;
	}

	@Nonnull
	@Override
	public IRecipeWrapper getRecipeWrapper(@Nonnull VendorRecipeWrapper recipe) {
		return recipe;
	}

	@Override
	public boolean isRecipeValid(@Nonnull VendorRecipeWrapper wrapper) {
		RockVendorFees recipe = wrapper.getRecipe();
		if (recipe.getInput() == null) {
			return false;
		}
		return true;
	}
}