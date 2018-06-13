package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.machines.renders.RendererCarvingBench;
import com.globbypotato.rockhounding_rocks.machines.renders.RendererCarvingRack;
import com.globbypotato.rockhounding_rocks.machines.renders.RendererCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.renders.RendererRockPlatform;
import com.globbypotato.rockhounding_rocks.machines.renders.RendererSculptingBench;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingRack;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockPlatform;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TESculptingBenchAnimated;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ModRenderers {

	public static void specialRenders() {
		ClientRegistry.bindTileEntitySpecialRenderer(TECuttingStation.class, new RendererCuttingStation());		
		ClientRegistry.bindTileEntitySpecialRenderer(TERockPlatform.class, new RendererRockPlatform());		
		ClientRegistry.bindTileEntitySpecialRenderer(TECarvingRack.class, new RendererCarvingRack());		
		ClientRegistry.bindTileEntitySpecialRenderer(TECarvingBenchAnimated.class, new RendererCarvingBench());		
		ClientRegistry.bindTileEntitySpecialRenderer(TESculptingBenchAnimated.class, new RendererSculptingBench());		
	}
}