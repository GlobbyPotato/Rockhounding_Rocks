package com.globbypotato.rockhounding_rocks.machines.container;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class COCuttingStation extends ContainerBase<TECuttingStation> {
	public COCuttingStation(IInventory playerInventory, TECuttingStation tile){
		super(playerInventory,tile);
	}

	@Override
	protected void addOwnSlots() {
		IItemHandler input = this.tile.getInput();
		IItemHandler output = this.tile.getOutput();
		IItemHandler template = this.tile.getTemplate();

		this.addSlotToContainer(new SlotItemHandler(input, 0, 51, 47));//input
		this.addSlotToContainer(new SlotItemHandler(input, 1, 8, 26));//fuel
		this.addSlotToContainer(new SlotItemHandler(input, 2, 80, 70));//consumable
		this.addSlotToContainer(new SlotItemHandler(input, 3, 152, 26));//bucket
		this.addSlotToContainer(new SlotItemHandler(output, 0, 109, 48));//output

		this.addSlotToContainer(new SlotItemHandler(template,  0, 8,  92));
		this.addSlotToContainer(new SlotItemHandler(template,  1, 26,  92));
		this.addSlotToContainer(new SlotItemHandler(template,  2, 44, 92));
		this.addSlotToContainer(new SlotItemHandler(template,  3, 62, 92));
		this.addSlotToContainer(new SlotItemHandler(template,  4, 80, 92));
		this.addSlotToContainer(new SlotItemHandler(template,  5, 98, 92));
		this.addSlotToContainer(new SlotItemHandler(template,  6, 116, 92));
		this.addSlotToContainer(new SlotItemHandler(template,  7, 134,92));
		this.addSlotToContainer(new SlotItemHandler(template,  8, 151,92));
		this.addSlotToContainer(new SlotItemHandler(template,  9, 8,110));
		this.addSlotToContainer(new SlotItemHandler(template, 10, 26,  110));
		this.addSlotToContainer(new SlotItemHandler(template, 11, 44, 110));
		this.addSlotToContainer(new SlotItemHandler(template, 12, 62, 110));
		this.addSlotToContainer(new SlotItemHandler(template, 13, 80, 110));
		this.addSlotToContainer(new SlotItemHandler(template, 14, 98, 110));
		this.addSlotToContainer(new SlotItemHandler(template, 15, 116, 110));
		this.addSlotToContainer(new SlotItemHandler(template, 16, 134,110));
		this.addSlotToContainer(new SlotItemHandler(template, 17, 151,110));
		this.addSlotToContainer(new SlotItemHandler(template, 18, 8, 128));
		this.addSlotToContainer(new SlotItemHandler(template, 19, 26,128));
		this.addSlotToContainer(new SlotItemHandler(template, 20, 44,128));
		this.addSlotToContainer(new SlotItemHandler(template, 21, 62,128));

	}

	@Override
	public ItemStack slotClick(int slot, int dragType, ClickType clickTypeIn, EntityPlayer player){
		if(slot == 0){
			this.tile.currentRecipe = null;
			return super.slotClick(slot, dragType, clickTypeIn, player);
		}
		else if(slot >= 5 && slot <= 26){ //26 is the total
			this.tile.cutSelector = slot - 5;
			this.tile.currentRecipe = null;
			doClickSound(player, this.tile.getWorld(), this.tile.getPos());
    		return ItemStack.EMPTY;
    	}
		return super.slotClick(slot, dragType, clickTypeIn, player);
	}

	@Override
	public boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection){
		if(super.mergeItemStack(stack, startIndex, 5, reverseDirection)){
			return true;
		}
		return super.mergeItemStack(stack, 27, endIndex, reverseDirection);
    }
}