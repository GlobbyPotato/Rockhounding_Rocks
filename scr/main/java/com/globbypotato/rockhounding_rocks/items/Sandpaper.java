package com.globbypotato.rockhounding_rocks.items;

import com.globbypotato.rockhounding_rocks.enums.EnumCuts;
import com.globbypotato.rockhounding_rocks.items.io.ConsumableIO;
import com.globbypotato.rockhounding_rocks.machines.recipes.CuttingStationRecipes;
import com.globbypotato.rockhounding_rocks.machines.recipes.io.CuttingStationRecipe;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Sandpaper extends ConsumableIO {

	public Sandpaper(String name, int uses) {
		super(name, uses);
	}

    @Override
	public int getItemEnchantability(){
    	return 30;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
    	return enchantment.type == EnumEnchantmentType.DIGGER;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack heldItem = player.getHeldItemMainhand();
		if(heldItem.getItemDamage() <= heldItem.getMaxDamage()){
			IBlockState state = worldIn.getBlockState(pos);
			Block block = state.getBlock();
			ItemStack decoblock = new ItemStack(block, 1, block.getMetaFromState(state));
	    	for(CuttingStationRecipe recipe: CuttingStationRecipes.cutting_station_recipes){
				if(!recipe.getOutput().isEmpty() && recipe.getOutput().isItemEqual(decoblock)){
					if(isValidCut(recipe.getLogic())){
				    	if(!worldIn.isRemote){
							if(rand.nextInt(8) == 0){
								Block plain = Block.getBlockFromItem(recipe.getInput().getItem());
								int plainmeta = recipe.getInput().getItemDamage();
								IBlockState plainstate = plain.getStateFromMeta(plainmeta);
								worldIn.setBlockState(pos, plainstate, 2);
								if(!player.capabilities.isCreativeMode){
									heldItem.damageItem(1, player);
								}
							}
				    	}
						worldIn.playSound(player, pos, SoundEvents.BLOCK_SAND_HIT, SoundCategory.AMBIENT, 0.3F, 1.0F);
					}
				}
			}
    	}
    	return EnumActionResult.SUCCESS;
    }

	public boolean isValidCut(int cut) {
		return cut == EnumCuts.POLISHED.ordinal()
			|| cut == EnumCuts.SLAB.ordinal()
			|| cut == EnumCuts.BRICKS.ordinal()
			|| cut == EnumCuts.SHORT.ordinal()
			|| cut == EnumCuts.DEBOSSED.ordinal()
			|| cut == EnumCuts.FLOOR.ordinal()
			|| cut == EnumCuts.PAVES.ordinal()
			|| cut == EnumCuts.TILE.ordinal()
			|| cut == EnumCuts.CARVED.ordinal();
	}

}