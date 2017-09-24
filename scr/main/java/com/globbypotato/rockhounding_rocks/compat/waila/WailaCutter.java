package com.globbypotato.rockhounding_rocks.compat.waila;

import java.util.List;

import com.globbypotato.rockhounding_rocks.machines.CuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;

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

public class WailaCutter implements IWailaDataProvider{

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
			if(te instanceof TileEntityCuttingStation){
				TileEntityCuttingStation tank = (TileEntityCuttingStation)te;
				if(tank.inputTank.getFluid() != null){
					currenttip.add(TextFormatting.GRAY + "Content: " + TextFormatting.AQUA + tank.inputTank.getFluid().getLocalizedName());
				}
				currenttip.add(TextFormatting.GRAY + "Storage: " + TextFormatting.DARK_AQUA + tank.inputTank.getFluidAmount() + " / " + tank.inputTank.getCapacity() + " mB");
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
		registrar.registerBodyProvider(new WailaCutter(), CuttingStation.class);
	}

}