package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Reference {
	// Create Mod Reference 
	public static final String MODID = "rockhounding_rocks";
    public static final String VERSION = "${version_mod}";
	public static final String CLIENT_PROXY_CLASS = "com.globbypotato.rockhounding_rocks.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.globbypotato.rockhounding_rocks.proxy.CommonProxy";

	//Create new Creative Tab with Icon
	public static CreativeTabs RockhoundingRocks = new CreativeTabs("rockhoundingRocks") {
		public Item getTabIconItem() { return Item.getItemFromBlock(ModBlocks.polishedB); }
	};
}