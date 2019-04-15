package com.globbypotato.rockhounding_rocks.blocks.decos;

import com.globbypotato.rockhounding_rocks.blocks.io.WallsIO;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksE;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WallsE extends WallsIO {
	public static final PropertyEnum VARIANT = PropertyEnum.create("type", EnumRocksE.class);

  public WallsE(String[] array, String name){
        super(name, Material.ROCK, array, 3.0F, 5.0F, SoundType.STONE);
		for(int x = 0; x < 16; x++){setHarvestLevel(EnumRocksE.values()[x].tool(), EnumRocksE.values()[x].harvest(), getState(x));}
		this.setDefaultState(this.blockState.getBaseState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)).withProperty(VARIANT, EnumRocksE.values()[0]));
  }

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getState(meta);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumRocksE)state.getValue(VARIANT)).ordinal();
	}

	@Override
	public BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[] { VARIANT, UP, NORTH, EAST, WEST, SOUTH });
	}

	private IBlockState getState(int i) {
		return getDefaultState().withProperty(VARIANT, EnumRocksE.values()[i]);
	}

	@Override
	public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
		return EnumRocksE.values()[getMetaFromState(state)].hardness();
	}

}