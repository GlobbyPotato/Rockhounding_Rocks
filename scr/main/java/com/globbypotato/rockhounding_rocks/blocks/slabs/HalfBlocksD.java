package com.globbypotato.rockhounding_rocks.blocks.slabs;

import java.util.Random;

import javax.annotation.Nullable;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.blocks.io.SlabsIO;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksD;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class HalfBlocksD extends SlabsIO {
    public static final PropertyEnum<EnumRocksD> VARIANT = PropertyEnum.<EnumRocksD>create("type", EnumRocksD.class);

	public HalfBlocksD(String name, String[] array, boolean tab) {
		super(name, Material.ROCK, array, 3.0F, 5.0F, tab);
		for(int x = 0; x < 16; x++){setHarvestLevel(EnumRocksD.values()[x].tool(), EnumRocksD.values()[x].harvest(), getState(x));}
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumRocksD.values()[0]));
	}

	private IBlockState getState(int i) {
		return getDefaultState().withProperty(VARIANT, EnumRocksD.values()[i]);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getState(meta);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(VARIANT).ordinal();
	}

	@Override
	public BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
		ItemStack heldItem = player.getHeldItemMainhand();
		if(holdingSlabLo(heldItem, ModBlocks.HALF_BLOCKS_D_LO) && isDoublingSlab(world, pos, heldItem, side, ModBlocks.HALF_BLOCKS_D_LO, ModBlocks.HALF_BLOCKS_D_HI)){
			world.setBlockState(pos, ModBlocks.BLOCKS_D.getStateFromMeta(heldItem.getItemDamage()));
			world.playSound(player, pos, SoundEvents.BLOCK_STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if(!player.capabilities.isCreativeMode){
            	heldItem.shrink(1);
    			if(heldItem.getCount() <= 0){heldItem = ItemStack.EMPTY;}
            }
			return true;
		}
		return false;
    }

	@Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player){
        return new ItemStack(ModBlocks.HALF_BLOCKS_D_LO, 1, this.damageDropped(state));
	}

    @Nullable
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return Item.getItemFromBlock(ModBlocks.HALF_BLOCKS_D_LO);
    }

}