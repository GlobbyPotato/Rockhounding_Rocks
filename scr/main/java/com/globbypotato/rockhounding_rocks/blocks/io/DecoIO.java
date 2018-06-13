package com.globbypotato.rockhounding_rocks.blocks.io;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class DecoIO extends MetaIO implements ISculpture{
	public DecoIO(String name, Material material, String[] array, float hardness, float resistance, SoundType stepSound) {
		super(name, material, array, hardness, resistance, stepSound);
	}

    @Override
    public boolean isFullCube(IBlockState state){
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

}