package com.globbypotato.rockhounding_rocks.blocks.pillars;

import com.globbypotato.rockhounding_core.blocks.itemblocks.BaseMetaIB;
import com.globbypotato.rockhounding_rocks.blocks.BaseFancy;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumPos;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksD;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FancyD extends BaseFancy {
	public static final PropertyEnum VARIANT = PropertyEnum.create("type", EnumRocksD.class);

    public FancyD(String[] array, String name, boolean isTranslucent){
        super(array, name, isTranslucent);
		GameRegistry.register(new BaseMetaIB(this, EnumRocksD.getNames()).setRegistryName(name));
		for(int x = 0; x < 16; x++){setHarvestLevel("pickaxe", EnumRocksD.values()[x].harvest(), getState(x));}
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumRocksD.values()[0]).withProperty(POS, EnumPos.FULL));
    }

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getState(meta);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumRocksD)state.getValue(VARIANT)).ordinal();
	}

	@Override
	public BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[] { VARIANT, POS });
	}

	private IBlockState getState(int i) {
		return getDefaultState().withProperty(VARIANT, EnumRocksD.values()[i]);
	}

	@Override
	public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
		return EnumRocksD.values()[getMetaFromState(state)].hardness();
	}

}