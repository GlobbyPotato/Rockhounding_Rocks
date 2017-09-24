package com.globbypotato.rockhounding_rocks.machines.container;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerCuttingStation extends ContainerBase<TileEntityCuttingStation> {
	public ContainerCuttingStation(IInventory playerInventory, TileEntityCuttingStation tile){
		super(playerInventory,tile);
	}

	@Override
	protected void addOwnSlots() {
		IItemHandler input = tile.getInput();
		IItemHandler output = tile.getOutput();
		IItemHandler template = tile.getTemplate();

		this.addSlotToContainer(new SlotItemHandler(input, 0, 89, 29));//input
		this.addSlotToContainer(new SlotItemHandler(input, 1, 8, 8));//fuel
		this.addSlotToContainer(new SlotItemHandler(input, 2, 63, 48));//consumable
		this.addSlotToContainer(new SlotItemHandler(input, 3, 150, 17));//bucket
		this.addSlotToContainer(new SlotItemHandler(output, 0, 89, 67));//output

		this.addSlotToContainer(new SlotItemHandler(template,  0, 8,  92));
		this.addSlotToContainer(new SlotItemHandler(template,  1, 8,  110));
		this.addSlotToContainer(new SlotItemHandler(template,  2, 26, 110));
		this.addSlotToContainer(new SlotItemHandler(template,  3, 44, 110));
		this.addSlotToContainer(new SlotItemHandler(template,  4, 62, 110));
		this.addSlotToContainer(new SlotItemHandler(template,  5, 80, 110));
		this.addSlotToContainer(new SlotItemHandler(template,  6, 98, 110));
		this.addSlotToContainer(new SlotItemHandler(template,  7, 116,110));
		this.addSlotToContainer(new SlotItemHandler(template,  8, 134,110));
		this.addSlotToContainer(new SlotItemHandler(template,  9, 152,110));
		this.addSlotToContainer(new SlotItemHandler(template, 10, 8,  128));
		this.addSlotToContainer(new SlotItemHandler(template, 11, 26, 128));
		this.addSlotToContainer(new SlotItemHandler(template, 12, 44, 128));
		this.addSlotToContainer(new SlotItemHandler(template, 13, 62, 128));
		this.addSlotToContainer(new SlotItemHandler(template, 14, 80, 128));
		this.addSlotToContainer(new SlotItemHandler(template, 15, 98, 128));
		this.addSlotToContainer(new SlotItemHandler(template, 16, 116,128));
		this.addSlotToContainer(new SlotItemHandler(template, 17, 134,128));
		this.addSlotToContainer(new SlotItemHandler(template, 18, 152,128));

	}

	@Override
	public ItemStack slotClick(int slot, int dragType, ClickType clickTypeIn, EntityPlayer player){
		if(slot >= 5 && slot <= 23){ //23 is the total
			this.tile.cutSelector = slot - 5;
			doClickSound(player, tile.getWorld(), tile.getPos());
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