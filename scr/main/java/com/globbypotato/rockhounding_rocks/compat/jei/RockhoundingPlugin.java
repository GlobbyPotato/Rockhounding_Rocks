package com.globbypotato.rockhounding_rocks.compat.jei;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.compat.jei.cutting.CuttingRecipeCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.cutting.CuttingRecipeHandler;
import com.globbypotato.rockhounding_rocks.compat.jei.cutting.CuttingRecipeWrapper;
import com.globbypotato.rockhounding_rocks.compat.jei.vendor.VendorRecipeCategory;
import com.globbypotato.rockhounding_rocks.compat.jei.vendor.VendorRecipeHandler;
import com.globbypotato.rockhounding_rocks.compat.jei.vendor.VendorRecipeWrapper;
import com.globbypotato.rockhounding_rocks.machines.gui.GuiCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.gui.GuiRockVendor;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import net.minecraft.item.ItemStack;

@JEIPlugin
public class RockhoundingPlugin extends BlankModPlugin{

	public static IJeiHelpers jeiHelpers;

	@Override
	public void register(IModRegistry registry) {

		jeiHelpers = registry.getJeiHelpers();
		IGuiHelper guiHelper = jeiHelpers.getGuiHelper();

		registry.addRecipeCategories(
				new VendorRecipeCategory(guiHelper),
				new CuttingRecipeCategory(guiHelper)
				);

		registry.addRecipeHandlers(
				new VendorRecipeHandler(),
				new CuttingRecipeHandler()
				);

		registry.addRecipes(VendorRecipeWrapper.getRecipes());
		registry.addRecipes(CuttingRecipeWrapper.getRecipes());

		registry.addRecipeClickArea(GuiRockVendor.class, 107, 17, 23, 18, RHRecipeUID.VENDOR);
		registry.addRecipeClickArea(GuiCuttingStation.class, 83, 49, 28, 15, RHRecipeUID.CUTTING);

		registry.addRecipeCategoryCraftingItem(new ItemStack(ModBlocks.rockVendor), RHRecipeUID.VENDOR);
		registry.addRecipeCategoryCraftingItem(new ItemStack(ModBlocks.cuttingStation), RHRecipeUID.CUTTING);

		registry.addDescription(new ItemStack(ModItems.rockFinder), "This special book allows to identify any rock and search for it during explorations. It can be inscribed inside the Rocks Vending System by placing it in its Pedia slot and select the rock of interest. It works only if the biome filter option is enabled. All the informations about the rock will be stored in the book NBT. To read the information just hover the mouse on it from the inventory. To locate a rock just right click the ground with an inscribed book and a chat message will tell if the specific rock cn be found in that biome.");
		registry.addDescription(new ItemStack(ModBlocks.cuttingStation), "This machine allows to cut the rocks into decorative models or carve them with patterns. It requires fuel, water and a cutting blade to work. To select the specific cut there is a switch selector with all the available cuts. Clicking any of the switches it will highlight allowing the specific cut. The Customized Cut allows to integrate also generic recipes from the Api.");
		registry.addDescription(new ItemStack(ModBlocks.rockVendor), "This machine allows to purchase the rocks featured by this mod or get informations about each of them. Each rock is defined by a main color theme and a selector allows to switch between the 16 available colors. Another selector allows to switch between all the rocks listed under the selected color. The machine requires valuable items as fee to perform the purchase, each one returning a different quantity of rocks. To purchase a rock, just select the desired rock, place the fee in the slot (it will tell hw many rocks it will return) and click the Purchase button making sure the output slot is able to receive the purchased stack.");
	}
}