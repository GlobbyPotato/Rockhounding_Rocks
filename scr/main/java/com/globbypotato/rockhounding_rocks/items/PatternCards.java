package com.globbypotato.rockhounding_rocks.items;

import com.globbypotato.rockhounding_rocks.enums.EnumCards;
import com.globbypotato.rockhounding_rocks.items.io.ArrayIO;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class PatternCards extends ArrayIO{

	public PatternCards(String name, String[] array) {
		super(name, array);
		setMaxStackSize(1);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack helditem = playerIn.getHeldItemMainhand();
		if(helditem != ItemStack.EMPTY){
			if(!playerIn.isSneaking()){
				if(helditem.getItemDamage() < EnumCards.size() - 1){
					helditem.setItemDamage(helditem.getItemDamage() + 1);
				}else{
					helditem.setItemDamage(0);
				}
			}else{
				if(helditem.getItemDamage() > 0){
					helditem.setItemDamage(helditem.getItemDamage() - 1);
				}else{
					helditem.setItemDamage(EnumCards.size() - 1);
				}
			}
		}
		return new ActionResult(EnumActionResult.PASS, helditem);
	}
}