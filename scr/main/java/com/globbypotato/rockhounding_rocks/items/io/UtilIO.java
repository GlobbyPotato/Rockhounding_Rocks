package com.globbypotato.rockhounding_rocks.items.io;

import com.globbypotato.rockhounding_core.items.BaseItem;
import com.globbypotato.rockhounding_rocks.handler.Reference;

public class UtilIO extends BaseItem {
	public UtilIO(String name){
		super(Reference.MODID, name);
		setMaxStackSize(1);
		setCreativeTab(Reference.RockhoundingRocks);
	}
}