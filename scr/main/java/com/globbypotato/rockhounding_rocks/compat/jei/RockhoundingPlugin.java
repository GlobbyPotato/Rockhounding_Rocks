package com.globbypotato.rockhounding_rocks.compat.jei;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.compat.jei.carving_bench.CarvingBenchCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.carving_bench.CarvingBenchWrapper;
import com.globbypotato.rockhounding_rocks.compat.jei.cutting_station.CuttingStationCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.cutting_station.CuttingStationWrapper;
import com.globbypotato.rockhounding_rocks.compat.jei.rock_vendor.RockVendorCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.rock_vendor.RockVendorWrapper;
import com.globbypotato.rockhounding_rocks.compat.jei.sculpting_bench.SculptingBenchCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.sculpting_bench.SculptingBenchWrapper;
import com.globbypotato.rockhounding_rocks.compat.jei.stone_rammer.StoneRammerCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.stone_rammer.StoneRammerWrapper;
import com.globbypotato.rockhounding_rocks.enums.EnumCuts;
import com.globbypotato.rockhounding_rocks.enums.rocks.extra.EnumVanilla2;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.machines.gui.UICarvingRack;
import com.globbypotato.rockhounding_rocks.machines.gui.UICuttingStation;
import com.globbypotato.rockhounding_rocks.machines.gui.UIRockVendor;
import com.globbypotato.rockhounding_rocks.utils.BaseRecipes;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientBlacklist;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@JEIPlugin
@SideOnly(Side.CLIENT)
public class RockhoundingPlugin implements IModPlugin {

	public static IJeiHelpers jeiHelpers;

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		jeiHelpers = registry.getJeiHelpers();
		IGuiHelper guiHelper = jeiHelpers.getGuiHelper();

		registry.addRecipeCategories(	
			new RockVendorCategory(guiHelper, RHRecipeUID.VENDOR),
			new StoneRammerCategory(guiHelper, RHRecipeUID.RAMMER),
			new CarvingBenchCategory(guiHelper, RHRecipeUID.CARVER),
			new SculptingBenchCategory(guiHelper, RHRecipeUID.SCULPTING)
		);
		if(ModConfig.CAN_USE_CUTTING_STATION){
			registry.addRecipeCategories(
				new CuttingStationCategory(guiHelper, RHRecipeUID.CUTTING)
			);	
		}				

	}

	@Override
	public void register(IModRegistry registry) {
		jeiHelpers = registry.getJeiHelpers();
		int rX = 156; int rY = 4; int rW = 16; int rH = 14; 

		if(ModConfig.CAN_USE_CUTTING_STATION){
			registry.addRecipes(CuttingStationWrapper.getRecipes(), RHRecipeUID.CUTTING);
			registry.addRecipeClickArea(UICuttingStation.class, rX, rY, rW, rH, RHRecipeUID.CUTTING);
			registry.addRecipeCatalyst(BaseRecipes.cutting_station, RHRecipeUID.CUTTING);
			registry.addIngredientInfo(BaseRecipes.cutting_station, ItemStack.class, "The Cutting Station allows to perform various rock cuttings to give the initial block a new shape or a decorative pattern. It requires fuel to be powered or RF, following the Rockhounding powering system, by using an Induction Heating Interface. It also needs water to lubricate the machine while cutting. The gui is provided of several switches to select which cut must be performed: by the icon and by hovering the mouse on them, they will tell the type of cut. A cut must be selected for the input block being accepted. The Customized Cuts is meant for integrated recipes, while by default, the machine will usually accept the raw rock to be turned into a plain block and then, the plain block to be turned into anything else. To operate, the machine needs to be loaded with a cutting blade in its proper slot. The speed of the machine is affected by the SHARPNESS enchantment applied to the blade, the UNBREAKING enchantment will affect its durability and the EFFICIENCY enchantment will affect the consumed water per cut.");
		}

		registry.addRecipes(RockVendorWrapper.getRecipes(), RHRecipeUID.VENDOR);
		registry.addRecipes(StoneRammerWrapper.getRecipes(), RHRecipeUID.RAMMER);
		registry.addRecipes(CarvingBenchWrapper.getRecipes(), RHRecipeUID.CARVER);
		registry.addRecipes(SculptingBenchWrapper.getRecipes(), RHRecipeUID.SCULPTING);

		registry.addRecipeClickArea(UIRockVendor.class, rX, rY, rW, rH, RHRecipeUID.VENDOR);
		registry.addRecipeClickArea(UICarvingRack.class, rX, rY, rW, rH, RHRecipeUID.CARVER);

		registry.addRecipeCatalyst(BaseRecipes.rock_vendor, RHRecipeUID.VENDOR);
		registry.addRecipeCatalyst(BaseRecipes.animated_rammer, RHRecipeUID.RAMMER);
		registry.addRecipeCatalyst(BaseRecipes.still_bench, RHRecipeUID.CARVER);
		registry.addRecipeCatalyst(BaseRecipes.still_sculpting, RHRecipeUID.SCULPTING);

		IIngredientBlacklist itemBlacklist = registry.getJeiHelpers().getIngredientBlacklist();
		for(int i=0;i<EnumCuts.size();i++){
			itemBlacklist.addIngredientToBlacklist(new ItemStack(ModItems.PATTERN_ITEMS,1,i));
		}
		itemBlacklist.addIngredientToBlacklist(BaseRecipes.animated_wheel);
		itemBlacklist.addIngredientToBlacklist(BaseRecipes.animated_rammer);
		itemBlacklist.addIngredientToBlacklist(BaseRecipes.animated_bench);
		itemBlacklist.addIngredientToBlacklist(BaseRecipes.animated_sculpting);
		if(!ModConfig.CAN_USE_CUTTING_STATION){
			itemBlacklist.addIngredientToBlacklist(BaseRecipes.cutting_station);
			itemBlacklist.addIngredientToBlacklist(ToolUtils.blade);
		}
		
		itemBlacklist.addIngredientToBlacklist(new ItemStack(ModBlocks.BLOCKS_VANILLA2, 1, EnumVanilla2.BROWN_MUSHROOM.ordinal()));
		itemBlacklist.addIngredientToBlacklist(new ItemStack(ModBlocks.BLOCKS_VANILLA2, 1, EnumVanilla2.RED_MUSHROOM.ordinal()));
		itemBlacklist.addIngredientToBlacklist(new ItemStack(ModBlocks.BLOCKS_VANILLA2, 1, EnumVanilla2.ICE_PACKED.ordinal()));
		itemBlacklist.addIngredientToBlacklist(new ItemStack(ModBlocks.BLOCKS_VANILLA2, 1, EnumVanilla2.SPONGE.ordinal()));

	}
}