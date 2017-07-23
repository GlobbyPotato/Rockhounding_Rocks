package com.globbypotato.rockhounding_rocks.compat.jei.vendor;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;

import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.item.ItemStack;

public class VendorRecipeWrapper extends RHRecipeWrapper<RockVendorFees> {
	
	public VendorRecipeWrapper(@Nonnull RockVendorFees recipe) {
		super(recipe);
	}

	public static List<VendorRecipeWrapper> getRecipes() {
		List<VendorRecipeWrapper> recipes = new ArrayList<>();
		for (RockVendorFees recipe : MachineRecipes.vendorRecipe) {
			recipes.add(new VendorRecipeWrapper(recipe));
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
	public List<Integer> getFees() {
		List<Integer> inputs = new ArrayList<Integer>();
		inputs.add(getRecipe().getOutput());
		return inputs;
	}

	@Override
	public void getIngredients(IIngredients ingredients) {}

}