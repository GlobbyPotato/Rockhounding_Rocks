package com.globbypotato.rockhounding_rocks.machines.recipes;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.enums.EnumSculpts;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.SculptingBenchRecipe;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;

public class SculptingBenchRecipes extends BaseRecipes{
	public static ArrayList<SculptingBenchRecipe> sculpting_bench_recipes = new ArrayList<SculptingBenchRecipe>();

	public static void machineRecipes() {
		for(int x = 0; x < 16; x++){
			if(ModConfig.ENABLE_SCULPT){
				if(ModConfig.ENABLE_COLUMNS){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.FLUTED.ordinal(),		 	flutedA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.FLUTED.ordinal(),		 	flutedB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.FLUTED.ordinal(),		 	flutedC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.FLUTED.ordinal(),		 	flutedD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.FLUTED.ordinal(),	 		flutedE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.FLUTED.ordinal(),			flutedF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.FLUTED.ordinal(),			flutedG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.FLUTED.ordinal(),			flutedH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.FLUTED.ordinal(), 			flutedVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.FLUTED.ordinal(), 			flutedVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.FLUTED.ordinal(), 			flutedClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.FLUTED.ordinal(), 			flutedConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_DORICS){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.DORIC.ordinal(),	 		doricsA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.DORIC.ordinal(),	 		doricsB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.DORIC.ordinal(),	 		doricsC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.DORIC.ordinal(),	 		doricsD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.DORIC.ordinal(), 			doricsE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.DORIC.ordinal(),			doricsF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.DORIC.ordinal(),			doricsG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.DORIC.ordinal(),			doricsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.DORIC.ordinal(), 			doricsVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.DORIC.ordinal(), 			doricsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.DORIC.ordinal(), 			doricsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.DORIC.ordinal(), 			doricsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_TETRAS){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.TETRAPYLON.ordinal(),		tetrasA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.TETRAPYLON.ordinal(),	 	tetrasB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.TETRAPYLON.ordinal(),	 	tetrasC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.TETRAPYLON.ordinal(),	 	tetrasD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.TETRAPYLON.ordinal(), 		tetrasE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.TETRAPYLON.ordinal(),		tetrasF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.TETRAPYLON.ordinal(),		tetrasG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.TETRAPYLON.ordinal(),		tetrasH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.TETRAPYLON.ordinal(), 		tetrasVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.TETRAPYLON.ordinal(), 		tetrasVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.TETRAPYLON.ordinal(), 		tetrasClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.TETRAPYLON.ordinal(), 		tetrasConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_PEDESTALS){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.PEDESTAL.ordinal(),		 	pedestalsA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.PEDESTAL.ordinal(),		 	pedestalsB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.PEDESTAL.ordinal(),		 	pedestalsC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.PEDESTAL.ordinal(),		 	pedestalsD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.PEDESTAL.ordinal(),	 		pedestalsE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.PEDESTAL.ordinal(),			pedestalsF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.PEDESTAL.ordinal(),			pedestalsG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.PEDESTAL.ordinal(),			pedestalsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.PEDESTAL.ordinal(), 		pedestalsVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.PEDESTAL.ordinal(), 		pedestalsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.PEDESTAL.ordinal(), 		pedestalsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.PEDESTAL.ordinal(), 		pedestalsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_SEGMENTED){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.SEGMENTED.ordinal(),		segmentedA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.SEGMENTED.ordinal(),		segmentedB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.SEGMENTED.ordinal(),		segmentedC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.SEGMENTED.ordinal(),		segmentedD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.SEGMENTED.ordinal(),	 	segmentedE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.SEGMENTED.ordinal(),		segmentedF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.SEGMENTED.ordinal(),		segmentedG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.SEGMENTED.ordinal(),		segmentedH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.SEGMENTED.ordinal(), 		segmentedVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.SEGMENTED.ordinal(), 		segmentedVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.SEGMENTED.ordinal(), 		segmentedClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.SEGMENTED.ordinal(), 		segmentedConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_FANCY){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.POST.ordinal(),		 		fancysA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.POST.ordinal(),		 		fancysB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.POST.ordinal(),		 		fancysC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.POST.ordinal(),		 		fancysD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.POST.ordinal(),	 			fancysE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.POST.ordinal(),				fancysF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.POST.ordinal(),				fancysG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.POST.ordinal(),				fancysH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.POST.ordinal(), 			fancysVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.POST.ordinal(), 			fancysVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.POST.ordinal(), 			fancysClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.POST.ordinal(), 			fancysConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_STELE){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.STELE.ordinal(),		 	stelesA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.STELE.ordinal(),		 	stelesB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.STELE.ordinal(),		 	stelesC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.STELE.ordinal(),		 	stelesD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.STELE.ordinal(),	 		stelesE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.STELE.ordinal(),			stelesF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.STELE.ordinal(),			stelesG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.STELE.ordinal(),			stelesH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.STELE.ordinal(), 			stelesVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.STELE.ordinal(), 			stelesVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.STELE.ordinal(), 			stelesClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.STELE.ordinal(), 			stelesConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_FOUNTAINS){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.FOUNTAIN.ordinal(),		 	fountainsA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.FOUNTAIN.ordinal(),		 	fountainsB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.FOUNTAIN.ordinal(),		 	fountainsC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.FOUNTAIN.ordinal(),		 	fountainsD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.FOUNTAIN.ordinal(),	 		fountainsE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.FOUNTAIN.ordinal(),			fountainsF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.FOUNTAIN.ordinal(),			fountainsG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.FOUNTAIN.ordinal(),			fountainsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.FOUNTAIN.ordinal(), 		fountainsVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.FOUNTAIN.ordinal(), 		fountainsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.FOUNTAIN.ordinal(), 		fountainsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.FOUNTAIN.ordinal(), 		fountainsConcrete(x)));
					}
				}
	
				if(ModConfig.ENABLE_LANTERNS){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.LANTERN.ordinal(),		 	lanternsA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.LANTERN.ordinal(),		 	lanternsB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.LANTERN.ordinal(),		 	lanternsC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.LANTERN.ordinal(),		 	lanternsD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.LANTERN.ordinal(),	 		lanternsE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.LANTERN.ordinal(),			lanternsF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.LANTERN.ordinal(),			lanternsG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.LANTERN.ordinal(),			lanternsH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.LANTERN.ordinal(), 			lanternsVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.LANTERN.ordinal(), 			lanternsVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.LANTERN.ordinal(), 			lanternsClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.LANTERN.ordinal(), 			lanternsConcrete(x)));
					}
				}
				
				if(ModConfig.ENABLE_TWISTED){
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsA(x), 							EnumSculpts.TWISTED.ordinal(),		 	twistedA(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsB(x),						 	EnumSculpts.TWISTED.ordinal(),		 	twistedB(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsC(x), 							EnumSculpts.TWISTED.ordinal(),		 	twistedC(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsD(x), 							EnumSculpts.TWISTED.ordinal(),		 	twistedD(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsE(x), 							EnumSculpts.TWISTED.ordinal(),	 		twistedE(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsF(x), 							EnumSculpts.TWISTED.ordinal(),			twistedF(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsG(x), 							EnumSculpts.TWISTED.ordinal(),			twistedG(x)));
					sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsH(x), 							EnumSculpts.TWISTED.ordinal(),			twistedH(x)));
					if(ModConfig.ENABLE_VANILLA){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(vanillaPlain[x], 					EnumSculpts.TWISTED.ordinal(), 			twistedVanilla(x)));
						sculpting_bench_recipes.add(new SculptingBenchRecipe(plainsVanilla2(x), 				EnumSculpts.TWISTED.ordinal(), 			twistedVanilla2(x)));
					}
					if(ModConfig.ENABLE_CLAY){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(terracotta(15-x), 					EnumSculpts.TWISTED.ordinal(), 			twistedClay(x)));
					}
					if(ModConfig.ENABLE_CONCRETE){
						sculpting_bench_recipes.add(new SculptingBenchRecipe(concrete(15-x), 					EnumSculpts.TWISTED.ordinal(), 			twistedConcrete(x)));
					}
				}
			}
		}
	}
}