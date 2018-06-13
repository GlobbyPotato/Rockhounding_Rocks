package com.globbypotato.rockhounding_rocks.blocks.io;

import com.globbypotato.rockhounding_rocks.enums.props.EnumPos;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BaseDorics extends DecoIO{
    public static final PropertyEnum POS = PropertyEnum.create("pos", EnumPos.class);

	public BaseDorics(String name, Material material, String[] array, float hardness, float resistance, SoundType stepSound) {
		super(name, material, array, hardness, resistance, stepSound);
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
	        if(stateUP.getBlock() instanceof BaseDorics && stateDOWN.getBlock() instanceof BaseDorics){
	        	return EnumPos.TORSO;
	        }else if(!(stateUP.getBlock() instanceof BaseDorics) && stateDOWN.getBlock() instanceof BaseDorics){
	        	return EnumPos.TOP;
	        }else if(stateUP.getBlock() instanceof BaseDorics && !(stateDOWN.getBlock() instanceof BaseDorics)){
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

}