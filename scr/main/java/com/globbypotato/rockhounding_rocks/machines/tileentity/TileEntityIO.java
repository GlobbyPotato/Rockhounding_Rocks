package com.globbypotato.rockhounding_rocks.machines.tileentity;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityInv;
import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;
import com.globbypotato.rockhounding_rocks.machines.Machines;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityIO extends TileEntityInv{

	public TileEntityIO(int inputSlots, int outputSlots, int templateSlots) {
		super(inputSlots, outputSlots, templateSlots);
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update() {

	}

	// WATER WHEEL
	public boolean hasSpinningWheel(World world, BlockPos pos, EnumFacing isFacingAt) {
		BlockPos wheelPos = pos.offset(isFacingAt);
		IBlockState wheelState = world.getBlockState(wheelPos);
		if(wheelState != null && wheelState.getBlock() == ModBlocks.MACHINES && wheelState.getBlock().getMetaFromState(wheelState) == EnumMachines.MILL_WHEEL_ANIMATED.ordinal()){
			TileEntity tile = world.getTileEntity(wheelPos);
			if(tile != null){
				TileEntityInv mill = (TileEntityInv)tile;
				if(mill.getFacing() == isFacingAt.getOpposite()){
					return true;
				}
			}
		}
		return false;
	}



	// PLATFORM
	public TERockPlatform getPlatform(EnumFacing facing){
		BlockPos platformPos = this.pos.offset(facing);
		TileEntity te = this.world.getTileEntity(platformPos);
		if(this.world.getBlockState(platformPos) != null && te instanceof TERockPlatform){
			TERockPlatform platform = (TERockPlatform)te;
			return platform;
		}
		return null;
	}

	public boolean isValidPlatform(EnumFacing facing){
		return getPlatform(facing) != null;
	}

	public MachineStackHandler getPlatformInput(EnumFacing facing){
		return ((MachineStackHandler)getPlatform(facing).getInput());
	}
	public MachineStackHandler getPlatformOutput(EnumFacing facing){
		return ((MachineStackHandler)getPlatform(facing).getOutput());
	}

	public ItemStack inputSlot(EnumFacing facing){
		return getPlatformInput(facing).getStackInSlot(TERockPlatform.INPUT_SLOT);
	}
	public ItemStack outputSlot(EnumFacing facing){
		return getPlatformOutput(facing).getStackInSlot(TERockPlatform.OUTPUT_SLOT);
	}



	// CARVING RACK
	public TECarvingRack getRack(){
		BlockPos rackPos = this.pos.up();
		TileEntity te = this.world.getTileEntity(rackPos);
		if(this.world.getBlockState(rackPos) != null && te instanceof TECarvingRack){
			TECarvingRack rack = (TECarvingRack)te;
			if(rack.getFacing() == getFacing()){
				return rack;
			}
		}
		return null;
	}

	public boolean hasRack(){
		return getRack() != null;
	}



	// WATER WHEEL
	public void swapState(World world, BlockPos pos, int oldFacing, int meta) {
		IBlockState state = world.getBlockState(pos);
		world.setBlockState(pos, state.withProperty(Machines.VARIANT, EnumMachines.values()[meta]).withProperty(Machines.FACING, EnumFacing.getFront(oldFacing)), 2);
		TileEntity tile = world.getTileEntity(pos);
		if(tile != null){
			TileEntityInv mill = (TileEntityInv)tile;
			mill.facing = oldFacing;
			this.markDirtyClient();
		}		
	}

}