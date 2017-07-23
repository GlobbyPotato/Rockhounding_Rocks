package com.globbypotato.rockhounding_rocks.machines.container;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityRockVendor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerRockVendor extends ContainerBase<TileEntityRockVendor> {
	Slot cPrev;
	Slot cNext;
	Slot nPrev;
	Slot nNext;
	Slot view;
	Slot buy;

	public ContainerRockVendor(IInventory playerInventory, TileEntityRockVendor tile){
		super(playerInventory,tile);
	}

	@Override
	protected void addOwnSlots() {
		IItemHandler input = tile.getInput();
		IItemHandler output = tile.getOutput();
		IItemHandler template = tile.getTemplate();

		this.addSlotToContainer(new SlotItemHandler(input, 0, 90, 18));//input
		this.addSlotToContainer(new SlotItemHandler(input, 1, 149, 70));//inscriber
		this.addSlotToContainer(new SlotItemHandler(output, 0, 149, 18));//output

		cPrev = this.addSlotToContainer(new SlotItemHandler(template, 0, 10,  18));//prev color
		cNext = this.addSlotToContainer(new SlotItemHandler(template, 1, 48,  18));//next color 
		nPrev = this.addSlotToContainer(new SlotItemHandler(template, 2, 10,  44));//prev name
		nNext = this.addSlotToContainer(new SlotItemHandler(template, 3, 126,  44));//next name
		buy = this.addSlotToContainer(new SlotItemHandler(template, 4, 130,  18));//buy
		view = this.addSlotToContainer(new SlotItemHandler(template, 5, 149,  44));//preview

	}

	@Override
	public ItemStack slotClick(int slot, int dragType, ClickType clickTypeIn, EntityPlayer player){
		if(slot == 3){//prev color
			if(this.tile.colorScan >= 0){
	    		this.tile.colorScan--; 
	    		this.tile.reloadRocks = true;
			}
    		return null;
		}else if(slot == 4){//next color
    		if(this.tile.colorScan < 15){
	    		this.tile.colorScan++; 
	    		this.tile.reloadRocks = true;
			}
    		return null;
		}else if(slot == 5){//prev name
			if(this.tile.rockScan >= 0){
	    		this.tile.rockScan--; 
			}
    		return null;
    	}else if(slot == 6){//next name
    		if(this.tile.isValidColor() && this.tile.listMaxRocks()){
    			this.tile.rockScan++; 
    		}
    		return null;
    	}else if(slot == 7){//buy
    		if(this.tile.canBuyRocks()){
    			this.tile.allowBuy = true;
    		}
    		return null;
    	}else if(slot == 8){//preview
    		return null;
    	}else{
    		return super.slotClick(slot, dragType, clickTypeIn, player);
    	}
	}

	@Override
	public boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection){
		if(super.mergeItemStack(stack, startIndex, 3, reverseDirection)){
			return true;
		}else{
			return super.mergeItemStack(stack, 9, endIndex, reverseDirection);
		}
    }
}