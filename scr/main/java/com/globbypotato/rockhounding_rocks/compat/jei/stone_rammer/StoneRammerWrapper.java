package com.globbypotato.rockhounding_rocks.compat.jei.stone_rammer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_rocks.compat.jei.RHRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.recipes.StoneRammerRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.StoneRammerRecipe;

import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.item.ItemStack;

public class StoneRammerWrapper extends RHRecipeWrapper<StoneRammerRecipe> {
	
	public StoneRammerWrapper(@Nonnull StoneRammerRecipe recipe) {
		super(recipe);
	}

	public static List<StoneRammerWrapper> getRecipes() {
		List<StoneRammerWrapper> recipes = new ArrayList<>();
		for (StoneRammerRecipe recipe : StoneRammerRecipes.stone_rammer_recipes) {
			if(!recipe.getInput().isEmpty() && !recipe.getOutput().isEmpty()){
				recipes.add(new StoneRammerWrapper(recipe));
			}
		}
		return recipes;
	}

	@Nonnull
	public List<ItemStack> getInputs() {
		return Collections.singletonList(getRecipe().getInput());
	}

	@Nonnull
	public List<ItemStack> getOutputs() {
		return Collections.singletonList(getRecipe().getOutput());
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInputs(ItemStack.class, getInputs());
		ingredients.setOutputs(ItemStack.class, getOutputs());
	}

}