package com.globbypotato.rockhounding_rocks.blocks.io;

import javax.annotation.Nullable;

import com.globbypotato.rockhounding_rocks.enums.props.EnumSupport;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class LanternsIO extends MetaIO{
    public static final PropertyEnum SUPPORT = PropertyEnum.create("support", EnumSupport.class);
    public static final AxisAlignedBB LANTERN_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 2.0D, 1.0D);
    public static final AxisAlignedBB SUPPORT_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	public LanternsIO(String name, Material material, String[] array, float hardness, float resistance, SoundType stepSound) {
		super(name, material, array, hardness, resistance, stepSound);
		setLightLevel(1.0F);
	}

    @Override
    public boolean isFullCube(IBlockState state){
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Nullable
	@Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos){
        BlockPos offUP = pos.offset(EnumFacing.UP);
        IBlockState stateUP = worldIn.getBlockState(offUP);
        if(stateUP.getBlock() instanceof ISculpture){
        	return SUPPORT_AABB;
        }
   		return LANTERN_AABB;
    }

	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess worldIn, BlockPos pos){
        BlockPos offUP = pos.offset(EnumFacing.UP);
        IBlockState stateUP = worldIn.getBlockState(offUP);
        if(stateUP.getBlock() instanceof ISculpture){
        	return SUPPORT_AABB;
        }
   		return LANTERN_AABB;
    }

	@Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){
        return state.withProperty(SUPPORT,lanternConnections(worldIn, pos));
    }

	private static EnumSupport lanternConnections(IBlockAccess worldIn, BlockPos pos) {
        BlockPos offUP = pos.offset(EnumFacing.UP);
        IBlockState stateUP = worldIn.getBlockState(offUP);
        if(stateUP.getBlock() instanceof ISculpture){
        	return EnumSupport.BASE;
        }
   		return EnumSupport.FULL;
	}

}