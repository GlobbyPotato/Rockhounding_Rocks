package com.globbypotato.rockhounding_rocks.machines.tileentity;

import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityInv;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class TEMillWheel extends TileEntityIO{

	public TEMillWheel() {
		super(0, 0, 0);
	}



	//----------------------- HANDLER -----------------------
	public static String getName(){
		return "mill_wheel";
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update() {
		if(!world.isRemote){
			IBlockState state = this.world.getBlockState(pos);
			int oldFacing = getFacing().getIndex();
			BlockPos midPos = pos.down();
			IBlockState midState = this.world.getBlockState(midPos);
			Block midLev = midState.getBlock();
			if(midLev != null && midLev == Blocks.WATER){
				int midFlow = midLev.getMetaFromState(midState);
				if(midFlow > 0 && midFlow < 3){
					if(this.getFacing() == EnumFacing.EAST){
						checkForSpin(state, oldFacing, midLev, midFlow, EnumFacing.SOUTH, EnumFacing.NORTH);
					}else if(this.getFacing() == EnumFacing.WEST){
						checkForSpin(state, oldFacing, midLev, midFlow, EnumFacing.NORTH, EnumFacing.SOUTH);
					}else if(this.getFacing() == EnumFacing.SOUTH){
						checkForSpin(state, oldFacing, midLev, midFlow, EnumFacing.WEST, EnumFacing.EAST);
					}else if(this.getFacing() == EnumFacing.NORTH){
						checkForSpin(state, oldFacing, midLev, midFlow, EnumFacing.EAST, EnumFacing.WEST);
					}
				}
			}
		}
	}

	private void checkForSpin(IBlockState state, int oldFacing, Block midLev, int midFlow, EnumFacing hiSide, EnumFacing loSide) {
		BlockPos hiPos = pos.down().offset(hiSide);
		BlockPos loPos = pos.down().offset(loSide);
		IBlockState hiState = this.world.getBlockState(hiPos);
		IBlockState loState = this.world.getBlockState(loPos);
		Block hiLev = hiState.getBlock();
		Block loLev = loState.getBlock();
		if(hiLev != null && hiLev == Blocks.WATER){
			int hiFlow = midLev.getMetaFromState(hiState);
			if(hiFlow < midFlow){
				if(loLev != null && loLev == Blocks.WATER){
					int loFlow = loLev.getMetaFromState(loState);
					if(loFlow > midFlow){
						swapState(this.world, this.pos, oldFacing, EnumMachines.MILL_WHEEL_ANIMATED.ordinal());
					}
				}
			}
		}
	}

}