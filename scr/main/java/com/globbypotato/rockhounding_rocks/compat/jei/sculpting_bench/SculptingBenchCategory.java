package com.globbypotato.rockhounding_rocks.compat.jei.sculpting_bench;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeCategory;
import com.globbypotato.rockhounding_rocks.machines.gui.UICarvingRack;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;

public class SculptingBenchCategory extends RHRecipeCategory {

	private String uid;
	private static final int INPUT_SLOT = 0;
	private static final int CONSUMABLE_SLOT = 1;
	private static final int OUTPUT_SLOT = 2;
	private static final int PATTERN_SLOT = 3;

	public SculptingBenchCategory(IGuiHelper guiHelper, String uid) {
		super(guiHelper.createDrawable(UICarvingRack.TEXTURE_JEI, 0, 0, 124, 52), "jei." + uid + ".name");
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
		SculptingBenchWrapper wrapper = (SculptingBenchWrapper) recipeWrapper;

		guiItemStacks.init(INPUT_SLOT, true, 53, 4);
		guiItemStacks.init(CONSUMABLE_SLOT, true, 89, 17);
		guiItemStacks.init(OUTPUT_SLOT, false, 53, 30);
		guiItemStacks.init(PATTERN_SLOT, true, 17, 17);

		guiItemStacks.set(INPUT_SLOT, wrapper.getInputs());
		guiItemStacks.set(CONSUMABLE_SLOT, wrapper.getTools());
		guiItemStacks.set(OUTPUT_SLOT, wrapper.getOutputs());
		guiItemStacks.set(PATTERN_SLOT, wrapper.getPattern());

	}

}