package com.globbypotato.rockhounding_rocks.machines;

import com.globbypotato.rockhounding_rocks.handler.GuiHandler;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityRockVendor;

import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;

public class RockVendor extends BaseMachine{
    public RockVendor(float hardness, float resistance, String name){
        super(name, Material.IRON, TileEntityRockVendor.class,GuiHandler.rockVendorID);
		setHardness(hardness);
		setResistance(resistance);	
		setHarvestLevel("pickaxe", 0);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

}