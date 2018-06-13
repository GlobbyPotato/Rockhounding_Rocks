package com.globbypotato.rockhounding_rocks.machines.container;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockVendor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class CORockVendor extends ContainerBase<TERockVendor> {
	public CORockVendor(IInventory playerInventory, TERockVendor tile){
		super(playerInventory,tile);
	}

	@Override
	protected void addOwnSlots() {
		IItemHandler input = this.tile.getInput();
		IItemHandler output = this.tile.getOutput();
		IItemHandler template = this.tile.getTemplate();

		this.addSlotToContainer(new SlotItemHandler(input, 0, 90, 28));//input
		this.addSlotToContainer(new SlotItemHandler(input, 1, 149, 80));//inscriber
		this.addSlotToContainer(new SlotItemHandler(output, 0, 149, 28));//output

		this.addSlotToContainer(new SlotItemHandler(template, 0, 10,  28));//prev color
		this.addSlotToContainer(new SlotItemHandler(template, 1, 48,  28));//next color 
		this.addSlotToContainer(new SlotItemHandler(template, 2, 10,  54));//prev name
		this.addSlotToContainer(new SlotItemHandler(template, 3, 130,  54));//next name
		this.addSlotToContainer(new SlotItemHandler(template, 4, 130,  28));//buy
		this.addSlotToContainer(new SlotItemHandler(template, 5, 149,  54));//preview
		this.addSlotToContainer(new SlotItemHandler(template, 6, 130,  80));//inscribe

	}

	@Override
	public ItemStack slotClick(int slot, int dragType, ClickType clickTypeIn, EntityPlayer player){
		if(slot == 3){//prev color
			if(this.tile.colorScan >= 0){
	    		this.tile.colorScan--; 
	    		this.tile.reloadRocks = true;
			}
			doClickSound(player, this.tile.getWorld(), this.tile.getPos());
    		return ItemStack.EMPTY;
		}else if(slot == 4){//next color
    		if(this.tile.colorScan < 15){
	    		this.tile.colorScan++; 
	    		this.tile.reloadRocks = true;
			}
			doClickSound(player, this.tile.getWorld(), this.tile.getPos());
    		return ItemStack.EMPTY;
		}else if(slot == 5){//prev name
			if(this.tile.rockScan >= 0){
	    		this.tile.rockScan--; 
			}
			doClickSound(player, this.tile.getWorld(), this.tile.getPos());
    		return ItemStack.EMPTY;
    	}else if(slot == 6){//next name
    		if(this.tile.isValidColor() && this.tile.listMaxRocks()){
    			this.tile.rockScan++; 
    		}
			doClickSound(player, this.tile.getWorld(), this.tile.getPos());
    		return ItemStack.EMPTY;
    	}else if(slot == 7){//buy
    		if(this.tile.canBuyRocks()){
    			this.tile.allowBuy = true;
    		}
			doClickSound(player, this.tile.getWorld(), this.tile.getPos());
    		return ItemStack.EMPTY;
    	}else if(slot == 8){//preview
    		return ItemStack.EMPTY;
    	}else if(slot == 9){//inscribe
    		if(this.tile.canInscribe()){
    			this.tile.allowInscribe = true;
    		}
			doClickSound(player, this.tile.getWorld(), this.tile.getPos());
    		return ItemStack.EMPTY;
    	}else{
    		return super.slotClick(slot, dragType, clickTypeIn, player);
    	}
	}

	@Override
	public boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection){
		if(super.mergeItemStack(stack, startIndex, 3, reverseDirection)){
			return true;
		}
		return super.mergeItemStack(stack, 10, endIndex, reverseDirection);
    }
}