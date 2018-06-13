package com.globbypotato.rockhounding_rocks.machines.recipes;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.blocks.decos.PlainVanilla2;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.StoneRammerRecipe;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;

public class StoneRammerRecipes extends BaseRecipes{
	public static ArrayList<StoneRammerRecipe> stone_rammer_recipes = new ArrayList<StoneRammerRecipe>();

	public static void machineRecipes() {
		for(int x = 0; x < 16; x++){
			stone_rammer_recipes.add(new StoneRammerRecipe(raw_rocksA(x), 		plainsA(x)));
			stone_rammer_recipes.add(new StoneRammerRecipe(raw_rocksB(x), 		plainsB(x)));
			stone_rammer_recipes.add(new StoneRammerRecipe(raw_rocksC(x), 		plainsC(x)));
			stone_rammer_recipes.add(new StoneRammerRecipe(raw_rocksD(x),	 	plainsD(x)));
			stone_rammer_recipes.add(new StoneRammerRecipe(raw_rocksE(x), 		plainsE(x)));
			stone_rammer_recipes.add(new StoneRammerRecipe(raw_rocksF(x), 		plainsF(x)));
			stone_rammer_recipes.add(new StoneRammerRecipe(raw_rocksG(x), 		plainsG(x)));
			stone_rammer_recipes.add(new StoneRammerRecipe(raw_rocksH(x), 		plainsH(x)));
			
			if(PlainVanilla2.validCut(x)){
				stone_rammer_recipes.add(new StoneRammerRecipe(vanilla2Plain[x], 	plainsVanilla2(x)));
			}

			if(ModConfig.ENABLE_HALF_SLAB && ModConfig.manualRecipes >= 1){
				stone_rammer_recipes.add(new StoneRammerRecipe(plainsA(x),		plain_slabsA(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(polishedA(x), 	polished_slabsA(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(bricksA(x), 		bricks_slabsA(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(shortsA(x), 		shorts_slabsA(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(tilesA(x), 		tiles_slabsA(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(floorsA(x), 		floors_slabsA(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(pavesA(x),		paves_slabsA(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(debossA(x), 		deboss_slabsA(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(carvedA(x), 		carved_slabsA(2, x)));
				
				stone_rammer_recipes.add(new StoneRammerRecipe(plainsB(x),		plain_slabsB(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(polishedB(x), 	polished_slabsB(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(bricksB(x), 		bricks_slabsB(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(shortsB(x), 		shorts_slabsB(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(tilesB(x), 		tiles_slabsB(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(floorsB(x), 		floors_slabsB(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(pavesB(x), 		paves_slabsB(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(debossB(x), 		deboss_slabsB(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(carvedB(x), 		carved_slabsB(2, x)));

				stone_rammer_recipes.add(new StoneRammerRecipe(plainsC(x),		plain_slabsC(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(polishedC(x), 	polished_slabsC(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(bricksC(x), 		bricks_slabsC(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(shortsC(x), 		shorts_slabsC(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(tilesC(x), 		tiles_slabsC(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(floorsC(x), 		floors_slabsC(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(pavesC(x), 		paves_slabsC(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(debossC(x), 		deboss_slabsC(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(carvedC(x), 		carved_slabsC(2, x)));

				stone_rammer_recipes.add(new StoneRammerRecipe(plainsD(x),		plain_slabsD(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(polishedD(x), 	polished_slabsD(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(bricksD(x), 		bricks_slabsD(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(shortsD(x), 		shorts_slabsD(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(tilesD(x), 		tiles_slabsD(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(floorsD(x), 		floors_slabsD(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(pavesD(x), 		paves_slabsD(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(debossD(x), 		deboss_slabsD(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(carvedD(x), 		carved_slabsD(2, x)));

				stone_rammer_recipes.add(new StoneRammerRecipe(plainsE(x),		plain_slabsE(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(polishedE(x), 	polished_slabsE(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(bricksE(x), 		bricks_slabsE(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(shortsE(x),	 	shorts_slabsE(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(tilesE(x), 		tiles_slabsE(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(floorsE(x), 		floors_slabsE(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(pavesE(x), 		paves_slabsE(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(debossE(x), 		deboss_slabsE(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(carvedE(x), 		carved_slabsE(2, x)));

				stone_rammer_recipes.add(new StoneRammerRecipe(plainsF(x),		plain_slabsF(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(polishedF(x), 	polished_slabsF(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(bricksF(x), 		bricks_slabsF(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(shortsF(x), 		shorts_slabsF(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(tilesF(x), 		tiles_slabsF(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(floorsF(x), 		floors_slabsF(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(pavesF(x), 		paves_slabsF(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(debossF(x), 		deboss_slabsF(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(carvedF(x), 		carved_slabsF(2, x)));

				stone_rammer_recipes.add(new StoneRammerRecipe(plainsG(x),		plain_slabsG(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(polishedG(x), 	polished_slabsG(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(bricksG(x), 		bricks_slabsG(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(shortsG(x), 		shorts_slabsG(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(tilesG(x), 		tiles_slabsG(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(floorsG(x), 		floors_slabsG(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(pavesG(x), 		paves_slabsG(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(debossG(x), 		deboss_slabsG(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(carvedG(x), 		carved_slabsG(2, x)));

				stone_rammer_recipes.add(new StoneRammerRecipe(plainsH(x),		plain_slabsH(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(polishedH(x), 	polished_slabsH(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(bricksH(x), 		bricks_slabsH(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(shortsH(x), 		shorts_slabsH(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(tilesH(x), 		tiles_slabsH(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(floorsH(x), 		floors_slabsH(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(pavesH(x), 		paves_slabsH(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(debossH(x), 		deboss_slabsH(2, x)));
				stone_rammer_recipes.add(new StoneRammerRecipe(carvedH(x), 		carved_slabsH(2, x)));

			}
		}
	}
}