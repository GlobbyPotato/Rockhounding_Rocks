package com.globbypotato.rockhounding_rocks.machines.container;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerCuttingStation extends ContainerBase<TileEntityCuttingStation> {
	Slot cut00;
	Slot cut01;
	Slot cut02;
	Slot cut03;
	Slot cut04;
	Slot cut05;
	Slot cut06;
	Slot cut07;
	Slot cut08;
	Slot cut09;
	Slot cut10;
	Slot cut11;
	Slot cut12;
	Slot cut13;
	Slot cut14;
	Slot cut15;
	Slot cut16;
	Slot cut17;
	Slot cut18;

	public ContainerCuttingStation(IInventory playerInventory, TileEntityCuttingStation tile){
		super(playerInventory,tile);
	}

	@Override
	protected void addOwnSlots() {
		IItemHandler input = tile.getInput();
		IItemHandler output = tile.getOutput();
		IItemHandler template = tile.getTemplate();

		this.addSlotToContainer(new SlotItemHandler(input, 0, 89, 29));//input
		this.addSlotToContainer(new SlotItemHandler(input, 1, 8, 17));//fuel
		this.addSlotToContainer(new SlotItemHandler(input, 2, 63, 48));//consumable
		this.addSlotToContainer(new SlotItemHandler(input, 3, 150, 17));//bucket
		this.addSlotToContainer(new SlotItemHandler(output, 0, 89, 67));//output

		cut00 = this.addSlotToContainer(new SlotItemHandler(template,  0, 8,  92));
		cut01 = this.addSlotToContainer(new SlotItemHandler(template,  1, 8,  110));
		cut02 = this.addSlotToContainer(new SlotItemHandler(template,  2, 26, 110));
		cut03 = this.addSlotToContainer(new SlotItemHandler(template,  3, 44, 110));
		cut04 = this.addSlotToContainer(new SlotItemHandler(template,  4, 62, 110));
		cut05 = this.addSlotToContainer(new SlotItemHandler(template,  5, 80, 110));
		cut06 = this.addSlotToContainer(new SlotItemHandler(template,  6, 98, 110));
		cut07 = this.addSlotToContainer(new SlotItemHandler(template,  7, 116,110));
		cut08 = this.addSlotToContainer(new SlotItemHandler(template,  8, 134,110));
		cut09 = this.addSlotToContainer(new SlotItemHandler(template,  9, 152,110));
		cut10 = this.addSlotToContainer(new SlotItemHandler(template, 10, 8,  128));
		cut11 = this.addSlotToContainer(new SlotItemHandler(template, 11, 26, 128));
		cut12 = this.addSlotToContainer(new SlotItemHandler(template, 12, 44, 128));
		cut13 = this.addSlotToContainer(new SlotItemHandler(template, 13, 62, 128));
		cut14 = this.addSlotToContainer(new SlotItemHandler(template, 14, 80, 128));
		cut15 = this.addSlotToContainer(new SlotItemHandler(template, 15, 98, 128));
		cut16 = this.addSlotToContainer(new SlotItemHandler(template, 16, 116,128));
		cut17 = this.addSlotToContainer(new SlotItemHandler(template, 17, 134,128));
		cut18 = this.addSlotToContainer(new SlotItemHandler(template, 18, 152,128));

	}

	@Override
	public ItemStack slotClick(int slot, int dragType, ClickType clickTypeIn, EntityPlayer player){
		if(slot >= 5 && slot <= 21){ //23 is the total
			this.tile.cutSelector = slot - 5;
    		return null;
		}else if(slot >= 22 && slot <= 23){ //to be removed when total is done
    		return null;
    	}else{
    		return super.slotClick(slot, dragType, clickTypeIn, player);
    	}
	}

	@Override
	public boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection){
		if(super.mergeItemStack(stack, startIndex, 5, reverseDirection)){
			return true;
		}else{
			return super.mergeItemStack(stack, 24, endIndex, reverseDirection);
		}
    }
}