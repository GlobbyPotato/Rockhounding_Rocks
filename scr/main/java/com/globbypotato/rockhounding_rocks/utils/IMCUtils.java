package com.globbypotato.rockhounding_rocks.utils;

import java.util.List;

import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCMessage;

public class IMCUtils {
	public static String VENDOR_KEY = "addToVendor";
	public static String VENDOR_KEY_REMOVER = "removeFromVendor";
	public static String CUTTING_KEY = "addToCutting";
	static boolean canOredict;
	static int rockStacksize;

	public static void extraRecipes(List<IMCMessage> messages) {
		for(IMCMessage message : messages) {
			if(message.isNBTMessage()){
				try {
		    		NBTTagCompound tag = message.getNBTValue();
		    		/**
		    		 * REMOVE RECIPES
		    		 */
		    		if(message.key.equalsIgnoreCase(VENDOR_KEY_REMOVER)){
		    			ItemStack input = null;
		        		if(tag.hasKey("Input")){
		        			input = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Input"));
		        		}
		        		if(input != null){
		        			for(int x = 0; x < MachineRecipes.vendorRecipe.size(); x++){
		        				if(MachineRecipes.vendorRecipe.get(x).getInput().isItemEqual(input)){
		        					MachineRecipes.vendorRecipe.remove(x);
		        				}
		        			}
		        		}
					}

		    		/**
		    		 * ADD RECIPES
		    		 */
		    		if(message.key.equalsIgnoreCase(VENDOR_KEY)){
		    			ItemStack input = null;
		        		if(tag.hasKey("Input")){
		        			input = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Input"));
		        		}
		        		if(tag.hasKey("Oredict")){
		        			canOredict = tag.getBoolean("Oredict");
		        		}
		        		if(tag.hasKey("Stacksize")){
		        			rockStacksize = tag.getInteger("Stacksize");
		        		}
		        		if(input != null && rockStacksize > 0){
		        			MachineRecipes.vendorRecipe.add(new RockVendorFees(input, canOredict, rockStacksize));
		        		}
		    		}else if(message.key.equalsIgnoreCase(CUTTING_KEY)){
		    			ItemStack input = null;
		    			ItemStack output = null;
		    			int code = 0;
		        		if(tag.hasKey("Input")){
		        			input = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Input"));
		        		}
		        		if(tag.hasKey("Code")){
		        			code = tag.getInteger("Code");
		        		}
		        		if(tag.hasKey("Output")){
		        			output = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Output"));
		        		}
		        		if(input != null && output != null){
		        			MachineRecipes.cuttingRecipes.add(new CuttingStationRecipes(input, code, output));
		        		}
		    		}
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}