package com.globbypotato.rockhounding_rocks.utils;

import java.util.List;

import com.globbypotato.rockhounding_rocks.machines.recipes.CarvingBenchRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.RockVendorFees;
import com.globbypotato.rockhounding_rocks.machines.recipes.SculptingBenchRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.StoneRammerRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CarvingBenchRecipe;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CuttingStationRecipe;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.RockVendorFee;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.SculptingBenchRecipe;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.StoneRammerRecipe;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCMessage;
import rockhounding.api.IReciperBase;

public class IMCUtils extends IReciperBase{
	static int stacksize;
	public static ItemStack input;
	public static ItemStack output;

	public static void extraRecipes(List<IMCMessage> messages) {
		for(IMCMessage message : messages) {
			if(message.isNBTMessage()){
				try {
		    		NBTTagCompound tag = message.getNBTValue();
		    		if(message.key.equalsIgnoreCase(add_rock_vendor_key)){
		        		if(tag.hasKey(tagInput)){
		        			input = new ItemStack(tag.getCompoundTag(tagInput));
		        		}
		        		if(tag.hasKey(tagPattern)){
		        			stacksize = tag.getInteger(tagPattern);
		        		}
		        		RockVendorFees.rock_vendor_fees.add(new RockVendorFee(input, stacksize));
		    		}else if(message.key.equalsIgnoreCase(add_cutting_station_key)){
		    			int code = 0;
		        		if(tag.hasKey(tagInput)){
		        			input = new ItemStack(tag.getCompoundTag(tagInput));
		        		}
		        		if(tag.hasKey(tagPattern)){
		        			code = tag.getInteger(tagPattern);
		        		}
		        		if(tag.hasKey(tagOutput)){
		        			output = new ItemStack(tag.getCompoundTag(tagOutput));
		        		}
		        		if(!input.isEmpty() && !output.isEmpty()){
		        			CuttingStationRecipes.cutting_station_recipes.add(new CuttingStationRecipe(input, code, output));
		        		}
		    		}else if(message.key.equalsIgnoreCase(add_stone_rammer_key)){
		        		if(tag.hasKey(tagInput)){
		        			input = new ItemStack(tag.getCompoundTag(tagInput));
		        		}
		        		if(tag.hasKey(tagOutput)){
		        			output = new ItemStack(tag.getCompoundTag(tagOutput));
		        		}
		        		if(!input.isEmpty() && !output.isEmpty()){
		        			StoneRammerRecipes.stone_rammer_recipes.add(new StoneRammerRecipe(input, output));
		        		}
		    		}else if(message.key.equalsIgnoreCase(add_carving_bench_key)){
		    			int code = 0;
		        		if(tag.hasKey(tagInput)){
		        			input = new ItemStack(tag.getCompoundTag(tagInput));
		        		}
		        		if(tag.hasKey(tagPattern)){
		        			code = tag.getInteger(tagPattern);
		        		}
		        		if(tag.hasKey(tagOutput)){
		        			output = new ItemStack(tag.getCompoundTag(tagOutput));
		        		}
		        		if(!input.isEmpty() && !output.isEmpty()){
		        			CarvingBenchRecipes.carving_bench_recipes.add(new CarvingBenchRecipe(input, code, output));
		        		}
		    		}else if(message.key.equalsIgnoreCase(add_sculpting_bench_key)){
		    			int code = 0;
		        		if(tag.hasKey(tagInput)){
		        			input = new ItemStack(tag.getCompoundTag(tagInput));
		        		}
		        		if(tag.hasKey(tagPattern)){
		        			code = tag.getInteger(tagPattern);
		        		}
		        		if(tag.hasKey(tagOutput)){
		        			output = new ItemStack(tag.getCompoundTag(tagOutput));
		        		}
		        		if(!input.isEmpty() && !output.isEmpty()){
		        			SculptingBenchRecipes.sculpting_bench_recipes.add(new SculptingBenchRecipe(input, code, output));
		        		}
		    		}
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}