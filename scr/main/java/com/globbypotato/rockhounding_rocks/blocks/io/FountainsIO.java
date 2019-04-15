package com.globbypotato.rockhounding_rocks.blocks.io;

import com.globbypotato.rockhounding_rocks.handler.ModConfig;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBanner;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FountainsIO extends MetaIO implements ISculpture{
	public FountainsIO(String name, Material material, String[] array, float hardness, float resistance, SoundType stepSound) {
		super(name, material, array, hardness, resistance, stepSound);
	}

    @Override
    public boolean isFullCube(IBlockState state){
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
    	if(!worldIn.isRemote){
    		ItemStack heldItem = playerIn.getHeldItemMainhand();
    		if(!heldItem.isEmpty()){
	            Item item = heldItem.getItem();
	    		if(item != null && ModConfig.CAN_USE_FOUNTAINS && side == EnumFacing.UP){
		            if(item == Items.WATER_BUCKET){
		                if(!playerIn.capabilities.isCreativeMode){
		                    playerIn.setHeldItem(hand, new ItemStack(Items.BUCKET));
		                }
		                return true;
		            }else if (item == Items.BUCKET){
		                if (!playerIn.capabilities.isCreativeMode){
		                    heldItem.shrink(1);
		                    if (heldItem.getCount() == 0){
		                        playerIn.setHeldItem(hand, new ItemStack(Items.WATER_BUCKET));
		                    }else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET))){
		                        playerIn.dropItem(new ItemStack(Items.WATER_BUCKET), false);
		                    }
		                }
		            	return true;
		            }else if (item == Items.GLASS_BOTTLE){
		                if (!playerIn.capabilities.isCreativeMode){
		                    ItemStack itemstack1 = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER);
		                    if (heldItem.getCount() - 1 == 0){
		                        playerIn.setHeldItem(hand, itemstack1);
		                    }else if (!playerIn.inventory.addItemStackToInventory(itemstack1)){
		                        playerIn.dropItem(itemstack1, false);
		                    }else if (playerIn instanceof EntityPlayerMP){
		                        ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
		                    }
		                }
		                return true;
		            }else{
		                if (item instanceof ItemArmor){
		                    ItemArmor itemarmor = (ItemArmor)item;
		                    if (itemarmor.getArmorMaterial() == ItemArmor.ArmorMaterial.LEATHER && itemarmor.hasColor(heldItem)){
		                        itemarmor.removeColor(heldItem);
		                        playerIn.addStat(StatList.ARMOR_CLEANED);
		                        return true;
		                    }
		                }
		                if (item instanceof ItemBanner){
		                    if (TileEntityBanner.getPatterns(heldItem) > 0 && !worldIn.isRemote){
		                        ItemStack itemstack = heldItem.copy();
		                        itemstack.setCount(1);
		                        TileEntityBanner.removeBannerData(itemstack);
		                        playerIn.addStat(StatList.BANNER_CLEANED);
		                        if (!playerIn.capabilities.isCreativeMode){
		                            heldItem.shrink(1);
		                        }
		                        if (heldItem.getCount() == 0){
		                            playerIn.setHeldItem(hand, itemstack);
		                        }else if (!playerIn.inventory.addItemStackToInventory(itemstack)){
		                            playerIn.dropItem(itemstack, false);
		                        }else if (playerIn instanceof EntityPlayerMP){
		                            ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
		                        }
		                    }
		                    return true;
		                }
		            }
	    		}
	    	}
    	}
    	return true;
    }

	@Override
    public boolean isTopSolid(IBlockState state){
        return false;
    }

	@Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face){
        return BlockFaceShape.UNDEFINED;
    }

}