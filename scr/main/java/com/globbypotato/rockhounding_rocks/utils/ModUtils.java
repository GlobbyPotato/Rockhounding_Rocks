package com.globbypotato.rockhounding_rocks.utils;

import com.globbypotato.rockhounding_core.utils.CoreUtils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;

public class ModUtils {
	public static String thermal_f_id = "thermalfoundation";

	public static ItemStack thermal_f_wrench(){
		if(Loader.isModLoaded(thermal_f_id)){
			Item material = Item.REGISTRY.getObject(new ResourceLocation(thermal_f_id + ":" + "wrench"));
			ItemStack temp = CoreUtils.getModdedStack(material, 1, 0);
			if(!temp.isEmpty()){
				return temp;
			}
		}
		return ItemStack.EMPTY;
	}

}