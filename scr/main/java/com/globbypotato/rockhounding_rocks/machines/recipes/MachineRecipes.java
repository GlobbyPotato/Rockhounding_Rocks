package com.globbypotato.rockhounding_rocks.machines.recipes;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MachineRecipes extends BaseRecipes{
	public static ArrayList<RockVendorFees> vendorRecipe = new ArrayList<RockVendorFees>();
	public static ArrayList<CuttingStationRecipes> cuttingRecipes = new ArrayList<CuttingStationRecipes>();

	public static void machineRecipes() {
		vendorRecipe.add(new RockVendorFees(new ItemStack(Items.GOLD_NUGGET), true, 1));
		vendorRecipe.add(new RockVendorFees(new ItemStack(Items.GOLD_INGOT), true, 9));
		vendorRecipe.add(new RockVendorFees(new ItemStack(Items.EMERALD), true, 16));
		vendorRecipe.add(new RockVendorFees(new ItemStack(Items.DIAMOND), true, 32));

		for(int x = 0; x < 16; x++){
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.rocksA, 1, x), 	1, 	new ItemStack(ModBlocks.blocksA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.rocksB, 1, x), 	1, 	new ItemStack(ModBlocks.blocksB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.rocksC, 1, x), 	1, 	new ItemStack(ModBlocks.blocksC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.rocksD, 1, x), 	1, 	new ItemStack(ModBlocks.blocksD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.rocksE, 1, x), 	1, 	new ItemStack(ModBlocks.blocksE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.rocksF, 1, x), 	1, 	new ItemStack(ModBlocks.blocksF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.rocksG, 1, x), 	1, 	new ItemStack(ModBlocks.blocksG, 1, x)));

			if(ModConfig.ENABLE_POLISHED){
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	2, 	new ItemStack(ModBlocks.polishedA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	2, 	new ItemStack(ModBlocks.polishedB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	2, 	new ItemStack(ModBlocks.polishedC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	2, 	new ItemStack(ModBlocks.polishedD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	2, 	new ItemStack(ModBlocks.polishedE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	2, 	new ItemStack(ModBlocks.polishedF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	2, 	new ItemStack(ModBlocks.polishedG, 1, x)));
			}

			if(ModConfig.ENABLE_BRICKS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				4, 	new ItemStack(ModBlocks.bricksVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	4, 	new ItemStack(ModBlocks.bricksClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	4, 	new ItemStack(ModBlocks.bricksA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	4, 	new ItemStack(ModBlocks.bricksB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	4, 	new ItemStack(ModBlocks.bricksC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	4, 	new ItemStack(ModBlocks.bricksD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	4, 	new ItemStack(ModBlocks.bricksE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	4, 	new ItemStack(ModBlocks.bricksF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	4, 	new ItemStack(ModBlocks.bricksG, 1, x)));
			}

			if(ModConfig.ENABLE_SLABS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				3, 	new ItemStack(ModBlocks.slabsVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	3, 	new ItemStack(ModBlocks.slabsClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	3, 	new ItemStack(ModBlocks.slabsA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	3, 	new ItemStack(ModBlocks.slabsB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	3, 	new ItemStack(ModBlocks.slabsC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	3, 	new ItemStack(ModBlocks.slabsD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	3, 	new ItemStack(ModBlocks.slabsE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	3, 	new ItemStack(ModBlocks.slabsF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	3, 	new ItemStack(ModBlocks.slabsG, 1, x)));
			}			

			if(ModConfig.ENABLE_SLABS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				5, 	new ItemStack(ModBlocks.shortsVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	5, 	new ItemStack(ModBlocks.shortsClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	5, 	new ItemStack(ModBlocks.shortsA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	5, 	new ItemStack(ModBlocks.shortsB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	5, 	new ItemStack(ModBlocks.shortsC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	5, 	new ItemStack(ModBlocks.shortsD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	5, 	new ItemStack(ModBlocks.shortsE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	5, 	new ItemStack(ModBlocks.shortsF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	5, 	new ItemStack(ModBlocks.shortsG, 1, x)));
			}

			if(ModConfig.ENABLE_DEBOSSED){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				6, 	new ItemStack(ModBlocks.debossVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	6, 	new ItemStack(ModBlocks.debossClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	6, 	new ItemStack(ModBlocks.debossA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	6, 	new ItemStack(ModBlocks.debossB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	6, 	new ItemStack(ModBlocks.debossC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	6, 	new ItemStack(ModBlocks.debossD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	6, 	new ItemStack(ModBlocks.debossE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	6, 	new ItemStack(ModBlocks.debossF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	6, 	new ItemStack(ModBlocks.debossG, 1, x)));
			}

			if(ModConfig.ENABLE_FLOORS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				7, 	new ItemStack(ModBlocks.floorsVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	7, 	new ItemStack(ModBlocks.floorsClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	7, 	new ItemStack(ModBlocks.floorsA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	7, 	new ItemStack(ModBlocks.floorsB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	7, 	new ItemStack(ModBlocks.floorsC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	7, 	new ItemStack(ModBlocks.floorsD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	7, 	new ItemStack(ModBlocks.floorsE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	7, 	new ItemStack(ModBlocks.floorsF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	7, 	new ItemStack(ModBlocks.floorsG, 1, x)));
			}

			if(ModConfig.ENABLE_TILES){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				8, 	new ItemStack(ModBlocks.tilesVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	8, 	new ItemStack(ModBlocks.tilesClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	8, 	new ItemStack(ModBlocks.tilesA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	8, 	new ItemStack(ModBlocks.tilesB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	8, 	new ItemStack(ModBlocks.tilesC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	8, 	new ItemStack(ModBlocks.tilesD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	8, 	new ItemStack(ModBlocks.tilesE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	8, 	new ItemStack(ModBlocks.tilesF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	8, 	new ItemStack(ModBlocks.tilesG, 1, x)));
			}

			if(ModConfig.ENABLE_CARVED){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				9, 	new ItemStack(ModBlocks.carvedVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	9, 	new ItemStack(ModBlocks.carvedClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	9, 	new ItemStack(ModBlocks.carvedA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	9, 	new ItemStack(ModBlocks.carvedB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	9, 	new ItemStack(ModBlocks.carvedC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	9, 	new ItemStack(ModBlocks.carvedD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	9, 	new ItemStack(ModBlocks.carvedE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	9, 	new ItemStack(ModBlocks.carvedF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	9, 	new ItemStack(ModBlocks.carvedG, 1, x)));
			}

			if(ModConfig.ENABLE_COLUMNS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				10, new ItemStack(ModBlocks.columnsVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	10, new ItemStack(ModBlocks.columnsClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	10,	new ItemStack(ModBlocks.columnsA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	10,	new ItemStack(ModBlocks.columnsB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	10,	new ItemStack(ModBlocks.columnsC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	10,	new ItemStack(ModBlocks.columnsD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	10,	new ItemStack(ModBlocks.columnsE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	10,	new ItemStack(ModBlocks.columnsF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	10,	new ItemStack(ModBlocks.columnsG, 1, x)));
			}

			if(ModConfig.ENABLE_DORICS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				11, new ItemStack(ModBlocks.doricsVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	11,	new ItemStack(ModBlocks.doricsClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	11, new ItemStack(ModBlocks.doricsA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	11, new ItemStack(ModBlocks.doricsB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	11, new ItemStack(ModBlocks.doricsC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	11, new ItemStack(ModBlocks.doricsD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	11, new ItemStack(ModBlocks.doricsE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	11, new ItemStack(ModBlocks.doricsF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	11, new ItemStack(ModBlocks.doricsG, 1, x)));
			}

			if(ModConfig.ENABLE_TETRAS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				12, new ItemStack(ModBlocks.tetrasVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	12, new ItemStack(ModBlocks.tetrasClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	12, new ItemStack(ModBlocks.tetrasA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	12, new ItemStack(ModBlocks.tetrasB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	12, new ItemStack(ModBlocks.tetrasC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	12, new ItemStack(ModBlocks.tetrasD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	12, new ItemStack(ModBlocks.tetrasE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	12, new ItemStack(ModBlocks.tetrasF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	12, new ItemStack(ModBlocks.tetrasG, 1, x)));
			}

			if(ModConfig.ENABLE_POSTS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				13, new ItemStack(ModBlocks.postsVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	13,	new ItemStack(ModBlocks.postsClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	13, new ItemStack(ModBlocks.postsA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	13, new ItemStack(ModBlocks.postsB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	13, new ItemStack(ModBlocks.postsC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	13, new ItemStack(ModBlocks.postsD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	13, new ItemStack(ModBlocks.postsE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	13, new ItemStack(ModBlocks.postsF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	13, new ItemStack(ModBlocks.postsG, 1, x)));
			}

			if(ModConfig.ENABLE_SEGMENTED){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				14, new ItemStack(ModBlocks.segmentedVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	14, new ItemStack(ModBlocks.segmentedClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	14, new ItemStack(ModBlocks.segmentedA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	14, new ItemStack(ModBlocks.segmentedB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	14, new ItemStack(ModBlocks.segmentedC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	14, new ItemStack(ModBlocks.segmentedD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	14, new ItemStack(ModBlocks.segmentedE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	14, new ItemStack(ModBlocks.segmentedF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	14, new ItemStack(ModBlocks.segmentedG, 1, x)));
			}

			if(ModConfig.ENABLE_FANCY){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				15, new ItemStack(ModBlocks.fancysVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	15, new ItemStack(ModBlocks.fancysClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	15, new ItemStack(ModBlocks.fancysA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	15, new ItemStack(ModBlocks.fancysB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	15, new ItemStack(ModBlocks.fancysC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	15, new ItemStack(ModBlocks.fancysD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	15, new ItemStack(ModBlocks.fancysE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	15, new ItemStack(ModBlocks.fancysF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	15, new ItemStack(ModBlocks.fancysG, 1, x)));
			}

			if(ModConfig.ENABLE_STELE){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				16, new ItemStack(ModBlocks.stelesVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	16, new ItemStack(ModBlocks.stelesClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	16, new ItemStack(ModBlocks.stelesA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	16, new ItemStack(ModBlocks.stelesB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	16, new ItemStack(ModBlocks.stelesC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	16, new ItemStack(ModBlocks.stelesD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	16, new ItemStack(ModBlocks.stelesE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	16, new ItemStack(ModBlocks.stelesF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	16, new ItemStack(ModBlocks.stelesG, 1, x)));
			}

			if(ModConfig.ENABLE_FOUNTAINS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				17, new ItemStack(ModBlocks.fountainsVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	17, new ItemStack(ModBlocks.fountainsClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	17, new ItemStack(ModBlocks.fountainsA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	17, new ItemStack(ModBlocks.fountainsB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	17, new ItemStack(ModBlocks.fountainsC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	17, new ItemStack(ModBlocks.fountainsD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	17, new ItemStack(ModBlocks.fountainsE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	17, new ItemStack(ModBlocks.fountainsF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	17, new ItemStack(ModBlocks.fountainsG, 1, x)));
			}

			if(ModConfig.ENABLE_LANTERNS){
				cuttingRecipes.add(new CuttingStationRecipes(ToolUtils.vanillaPlain[x], 				18, new ItemStack(ModBlocks.lanternsVanilla, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15-x), 	18, new ItemStack(ModBlocks.lanternsClay, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksA, 1, x), 	18, new ItemStack(ModBlocks.lanternsA, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksB, 1, x), 	18, new ItemStack(ModBlocks.lanternsB, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksC, 1, x), 	18, new ItemStack(ModBlocks.lanternsC, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksD, 1, x), 	18, new ItemStack(ModBlocks.lanternsD, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksE, 1, x), 	18, new ItemStack(ModBlocks.lanternsE, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksF, 1, x), 	18, new ItemStack(ModBlocks.lanternsF, 1, x)));
				cuttingRecipes.add(new CuttingStationRecipes(new ItemStack(ModBlocks.blocksG, 1, x), 	18, new ItemStack(ModBlocks.lanternsG, 1, x)));
			}
		}
	}

}