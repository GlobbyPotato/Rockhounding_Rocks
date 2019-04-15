package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreIngredient;

@Mod.EventBusSubscriber
public class ModRecipes extends BaseRecipes{

	/**
	 * @param event  
	 */
	@SubscribeEvent
	public static void registerRecipes(final RegistryEvent.Register<IRecipe> event){
		GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MODID, "guide_book"), new ResourceLocation(Reference.MODID, "utils"), ToolUtils.rh_book.copy(), new Ingredient[] { new OreIngredient("cobblestone"), Ingredient.fromStacks(new ItemStack(Items.PAPER)), Ingredient.fromStacks(new ItemStack(Items.PAPER)), Ingredient.fromStacks(new ItemStack(Items.PAPER)) });

		if(ModConfig.ENABLE_WALLS){
			for(int x = 0; x < 16; x++){
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "walls_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), wallsA(6, x), new Object[] { "BBB","BBB", 'B', plainsA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "walls_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), wallsB(6, x), new Object[] { "BBB","BBB", 'B', plainsB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "walls_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), wallsC(6, x), new Object[] { "BBB","BBB", 'B', plainsC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "walls_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), wallsD(6, x), new Object[] { "BBB","BBB", 'B', plainsD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "walls_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), wallsE(6, x), new Object[] { "BBB","BBB", 'B', plainsE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "walls_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), wallsF(6, x), new Object[] { "BBB","BBB", 'B', plainsF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "walls_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), wallsG(6, x), new Object[] { "BBB","BBB", 'B', plainsG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "walls_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), wallsH(6, x), new Object[] { "BBB","BBB", 'B', plainsH(x)});
			}
		}

		if(ModConfig.ENABLE_HALF_SLAB){
			for(int x = 0; x < 16; x++){
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_plain_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), plain_slabsA(6, x), new Object[] { "BBB", 'B', plainsA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_plain_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), plain_slabsB(6, x), new Object[] { "BBB", 'B', plainsB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_plain_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), plain_slabsC(6, x), new Object[] { "BBB", 'B', plainsC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_plain_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), plain_slabsD(6, x), new Object[] { "BBB", 'B', plainsD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_plain_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), plain_slabsE(6, x), new Object[] { "BBB", 'B', plainsE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_plain_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), plain_slabsF(6, x), new Object[] { "BBB", 'B', plainsF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_plain_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), plain_slabsG(6, x), new Object[] { "BBB", 'B', plainsG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_plain_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), plain_slabsH(6, x), new Object[] { "BBB", 'B', plainsH(x)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_polished_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), polished_slabsA(6, x), new Object[] { "BBB", 'B', polishedA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_polished_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), polished_slabsB(6, x), new Object[] { "BBB", 'B', polishedB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_polished_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), polished_slabsC(6, x), new Object[] { "BBB", 'B', polishedC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_polished_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), polished_slabsD(6, x), new Object[] { "BBB", 'B', polishedD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_polished_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), polished_slabsE(6, x), new Object[] { "BBB", 'B', polishedE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_polished_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), polished_slabsF(6, x), new Object[] { "BBB", 'B', polishedF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_polished_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), polished_slabsG(6, x), new Object[] { "BBB", 'B', polishedG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_polished_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), polished_slabsH(6, x), new Object[] { "BBB", 'B', polishedH(x)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_bricks_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), bricks_slabsA(6, x), new Object[] { "BBB", 'B', bricksA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_bricks_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), bricks_slabsB(6, x), new Object[] { "BBB", 'B', bricksB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_bricks_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), bricks_slabsC(6, x), new Object[] { "BBB", 'B', bricksC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_bricks_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), bricks_slabsD(6, x), new Object[] { "BBB", 'B', bricksD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_bricks_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), bricks_slabsE(6, x), new Object[] { "BBB", 'B', bricksE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_bricks_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), bricks_slabsF(6, x), new Object[] { "BBB", 'B', bricksF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_bricks_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), bricks_slabsG(6, x), new Object[] { "BBB", 'B', bricksG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_bricks_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), bricks_slabsH(6, x), new Object[] { "BBB", 'B', bricksH(x)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_shorts_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), shorts_slabsA(6, x), new Object[] { "BBB", 'B', shortsA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_shorts_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), shorts_slabsB(6, x), new Object[] { "BBB", 'B', shortsB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_shorts_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), shorts_slabsC(6, x), new Object[] { "BBB", 'B', shortsC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_shorts_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), shorts_slabsD(6, x), new Object[] { "BBB", 'B', shortsD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_shorts_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), shorts_slabsE(6, x), new Object[] { "BBB", 'B', shortsE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_shorts_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), shorts_slabsF(6, x), new Object[] { "BBB", 'B', shortsF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_shorts_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), shorts_slabsG(6, x), new Object[] { "BBB", 'B', shortsG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_shorts_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), shorts_slabsH(6, x), new Object[] { "BBB", 'B', shortsH(x)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_tiles_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), tiles_slabsA(6, x), new Object[] { "BBB", 'B', tilesA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_tiles_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), tiles_slabsB(6, x), new Object[] { "BBB", 'B', tilesB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_tiles_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), tiles_slabsC(6, x), new Object[] { "BBB", 'B', tilesC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_tiles_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), tiles_slabsD(6, x), new Object[] { "BBB", 'B', tilesD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_tiles_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), tiles_slabsE(6, x), new Object[] { "BBB", 'B', tilesE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_tiles_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), tiles_slabsF(6, x), new Object[] { "BBB", 'B', tilesF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_tiles_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), tiles_slabsG(6, x), new Object[] { "BBB", 'B', tilesG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_tiles_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), tiles_slabsH(6, x), new Object[] { "BBB", 'B', tilesH(x)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_deboss_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), deboss_slabsA(6, x), new Object[] { "BBB", 'B', debossA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_deboss_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), deboss_slabsB(6, x), new Object[] { "BBB", 'B', debossB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_deboss_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), deboss_slabsC(6, x), new Object[] { "BBB", 'B', debossC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_deboss_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), deboss_slabsD(6, x), new Object[] { "BBB", 'B', debossD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_deboss_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), deboss_slabsE(6, x), new Object[] { "BBB", 'B', debossE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_deboss_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), deboss_slabsF(6, x), new Object[] { "BBB", 'B', debossF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_deboss_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), deboss_slabsG(6, x), new Object[] { "BBB", 'B', debossG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_deboss_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), deboss_slabsH(6, x), new Object[] { "BBB", 'B', debossH(x)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_carved_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), carved_slabsA(6, x), new Object[] { "BBB", 'B', carvedA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_carved_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), carved_slabsB(6, x), new Object[] { "BBB", 'B', carvedB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_carved_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), carved_slabsC(6, x), new Object[] { "BBB", 'B', carvedC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_carved_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), carved_slabsD(6, x), new Object[] { "BBB", 'B', carvedD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_carved_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), carved_slabsE(6, x), new Object[] { "BBB", 'B', carvedE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_carved_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), carved_slabsF(6, x), new Object[] { "BBB", 'B', carvedF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_carved_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), carved_slabsG(6, x), new Object[] { "BBB", 'B', carvedG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_carved_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), carved_slabsH(6, x), new Object[] { "BBB", 'B', carvedH(x)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_floors_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), floors_slabsA(6, x), new Object[] { "BBB", 'B', floorsA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_floors_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), floors_slabsB(6, x), new Object[] { "BBB", 'B', floorsB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_floors_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), floors_slabsC(6, x), new Object[] { "BBB", 'B', floorsC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_floors_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), floors_slabsD(6, x), new Object[] { "BBB", 'B', floorsD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_floors_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), floors_slabsE(6, x), new Object[] { "BBB", 'B', floorsE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_floors_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), floors_slabsF(6, x), new Object[] { "BBB", 'B', floorsF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_floors_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), floors_slabsG(6, x), new Object[] { "BBB", 'B', floorsG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_floors_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), floors_slabsH(6, x), new Object[] { "BBB", 'B', floorsH(x)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_paves_A_" + x), new ResourceLocation(Reference.MODID, "blocks"), paves_slabsA(6, x), new Object[] { "BBB", 'B', pavesA(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_paves_B_" + x), new ResourceLocation(Reference.MODID, "blocks"), paves_slabsB(6, x), new Object[] { "BBB", 'B', pavesB(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_paves_C_" + x), new ResourceLocation(Reference.MODID, "blocks"), paves_slabsC(6, x), new Object[] { "BBB", 'B', pavesC(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_paves_D_" + x), new ResourceLocation(Reference.MODID, "blocks"), paves_slabsD(6, x), new Object[] { "BBB", 'B', pavesD(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_paves_E_" + x), new ResourceLocation(Reference.MODID, "blocks"), paves_slabsE(6, x), new Object[] { "BBB", 'B', pavesE(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_paves_F_" + x), new ResourceLocation(Reference.MODID, "blocks"), paves_slabsF(6, x), new Object[] { "BBB", 'B', pavesF(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_paves_G_" + x), new ResourceLocation(Reference.MODID, "blocks"), paves_slabsG(6, x), new Object[] { "BBB", 'B', pavesG(x)});
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID, "half_slabs_paves_H_" + x), new ResourceLocation(Reference.MODID, "blocks"), paves_slabsH(6, x), new Object[] { "BBB", 'B', pavesH(x)});
			}
		}

		MachineRecipes.init();
	}

}