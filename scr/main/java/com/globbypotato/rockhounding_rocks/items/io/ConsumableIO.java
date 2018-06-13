package com.globbypotato.rockhounding_rocks.items.io;

import java.util.Random;

import com.globbypotato.rockhounding_core.items.BaseConsumable;
import com.globbypotato.rockhounding_rocks.handler.Reference;

public class ConsumableIO extends BaseConsumable{
	public Random rand = new Random();

	public ConsumableIO(String name, int uses) {
		super(Reference.MODID, name, uses);
		setCreativeTab(Reference.RockhoundingRocks);
	}

}