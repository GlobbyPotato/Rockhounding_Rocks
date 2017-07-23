package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.machines.container.ContainerCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.container.ContainerRockVendor;
import com.globbypotato.rockhounding_rocks.machines.gui.GuiCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.gui.GuiRockVendor;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TileEntityRockVendor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int rockVendorID = 0;
	public static final int cuttingStationID = 1;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x,y,z));
		switch(ID) {
			default: return null;
			case rockVendorID:
				if (entity != null && entity instanceof TileEntityRockVendor){return new ContainerRockVendor(player.inventory, (TileEntityRockVendor) entity);}
			case cuttingStationID:
				if (entity != null && entity instanceof TileEntityCuttingStation){return new ContainerCuttingStation(player.inventory, (TileEntityCuttingStation) entity);}
		}
        return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x,y,z));
		switch(ID) {
			default: return null;
			case rockVendorID:
				if (entity != null && entity instanceof TileEntityRockVendor) {return new GuiRockVendor(player.inventory, (TileEntityRockVendor) entity);}
			case cuttingStationID:
				if (entity != null && entity instanceof TileEntityCuttingStation) {return new GuiCuttingStation(player.inventory, (TileEntityCuttingStation) entity);}
		}
        return null;
	}

}