package com.globbypotato.rockhounding_rocks.compat.jei.cutting_station;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeCategory;
import com.globbypotato.rockhounding_rocks.machines.gui.UICuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IGuiFluidStackGroup;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class CuttingStationCategory extends RHRecipeCategory {

	private String uid;
	private static final int INPUT_SLOT = 0;
	private static final int CONSUMABLE_SLOT = 1;
	private static final int OUTPUT_SLOT = 2;
	private static final int WATER_TANK = 3;
	private static final int PATTERN_SLOT = 4;

	public CuttingStationCategory(IGuiHelper guiHelper, String uid) {
		super(guiHelper.createDrawable(UICuttingStation.TEXTURE_JEI, 0, 0, 95, 67), "jei." + uid + ".name");
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
		IGuiFluidStackGroup guiFluidStacks = recipeLayout.getFluidStacks();
		CuttingStationWrapper wrapper = (CuttingStationWrapper) recipeWrapper;

		guiItemStacks.init(INPUT_SLOT, true, 26, 5);
		guiItemStacks.init(CONSUMABLE_SLOT, true, 0, 24);
		guiItemStacks.init(OUTPUT_SLOT, false, 26, 43);
		guiFluidStacks.init(WATER_TANK, true,  74, 1, 20, 65, 100, false, null);
		guiItemStacks.init(PATTERN_SLOT, true, 52, 24);

		guiItemStacks.set(INPUT_SLOT, wrapper.getInputs());
		guiItemStacks.set(CONSUMABLE_SLOT, ToolUtils.blade);
		guiItemStacks.set(OUTPUT_SLOT, wrapper.getOutputs());
		guiFluidStacks.set(WATER_TANK, new FluidStack(FluidRegistry.WATER, TECuttingStation.consumedWater));
		guiItemStacks.set(PATTERN_SLOT, wrapper.getPattern());

	}

}