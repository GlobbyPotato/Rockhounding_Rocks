package com.globbypotato.rockhounding_rocks.compat.top;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInterModComms;

public class TopCompat{
	private static String TOPID = "theoneprobe";
	private static String modpath = "com.globbypotato.rockhounding_rocks.compat.top.";

	public static void init(){
        if (Loader.isModLoaded(TOPID)) {
            FMLInterModComms.sendFunctionMessage(TOPID, "getTheOneProbe", modpath + "TopMachines$getTOP");
        }
	}

}