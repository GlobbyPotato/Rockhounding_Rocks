package com.globbypotato.rockhounding_rocks.blocks.pillars;

import com.globbypotato.rockhounding_rocks.blocks.io.BaseStele;
import com.globbypotato.rockhounding_rocks.enums.props.EnumPos;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksB;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SteleB extends BaseStele {
	public static final PropertyEnum VARIANT = PropertyEnum.create("type", EnumRocksB.class);

    public SteleB(String[] array, String name){
        super(name, Material.ROCK, array, 3.0F, 5.0F, SoundType.STONE);
		for(int x = 0; x < 16; x++){setHarvestLevel(EnumRocksB.values()[x].tool(), EnumRocksB.values()[x].harvest(), getState(x));}
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumRocksB.values()[0]).withProperty(POS, EnumPos.FULL));
    }

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getState(meta);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumRocksB)state.getValue(VARIANT)).ordinal();
	}

	@Override
	public BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[] { VARIANT, POS });
	}

	private IBlockState getState(int i) {
		return getDefaultState().withProperty(VARIANT, EnumRocksB.values()[i]);
	}

	@Override
	public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
		return EnumRocksB.values()[getMetaFromState(state)].hardness();
	}

}