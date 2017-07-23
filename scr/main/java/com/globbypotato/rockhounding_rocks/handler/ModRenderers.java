package com.globbypotato.rockhounding_rocks.handler;
import com.globbypotato.rockhounding_rocks.machines.renders.RendererCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ModRenderers {

	public static void specialRenders() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCuttingStation.class, new RendererCuttingStation());		
	}
}