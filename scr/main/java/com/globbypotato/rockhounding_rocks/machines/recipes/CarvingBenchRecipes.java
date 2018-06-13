package com.globbypotato.rockhounding_rocks.machines.recipes;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.enums.EnumCards;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CarvingBenchRecipe;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;

public class CarvingBenchRecipes extends BaseRecipes{
	public static ArrayList<CarvingBenchRecipe> carving_bench_recipes = new ArrayList<CarvingBenchRecipe>();

	public static void machineRecipes() {
		for(int x = 0; x < 16; x++){
			if(ModConfig.ENABLE_DECO){
				if(ModConfig.ENABLE_POLISHED){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.POLISHED.ordinal(),	 	polishedA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.POLISHED.ordinal(),	 	polishedB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.POLISHED.ordinal(),	 	polishedC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.POLISHED.ordinal(),	 	polishedD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.POLISHED.ordinal(), 		polishedE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.POLISHED.ordinal(),		polishedF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.POLISHED.ordinal(),		polishedG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.POLISHED.ordinal(),		polishedH(x)));
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(polishedA(x), 						EnumCards.PLAIN.ordinal(),		 	plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(polishedB(x),				 		EnumCards.PLAIN.ordinal(),		 	plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(polishedC(x), 						EnumCards.PLAIN.ordinal(),		 	plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(polishedD(x), 						EnumCards.PLAIN.ordinal(),		 	plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(polishedE(x), 						EnumCards.PLAIN.ordinal(), 			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(polishedF(x), 						EnumCards.PLAIN.ordinal(),		 	plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(polishedG(x), 						EnumCards.PLAIN.ordinal(),		 	plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(polishedH(x), 						EnumCards.PLAIN.ordinal(),		 	plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.POLISHED.ordinal(), 		polishedVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.POLISHED.ordinal(), 		polishedVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(polishedVanilla(x), 			EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(polishedVanilla2(x), 			EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.POLISHED.ordinal(), 		polishedClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(polishedClay(x), 				EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.POLISHED.ordinal(), 		polishedConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(polishedConcrete(x), 			EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}
	
				if(ModConfig.ENABLE_BRICKS){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.BRICKS.ordinal(), 		bricksA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.BRICKS.ordinal(),			bricksB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.BRICKS.ordinal(),			bricksC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.BRICKS.ordinal(),			bricksD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.BRICKS.ordinal(),			bricksE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.BRICKS.ordinal(),			bricksF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.BRICKS.ordinal(),			bricksG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.BRICKS.ordinal(),			bricksH(x)));
	
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(bricksA(x), 						EnumCards.PLAIN.ordinal(), 			plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(bricksB(x),				 		EnumCards.PLAIN.ordinal(),			plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(bricksC(x), 						EnumCards.PLAIN.ordinal(),			plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(bricksD(x), 						EnumCards.PLAIN.ordinal(),			plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(bricksE(x), 						EnumCards.PLAIN.ordinal(),			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(bricksF(x), 						EnumCards.PLAIN.ordinal(),			plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(bricksG(x), 						EnumCards.PLAIN.ordinal(),			plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(bricksH(x), 						EnumCards.PLAIN.ordinal(),			plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.BRICKS.ordinal(), 		bricksVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.BRICKS.ordinal(), 		bricksVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(bricksVanilla(x), 				EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(bricksVanilla2(x), 			EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.BRICKS.ordinal(), 		bricksClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(bricksClay(x), 				EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.BRICKS.ordinal(), 		bricksConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(bricksConcrete(x), 			EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}
	
				if(ModConfig.ENABLE_SLABS){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.SLAB.ordinal(), 			slabsA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.SLAB.ordinal(),			slabsB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.SLAB.ordinal(),			slabsC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.SLAB.ordinal(),			slabsD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.SLAB.ordinal(),			slabsE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.SLAB.ordinal(),			slabsF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.SLAB.ordinal(),			slabsG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.SLAB.ordinal(),			slabsH(x)));
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(slabsA(x), 						EnumCards.PLAIN.ordinal(), 			plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(slabsB(x),				 			EnumCards.PLAIN.ordinal(),			plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(slabsC(x), 						EnumCards.PLAIN.ordinal(),			plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(slabsD(x), 						EnumCards.PLAIN.ordinal(),			plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(slabsE(x), 						EnumCards.PLAIN.ordinal(),			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(slabsF(x), 						EnumCards.PLAIN.ordinal(),			plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(slabsG(x), 						EnumCards.PLAIN.ordinal(),			plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(slabsH(x), 						EnumCards.PLAIN.ordinal(),			plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.SLAB.ordinal(), 			slabsVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.SLAB.ordinal(), 			slabsVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(slabsVanilla(x), 				EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(slabsVanilla2(x), 				EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.SLAB.ordinal(), 			slabsClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(slabsClay(x), 					EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.SLAB.ordinal(), 			slabsConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(slabsConcrete(x), 				EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}			
	
				if(ModConfig.ENABLE_SHORTS){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.SHORT.ordinal(), 			shortsA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.SHORT.ordinal(),			shortsB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.SHORT.ordinal(),			shortsC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.SHORT.ordinal(),			shortsD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.SHORT.ordinal(),			shortsE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.SHORT.ordinal(),			shortsF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.SHORT.ordinal(),			shortsG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.SHORT.ordinal(),			shortsH(x)));
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(shortsA(x), 						EnumCards.PLAIN.ordinal(), 			plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(shortsB(x),				 		EnumCards.PLAIN.ordinal(),			plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(shortsC(x), 						EnumCards.PLAIN.ordinal(),			plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(shortsD(x), 						EnumCards.PLAIN.ordinal(),			plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(shortsE(x), 						EnumCards.PLAIN.ordinal(),			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(shortsF(x), 						EnumCards.PLAIN.ordinal(),			plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(shortsG(x), 						EnumCards.PLAIN.ordinal(),			plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(shortsH(x), 						EnumCards.PLAIN.ordinal(),			plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.SHORT.ordinal(), 			shortsVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.SHORT.ordinal(), 			shortsVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(shortsVanilla(x), 				EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(shortsVanilla2(x), 			EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.SHORT.ordinal(), 			shortsClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(shortsClay(x), 				EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.SHORT.ordinal(), 			shortsConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(shortsConcrete(x), 			EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}
	
				if(ModConfig.ENABLE_DEBOSSED){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.DEBOSSED.ordinal(), 		debossA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.DEBOSSED.ordinal(),		debossB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.DEBOSSED.ordinal(),		debossC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.DEBOSSED.ordinal(),		debossD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.DEBOSSED.ordinal(),		debossE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.DEBOSSED.ordinal(),		debossF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.DEBOSSED.ordinal(),		debossG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.DEBOSSED.ordinal(),		debossH(x)));
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(debossA(x), 						EnumCards.PLAIN.ordinal(), 			plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(debossB(x),				 		EnumCards.PLAIN.ordinal(),			plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(debossC(x), 						EnumCards.PLAIN.ordinal(),			plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(debossD(x), 						EnumCards.PLAIN.ordinal(),			plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(debossE(x), 						EnumCards.PLAIN.ordinal(),			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(debossF(x), 						EnumCards.PLAIN.ordinal(),			plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(debossG(x), 						EnumCards.PLAIN.ordinal(),			plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(debossH(x), 						EnumCards.PLAIN.ordinal(),			plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.DEBOSSED.ordinal(), 		debossVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.DEBOSSED.ordinal(), 		debossVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(debossVanilla(x), 				EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(debossVanilla2(x), 			EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.DEBOSSED.ordinal(), 		debossClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(debossClay(x), 				EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.DEBOSSED.ordinal(), 		debossConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(debossConcrete(x), 			EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}
	
				if(ModConfig.ENABLE_FLOORS){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.FLOOR.ordinal(), 			floorsA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.FLOOR.ordinal(),			floorsB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.FLOOR.ordinal(),			floorsC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.FLOOR.ordinal(),			floorsD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.FLOOR.ordinal(),			floorsE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.FLOOR.ordinal(),			floorsF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.FLOOR.ordinal(),			floorsG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.FLOOR.ordinal(),			floorsH(x)));
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(floorsA(x), 						EnumCards.PLAIN.ordinal(), 			plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(floorsB(x),						EnumCards.PLAIN.ordinal(),			plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(floorsC(x), 						EnumCards.PLAIN.ordinal(),			plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(floorsD(x), 						EnumCards.PLAIN.ordinal(),			plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(floorsE(x), 						EnumCards.PLAIN.ordinal(),			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(floorsF(x), 						EnumCards.PLAIN.ordinal(),			plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(floorsG(x), 						EnumCards.PLAIN.ordinal(),			plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(floorsH(x), 						EnumCards.PLAIN.ordinal(),			plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.FLOOR.ordinal(), 			floorsVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.FLOOR.ordinal(), 			floorsVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(floorsVanilla(x), 				EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(floorsVanilla2(x), 			EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.FLOOR.ordinal(), 			floorsClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(floorsClay(x), 				EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.FLOOR.ordinal(), 			floorsConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(floorsConcrete(x), 			EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}
	
				if(ModConfig.ENABLE_PAVES){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.PAVES.ordinal(), 			pavesA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.PAVES.ordinal(),			pavesB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.PAVES.ordinal(),			pavesC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.PAVES.ordinal(),			pavesD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.PAVES.ordinal(),			pavesE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.PAVES.ordinal(),			pavesF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.PAVES.ordinal(),			pavesG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.PAVES.ordinal(),			pavesH(x)));
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(pavesA(x), 						EnumCards.PLAIN.ordinal(), 			plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(pavesB(x),							EnumCards.PLAIN.ordinal(),			plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(pavesC(x), 						EnumCards.PLAIN.ordinal(),			plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(pavesD(x), 						EnumCards.PLAIN.ordinal(),			plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(pavesE(x), 						EnumCards.PLAIN.ordinal(),			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(pavesF(x), 						EnumCards.PLAIN.ordinal(),			plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(pavesG(x), 						EnumCards.PLAIN.ordinal(),			plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(pavesH(x), 						EnumCards.PLAIN.ordinal(),			plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.PAVES.ordinal(), 			pavesVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.PAVES.ordinal(), 			pavesVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(pavesVanilla(x), 				EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(pavesVanilla2(x), 				EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.PAVES.ordinal(), 			pavesClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(pavesClay(x), 					EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.PAVES.ordinal(), 			pavesConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(pavesConcrete(x), 				EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}
	
				if(ModConfig.ENABLE_TILES){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.TILE.ordinal(), 			tilesA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.TILE.ordinal(),			tilesB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.TILE.ordinal(),			tilesC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.TILE.ordinal(),			tilesD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.TILE.ordinal(),			tilesE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.TILE.ordinal(),			tilesF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.TILE.ordinal(),			tilesG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.TILE.ordinal(),			tilesH(x)));
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(tilesA(x), 						EnumCards.PLAIN.ordinal(), 			plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(tilesB(x),				 			EnumCards.PLAIN.ordinal(),			plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(tilesC(x), 						EnumCards.PLAIN.ordinal(),			plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(tilesD(x), 						EnumCards.PLAIN.ordinal(),			plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(tilesE(x), 						EnumCards.PLAIN.ordinal(),			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(tilesF(x), 						EnumCards.PLAIN.ordinal(),			plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(tilesG(x), 						EnumCards.PLAIN.ordinal(),			plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(tilesH(x), 						EnumCards.PLAIN.ordinal(),			plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.TILE.ordinal(), 			tilesVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.TILE.ordinal(), 			tilesVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(tilesVanilla(x), 				EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(tilesVanilla2(x), 				EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.TILE.ordinal(), 			tilesClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(tilesClay(x), 					EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.TILE.ordinal(), 			tilesConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(tilesConcrete(x), 				EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}
	
				if(ModConfig.ENABLE_CARVED){
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsA(x), 							EnumCards.CARVED.ordinal(), 		carvedA(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsB(x),						 	EnumCards.CARVED.ordinal(),			carvedB(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsC(x), 							EnumCards.CARVED.ordinal(),			carvedC(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsD(x), 							EnumCards.CARVED.ordinal(),			carvedD(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsE(x), 							EnumCards.CARVED.ordinal(),			carvedE(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsF(x), 							EnumCards.CARVED.ordinal(),			carvedF(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsG(x), 							EnumCards.CARVED.ordinal(),			carvedG(x)));
					carving_bench_recipes.add(new CarvingBenchRecipe(plainsH(x), 							EnumCards.CARVED.ordinal(),			carvedH(x)));
					if(ModConfig.allowReverse){
						carving_bench_recipes.add(new CarvingBenchRecipe(carvedA(x), 						EnumCards.PLAIN.ordinal(), 			plainsA(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(carvedB(x),				 		EnumCards.PLAIN.ordinal(),			plainsB(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(carvedC(x), 						EnumCards.PLAIN.ordinal(),			plainsC(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(carvedD(x), 						EnumCards.PLAIN.ordinal(),			plainsD(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(carvedE(x), 						EnumCards.PLAIN.ordinal(),			plainsE(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(carvedF(x), 						EnumCards.PLAIN.ordinal(),			plainsF(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(carvedG(x), 						EnumCards.PLAIN.ordinal(),			plainsG(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(carvedH(x), 						EnumCards.PLAIN.ordinal(),			plainsH(x)));
					}
					if(ModConfig.ENABLE_VANILLA){
						carving_bench_recipes.add(new CarvingBenchRecipe(vanillaPlain[x], 					EnumCards.CARVED.ordinal(), 		carvedVanilla(x)));
						carving_bench_recipes.add(new CarvingBenchRecipe(plainsVanilla2(x), 				EnumCards.CARVED.ordinal(), 		carvedVanilla2(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(carvedVanilla(x), 				EnumCards.PLAIN.ordinal(), 			vanillaPlain[x]));
							carving_bench_recipes.add(new CarvingBenchRecipe(carvedVanilla2(x), 			EnumCards.PLAIN.ordinal(), 			plainsVanilla2(x)));
						}
					}
					if(ModConfig.ENABLE_CLAY){
						carving_bench_recipes.add(new CarvingBenchRecipe(terracotta(15-x), 					EnumCards.CARVED.ordinal(), 		carvedClay(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(carvedClay(x), 				EnumCards.PLAIN.ordinal(), 			terracotta(15-x)));
						}
					}
					if(ModConfig.ENABLE_CONCRETE){
						carving_bench_recipes.add(new CarvingBenchRecipe(concrete(15-x), 					EnumCards.CARVED.ordinal(), 		carvedConcrete(x)));
						if(ModConfig.allowReverse){
							carving_bench_recipes.add(new CarvingBenchRecipe(carvedConcrete(x), 			EnumCards.PLAIN.ordinal(), 			concrete(15-x)));
						}
					}
				}
			}
		}
	}
}