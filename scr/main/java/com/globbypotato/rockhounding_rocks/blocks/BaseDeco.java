package com.globbypotato.rockhounding_rocks.blocks;

import net.minecraft.block.state.IBlockState;

public class BaseDeco extends BaseRocks {

	protected BaseDeco(String[] array, String name, boolean isTranslucent) {
		super(array, name, isTranslucent);
	}

    @Override
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
    }

}