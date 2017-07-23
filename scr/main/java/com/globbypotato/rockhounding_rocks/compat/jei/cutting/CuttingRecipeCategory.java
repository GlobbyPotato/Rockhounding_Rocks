package com.globbypotato.rockhounding_rocks.compat.jei.cutting;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeUID;
import com.globbypotato.rockhounding_rocks.machines.gui.GuiCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IGuiFluidStackGroup;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class CuttingRecipeCategory extends RHRecipeCategory {

	private static final int INPUT_SLOT = 0;
	private static final int CONSUMABLE_SLOT = 1;
	private static final int OUTPUT_SLOT = 2;
	private static final int WATER_SLOT = 3;
	private static final int WATER_TANK = 4;

	private final static ResourceLocation guiTexture = GuiCuttingStation.TEXTURE_REF;

	public CuttingRecipeCategory(IGuiHelper guiHelper) {
		super(guiHelper.createDrawable(guiTexture, 7, 16, 162, 92), "jei.cutting.name");
	}

	@Nonnull
	@Override
	public String getUid() {
		return RHRecipeUID.CUTTING;
	}

	@Override
	public void setRecipe(@Nonnull IRecipeLayout recipeLayout, @Nonnull IRecipeWrapper recipeWrapper) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		IGuiFluidStackGroup guiFluidStacks = recipeLayout.getFluidStacks();
		CuttingRecipeWrapper wrapper = (CuttingRecipeWrapper) recipeWrapper;

		guiItemStacks.init(INPUT_SLOT, true, 81, 12);
		guiItemStacks.init(CONSUMABLE_SLOT, true, 55, 31);
		guiItemStacks.init(OUTPUT_SLOT, false, 81, 50);
		guiItemStacks.init(WATER_SLOT, false, 142, 0);
		guiFluidStacks.init(WATER_TANK, true,  141, 21, 20, 65, 100, false, null);

		guiItemStacks.set(INPUT_SLOT, wrapper.getInputs());
		guiItemStacks.set(CONSUMABLE_SLOT, new ItemStack(ModItems.cuttingBlade));
		guiItemStacks.set(OUTPUT_SLOT, wrapper.getOutputs());
		guiItemStacks.set(WATER_SLOT, new ItemStack(Items.WATER_BUCKET));
		guiFluidStacks.set(WATER_TANK, new FluidStack(FluidRegistry.WATER, TileEntityCuttingStation.consumedWater));

	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
		setRecipe(recipeLayout,recipeWrapper);
	}
}