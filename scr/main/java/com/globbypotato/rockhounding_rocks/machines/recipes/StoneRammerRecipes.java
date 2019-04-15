package com.globbypotato.rockhounding_rocks.machines.recipes;

import java.util.ArrayList;

import com.globbypotato.rockhounding_rocks.blocks.decos.PlainVanilla2;
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

		}
	}
}