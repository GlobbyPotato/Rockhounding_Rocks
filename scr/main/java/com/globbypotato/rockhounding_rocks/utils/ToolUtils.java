package com.globbypotato.rockhounding_rocks.utils;

import com.globbypotato.rockhounding_rocks.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolUtils {
	public static ItemStack blade = new ItemStack(ModItems.CUTTING_BLADE);
	public static ItemStack finder = new ItemStack(ModItems.ROCK_FINDER);
	public static ItemStack dummy = new ItemStack(ModItems.DUMMY_HAMMER);

	public static ItemStack rh_book = GameRegistry.makeItemStack("gbook:guidebook",0,1,"{Book:\"rockhounding_rocks:xml/rockbook.xml\"}");

	public static ItemStack cards(int meta) {return new ItemStack(ModItems.PATTERN_CARDS, 1, meta);}
	public static ItemStack sculpt(int meta) {return new ItemStack(ModItems.SCULPTING_CARDS, 1, meta);}

}