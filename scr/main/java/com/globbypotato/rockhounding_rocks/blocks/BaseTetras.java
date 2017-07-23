package com.globbypotato.rockhounding_rocks.blocks;

import com.globbypotato.rockhounding_rocks.enums.rocks.EnumPos;

import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BaseTetras extends BaseRocks {
    public static final PropertyEnum POS = PropertyEnum.create("pos", EnumPos.class);

	protected BaseTetras(String[] array, String name, boolean isTranslucent) {
		super(array, name, isTranslucent);
	}

    @Override
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
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
        if(stateUP.getBlock() instanceof BaseTetras && stateDOWN.getBlock() instanceof BaseTetras){
        	return EnumPos.TORSO;
        }else if(!(stateUP.getBlock() instanceof BaseTetras) && stateDOWN.getBlock() instanceof BaseTetras){
        	return EnumPos.TOP;
        }else if(stateUP.getBlock() instanceof BaseTetras && !(stateDOWN.getBlock() instanceof BaseTetras)){
        	return EnumPos.BOTTOM;
        }else{
    		return EnumPos.FULL;
        }
	}

}