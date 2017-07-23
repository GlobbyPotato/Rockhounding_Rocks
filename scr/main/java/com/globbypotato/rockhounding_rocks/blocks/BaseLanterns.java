package com.globbypotato.rockhounding_rocks.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BaseLanterns extends BaseRocks {
    public static final AxisAlignedBB LANTERN_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 2.0D, 1.0D);

	protected BaseLanterns(String[] array, String name, boolean isTranslucent) {
		super(array, name, isTranslucent);
		setLightLevel(1.0F);
	}

    @Override
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
    }

    @Nullable
	@Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, World worldIn, BlockPos pos){
    	return LANTERN_AABB;
    }

	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
    	return LANTERN_AABB;
    }

}