package com.globbypotato.rockhounding_rocks.blocks.io;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

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

	@Override
    public boolean isTopSolid(IBlockState state){
        return true;
    }

	@Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face){
		if(face == EnumFacing.DOWN || face == EnumFacing.UP){
            return BlockFaceShape.SOLID;
        }
        return BlockFaceShape.UNDEFINED;
    }

}