package com.globbypotato.rockhounding_rocks.compat.waila;

import java.util.List;

import com.globbypotato.rockhounding_rocks.machines.Machines;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TESculptingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEStoneRammerAnimated;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class WailaMachines implements IWailaDataProvider{

	@Override
	public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) {
		return new ItemStack(accessor.getBlock(), 1, accessor.getMetadata());
	}

	@Override
	public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
		return currenttip;
	}

	@Override
	public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
		BlockPos pos = accessor.getPosition();
		World world = accessor.getWorld();
		TileEntity te = world.getTileEntity(pos);
		if(te != null){
			if(te instanceof TECuttingStation){
				TECuttingStation tank = (TECuttingStation)te;
				currenttip.add(TextFormatting.GRAY + "Water: " + TextFormatting.DARK_AQUA + tank.inputTank.getFluidAmount() + " / " + tank.inputTank.getCapacity() + " mB");
			}
			if(te instanceof TEStoneRammerAnimated){
				TEStoneRammerAnimated tank = (TEStoneRammerAnimated)te;
				if(tank.getCooktime() > 0){
					int adv = (tank.getCooktime() * 100) / tank.getCooktimeMax();
					String perc = adv + "%";
					currenttip.add(TextFormatting.GRAY + "Progress: " + TextFormatting.DARK_AQUA + perc);
				}
			}
			if(te instanceof TECarvingBenchAnimated){
				TECarvingBenchAnimated tank = (TECarvingBenchAnimated)te;
				if(tank.getCooktime() > 0){
					int adv = (tank.getCooktime() * 100) / tank.getCooktimeMax();
					String perc = adv + "%";
					currenttip.add(TextFormatting.GRAY + "Progress: " + TextFormatting.DARK_AQUA + perc);
				}
			}
			if(te instanceof TESculptingBenchAnimated){
				TESculptingBenchAnimated tank = (TESculptingBenchAnimated)te;
				if(tank.getCooktime() > 0){
					int adv = (tank.getCooktime() * 100) / tank.getCooktimeMax();
					String perc = adv + "%";
					currenttip.add(TextFormatting.GRAY + "Progress: " + TextFormatting.DARK_AQUA + perc);
				}
			}

		}
		return currenttip;
	}

	@Override
	public List<String> getWailaTail(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
		return currenttip;
	}

	@Override
	public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity te, NBTTagCompound tag, World world, BlockPos pos) {
		return tag;
	}

	public static void callbackRegister(IWailaRegistrar registrar) {
		registrar.registerBodyProvider(new WailaMachines(), Machines.class);
	}

}