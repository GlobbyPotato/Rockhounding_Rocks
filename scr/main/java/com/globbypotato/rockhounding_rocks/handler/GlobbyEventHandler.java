package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.ModItems;
import com.globbypotato.rockhounding_rocks.machines.io.MachineIO;
import com.globbypotato.rockhounding_rocks.utils.ModUtils;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GlobbyEventHandler {
	@SubscribeEvent
	public void onInteract(RightClickBlock event){
		if(Loader.isModLoaded(ModUtils.thermal_f_id)){
        	if(event.getWorld().getBlockState(event.getPos()) != null && event.getWorld().getBlockState(event.getPos()).getBlock() instanceof MachineIO){
	            if (!event.getItemStack().isEmpty() && !ModUtils.thermal_f_wrench().isEmpty() && event.getItemStack().isItemEqual(ModUtils.thermal_f_wrench())){
	            	event.setCanceled(true);
	            }
        	}
		}
	}



	@SubscribeEvent
    @SideOnly(Side.CLIENT)
	public void handleTooltip(ItemTooltipEvent event){
		ItemStack itemstack = event.getItemStack();
		if(itemstack != ItemStack.EMPTY){
			if(itemstack.getItem() == ModItems.PATTERN_CARDS || itemstack.getItem() == ModItems.SCULPTING_CARDS){
				event.getToolTip().add("Right-Click to scroll patterns onward, Shift-Right-Click to scroll backward");
			}
		}
	}
}