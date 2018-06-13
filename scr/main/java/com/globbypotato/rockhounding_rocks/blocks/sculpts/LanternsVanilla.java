package com.globbypotato.rockhounding_rocks.blocks.sculpts;

import com.globbypotato.rockhounding_rocks.blocks.io.LanternsIO;
import com.globbypotato.rockhounding_rocks.enums.props.EnumSupport;
import com.globbypotato.rockhounding_rocks.enums.rocks.extra.EnumVanilla;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LanternsVanilla extends LanternsIO {
	public static final PropertyEnum VARIANT = PropertyEnum.create("type", EnumVanilla.class);

    public LanternsVanilla(String[] array, String name){
        super(name, Material.ROCK, array, 3.0F, 5.0F, SoundType.STONE);
		for(int x = 0; x < 16; x++){setHarvestLevel(EnumVanilla.values()[x].tool(), EnumVanilla.values()[x].harvest(), getState(x));}
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumVanilla.values()[0]).withProperty(SUPPORT, EnumSupport.FULL));
    }

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getState(meta);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumVanilla)state.getValue(VARIANT)).ordinal();
	}

	@Override
	public BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[] { VARIANT, SUPPORT });
	}

	private IBlockState getState(int i) {
		return getDefaultState().withProperty(VARIANT, EnumVanilla.values()[i]);
	}

	@Override
	public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
		return EnumVanilla.values()[getMetaFromState(state)].hardness();
	}

}