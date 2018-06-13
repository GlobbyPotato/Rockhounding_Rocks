package com.globbypotato.rockhounding_rocks.proxy;

import com.globbypotato.rockhounding_rocks.compat.crafttweaker.CTSupport;
import com.globbypotato.rockhounding_rocks.compat.top.TopCompat;
import com.globbypotato.rockhounding_rocks.compat.waila.WailaCompat;
import com.globbypotato.rockhounding_rocks.handler.GlobbyEventHandler;
import com.globbypotato.rockhounding_rocks.handler.GuiHandler;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.handler.ModTileEntities;
import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.utils.IMCUtils;
import com.globbypotato.rockhounding_rocks.world.RocksGenerator;

import net.minecraftforge.common.MinecraftForge;
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

		// Register Events
		MinecraftForge.EVENT_BUS.register(new GlobbyEventHandler());	

		// Register tile entities
		ModTileEntities.registerTileEntities();

		// Register WorldGen 
		GameRegistry.registerWorldGenerator(new RocksGenerator(), 1);

		// info compatibility
        WailaCompat.init();
        TopCompat.init();
		CTSupport.init();
	}

	/**
	 * @param e  
	 */
	public void init(FMLInitializationEvent e){
		// Register Guis
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MODID, new GuiHandler());
	}

	public void imcInit(IMCEvent event) {
		// Add custom recipes
		IMCUtils.extraRecipes(event.getMessages());
	}

	/**
	 * @param e  
	 */
	public void postInit(FMLPostInitializationEvent e){
		//
	}

}