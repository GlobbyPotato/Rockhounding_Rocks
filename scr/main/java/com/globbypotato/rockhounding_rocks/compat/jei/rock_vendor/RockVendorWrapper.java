package com.globbypotato.rockhounding_rocks.compat.jei.rock_vendor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.RockVendorFee;

import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class RockVendorWrapper extends RHRecipeWrapper<RockVendorFee> {
	
	public RockVendorWrapper(@Nonnull RockVendorFee recipe) {
		super(recipe);
	}

	public static List<RockVendorWrapper> getRecipes() {
		List<RockVendorWrapper> recipes = new ArrayList<>();
		for (RockVendorFee recipe : RockVendorFees.rock_vendor_fees) {
			if(!recipe.getInput().isEmpty()){
				recipes.add(new RockVendorWrapper(recipe));
			}
		}
		return recipes;
	}

	@Nonnull
	public List<ItemStack> getInputs() {
		return Collections.singletonList(getRecipe().getInput());
	}

	@Nonnull
	public List<Integer> getFees() {
		List<Integer> inputs = new ArrayList<Integer>();
		inputs.add(getRecipe().getOutput());
		return inputs;
	}

	@Nonnull
	public List<ItemStack> getOutputs() {
		return Collections.singletonList(new ItemStack(Blocks.STONE, getRecipe().getOutput()));
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInputs(ItemStack.class, getInputs());
	}

}