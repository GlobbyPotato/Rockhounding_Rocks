package com.globbypotato.rockhounding_rocks.items;

import com.globbypotato.rockhounding_core.items.BaseConsumable;
import com.globbypotato.rockhounding_rocks.handler.Reference;

public class ConsumableIO extends BaseConsumable{

	public ConsumableIO(String name, int uses) {
		super(name, uses);
		setCreativeTab(Reference.RockhoundingRocks);
	}
}