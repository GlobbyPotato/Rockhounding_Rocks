package com.globbypotato.rockhounding_rocks.enums;

import net.minecraft.util.IStringSerializable;

public interface BaseEnum extends IStringSerializable{

	@Override
	public default String getName() {
		return toString().toLowerCase();
	}

}