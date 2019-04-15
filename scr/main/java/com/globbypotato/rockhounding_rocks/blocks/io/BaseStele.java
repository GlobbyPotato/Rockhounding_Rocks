package com.globbypotato.rockhounding_rocks.blocks.io;

import com.globbypotato.rockhounding_rocks.enums.props.EnumPos;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BaseStele extends DecoIO{
    public static final PropertyEnum POS = PropertyEnum.create("pos", EnumPos.class);

	public BaseStele(String name, Material material, String[] array, float hardness, float resistance, SoundType stepSound) {
		super(name, material, array, hardness, resistance, stepSound);
		setLightLevel(0.25F);
	}

	@Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){
        return state.withProperty(POS, columnConnections(worldIn, pos));
    }

	private static EnumPos columnConnections(IBlockAccess worldIn, BlockPos pos) {
        BlockPos offUP = pos.offset(EnumFacing.UP);
        BlockPos offDOWN = pos.offset(EnumFacing.DOWN);
        IBlockState stateUP = worldIn.getBlockState(offUP);
        IBlockState stateDOWN = worldIn.getBlockState(offDOWN);
        IBlockState state = worldIn.getBlockState(pos);
        boolean multi = ModConfig.CAN_PILLARS_BLEND;
        if(multi){
	        if(stateUP.getBlock() instanceof BaseStele && stateDOWN.getBlock() instanceof BaseStele){
	        	return EnumPos.TORSO;
	        }else if(!(stateUP.getBlock() instanceof BaseStele) && stateDOWN.getBlock() instanceof BaseStele){
	        	return EnumPos.TOP;
	        }else if(stateUP.getBlock() instanceof BaseStele && !(stateDOWN.getBlock() instanceof BaseStele)){
	        	return EnumPos.BOTTOM;
	        }
        }else{
	        if(stateUP.getBlock() == state.getBlock() && stateDOWN.getBlock() == state.getBlock()){
	        	return EnumPos.TORSO;
	        }else if(!(stateUP.getBlock() == state.getBlock()) && stateDOWN.getBlock() == state.getBlock()){
	        	return EnumPos.TOP;
	        }else if(stateUP.getBlock() == state.getBlock() && !(stateDOWN.getBlock() == state.getBlock())){
	        	return EnumPos.BOTTOM;
	        }
        }
   		return EnumPos.FULL;
	}

	@Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face){
        return BlockFaceShape.UNDEFINED;
    }

}