package com.globbypotato.rockhounding_rocks.machines.recipes;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.blocks.decos.PlainVanilla2;
import com.globbypotato.rockhounding_rocks.enums.EnumCuts;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CuttingStationRecipe;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.StoneRammerRecipe;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CuttingStationRecipes extends BaseRecipes{
	public static ArrayList<CuttingStationRecipe> cutting_station_recipes = new ArrayList<CuttingStationRecipe>();

	public static void machineRecipes() {
		for(int x = 0; x < 16; x++){
				cutting_station_recipes.add(new CuttingStationRecipe(raw_rocksA(x), 							EnumCuts.PLAIN.ordinal(), 					plainsA(x)));
				cutting_station_recipes.add(new CuttingStationRecipe(raw_rocksB(x), 							EnumCuts.PLAIN.ordinal(), 					plainsB(x)));
				cutting_station_recipes.add(new CuttingStationRecipe(raw_rocksC(x), 							EnumCuts.PLAIN.ordinal(), 					plainsC(x)));
				cutting_station_recipes.add(new CuttingStationRecipe(raw_rocksD(x), 							EnumCuts.PLAIN.ordinal(), 					plainsD(x)));
				cutting_station_recipes.add(new CuttingStationRecipe(raw_rocksE(x), 							EnumCuts.PLAIN.ordinal(), 					plainsE(x)));
				cutting_station_recipes.add(new CuttingStationRecipe(raw_rocksF(x), 							EnumCuts.PLAIN.ordinal(), 					plainsF(x)));
				cutting_station_recipes.add(new CuttingStationRecipe(raw_rocksG(x), 							EnumCuts.PLAIN.ordinal(), 					plainsG(x)));
				cutting_station_recipes.add(new CuttingStationRecipe(raw_rocksH(x), 							EnumCuts.PLAIN.ordinal(), 					plainsH(x)));

				if(PlainVanilla2.validCut(x)){
					cutting_station_recipes.add(new CuttingStationRecipe(vanilla2Plain[x], 						EnumCuts.PLAIN.ordinal(),					plainsVanilla2(x)));
				}

			if(ModConfig.ENABLE_DECO){
				if(ModConfig.ENABLE_POLISHED){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.POLISHED.ordinal(),			 	polishedA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x),						 	EnumCuts.POLISHED.ordinal(),		 		polishedB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.POLISHED.ordinal(),			 	polishedC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.POLISHED.ordinal(),			 	polishedD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.POLISHED.ordinal(), 				polishedE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.POLISHED.ordinal(),			 	polishedF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.POLISHED.ordinal(),			 	polishedG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.POLISHED.ordinal(),			 	polishedH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.POLISHED.ordinal(), 				polishedVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.POLISHED.ordinal(), 				polishedVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.POLISHED.ordinal(), 				polishedClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.POLISHED.ordinal(), 				polishedConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_BRICKS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.BRICKS.ordinal(), 					bricksA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x),						 	EnumCuts.BRICKS.ordinal(),					bricksB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.BRICKS.ordinal(),					bricksC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.BRICKS.ordinal(),					bricksD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.BRICKS.ordinal(),					bricksE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.BRICKS.ordinal(),					bricksF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.BRICKS.ordinal(),					bricksG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.BRICKS.ordinal(),					bricksH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.BRICKS.ordinal(), 					bricksVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.BRICKS.ordinal(), 					bricksVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.BRICKS.ordinal(), 					bricksClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.BRICKS.ordinal(), 					bricksConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_SLABS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.SLAB.ordinal(),			 		slabsA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.SLAB.ordinal(),				 	slabsB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x),						 	EnumCuts.SLAB.ordinal(),				 	slabsC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x),						 	EnumCuts.SLAB.ordinal(), 					slabsD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x),							EnumCuts.SLAB.ordinal(),				 	slabsE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.SLAB.ordinal(),				 	slabsF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.SLAB.ordinal(),				 	slabsG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.SLAB.ordinal(),				 	slabsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.SLAB.ordinal(), 					slabsVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.SLAB.ordinal(), 					slabsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.SLAB.ordinal(),					slabsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.SLAB.ordinal(),					slabsConcrete(x)));
					}
				}			
	
				if(ModConfig.ENABLE_SHORTS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.SHORT.ordinal(), 					shortsA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.SHORT.ordinal(),				 	shortsB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.SHORT.ordinal(),				 	shortsC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.SHORT.ordinal(),				 	shortsD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.SHORT.ordinal(), 					shortsE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.SHORT.ordinal(),				 	shortsF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.SHORT.ordinal(),				 	shortsG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.SHORT.ordinal(),				 	shortsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.SHORT.ordinal(), 					shortsVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.SHORT.ordinal(), 					shortsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.SHORT.ordinal(), 					shortsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.SHORT.ordinal(), 					shortsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_DEBOSSED){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.DEBOSSED.ordinal(), 				debossA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.DEBOSSED.ordinal(),			 	debossB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.DEBOSSED.ordinal(), 				debossC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.DEBOSSED.ordinal(), 				debossD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.DEBOSSED.ordinal(), 				debossE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.DEBOSSED.ordinal(), 				debossF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.DEBOSSED.ordinal(), 				debossG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.DEBOSSED.ordinal(), 				debossH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.DEBOSSED.ordinal(), 				debossVanilla(x)));					
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.DEBOSSED.ordinal(), 				debossVanilla2(x)));					
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.DEBOSSED.ordinal(), 				debossClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.DEBOSSED.ordinal(), 				debossConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_FLOORS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.FLOOR.ordinal(),	 			 	floorsA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.FLOOR.ordinal(), 				 	floorsB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.FLOOR.ordinal(), 				 	floorsC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.FLOOR.ordinal(), 					floorsD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x),						 	EnumCuts.FLOOR.ordinal(), 				 	floorsE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.FLOOR.ordinal(), 				 	floorsF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.FLOOR.ordinal(), 				 	floorsG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.FLOOR.ordinal(), 				 	floorsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.FLOOR.ordinal(), 					floorsVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.FLOOR.ordinal(), 					floorsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.FLOOR.ordinal(), 					floorsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.FLOOR.ordinal(), 					floorsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_PAVES){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.PAVES.ordinal(), 					pavesA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.PAVES.ordinal(), 					pavesB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.PAVES.ordinal(),				 	pavesC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.PAVES.ordinal(), 					pavesD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.PAVES.ordinal(), 					pavesE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.PAVES.ordinal(), 					pavesF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.PAVES.ordinal(), 					pavesG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.PAVES.ordinal(), 					pavesH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.PAVES.ordinal(), 					pavesVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.PAVES.ordinal(), 					pavesVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.PAVES.ordinal(), 					pavesClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.PAVES.ordinal(), 					pavesConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_TILES){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x),						 	EnumCuts.TILE.ordinal(), 					tilesA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.TILE.ordinal(),	 				tilesB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.TILE.ordinal(), 					tilesC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.TILE.ordinal(), 					tilesD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.TILE.ordinal(), 					tilesE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.TILE.ordinal(),	 				tilesF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.TILE.ordinal(), 					tilesG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.TILE.ordinal(), 					tilesH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.TILE.ordinal(), 					tilesVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.TILE.ordinal(), 					tilesVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.TILE.ordinal(), 					tilesClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.TILE.ordinal(), 					tilesConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_CARVED){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.CARVED.ordinal(), 					carvedA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.CARVED.ordinal(), 					carvedB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.CARVED.ordinal(), 					carvedC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x),						 	EnumCuts.CARVED.ordinal(), 					carvedD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x),						 	EnumCuts.CARVED.ordinal(), 					carvedE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.CARVED.ordinal(), 					carvedF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.CARVED.ordinal(), 					carvedG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.CARVED.ordinal(), 					carvedH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.CARVED.ordinal(), 					carvedVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.CARVED.ordinal(), 					carvedVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.CARVED.ordinal(), 					carvedClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.CARVED.ordinal(), 					carvedConcrete(x)));
					}
				}
			}

			if(ModConfig.ENABLE_SCULPT){
				if(ModConfig.ENABLE_COLUMNS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x),						 	EnumCuts.FLUTED.ordinal(),					flutedA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.FLUTED.ordinal(),					flutedB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.FLUTED.ordinal(),					flutedC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.FLUTED.ordinal(),					flutedD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.FLUTED.ordinal(),					flutedE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.FLUTED.ordinal(),					flutedF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.FLUTED.ordinal(),					flutedG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.FLUTED.ordinal(),					flutedH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.FLUTED.ordinal(), 					flutedVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.FLUTED.ordinal(), 					flutedVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.FLUTED.ordinal(), 					flutedClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.FLUTED.ordinal(), 					flutedConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_DORICS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x),						 	EnumCuts.DORIC.ordinal(),					doricsA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x),						 	EnumCuts.DORIC.ordinal(), 					doricsB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x),						 	EnumCuts.DORIC.ordinal(), 					doricsC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x),						 	EnumCuts.DORIC.ordinal(), 					doricsD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.DORIC.ordinal(), 					doricsE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.DORIC.ordinal(), 					doricsF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.DORIC.ordinal(), 					doricsG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.DORIC.ordinal(), 					doricsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.DORIC.ordinal(),					doricsVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.DORIC.ordinal(),					doricsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.DORIC.ordinal(),					doricsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.DORIC.ordinal(),					doricsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_TETRAS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.TETRAPYLON.ordinal(), 				tetrasA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.TETRAPYLON.ordinal(), 				tetrasB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.TETRAPYLON.ordinal(), 				tetrasC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.TETRAPYLON.ordinal(), 				tetrasD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.TETRAPYLON.ordinal(),				tetrasE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.TETRAPYLON.ordinal(), 				tetrasF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.TETRAPYLON.ordinal(), 				tetrasG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.TETRAPYLON.ordinal(), 				tetrasH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.TETRAPYLON.ordinal(),				tetrasVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.TETRAPYLON.ordinal(),				tetrasVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.TETRAPYLON.ordinal(), 				tetrasClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.TETRAPYLON.ordinal(), 				tetrasConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_PEDESTALS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.PEDESTAL.ordinal(), 				pedestalsA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.PEDESTAL.ordinal(), 				pedestalsB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.PEDESTAL.ordinal(), 				pedestalsC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.PEDESTAL.ordinal(), 				pedestalsD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.PEDESTAL.ordinal(), 				pedestalsE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.PEDESTAL.ordinal(), 				pedestalsF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.PEDESTAL.ordinal(), 				pedestalsG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.PEDESTAL.ordinal(), 				pedestalsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.PEDESTAL.ordinal(), 				pedestalsVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.PEDESTAL.ordinal(), 				pedestalsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.PEDESTAL.ordinal(),				pedestalsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.PEDESTAL.ordinal(),				pedestalsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_SEGMENTED){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.SEGMENTED.ordinal(), 				segmentedA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.SEGMENTED.ordinal(), 				segmentedB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.SEGMENTED.ordinal(), 				segmentedC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.SEGMENTED.ordinal(), 				segmentedD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.SEGMENTED.ordinal(), 				segmentedE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.SEGMENTED.ordinal(), 				segmentedF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x),						 	EnumCuts.SEGMENTED.ordinal(), 				segmentedG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x),						 	EnumCuts.SEGMENTED.ordinal(), 				segmentedH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.SEGMENTED.ordinal(), 				segmentedVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.SEGMENTED.ordinal(), 				segmentedVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.SEGMENTED.ordinal(), 				segmentedClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.SEGMENTED.ordinal(), 				segmentedConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_FANCY){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x),						 	EnumCuts.POST.ordinal(), 					fancysA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.POST.ordinal(), 					fancysB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.POST.ordinal(), 					fancysC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.POST.ordinal(), 					fancysD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.POST.ordinal(), 					fancysE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.POST.ordinal(), 					fancysF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.POST.ordinal(), 					fancysG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.POST.ordinal(), 					fancysH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.POST.ordinal(), 					fancysVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.POST.ordinal(), 					fancysVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.POST.ordinal(),					fancysClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.POST.ordinal(),					fancysConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_STELE){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x),						 	EnumCuts.STELE.ordinal(), 					stelesA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.STELE.ordinal(), 					stelesB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x),						 	EnumCuts.STELE.ordinal(), 					stelesC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x),						 	EnumCuts.STELE.ordinal(), 					stelesD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x),						 	EnumCuts.STELE.ordinal(), 					stelesE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x),						 	EnumCuts.STELE.ordinal(), 					stelesF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.STELE.ordinal(), 					stelesG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.STELE.ordinal(), 					stelesH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.STELE.ordinal(), 					stelesVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.STELE.ordinal(), 					stelesVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.STELE.ordinal(),					stelesClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.STELE.ordinal(),					stelesConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_FOUNTAINS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.FOUNTAIN.ordinal(), 				fountainsA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.FOUNTAIN.ordinal(), 				fountainsB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.FOUNTAIN.ordinal(), 				fountainsC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x),						 	EnumCuts.FOUNTAIN.ordinal(), 				fountainsD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.FOUNTAIN.ordinal(), 				fountainsE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x),						 	EnumCuts.FOUNTAIN.ordinal(), 				fountainsF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x),						 	EnumCuts.FOUNTAIN.ordinal(), 				fountainsG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x),						 	EnumCuts.FOUNTAIN.ordinal(), 				fountainsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.FOUNTAIN.ordinal(), 				fountainsVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.FOUNTAIN.ordinal(), 				fountainsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.FOUNTAIN.ordinal(), 				fountainsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.FOUNTAIN.ordinal(), 				fountainsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_LANTERNS){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.LANTERN.ordinal(), 				lanternsA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x), 							EnumCuts.LANTERN.ordinal(), 				lanternsB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.LANTERN.ordinal(), 				lanternsC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.LANTERN.ordinal(), 				lanternsD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.LANTERN.ordinal(), 				lanternsE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.LANTERN.ordinal(), 				lanternsF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.LANTERN.ordinal(), 				lanternsG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.LANTERN.ordinal(), 				lanternsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.LANTERN.ordinal(), 				lanternsVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.LANTERN.ordinal(), 				lanternsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.LANTERN.ordinal(), 				lanternsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.LANTERN.ordinal(), 				lanternsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_TWISTED){
					cutting_station_recipes.add(new CuttingStationRecipe(plainsA(x), 							EnumCuts.TWISTED.ordinal(), 				twistedA(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsB(x),						 	EnumCuts.TWISTED.ordinal(),					twistedB(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsC(x), 							EnumCuts.TWISTED.ordinal(),					twistedC(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsD(x), 							EnumCuts.TWISTED.ordinal(),					twistedD(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsE(x), 							EnumCuts.TWISTED.ordinal(),					twistedE(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsF(x), 							EnumCuts.TWISTED.ordinal(),					twistedF(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsG(x), 							EnumCuts.TWISTED.ordinal(),					twistedG(x)));
					cutting_station_recipes.add(new CuttingStationRecipe(plainsH(x), 							EnumCuts.TWISTED.ordinal(),					twistedH(x)));
					if(ModConfig.ENABLE_VANILLA){
						cutting_station_recipes.add(new CuttingStationRecipe(vanillaPlain[x], 					EnumCuts.TWISTED.ordinal(), 				twistedVanilla(x)));
						cutting_station_recipes.add(new CuttingStationRecipe(plainsVanilla2(x), 				EnumCuts.TWISTED.ordinal(), 				twistedVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						cutting_station_recipes.add(new CuttingStationRecipe(terracotta(15-x), 					EnumCuts.TWISTED.ordinal(), 				twistedClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						cutting_station_recipes.add(new CuttingStationRecipe(concrete(15-x), 					EnumCuts.TWISTED.ordinal(), 				twistedConcrete(x)));
					}
				}
			}
		}
	}


}