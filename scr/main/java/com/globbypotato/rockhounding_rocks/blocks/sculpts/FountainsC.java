package com.globbypotato.rockhounding_rocks.blocks.sculpts;

import com.globbypotato.rockhounding_rocks.blocks.io.FountainsIO;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksC;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FountainsC extends FountainsIO {
	public static final PropertyEnum VARIANT = PropertyEnum.create("type", EnumRocksC.class);

    public FountainsC(String[] array, String name){
        super(name, Material.ROCK, array, 3.0F, 5.0F, SoundType.STONE);
		for(int x = 0; x < 16; x++){setHarvestLevel(EnumRocksC.values()[x].tool(), EnumRocksC.values()[x].harvest(), getState(x));}
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumRocksC.values()[0]));
    }

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getState(meta);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumRocksC)state.getValue(VARIANT)).ordinal();
	}

	@Override
	public BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[] { VARIANT });
	}

	private IBlockState getState(int i) {
		return getDefaultState().withProperty(VARIANT, EnumRocksC.values()[i]);
	}

	@Override
	public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
		return EnumRocksC.values()[getMetaFromState(state)].hardness();
	}

}