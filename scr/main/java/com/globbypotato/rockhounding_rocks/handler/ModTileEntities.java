package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingBench;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingRack;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEMillWheel;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEMillWheelAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockPlatform;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockVendor;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TESculptingBench;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TESculptingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEStoneRammer;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEStoneRammerAnimated;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {

	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TECuttingStation.class, Reference.MODID + "_" + TECuttingStation.getName());
		GameRegistry.registerTileEntity(TERockVendor.class, Reference.MODID + "_" + TERockVendor.getName());
		GameRegistry.registerTileEntity(TEMillWheel.class, Reference.MODID + "_" + TEMillWheel.getName());
		GameRegistry.registerTileEntity(TEMillWheelAnimated.class, Reference.MODID + "_" + TEMillWheelAnimated.getName());
		GameRegistry.registerTileEntity(TERockPlatform.class, Reference.MODID + "_" + TERockPlatform.getName());
		GameRegistry.registerTileEntity(TEStoneRammer.class, Reference.MODID + "_" + TEStoneRammer.getName());
		GameRegistry.registerTileEntity(TEStoneRammerAnimated.class, Reference.MODID + "_" + TEStoneRammerAnimated.getName());
		GameRegistry.registerTileEntity(TECarvingBench.class, Reference.MODID + "_" + TECarvingBench.getName());
		GameRegistry.registerTileEntity(TECarvingBenchAnimated.class, Reference.MODID + "_" + TECarvingBenchAnimated.getName());
		GameRegistry.registerTileEntity(TECarvingRack.class, Reference.MODID + "_" + TECarvingRack.getName());
		GameRegistry.registerTileEntity(TESculptingBench.class, Reference.MODID + "_" + TESculptingBench.getName());
		GameRegistry.registerTileEntity(TESculptingBenchAnimated.class, Reference.MODID + "_" + TESculptingBenchAnimated.getName());
	}

}