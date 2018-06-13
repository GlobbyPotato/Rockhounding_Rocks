package com.globbypotato.rockhounding_rocks.machines.tileentity;

import com.globbypotato.rockhounding_rocks.enums.EnumMachines;

public class TEStoneRammer extends TileEntityIO{

	public TEStoneRammer() {
		super(0, 0, 0);
	}



	//----------------------- HANDLER -----------------------
	public static String getName(){
		return "stone_rammer";
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update() {
		if(!world.isRemote){
			if(hasSpinningWheel(this.world, this.pos, isFacingAt(270))){
				int oldFacing = getFacing().getIndex();
				swapState(this.world, this.pos, oldFacing, EnumMachines.STONE_RAMMER_ANIMATED.ordinal());
			}
		}
	}

}