package com.globbypotato.rockhounding_rocks.compat.jei.stone_rammer;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeCategory;
import com.globbypotato.rockhounding_rocks.handler.Reference;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;

public class StoneRammerCategory extends RHRecipeCategory {

	public static final ResourceLocation TEXTURE_JEI =  new ResourceLocation(Reference.MODID + ":textures/gui/jei/jeistonerammer.png");
	private String uid;
	private static final int INPUT_SLOT = 0;
	private static final int OUTPUT_SLOT = 1;

	public StoneRammerCategory(IGuiHelper guiHelper, String uid) {
		super(guiHelper.createDrawable(TEXTURE_JEI, 0, 0, 132, 52), "jei." + uid + ".name");
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
		StoneRammerWrapper wrapper = (StoneRammerWrapper) recipeWrapper;

		guiItemStacks.init(INPUT_SLOT, true, 35, 17);
		guiItemStacks.init(OUTPUT_SLOT, false, 79, 17);

		guiItemStacks.set(INPUT_SLOT, wrapper.getInputs());
		guiItemStacks.set(OUTPUT_SLOT, wrapper.getOutputs());

	}

}