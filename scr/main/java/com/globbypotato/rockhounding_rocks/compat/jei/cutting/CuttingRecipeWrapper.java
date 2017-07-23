package com.globbypotato.rockhounding_rocks.compat.jei.cutting;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;

import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.item.ItemStack;

public class CuttingRecipeWrapper extends RHRecipeWrapper<CuttingStationRecipes> {
	
	public CuttingRecipeWrapper(@Nonnull CuttingStationRecipes recipe) {
		super(recipe);
	}

	public static List<CuttingRecipeWrapper> getRecipes() {
		List<CuttingRecipeWrapper> recipes = new ArrayList<>();
		for (CuttingStationRecipes recipe : MachineRecipes.cuttingRecipes) {
			recipes.add(new CuttingRecipeWrapper(recipe));
		}
		return recipes;
	}

	@Nonnull
	@Override
	public List<ItemStack> getInputs() {
		List<ItemStack> inputs = new ArrayList<ItemStack>();
		inputs.add(getRecipe().getInput());
		return inputs;
	}

	@Nonnull
	@Override
	public List<ItemStack> getOutputs() {
		List<ItemStack> outputs = new ArrayList<ItemStack>();
		outputs.add(getRecipe().getOutput());
		return outputs;
	}

	@Override
	public void getIngredients(IIngredients ingredients) {}

}