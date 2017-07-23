package com.globbypotato.rockhounding_rocks.compat.jei.vendor;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeUID;
import com.globbypotato.rockhounding_rocks.machines.gui.GuiRockVendor;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;

public class VendorRecipeCategory extends RHRecipeCategory {

	private static final int INPUT_SLOT = 1;

	private final static ResourceLocation guiTexture = GuiRockVendor.TEXTURE_REF;

	public VendorRecipeCategory(IGuiHelper guiHelper) {
		super(guiHelper.createDrawable(guiTexture, 7, 14, 162, 76), "jei.vendor.name");
	}

	@Nonnull
	@Override
	public String getUid() {
		return RHRecipeUID.VENDOR;
	}

	@Override
	public void setRecipe(@Nonnull IRecipeLayout recipeLayout, @Nonnull IRecipeWrapper recipeWrapper) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

		guiItemStacks.init(INPUT_SLOT, true, 82, 3);

		VendorRecipeWrapper wrapper = (VendorRecipeWrapper) recipeWrapper;	

		guiItemStacks.set(INPUT_SLOT, wrapper.getInputs());

	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
		setRecipe(recipeLayout,recipeWrapper);
	}
}