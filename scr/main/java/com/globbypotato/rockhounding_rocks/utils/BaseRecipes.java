package com.globbypotato.rockhounding_rocks.utils;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class BaseRecipes {
	public static ItemStack machines(int num, EnumMachines meta){return new ItemStack(ModBlocks.MACHINES, num, meta.ordinal());}
	public static ItemStack cutting_station = machines(1, EnumMachines.CUTTING_STATION);
	public static ItemStack rock_vendor = machines(1, EnumMachines.ROCK_VENDOR);
	public static ItemStack animated_wheel = machines(1, EnumMachines.MILL_WHEEL_ANIMATED);
	public static ItemStack animated_rammer = machines(1, EnumMachines.STONE_RAMMER_ANIMATED);
	public static ItemStack animated_bench = machines(1, EnumMachines.CARVING_BENCH_ANIMATED);
	public static ItemStack animated_sculpting = machines(1, EnumMachines.SCULPTING_BENCH_ANIMATED);
	public static ItemStack still_bench = machines(1, EnumMachines.CARVING_BENCH);
	public static ItemStack still_sculpting = machines(1, EnumMachines.SCULPTING_BENCH);
	
	public static ItemStack terracotta(int meta) {return new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, meta);}
	public static ItemStack concrete(int meta) {return new ItemStack(Blocks.CONCRETE, 1, meta);}

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

	public static ItemStack[] vanilla2Plain = new ItemStack[]{
			new ItemStack(Blocks.PURPUR_BLOCK),
			new ItemStack(Blocks.GLOWSTONE),
			new ItemStack(Blocks.PACKED_ICE),
			new ItemStack(Blocks.BROWN_MUSHROOM_BLOCK),
			new ItemStack(Blocks.RED_MUSHROOM_BLOCK),
			new ItemStack(Blocks.BROWN_MUSHROOM),
			new ItemStack(Blocks.PRISMARINE, 1, 2),
			new ItemStack(Blocks.SPONGE),
			new ItemStack(Blocks.MYCELIUM),
			new ItemStack(Blocks.BRICK_BLOCK),
			new ItemStack(Blocks.PLANKS,1,0),
			new ItemStack(Blocks.PLANKS,1,2),
			new ItemStack(Blocks.PLANKS,1,3),
			new ItemStack(Blocks.PLANKS,1,1),
			new ItemStack(Blocks.PLANKS,1,5),
			new ItemStack(Blocks.PLANKS,1,4)};

	public static ItemStack raw_rocksA(int meta) {return new ItemStack(ModBlocks.ROCKS_A, 1, meta);}
	public static ItemStack raw_rocksB(int meta) {return new ItemStack(ModBlocks.ROCKS_B, 1, meta);}
	public static ItemStack raw_rocksC(int meta) {return new ItemStack(ModBlocks.ROCKS_C, 1, meta);}
	public static ItemStack raw_rocksD(int meta) {return new ItemStack(ModBlocks.ROCKS_D, 1, meta);}
	public static ItemStack raw_rocksE(int meta) {return new ItemStack(ModBlocks.ROCKS_E, 1, meta);}
	public static ItemStack raw_rocksF(int meta) {return new ItemStack(ModBlocks.ROCKS_F, 1, meta);}
	public static ItemStack raw_rocksG(int meta) {return new ItemStack(ModBlocks.ROCKS_G, 1, meta);}
	public static ItemStack raw_rocksH(int meta) {return new ItemStack(ModBlocks.ROCKS_H, 1, meta);}

	public static ItemStack plainsA(int meta) {return new ItemStack(ModBlocks.BLOCKS_A, 1, meta);}
	public static ItemStack plainsB(int meta) {return new ItemStack(ModBlocks.BLOCKS_B, 1, meta);}
	public static ItemStack plainsC(int meta) {return new ItemStack(ModBlocks.BLOCKS_C, 1, meta);}
	public static ItemStack plainsD(int meta) {return new ItemStack(ModBlocks.BLOCKS_D, 1, meta);}
	public static ItemStack plainsE(int meta) {return new ItemStack(ModBlocks.BLOCKS_E, 1, meta);}
	public static ItemStack plainsF(int meta) {return new ItemStack(ModBlocks.BLOCKS_F, 1, meta);}
	public static ItemStack plainsG(int meta) {return new ItemStack(ModBlocks.BLOCKS_G, 1, meta);}
	public static ItemStack plainsH(int meta) {return new ItemStack(ModBlocks.BLOCKS_H, 1, meta);}
	public static ItemStack plainsVanilla2(int meta) {return new ItemStack(ModBlocks.BLOCKS_VANILLA2, 1, meta);}

	public static ItemStack polishedA(int meta) {return new ItemStack(ModBlocks.POLISHED_A, 1, meta);}
	public static ItemStack polishedB(int meta) {return new ItemStack(ModBlocks.POLISHED_B, 1, meta);}
	public static ItemStack polishedC(int meta) {return new ItemStack(ModBlocks.POLISHED_C, 1, meta);}
	public static ItemStack polishedD(int meta) {return new ItemStack(ModBlocks.POLISHED_D, 1, meta);}
	public static ItemStack polishedE(int meta) {return new ItemStack(ModBlocks.POLISHED_E, 1, meta);}
	public static ItemStack polishedF(int meta) {return new ItemStack(ModBlocks.POLISHED_F, 1, meta);}
	public static ItemStack polishedG(int meta) {return new ItemStack(ModBlocks.POLISHED_G, 1, meta);}
	public static ItemStack polishedH(int meta) {return new ItemStack(ModBlocks.POLISHED_H, 1, meta);}
	public static ItemStack polishedVanilla(int meta) {return new ItemStack(ModBlocks.POLISHED_VANILLA, 1, meta);}
	public static ItemStack polishedVanilla2(int meta) {return new ItemStack(ModBlocks.POLISHED_VANILLA2, 1, meta);}
	public static ItemStack polishedClay(int meta) {return new ItemStack(ModBlocks.POLISHED_CLAY, 1, meta);}
	public static ItemStack polishedConcrete(int meta) {return new ItemStack(ModBlocks.POLISHED_CONCRETE, 1, meta);}

	public static ItemStack bricksA(int meta) {return new ItemStack(ModBlocks.BRICKS_A, 1, meta);}
	public static ItemStack bricksB(int meta) {return new ItemStack(ModBlocks.BRICKS_B, 1, meta);}
	public static ItemStack bricksC(int meta) {return new ItemStack(ModBlocks.BRICKS_C, 1, meta);}
	public static ItemStack bricksD(int meta) {return new ItemStack(ModBlocks.BRICKS_D, 1, meta);}
	public static ItemStack bricksE(int meta) {return new ItemStack(ModBlocks.BRICKS_E, 1, meta);}
	public static ItemStack bricksF(int meta) {return new ItemStack(ModBlocks.BRICKS_F, 1, meta);}
	public static ItemStack bricksG(int meta) {return new ItemStack(ModBlocks.BRICKS_G, 1, meta);}
	public static ItemStack bricksH(int meta) {return new ItemStack(ModBlocks.BRICKS_H, 1, meta);}
	public static ItemStack bricksVanilla(int meta) {return new ItemStack(ModBlocks.BRICKS_VANILLA, 1, meta);}
	public static ItemStack bricksVanilla2(int meta) {return new ItemStack(ModBlocks.BRICKS_VANILLA2, 1, meta);}
	public static ItemStack bricksClay(int meta) {return new ItemStack(ModBlocks.BRICKS_CLAY, 1, meta);}
	public static ItemStack bricksConcrete(int meta) {return new ItemStack(ModBlocks.BRICKS_CONCRETE, 1, meta);}

	public static ItemStack slabsA(int meta) {return new ItemStack(ModBlocks.SLABS_A, 1, meta);}
	public static ItemStack slabsB(int meta) {return new ItemStack(ModBlocks.SLABS_B, 1, meta);}
	public static ItemStack slabsC(int meta) {return new ItemStack(ModBlocks.SLABS_C, 1, meta);}
	public static ItemStack slabsD(int meta) {return new ItemStack(ModBlocks.SLABS_D, 1, meta);}
	public static ItemStack slabsE(int meta) {return new ItemStack(ModBlocks.SLABS_E, 1, meta);}
	public static ItemStack slabsF(int meta) {return new ItemStack(ModBlocks.SLABS_F, 1, meta);}
	public static ItemStack slabsG(int meta) {return new ItemStack(ModBlocks.SLABS_G, 1, meta);}
	public static ItemStack slabsH(int meta) {return new ItemStack(ModBlocks.SLABS_H, 1, meta);}
	public static ItemStack slabsVanilla(int meta) {return new ItemStack(ModBlocks.SLABS_VANILLA, 1, meta);}
	public static ItemStack slabsVanilla2(int meta) {return new ItemStack(ModBlocks.SLABS_VANILLA2, 1, meta);}
	public static ItemStack slabsClay(int meta) {return new ItemStack(ModBlocks.SLABS_CLAY, 1, meta);}
	public static ItemStack slabsConcrete(int meta) {return new ItemStack(ModBlocks.SLABS_CONCRETE, 1, meta);}

	public static ItemStack pillarsA(int meta) {return new ItemStack(ModBlocks.PILLARS_A, 1, meta);}
	public static ItemStack pillarsB(int meta) {return new ItemStack(ModBlocks.PILLARS_B, 1, meta);}
	public static ItemStack pillarsC(int meta) {return new ItemStack(ModBlocks.PILLARS_C, 1, meta);}
	public static ItemStack pillarsD(int meta) {return new ItemStack(ModBlocks.PILLARS_D, 1, meta);}
	public static ItemStack pillarsE(int meta) {return new ItemStack(ModBlocks.PILLARS_E, 1, meta);}
	public static ItemStack pillarsF(int meta) {return new ItemStack(ModBlocks.PILLARS_F, 1, meta);}
	public static ItemStack pillarsG(int meta) {return new ItemStack(ModBlocks.PILLARS_G, 1, meta);}
	public static ItemStack pillarsH(int meta) {return new ItemStack(ModBlocks.PILLARS_H, 1, meta);}
	public static ItemStack pillarsVanilla(int meta) {return new ItemStack(ModBlocks.PILLARS_VANILLA, 1, meta);}
	public static ItemStack pillarsVanilla2(int meta) {return new ItemStack(ModBlocks.PILLARS_VANILLA2, 1, meta);}
	public static ItemStack pillarsClay(int meta) {return new ItemStack(ModBlocks.PILLARS_CLAY, 1, meta);}
	public static ItemStack pillarsConcrete(int meta) {return new ItemStack(ModBlocks.PILLARS_CONCRETE, 1, meta);}

	public static ItemStack shortsA(int meta) {return new ItemStack(ModBlocks.SHORTS_A, 1, meta);}
	public static ItemStack shortsB(int meta) {return new ItemStack(ModBlocks.SHORTS_B, 1, meta);}
	public static ItemStack shortsC(int meta) {return new ItemStack(ModBlocks.SHORTS_C, 1, meta);}
	public static ItemStack shortsD(int meta) {return new ItemStack(ModBlocks.SHORTS_D, 1, meta);}
	public static ItemStack shortsE(int meta) {return new ItemStack(ModBlocks.SHORTS_E, 1, meta);}
	public static ItemStack shortsF(int meta) {return new ItemStack(ModBlocks.SHORTS_F, 1, meta);}
	public static ItemStack shortsG(int meta) {return new ItemStack(ModBlocks.SHORTS_G, 1, meta);}
	public static ItemStack shortsH(int meta) {return new ItemStack(ModBlocks.SHORTS_H, 1, meta);}
	public static ItemStack shortsVanilla(int meta) {return new ItemStack(ModBlocks.SHORTS_VANILLA, 1, meta);}
	public static ItemStack shortsVanilla2(int meta) {return new ItemStack(ModBlocks.SHORTS_VANILLA2, 1, meta);}
	public static ItemStack shortsClay(int meta) {return new ItemStack(ModBlocks.SHORTS_CLAY, 1, meta);}
	public static ItemStack shortsConcrete(int meta) {return new ItemStack(ModBlocks.SHORTS_CONCRETE, 1, meta);}

	public static ItemStack debossA(int meta) {return new ItemStack(ModBlocks.DEBOSS_A, 1, meta);}
	public static ItemStack debossB(int meta) {return new ItemStack(ModBlocks.DEBOSS_B, 1, meta);}
	public static ItemStack debossC(int meta) {return new ItemStack(ModBlocks.DEBOSS_C, 1, meta);}
	public static ItemStack debossD(int meta) {return new ItemStack(ModBlocks.DEBOSS_D, 1, meta);}
	public static ItemStack debossE(int meta) {return new ItemStack(ModBlocks.DEBOSS_E, 1, meta);}
	public static ItemStack debossF(int meta) {return new ItemStack(ModBlocks.DEBOSS_F, 1, meta);}
	public static ItemStack debossG(int meta) {return new ItemStack(ModBlocks.DEBOSS_G, 1, meta);}
	public static ItemStack debossH(int meta) {return new ItemStack(ModBlocks.DEBOSS_H, 1, meta);}
	public static ItemStack debossVanilla(int meta) {return new ItemStack(ModBlocks.DEBOSS_VANILLA, 1, meta);}
	public static ItemStack debossVanilla2(int meta) {return new ItemStack(ModBlocks.DEBOSS_VANILLA2, 1, meta);}
	public static ItemStack debossClay(int meta) {return new ItemStack(ModBlocks.DEBOSS_CLAY, 1, meta);}
	public static ItemStack debossConcrete(int meta) {return new ItemStack(ModBlocks.DEBOSS_CONCRETE, 1, meta);}

	public static ItemStack floorsA(int meta) {return new ItemStack(ModBlocks.FLOORS_A, 1, meta);}
	public static ItemStack floorsB(int meta) {return new ItemStack(ModBlocks.FLOORS_B, 1, meta);}
	public static ItemStack floorsC(int meta) {return new ItemStack(ModBlocks.FLOORS_C, 1, meta);}
	public static ItemStack floorsD(int meta) {return new ItemStack(ModBlocks.FLOORS_D, 1, meta);}
	public static ItemStack floorsE(int meta) {return new ItemStack(ModBlocks.FLOORS_E, 1, meta);}
	public static ItemStack floorsF(int meta) {return new ItemStack(ModBlocks.FLOORS_F, 1, meta);}
	public static ItemStack floorsG(int meta) {return new ItemStack(ModBlocks.FLOORS_G, 1, meta);}
	public static ItemStack floorsH(int meta) {return new ItemStack(ModBlocks.FLOORS_H, 1, meta);}
	public static ItemStack floorsVanilla(int meta) {return new ItemStack(ModBlocks.FLOORS_VANILLA, 1, meta);}
	public static ItemStack floorsVanilla2(int meta) {return new ItemStack(ModBlocks.FLOORS_VANILLA2, 1, meta);}
	public static ItemStack floorsClay(int meta) {return new ItemStack(ModBlocks.FLOORS_CLAY, 1, meta);}
	public static ItemStack floorsConcrete(int meta) {return new ItemStack(ModBlocks.FLOORS_CONCRETE, 1, meta);}

	public static ItemStack pavesA(int meta) {return new ItemStack(ModBlocks.PAVES_A, 1, meta);}
	public static ItemStack pavesB(int meta) {return new ItemStack(ModBlocks.PAVES_B, 1, meta);}
	public static ItemStack pavesC(int meta) {return new ItemStack(ModBlocks.PAVES_C, 1, meta);}
	public static ItemStack pavesD(int meta) {return new ItemStack(ModBlocks.PAVES_D, 1, meta);}
	public static ItemStack pavesE(int meta) {return new ItemStack(ModBlocks.PAVES_E, 1, meta);}
	public static ItemStack pavesF(int meta) {return new ItemStack(ModBlocks.PAVES_F, 1, meta);}
	public static ItemStack pavesG(int meta) {return new ItemStack(ModBlocks.PAVES_G, 1, meta);}
	public static ItemStack pavesH(int meta) {return new ItemStack(ModBlocks.PAVES_H, 1, meta);}
	public static ItemStack pavesVanilla(int meta) {return new ItemStack(ModBlocks.PAVES_VANILLA, 1, meta);}
	public static ItemStack pavesVanilla2(int meta) {return new ItemStack(ModBlocks.PAVES_VANILLA2, 1, meta);}
	public static ItemStack pavesClay(int meta) {return new ItemStack(ModBlocks.PAVES_CLAY, 1, meta);}
	public static ItemStack pavesConcrete(int meta) {return new ItemStack(ModBlocks.PAVES_CONCRETE, 1, meta);}

	public static ItemStack tilesA(int meta) {return new ItemStack(ModBlocks.TILES_A, 1, meta);}
	public static ItemStack tilesB(int meta) {return new ItemStack(ModBlocks.TILES_B, 1, meta);}
	public static ItemStack tilesC(int meta) {return new ItemStack(ModBlocks.TILES_C, 1, meta);}
	public static ItemStack tilesD(int meta) {return new ItemStack(ModBlocks.TILES_D, 1, meta);}
	public static ItemStack tilesE(int meta) {return new ItemStack(ModBlocks.TILES_E, 1, meta);}
	public static ItemStack tilesF(int meta) {return new ItemStack(ModBlocks.TILES_F, 1, meta);}
	public static ItemStack tilesG(int meta) {return new ItemStack(ModBlocks.TILES_G, 1, meta);}
	public static ItemStack tilesH(int meta) {return new ItemStack(ModBlocks.TILES_H, 1, meta);}
	public static ItemStack tilesVanilla(int meta) {return new ItemStack(ModBlocks.TILES_VANILLA, 1, meta);}
	public static ItemStack tilesVanilla2(int meta) {return new ItemStack(ModBlocks.TILES_VANILLA2, 1, meta);}
	public static ItemStack tilesClay(int meta) {return new ItemStack(ModBlocks.TILES_CLAY, 1, meta);}
	public static ItemStack tilesConcrete(int meta) {return new ItemStack(ModBlocks.TILES_CONCRETE, 1, meta);}

	public static ItemStack carvedA(int meta) {return new ItemStack(ModBlocks.CARVED_A, 1, meta);}
	public static ItemStack carvedB(int meta) {return new ItemStack(ModBlocks.CARVED_B, 1, meta);}
	public static ItemStack carvedC(int meta) {return new ItemStack(ModBlocks.CARVED_C, 1, meta);}
	public static ItemStack carvedD(int meta) {return new ItemStack(ModBlocks.CARVED_D, 1, meta);}
	public static ItemStack carvedE(int meta) {return new ItemStack(ModBlocks.CARVED_E, 1, meta);}
	public static ItemStack carvedF(int meta) {return new ItemStack(ModBlocks.CARVED_F, 1, meta);}
	public static ItemStack carvedG(int meta) {return new ItemStack(ModBlocks.CARVED_G, 1, meta);}
	public static ItemStack carvedH(int meta) {return new ItemStack(ModBlocks.CARVED_H, 1, meta);}
	public static ItemStack carvedVanilla(int meta) {return new ItemStack(ModBlocks.CARVED_VANILLA, 1, meta);}
	public static ItemStack carvedVanilla2(int meta) {return new ItemStack(ModBlocks.CARVED_VANILLA2, 1, meta);}
	public static ItemStack carvedClay(int meta) {return new ItemStack(ModBlocks.CARVED_CLAY, 1, meta);}
	public static ItemStack carvedConcrete(int meta) {return new ItemStack(ModBlocks.CARVED_CONCRETE, 1, meta);}

	public static ItemStack flutedA(int meta) {return new ItemStack(ModBlocks.COLUMNS_A, 1, meta);}
	public static ItemStack flutedB(int meta) {return new ItemStack(ModBlocks.COLUMNS_B, 1, meta);}
	public static ItemStack flutedC(int meta) {return new ItemStack(ModBlocks.COLUMNS_C, 1, meta);}
	public static ItemStack flutedD(int meta) {return new ItemStack(ModBlocks.COLUMNS_D, 1, meta);}
	public static ItemStack flutedE(int meta) {return new ItemStack(ModBlocks.COLUMNS_E, 1, meta);}
	public static ItemStack flutedF(int meta) {return new ItemStack(ModBlocks.COLUMNS_F, 1, meta);}
	public static ItemStack flutedG(int meta) {return new ItemStack(ModBlocks.COLUMNS_G, 1, meta);}
	public static ItemStack flutedH(int meta) {return new ItemStack(ModBlocks.COLUMNS_H, 1, meta);}
	public static ItemStack flutedVanilla(int meta) {return new ItemStack(ModBlocks.COLUMNS_VANILLA, 1, meta);}
	public static ItemStack flutedVanilla2(int meta) {return new ItemStack(ModBlocks.COLUMNS_VANILLA2, 1, meta);}
	public static ItemStack flutedClay(int meta) {return new ItemStack(ModBlocks.COLUMNS_CLAY, 1, meta);}
	public static ItemStack flutedConcrete(int meta) {return new ItemStack(ModBlocks.COLUMNS_CONCRETE, 1, meta);}

	public static ItemStack doricsA(int meta) {return new ItemStack(ModBlocks.DORICS_A, 1, meta);}
	public static ItemStack doricsB(int meta) {return new ItemStack(ModBlocks.DORICS_B, 1, meta);}
	public static ItemStack doricsC(int meta) {return new ItemStack(ModBlocks.DORICS_C, 1, meta);}
	public static ItemStack doricsD(int meta) {return new ItemStack(ModBlocks.DORICS_D, 1, meta);}
	public static ItemStack doricsE(int meta) {return new ItemStack(ModBlocks.DORICS_E, 1, meta);}
	public static ItemStack doricsF(int meta) {return new ItemStack(ModBlocks.DORICS_F, 1, meta);}
	public static ItemStack doricsG(int meta) {return new ItemStack(ModBlocks.DORICS_G, 1, meta);}
	public static ItemStack doricsH(int meta) {return new ItemStack(ModBlocks.DORICS_H, 1, meta);}
	public static ItemStack doricsVanilla(int meta) {return new ItemStack(ModBlocks.DORICS_VANILLA, 1, meta);}
	public static ItemStack doricsVanilla2(int meta) {return new ItemStack(ModBlocks.DORICS_VANILLA2, 1, meta);}
	public static ItemStack doricsClay(int meta) {return new ItemStack(ModBlocks.DORICS_CLAY, 1, meta);}
	public static ItemStack doricsConcrete(int meta) {return new ItemStack(ModBlocks.DORICS_CONCRETE, 1, meta);}

	public static ItemStack tetrasA(int meta) {return new ItemStack(ModBlocks.TETRAS_A, 1, meta);}
	public static ItemStack tetrasB(int meta) {return new ItemStack(ModBlocks.TETRAS_B, 1, meta);}
	public static ItemStack tetrasC(int meta) {return new ItemStack(ModBlocks.TETRAS_C, 1, meta);}
	public static ItemStack tetrasD(int meta) {return new ItemStack(ModBlocks.TETRAS_D, 1, meta);}
	public static ItemStack tetrasE(int meta) {return new ItemStack(ModBlocks.TETRAS_E, 1, meta);}
	public static ItemStack tetrasF(int meta) {return new ItemStack(ModBlocks.TETRAS_F, 1, meta);}
	public static ItemStack tetrasG(int meta) {return new ItemStack(ModBlocks.TETRAS_G, 1, meta);}
	public static ItemStack tetrasH(int meta) {return new ItemStack(ModBlocks.TETRAS_H, 1, meta);}
	public static ItemStack tetrasVanilla(int meta) {return new ItemStack(ModBlocks.TETRAS_VANILLA, 1, meta);}
	public static ItemStack tetrasVanilla2(int meta) {return new ItemStack(ModBlocks.TETRAS_VANILLA2, 1, meta);}
	public static ItemStack tetrasClay(int meta) {return new ItemStack(ModBlocks.TETRAS_CLAY, 1, meta);}
	public static ItemStack tetrasConcrete(int meta) {return new ItemStack(ModBlocks.TETRAS_CONCRETE, 1, meta);}

	public static ItemStack pedestalsA(int meta) {return new ItemStack(ModBlocks.PEDESTALS_A, 1, meta);}
	public static ItemStack pedestalsB(int meta) {return new ItemStack(ModBlocks.PEDESTALS_B, 1, meta);}
	public static ItemStack pedestalsC(int meta) {return new ItemStack(ModBlocks.PEDESTALS_C, 1, meta);}
	public static ItemStack pedestalsD(int meta) {return new ItemStack(ModBlocks.PEDESTALS_D, 1, meta);}
	public static ItemStack pedestalsE(int meta) {return new ItemStack(ModBlocks.PEDESTALS_E, 1, meta);}
	public static ItemStack pedestalsF(int meta) {return new ItemStack(ModBlocks.PEDESTALS_F, 1, meta);}
	public static ItemStack pedestalsG(int meta) {return new ItemStack(ModBlocks.PEDESTALS_G, 1, meta);}
	public static ItemStack pedestalsH(int meta) {return new ItemStack(ModBlocks.PEDESTALS_H, 1, meta);}
	public static ItemStack pedestalsVanilla(int meta) {return new ItemStack(ModBlocks.PEDESTALS_VANILLA, 1, meta);}
	public static ItemStack pedestalsVanilla2(int meta) {return new ItemStack(ModBlocks.PEDESTALS_VANILLA2, 1, meta);}
	public static ItemStack pedestalsClay(int meta) {return new ItemStack(ModBlocks.PEDESTALS_CLAY, 1, meta);}
	public static ItemStack pedestalsConcrete(int meta) {return new ItemStack(ModBlocks.PEDESTALS_CONCRETE, 1, meta);}

	public static ItemStack segmentedA(int meta) {return new ItemStack(ModBlocks.SEGMENTED_A, 1, meta);}
	public static ItemStack segmentedB(int meta) {return new ItemStack(ModBlocks.SEGMENTED_B, 1, meta);}
	public static ItemStack segmentedC(int meta) {return new ItemStack(ModBlocks.SEGMENTED_C, 1, meta);}
	public static ItemStack segmentedD(int meta) {return new ItemStack(ModBlocks.SEGMENTED_D, 1, meta);}
	public static ItemStack segmentedE(int meta) {return new ItemStack(ModBlocks.SEGMENTED_E, 1, meta);}
	public static ItemStack segmentedF(int meta) {return new ItemStack(ModBlocks.SEGMENTED_F, 1, meta);}
	public static ItemStack segmentedG(int meta) {return new ItemStack(ModBlocks.SEGMENTED_G, 1, meta);}
	public static ItemStack segmentedH(int meta) {return new ItemStack(ModBlocks.SEGMENTED_H, 1, meta);}
	public static ItemStack segmentedVanilla(int meta) {return new ItemStack(ModBlocks.SEGMENTED_VANILLA, 1, meta);}
	public static ItemStack segmentedVanilla2(int meta) {return new ItemStack(ModBlocks.SEGMENTED_VANILLA2, 1, meta);}
	public static ItemStack segmentedClay(int meta) {return new ItemStack(ModBlocks.SEGMENTED_CLAY, 1, meta);}
	public static ItemStack segmentedConcrete(int meta) {return new ItemStack(ModBlocks.SEGMENTED_CONCRETE, 1, meta);}

	public static ItemStack fancysA(int meta) {return new ItemStack(ModBlocks.FANCYS_A, 1, meta);}
	public static ItemStack fancysB(int meta) {return new ItemStack(ModBlocks.FANCYS_B, 1, meta);}
	public static ItemStack fancysC(int meta) {return new ItemStack(ModBlocks.FANCYS_C, 1, meta);}
	public static ItemStack fancysD(int meta) {return new ItemStack(ModBlocks.FANCYS_D, 1, meta);}
	public static ItemStack fancysE(int meta) {return new ItemStack(ModBlocks.FANCYS_E, 1, meta);}
	public static ItemStack fancysF(int meta) {return new ItemStack(ModBlocks.FANCYS_F, 1, meta);}
	public static ItemStack fancysG(int meta) {return new ItemStack(ModBlocks.FANCYS_G, 1, meta);}
	public static ItemStack fancysH(int meta) {return new ItemStack(ModBlocks.FANCYS_H, 1, meta);}
	public static ItemStack fancysVanilla(int meta) {return new ItemStack(ModBlocks.FANCYS_VANILLA, 1, meta);}
	public static ItemStack fancysVanilla2(int meta) {return new ItemStack(ModBlocks.FANCYS_VANILLA2, 1, meta);}
	public static ItemStack fancysClay(int meta) {return new ItemStack(ModBlocks.FANCYS_CLAY, 1, meta);}
	public static ItemStack fancysConcrete(int meta) {return new ItemStack(ModBlocks.FANCYS_CONCRETE, 1, meta);}

	public static ItemStack stelesA(int meta) {return new ItemStack(ModBlocks.STELES_A, 1, meta);}
	public static ItemStack stelesB(int meta) {return new ItemStack(ModBlocks.STELES_B, 1, meta);}
	public static ItemStack stelesC(int meta) {return new ItemStack(ModBlocks.STELES_C, 1, meta);}
	public static ItemStack stelesD(int meta) {return new ItemStack(ModBlocks.STELES_D, 1, meta);}
	public static ItemStack stelesE(int meta) {return new ItemStack(ModBlocks.STELES_E, 1, meta);}
	public static ItemStack stelesF(int meta) {return new ItemStack(ModBlocks.STELES_F, 1, meta);}
	public static ItemStack stelesG(int meta) {return new ItemStack(ModBlocks.STELES_G, 1, meta);}
	public static ItemStack stelesH(int meta) {return new ItemStack(ModBlocks.STELES_H, 1, meta);}
	public static ItemStack stelesVanilla(int meta) {return new ItemStack(ModBlocks.STELES_VANILLA, 1, meta);}
	public static ItemStack stelesVanilla2(int meta) {return new ItemStack(ModBlocks.STELES_VANILLA2, 1, meta);}
	public static ItemStack stelesClay(int meta) {return new ItemStack(ModBlocks.STELES_CLAY, 1, meta);}
	public static ItemStack stelesConcrete(int meta) {return new ItemStack(ModBlocks.STELES_CONCRETE, 1, meta);}

	public static ItemStack fountainsA(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_A, 1, meta);}
	public static ItemStack fountainsB(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_B, 1, meta);}
	public static ItemStack fountainsC(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_C, 1, meta);}
	public static ItemStack fountainsD(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_D, 1, meta);}
	public static ItemStack fountainsE(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_E, 1, meta);}
	public static ItemStack fountainsF(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_F, 1, meta);}
	public static ItemStack fountainsG(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_G, 1, meta);}
	public static ItemStack fountainsH(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_H, 1, meta);}
	public static ItemStack fountainsVanilla(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_VANILLA, 1, meta);}
	public static ItemStack fountainsVanilla2(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_VANILLA2, 1, meta);}
	public static ItemStack fountainsClay(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_CLAY, 1, meta);}
	public static ItemStack fountainsConcrete(int meta) {return new ItemStack(ModBlocks.FOUNTAINS_CONCRETE, 1, meta);}

	public static ItemStack lanternsA(int meta) {return new ItemStack(ModBlocks.LANTERNS_A, 1, meta);}
	public static ItemStack lanternsB(int meta) {return new ItemStack(ModBlocks.LANTERNS_B, 1, meta);}
	public static ItemStack lanternsC(int meta) {return new ItemStack(ModBlocks.LANTERNS_C, 1, meta);}
	public static ItemStack lanternsD(int meta) {return new ItemStack(ModBlocks.LANTERNS_D, 1, meta);}
	public static ItemStack lanternsE(int meta) {return new ItemStack(ModBlocks.LANTERNS_E, 1, meta);}
	public static ItemStack lanternsF(int meta) {return new ItemStack(ModBlocks.LANTERNS_F, 1, meta);}
	public static ItemStack lanternsG(int meta) {return new ItemStack(ModBlocks.LANTERNS_G, 1, meta);}
	public static ItemStack lanternsH(int meta) {return new ItemStack(ModBlocks.LANTERNS_H, 1, meta);}
	public static ItemStack lanternsVanilla(int meta) {return new ItemStack(ModBlocks.LANTERNS_VANILLA, 1, meta);}
	public static ItemStack lanternsVanilla2(int meta) {return new ItemStack(ModBlocks.LANTERNS_VANILLA2, 1, meta);}
	public static ItemStack lanternsClay(int meta) {return new ItemStack(ModBlocks.LANTERNS_CLAY, 1, meta);}
	public static ItemStack lanternsConcrete(int meta) {return new ItemStack(ModBlocks.LANTERNS_CONCRETE, 1, meta);}

	public static ItemStack twistedA(int meta) {return new ItemStack(ModBlocks.TWISTED_A, 1, meta);}
	public static ItemStack twistedB(int meta) {return new ItemStack(ModBlocks.TWISTED_B, 1, meta);}
	public static ItemStack twistedC(int meta) {return new ItemStack(ModBlocks.TWISTED_C, 1, meta);}
	public static ItemStack twistedD(int meta) {return new ItemStack(ModBlocks.TWISTED_D, 1, meta);}
	public static ItemStack twistedE(int meta) {return new ItemStack(ModBlocks.TWISTED_E, 1, meta);}
	public static ItemStack twistedF(int meta) {return new ItemStack(ModBlocks.TWISTED_F, 1, meta);}
	public static ItemStack twistedG(int meta) {return new ItemStack(ModBlocks.TWISTED_G, 1, meta);}
	public static ItemStack twistedH(int meta) {return new ItemStack(ModBlocks.TWISTED_H, 1, meta);}
	public static ItemStack twistedVanilla(int meta) {return new ItemStack(ModBlocks.TWISTED_VANILLA, 1, meta);}
	public static ItemStack twistedVanilla2(int meta) {return new ItemStack(ModBlocks.TWISTED_VANILLA2, 1, meta);}
	public static ItemStack twistedClay(int meta) {return new ItemStack(ModBlocks.TWISTED_CLAY, 1, meta);}
	public static ItemStack twistedConcrete(int meta) {return new ItemStack(ModBlocks.TWISTED_CONCRETE, 1, meta);}

	public static ItemStack wallsA(int num, int meta) {return new ItemStack(ModBlocks.WALLS_A, num, meta);}
	public static ItemStack wallsB(int num, int meta) {return new ItemStack(ModBlocks.WALLS_B, num, meta);}
	public static ItemStack wallsC(int num, int meta) {return new ItemStack(ModBlocks.WALLS_C, num, meta);}
	public static ItemStack wallsD(int num, int meta) {return new ItemStack(ModBlocks.WALLS_D, num, meta);}
	public static ItemStack wallsE(int num, int meta) {return new ItemStack(ModBlocks.WALLS_E, num, meta);}
	public static ItemStack wallsF(int num, int meta) {return new ItemStack(ModBlocks.WALLS_F, num, meta);}
	public static ItemStack wallsG(int num, int meta) {return new ItemStack(ModBlocks.WALLS_G, num, meta);}
	public static ItemStack wallsH(int num, int meta) {return new ItemStack(ModBlocks.WALLS_H, num, meta);}

	public static ItemStack plain_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_BLOCKS_A_LO, num, meta);}
	public static ItemStack plain_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_BLOCKS_B_LO, num, meta);}
	public static ItemStack plain_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_BLOCKS_C_LO, num, meta);}
	public static ItemStack plain_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_BLOCKS_D_LO, num, meta);}
	public static ItemStack plain_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_BLOCKS_E_LO, num, meta);}
	public static ItemStack plain_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_BLOCKS_F_LO, num, meta);}
	public static ItemStack plain_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_BLOCKS_G_LO, num, meta);}
	public static ItemStack plain_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_BLOCKS_H_LO, num, meta);}

	public static ItemStack polished_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_POLISHED_A_LO, num, meta);}
	public static ItemStack polished_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_POLISHED_B_LO, num, meta);}
	public static ItemStack polished_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_POLISHED_C_LO, num, meta);}
	public static ItemStack polished_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_POLISHED_D_LO, num, meta);}
	public static ItemStack polished_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_POLISHED_E_LO, num, meta);}
	public static ItemStack polished_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_POLISHED_F_LO, num, meta);}
	public static ItemStack polished_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_POLISHED_G_LO, num, meta);}
	public static ItemStack polished_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_POLISHED_H_LO, num, meta);}

	public static ItemStack bricks_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_BRICKS_A_LO, num, meta);}
	public static ItemStack bricks_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_BRICKS_B_LO, num, meta);}
	public static ItemStack bricks_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_BRICKS_C_LO, num, meta);}
	public static ItemStack bricks_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_BRICKS_D_LO, num, meta);}
	public static ItemStack bricks_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_BRICKS_E_LO, num, meta);}
	public static ItemStack bricks_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_BRICKS_F_LO, num, meta);}
	public static ItemStack bricks_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_BRICKS_G_LO, num, meta);}
	public static ItemStack bricks_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_BRICKS_H_LO, num, meta);}

	public static ItemStack shorts_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_SHORTS_A_LO, num, meta);}
	public static ItemStack shorts_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_SHORTS_B_LO, num, meta);}
	public static ItemStack shorts_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_SHORTS_C_LO, num, meta);}
	public static ItemStack shorts_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_SHORTS_D_LO, num, meta);}
	public static ItemStack shorts_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_SHORTS_E_LO, num, meta);}
	public static ItemStack shorts_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_SHORTS_F_LO, num, meta);}
	public static ItemStack shorts_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_SHORTS_G_LO, num, meta);}
	public static ItemStack shorts_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_SHORTS_H_LO, num, meta);}

	public static ItemStack floors_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_FLOORS_A_LO, num, meta);}
	public static ItemStack floors_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_FLOORS_B_LO, num, meta);}
	public static ItemStack floors_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_FLOORS_C_LO, num, meta);}
	public static ItemStack floors_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_FLOORS_D_LO, num, meta);}
	public static ItemStack floors_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_FLOORS_E_LO, num, meta);}
	public static ItemStack floors_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_FLOORS_F_LO, num, meta);}
	public static ItemStack floors_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_FLOORS_G_LO, num, meta);}
	public static ItemStack floors_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_FLOORS_H_LO, num, meta);}

	public static ItemStack paves_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_PAVES_A_LO, num, meta);}
	public static ItemStack paves_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_PAVES_B_LO, num, meta);}
	public static ItemStack paves_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_PAVES_C_LO, num, meta);}
	public static ItemStack paves_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_PAVES_D_LO, num, meta);}
	public static ItemStack paves_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_PAVES_E_LO, num, meta);}
	public static ItemStack paves_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_PAVES_F_LO, num, meta);}
	public static ItemStack paves_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_PAVES_G_LO, num, meta);}
	public static ItemStack paves_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_PAVES_H_LO, num, meta);}

	public static ItemStack deboss_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_DEBOSS_A_LO, num, meta);}
	public static ItemStack deboss_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_DEBOSS_B_LO, num, meta);}
	public static ItemStack deboss_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_DEBOSS_C_LO, num, meta);}
	public static ItemStack deboss_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_DEBOSS_D_LO, num, meta);}
	public static ItemStack deboss_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_DEBOSS_E_LO, num, meta);}
	public static ItemStack deboss_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_DEBOSS_F_LO, num, meta);}
	public static ItemStack deboss_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_DEBOSS_G_LO, num, meta);}
	public static ItemStack deboss_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_DEBOSS_H_LO, num, meta);}

	public static ItemStack carved_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_CARVED_A_LO, num, meta);}
	public static ItemStack carved_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_CARVED_B_LO, num, meta);}
	public static ItemStack carved_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_CARVED_C_LO, num, meta);}
	public static ItemStack carved_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_CARVED_D_LO, num, meta);}
	public static ItemStack carved_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_CARVED_E_LO, num, meta);}
	public static ItemStack carved_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_CARVED_F_LO, num, meta);}
	public static ItemStack carved_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_CARVED_G_LO, num, meta);}
	public static ItemStack carved_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_CARVED_H_LO, num, meta);}

	public static ItemStack tiles_slabsA(int num, int meta) {return new ItemStack(ModBlocks.HALF_TILES_A_LO, num, meta);}
	public static ItemStack tiles_slabsB(int num, int meta) {return new ItemStack(ModBlocks.HALF_TILES_B_LO, num, meta);}
	public static ItemStack tiles_slabsC(int num, int meta) {return new ItemStack(ModBlocks.HALF_TILES_C_LO, num, meta);}
	public static ItemStack tiles_slabsD(int num, int meta) {return new ItemStack(ModBlocks.HALF_TILES_D_LO, num, meta);}
	public static ItemStack tiles_slabsE(int num, int meta) {return new ItemStack(ModBlocks.HALF_TILES_E_LO, num, meta);}
	public static ItemStack tiles_slabsF(int num, int meta) {return new ItemStack(ModBlocks.HALF_TILES_F_LO, num, meta);}
	public static ItemStack tiles_slabsG(int num, int meta) {return new ItemStack(ModBlocks.HALF_TILES_G_LO, num, meta);}
	public static ItemStack tiles_slabsH(int num, int meta) {return new ItemStack(ModBlocks.HALF_TILES_H_LO, num, meta);}

}