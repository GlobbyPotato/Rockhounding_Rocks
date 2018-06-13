package com.globbypotato.rockhounding_rocks.blocks.decos;

import com.globbypotato.rockhounding_rocks.blocks.io.MetaIO;
import com.globbypotato.rockhounding_rocks.enums.rocks.extra.EnumVanilla2;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PlainVanilla2 extends MetaIO{
	public static final PropertyEnum VARIANT = PropertyEnum.create("type", EnumVanilla2.class);

    public PlainVanilla2(String[] array, String name){
        super(name, Material.ROCK, array, 3.0F, 5.0F, SoundType.STONE);
		for(int x = 0; x < 16; x++){setHarvestLevel(EnumVanilla2.values()[x].tool(), EnumVanilla2.values()[x].harvest(), getState(x));}
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumVanilla2.values()[0]));
    }

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getState(meta);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumVanilla2)state.getValue(VARIANT)).ordinal();
	}

	@Override
	public BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[] { VARIANT });
	}

	private IBlockState getState(int i) {
		return getDefaultState().withProperty(VARIANT, EnumVanilla2.values()[i]);
	}

	@Override
	public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
		return EnumVanilla2.values()[getMetaFromState(state)].hardness();
	}

	@Override
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos){
        return state.getBlock().getMetaFromState(state) == 1 ? 15 : 0;
    }

    @Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items){
        for (int i = 0; i < this.array.length; ++i){
        	if(validPart(i)){ 
           		items.add(new ItemStack(this, 1, i));
        	}
        }
    }

    public boolean validPart(int i) {
		return i == EnumVanilla2.ACACIA_WOOD.ordinal()
			|| i == EnumVanilla2.BIRCH_WOOD.ordinal()
			|| i == EnumVanilla2.DARK_OAK_WOOD.ordinal()
			|| i == EnumVanilla2.DARK_PRISMARINE.ordinal()
			|| i == EnumVanilla2.GLOWSTONE.ordinal()
			|| i == EnumVanilla2.JUNGLE_WOOD.ordinal()
			|| i == EnumVanilla2.LEATHER.ordinal()
			|| i == EnumVanilla2.MYCELIUM.ordinal()
			|| i == EnumVanilla2.OAK_WOOD.ordinal()
			|| i == EnumVanilla2.PURPUR.ordinal()
			|| i == EnumVanilla2.SIDE_MUSHROOM.ordinal()
			|| i == EnumVanilla2.SPRUCE_WOOD.ordinal();
	}

    public static boolean validCut(int i) {
		return i == EnumVanilla2.GLOWSTONE.ordinal()
			|| i == EnumVanilla2.ACACIA_WOOD.ordinal()
			|| i == EnumVanilla2.BIRCH_WOOD.ordinal()
			|| i == EnumVanilla2.DARK_OAK_WOOD.ordinal()
			|| i == EnumVanilla2.JUNGLE_WOOD.ordinal()
			|| i == EnumVanilla2.OAK_WOOD.ordinal()
			|| i == EnumVanilla2.SPRUCE_WOOD.ordinal();
	}

}