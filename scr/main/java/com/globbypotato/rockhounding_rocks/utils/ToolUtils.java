package com.globbypotato.rockhounding_rocks.utils;

import com.globbypotato.rockhounding_rocks.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ToolUtils {

	public static String[] cutNames = new String[]{
													"Customized Cuts",
													"Plain Block",
													"Polished Block",
													"Double Slab",
													"Bricks",
													"Short Bricks",
													"Debossed Tile",
													"Parquet Tile",
													"Tile",
													"Carved Block",
													"Fluted Column",
													"Doric Column",
													"Tetraphylon",
													"Pedestal",
													"Segmented Column",
													"Fountain",
													"Lantern",
													"Unused",
													"Unused"};

	public static ItemStack[] vanillaPlain = new ItemStack[]{
													new ItemStack(Blocks.STONE),
													new ItemStack(Blocks.COBBLESTONE),
													new ItemStack(Blocks.HARDENED_CLAY),
													new ItemStack(Blocks.NETHER_BRICK),
													new ItemStack(Blocks.RED_NETHER_BRICK),
													new ItemStack(Blocks.SANDSTONE),
													new ItemStack(Blocks.RED_SANDSTONE),
													new ItemStack(Blocks.BONE_BLOCK),
													new ItemStack(Blocks.END_STONE),
													new ItemStack(Blocks.STONE,1,1),
													new ItemStack(Blocks.STONE,1,5),
													new ItemStack(Blocks.STONE,1,3),
													new ItemStack(Blocks.PRISMARINE),
													new ItemStack(Blocks.QUARTZ_BLOCK),
													new ItemStack(Blocks.NETHER_WART_BLOCK),
													new ItemStack(Blocks.SNOW)};

	public static ItemStack blade = new ItemStack(ModItems.cuttingBlade);

}