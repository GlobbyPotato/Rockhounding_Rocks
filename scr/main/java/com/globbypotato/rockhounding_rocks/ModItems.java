package com.globbypotato.rockhounding_rocks;

import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.items.ConsumableIO;
import com.globbypotato.rockhounding_rocks.items.RockFinder;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ModItems {

	public static Item rockFinder;
	public static ConsumableIO cuttingBlade;

	public static void init(){
		rockFinder = new RockFinder("rockFinder");
		cuttingBlade = new ConsumableIO("cuttingBlade", ModConfig.bladeUses);
	}

	public static void initClient(){
		registerSimpleItemRender(rockFinder, 0, "rockFinder");
		cuttingBlade.initModel();
	}

	//render meta item
	public static void registerMetaItemRender(Item item, int meta, String fileName){
		ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName() + "_" + fileName, "inventory");
		ModelLoader.setCustomModelResourceLocation(item, meta, model );
	}
	//render simple item
	public static void registerSimpleItemRender(Item item, int meta, String fileName){
		ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, meta, model );
	}
}