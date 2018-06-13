package com.globbypotato.rockhounding_rocks.machines.io;

import com.globbypotato.rockhounding_core.machines.BaseRotatingMachine;
import com.globbypotato.rockhounding_rocks.handler.Reference;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MachineIO extends BaseRotatingMachine {

	public MachineIO(String name, Material material, String[] array, float hardness, float resistance, SoundType stepSound) {
		super(Reference.MODID, name, material, array);
		setCreativeTab(Reference.RockhoundingRocks);
		setHardness(hardness); 
		setResistance(resistance);	
		setSoundType(stepSound);
	}

}