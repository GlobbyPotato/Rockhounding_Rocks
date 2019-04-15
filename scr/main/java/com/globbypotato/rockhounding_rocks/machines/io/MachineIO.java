package com.globbypotato.rockhounding_rocks.machines.io;

import com.globbypotato.rockhounding_core.machines.BaseRotatingMachine;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityInv;
import com.globbypotato.rockhounding_rocks.handler.Reference;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MachineIO extends BaseRotatingMachine {
	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public MachineIO(String name, Material material, String[] array, float hardness, float resistance, SoundType stepSound) {
		super(Reference.MODID, name, material, array);
		setCreativeTab(Reference.RockhoundingRocks);
		setHardness(hardness); 
		setResistance(resistance);	
		setSoundType(stepSound);
	}


	public void handleRotation(World world, BlockPos pos, EntityPlayer player, int meta) {
		rotateTheBlock(world, pos);
	}

	public void rotateTheBlock(World world, BlockPos pos) {
		TileEntity tile = world.getTileEntity(pos);
		if(world.getBlockState(pos) != null && world.getBlockState(pos).getBlock() instanceof MachineIO && tile != null && tile instanceof TileEntityInv){
			TileEntityInv machine = (TileEntityInv)tile;
			switch(machine.facing){//2 4 5 3
				case 2: machine.facing = 5;break;
				case 5: machine.facing = 3;break;
				case 3: machine.facing = 4;break;
				case 4: machine.facing = 2;break;
				default: machine.facing = 2;
			}
			machine.markDirtyClient();
		}
	}
}