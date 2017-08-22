package com.globbypotato.rockhounding_rocks.proxy;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.compat.crafttweaker.CTSupport;
import com.globbypotato.rockhounding_rocks.handler.GuiHandler;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.handler.ModRecipes;
import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.machines.recipes.MachineRecipes;
import com.globbypotato.rockhounding_rocks.utils.IMCUtils;
import com.globbypotato.rockhounding_rocks.world.RocksGenerator;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e){
		// Load Config
		ModConfig.loadConfig(e);

		// Register Contents
		ModBlocks.init();
		ModItems.init();

		// Register WorldGen 
		GameRegistry.registerWorldGenerator(new RocksGenerator(), 1);
	}

	public void init(FMLInitializationEvent e){
		// Register Recipes
		ModRecipes.init();
		MachineRecipes.machineRecipes();

		// Register Guis
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MODID, new GuiHandler());
	}

	public void imcInit(IMCEvent event) {
		// Add custom recipes
		IMCUtils.extraRecipes(event.getMessages());
	}

	public void postInit(FMLPostInitializationEvent e){
		// Register Craft Tweaker Support
		CTSupport.init();
	}

	public void registerTileEntitySpecialRenderer() {}

	public void registerRenderInformation() {}

	public void initFluidModel(Block block, Fluid fluid) {}

}