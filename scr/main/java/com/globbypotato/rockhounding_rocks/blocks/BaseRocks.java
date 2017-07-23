package com.globbypotato.rockhounding_rocks.blocks;

import java.util.List;
import java.util.Random;

import com.globbypotato.rockhounding_rocks.handler.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseRocks extends Block{
	public String[] array;
	private boolean isTranslucent;

	protected BaseRocks(String[]array, String name, boolean isTranslucent) {
		super(Material.ROCK);
		setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		GameRegistry.register(this);
		setCreativeTab(Reference.RockhoundingRocks);
		setHardness(3.0F); setResistance(5.0F);	
		setSoundType(SoundType.STONE);
		this.array = array;
		this.isTranslucent = isTranslucent;
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return Item.getItemFromBlock(this);
	}

	@Override
    public int damageDropped(IBlockState state){
    	return getMetaFromState(state);
    }

	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		for (int i = 0; i < array.length; i++){
			list.add(new ItemStack(itemIn, 1, i));
		}
	}
	
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return this.isTranslucent ? BlockRenderLayer.TRANSLUCENT : BlockRenderLayer.SOLID;
    }

}