package com.globbypotato.rockhounding_rocks.compat.jei.rock_vendor;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeCategory;
import com.globbypotato.rockhounding_rocks.machines.gui.UIRockVendor;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;

public class RockVendorCategory extends RHRecipeCategory {

	private String uid;
	private static final int INPUT_SLOT = 1;
	private static final int OUTPUT_SLOT = 2;


	public RockVendorCategory(IGuiHelper guiHelper, String uid) {
		super(guiHelper.createDrawable(UIRockVendor.TEXTURE_JEI, 0, 0, 83, 24), "jei." + uid + ".name");
		this.uid = uid;
	}

	@Nonnull
	@Override
	public String getUid() {
		return this.uid;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

		guiItemStacks.init(INPUT_SLOT, true, 3, 3);
		guiItemStacks.init(OUTPUT_SLOT, true, 62, 3);

		RockVendorWrapper wrapper = (RockVendorWrapper) recipeWrapper;	

		guiItemStacks.set(INPUT_SLOT, wrapper.getInputs());
		guiItemStacks.set(OUTPUT_SLOT, wrapper.getOutputs());

	}

}