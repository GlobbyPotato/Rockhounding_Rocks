package com.globbypotato.rockhounding_rocks.compat.crafttweaker;

import com.globbypotato.rockhounding_rocks.compat.jei.cutting.CuttingRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;

import minetweaker.IUndoableAction;
import minetweaker.MineTweakerAPI;
import minetweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.rockhounding_rocks.CuttingStation")
public class CutterRecipes extends CTSupport{
	private static String name = "Cutting Station Recipe";

    @ZenMethod
    public static void add(IItemStack input, int code, IItemStack output) {
        if(input == null || code < 0 || output == null) {MineTweakerAPI.logError(name + ": Invalid recipe."); return;}
        MineTweakerAPI.apply(new AddToCutting(new CuttingStationRecipes(toStack(input), code, toStack(output))));
    }

    private static class AddToCutting implements IUndoableAction {
    	private CuttingStationRecipes recipe;
    	public AddToCutting(CuttingStationRecipes recipe){
          super();
          this.recipe = recipe;
    	}
    	@Override
    	public void apply() {
    		MachineRecipes.cuttingRecipes.add(this.recipe);
    		MineTweakerAPI.getIjeiRecipeRegistry().addRecipe(new CuttingRecipeWrapper(this.recipe));
    	}
    	@Override
    	public void undo() {
    		for(CuttingStationRecipes recipe : MachineRecipes.cuttingRecipes){
    			if(recipe.equals(this.recipe)){
    				MineTweakerAPI.getIjeiRecipeRegistry().removeRecipe(new CuttingRecipeWrapper(recipe));
    				MachineRecipes.cuttingRecipes.remove(recipe);	
                    break;
    			}
    		}
    	}
    	@Override
    	public boolean canUndo() {return true;}
    	@Override
    	public String describe() {return null;}
    	@Override
    	public String describeUndo() {return null;}
    	@Override
    	public Object getOverrideKey() {return null;}
    }

}