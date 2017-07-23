package com.globbypotato.rockhounding_rocks.blocks;

import com.globbypotato.rockhounding_rocks.handler.ModConfig;

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
import net.minecraft.world.World;

public class BaseFountains extends BaseRocks {

	protected BaseFountains(String[] array, String name, boolean isTranslucent) {
		super(array, name, isTranslucent);
	}

    @Override
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
    	if(!worldIn.isRemote){
    		if(heldItem != null){
	            Item item = heldItem.getItem();
	    		if(item != null && ModConfig.CAN_USE_FOUNTAINS && side == EnumFacing.UP){
		            if(item == Items.WATER_BUCKET){
		                if(!playerIn.capabilities.isCreativeMode){
		                    playerIn.setHeldItem(hand, new ItemStack(Items.BUCKET));
		                }
		                return true;
		            }else if (item == Items.BUCKET){
		                if (!playerIn.capabilities.isCreativeMode){
		                    --heldItem.stackSize;
		                    if (heldItem.stackSize == 0){
		                        playerIn.setHeldItem(hand, new ItemStack(Items.WATER_BUCKET));
		                    }else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET))){
		                        playerIn.dropItem(new ItemStack(Items.WATER_BUCKET), false);
		                    }
		                }
		            	return true;
		            }else if (item == Items.GLASS_BOTTLE){
		                if (!playerIn.capabilities.isCreativeMode){
		                    ItemStack itemstack1 = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER);
		                    if (--heldItem.stackSize == 0){
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
		                        itemstack.stackSize = 1;
		                        TileEntityBanner.removeBannerData(itemstack);
		                        playerIn.addStat(StatList.BANNER_CLEANED);
		                        if (!playerIn.capabilities.isCreativeMode){
		                            --heldItem.stackSize;
		                        }
		                        if (heldItem.stackSize == 0){
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
}