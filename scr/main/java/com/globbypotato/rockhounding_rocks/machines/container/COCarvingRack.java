package com.globbypotato.rockhounding_rocks.machines.container;

import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingRack;

import net.minecraft.inventory.IInventory;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class COCarvingRack extends ContainerBase<TECarvingRack> {
	public COCarvingRack(IInventory playerInventory, TECarvingRack tile){
		super(playerInventory,tile);
	}

	@Override
	protected void addOwnSlots() {
		IItemHandler input = this.tile.getInput();

		this.addSlotToContainer(new SlotItemHandler(input, 0, 44, 60));//pattern
		this.addSlotToContainer(new SlotItemHandler(input, 1, 116, 60));//tool

	}

}