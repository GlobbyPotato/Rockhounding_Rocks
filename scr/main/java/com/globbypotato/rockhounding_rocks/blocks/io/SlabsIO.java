package com.globbypotato.rockhounding_rocks.blocks.io;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlabsIO extends MetaIO {
    public static final AxisAlignedBB LO_SLAB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
    public static final AxisAlignedBB HI_SLAB = new AxisAlignedBB(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);
    public boolean tab;

	public SlabsIO(String name, Material material, String[] array, float hardness, float resistance, boolean tab) {
		super(name, material, array, hardness, resistance, SoundType.STONE);
		this.tab = tab;
		this.array = array;
	}

	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return this.tab ? LO_SLAB : HI_SLAB;
    }

    @Nullable
	@Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess worldIn, BlockPos pos){
        return this.tab ? LO_SLAB : HI_SLAB;
    }

	@Override
    public boolean isTopSolid(IBlockState state){
        return !this.tab;
    }

	@Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face){
		if((face == EnumFacing.DOWN && this.tab) || (face == EnumFacing.UP && !this.tab)){
            return BlockFaceShape.SOLID;
        }
        return BlockFaceShape.UNDEFINED;
    }

    @SideOnly(Side.CLIENT)
	@Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items){
        if (this.tab){
        	for(int x = 0; x < this.array.length; x++){
        		items.add(new ItemStack(this, 1, x));
        	}
        }
    }

	@Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }

	@Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	public static boolean isDoublingSlab(World world, BlockPos pos, ItemStack heldItem, EnumFacing side, Block blockLo, Block blockHi) {
		IBlockState state = world.getBlockState(pos);
		return (state.getBlock() == blockLo && state.getBlock().getMetaFromState(state) == heldItem.getItemDamage() && side == EnumFacing.UP) ||
 			   (state.getBlock() == blockHi && state.getBlock().getMetaFromState(state) == heldItem.getItemDamage() && side == EnumFacing.DOWN);
	}

	public static boolean holdingSlabLo(ItemStack heldItem, Block blockLo){
		return !heldItem.isEmpty() && heldItem.getItem() == Item.getItemFromBlock(blockLo);
	}

}