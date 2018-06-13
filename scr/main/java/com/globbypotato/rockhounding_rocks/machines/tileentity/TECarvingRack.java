package com.globbypotato.rockhounding_rocks.machines.tileentity;

import com.globbypotato.rockhounding_core.machines.tileentity.MachineStackHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.TileEntityInv;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler;
import com.globbypotato.rockhounding_core.machines.tileentity.WrappedItemHandler.WriteMode;
import com.globbypotato.rockhounding_rocks.items.PatternCards;
import com.globbypotato.rockhounding_rocks.items.SculptingCards;
import com.globbypotato.rockhounding_rocks.utils.ToolUtils;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class TECarvingRack extends TileEntityInv {

	public static int inputSlots = 2;

	public static int PATTERN_SLOT = 0;
	public static int TOOL_SLOT = 1;

	public TECarvingRack() {
		super(inputSlots, 0, 0);
		
		this.input =  new MachineStackHandler(inputSlots, this){
			@SuppressWarnings("synthetic-access")
			@Override
			public ItemStack insertItem(int slot, ItemStack insertingStack, boolean simulate){
				if(slot == PATTERN_SLOT && !insertingStack.isEmpty() && isValidPattern(insertingStack)){
					return super.insertItem(slot, insertingStack, simulate);
				}
				if(slot == TOOL_SLOT && !insertingStack.isEmpty() && insertingStack.isItemEqualIgnoreDurability(ToolUtils.dummy)){
					return super.insertItem(slot, insertingStack, simulate);
				}
				return insertingStack;
			}
		};
		this.automationInput = new WrappedItemHandler(this.input, WriteMode.IN);
	}



	// ----------------------- SLOTS -----------------------
	public ItemStack patternSlot(){
		return this.input.getStackInSlot(PATTERN_SLOT);
	}

	public ItemStack toolSlot(){
		return this.input.getStackInSlot(TOOL_SLOT);
	}



	//----------------------- HANDLER -----------------------
	public static String getName(){
		return "carving_rack";
	}

	@Override
	public int getGUIHeight() {
		return 200;
	}

	public boolean isValidPattern(ItemStack insertingStack) {
		return (isCarvingBench() && insertingStack.getItem() instanceof PatternCards)
			|| (isSculptingBench() && insertingStack.getItem() instanceof SculptingCards);
	}

	private boolean isCarvingBench() {
		BlockPos benchPos = pos.down();
		TileEntity tile = world.getTileEntity(benchPos);
		if(tile != null && (tile instanceof TECarvingBench || tile instanceof TECarvingBenchAnimated)){
			TileEntityInv bench = (TileEntityInv)tile;
			if(bench.getFacing() == getFacing()){
				return true;
			}
		}
		return false;
	}

	private boolean isSculptingBench() {
		BlockPos benchPos = pos.down();
		TileEntity tile = world.getTileEntity(benchPos);
		if(tile != null && (tile instanceof TESculptingBench || tile instanceof TESculptingBenchAnimated)){
			TileEntityInv bench = (TileEntityInv)tile;
			if(bench.getFacing() == getFacing()){
				return true;
			}
		}
		return false;
	}



	//----------------------- PROCESS -----------------------
	@Override
	public void update() {
		if(!world.isRemote){
			if(!world.isRemote){
				if(!patternSlot().isEmpty() || !toolSlot().isEmpty()){
					this.markDirtyClient();
				}
			}
		}
	}

}