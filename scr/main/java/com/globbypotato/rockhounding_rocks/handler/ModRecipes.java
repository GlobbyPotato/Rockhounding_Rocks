package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.integration.SupportUtils;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes extends BaseRecipes{

	public static void init() {
		ModRecipes.miscRecipes();
	}

	private static void miscRecipes() {
		if(SupportUtils.rhChemistryLoaded()){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cuttingStation), new Object[] { "ILI", "IBI", "IPI", 'I', SupportUtils.ironCasing(), 'B', Items.BUCKET, 'L', SupportUtils.basicLogic(), 'P', Blocks.PISTON  }));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.rockVendor), new Object[] { "BCB", "ILI", "III", 'I', SupportUtils.ironCasing(), 'B', Items.BOOK, 'L', SupportUtils.basicLogic(), 'C', SupportUtils.cabinet() }));
		}else{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cuttingStation), new Object[] { "IRI", "IBI", "IPI", 'I', "ingotIron", 'B', Items.BUCKET, 'P', Blocks.PISTON, 'R', "dustRedstone"  }));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.rockVendor), new Object[] { "BGB", "IRI", "III", 'I', "ingotIron", 'B', Items.BOOK, 'R', "dustRedstone", 'G', "blockGlass" }));
		}

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cuttingBlade), new Object[] { "III", "IDI", "III", 'I', "ingotIron", 'D', "gemDiamond"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rockFinder), new Object[] { Items.BOOK, "stone", "stone", "stone" }));
	}

}