package com.globbypotato.rockhounding_rocks.compat.crafttweaker;

import com.globbypotato.rockhounding_rocks.compat.jei.vendor.VendorRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;

import minetweaker.IUndoableAction;
import minetweaker.MineTweakerAPI;
import minetweaker.api.item.IItemStack;
import net.minecraft.item.ItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.rockhounding_rocks.RockVendor")
public class VendorRecipes extends CTSupport{
	private static String name = "Rack Vending System Recipe";

    @ZenMethod
    public static void add(IItemStack input, boolean oredict, int quantity) {
        if(input == null || quantity <= 0) {MineTweakerAPI.logError(name + ": Invalid recipe."); return;}
        MineTweakerAPI.apply(new AddToVendor(new RockVendorFees(toStack(input), oredict, quantity)));
    }

    private static class AddToVendor implements IUndoableAction {
    	private RockVendorFees recipe;
    	public AddToVendor(RockVendorFees recipe){
          super();
          this.recipe = recipe;
    	}
    	@Override
    	public void apply() {
    		MachineRecipes.vendorRecipe.add(this.recipe);
    		MineTweakerAPI.getIjeiRecipeRegistry().addRecipe(new VendorRecipeWrapper(this.recipe));
    	}
    	@Override
    	public void undo() {
    		for(RockVendorFees recipe : MachineRecipes.vendorRecipe){
    			if(recipe.equals(this.recipe)){
    				MineTweakerAPI.getIjeiRecipeRegistry().removeRecipe(new VendorRecipeWrapper(recipe));
    				MachineRecipes.vendorRecipe.remove(recipe);	
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

    @ZenMethod
    public static void remove(IItemStack input) {
        if(input == null) {MineTweakerAPI.logError(name + ": Invalid recipe."); return;}
        MineTweakerAPI.apply(new RemoveFromVendor(toStack(input)));    
    }
		    private static class RemoveFromVendor implements IUndoableAction {
		    	private ItemStack input;
		    	private RockVendorFees undoRecipe;
		    	public RemoveFromVendor(ItemStack input) {
		    		super();
		    		this.input = input;
		    	}
		    	@Override
		    	public void apply() {
		    		for(RockVendorFees recipe : MachineRecipes.vendorRecipe){
		    			if(this.input != null && recipe.getInput().isItemEqual(this.input)){
				    		this.undoRecipe = recipe;
		    				MineTweakerAPI.getIjeiRecipeRegistry().removeRecipe(new VendorRecipeWrapper(recipe));
		    				MachineRecipes.vendorRecipe.remove(recipe);	
	                        break;
		    			}
		    		}
		    	}
		    	@Override
		    	public void undo() {
		    		if(this.undoRecipe != null){
		    			MachineRecipes.vendorRecipe.add(this.undoRecipe);
			    		MineTweakerAPI.getIjeiRecipeRegistry().addRecipe(new VendorRecipeWrapper(this.undoRecipe));
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
