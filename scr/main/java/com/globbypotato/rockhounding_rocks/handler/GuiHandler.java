package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.machines.container.COCarvingRack;
import com.globbypotato.rockhounding_rocks.machines.container.COCuttingStation;
import com.globbypotato.rockhounding_rocks.machines.container.CORockVendor;
import com.globbypotato.rockhounding_rocks.machines.gui.UICarvingRack;
import com.globbypotato.rockhounding_rocks.machines.gui.UICuttingStation;
import com.globbypotato.rockhounding_rocks.machines.gui.UIRockVendor;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingRack;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TERockVendor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int rock_vendor_id = 0;
	public static final int cutting_station_id = 1;
	public static final int carving_bench_id = 2;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x,y,z));
		switch(ID) {
			default: return null;
			case rock_vendor_id:
				if (entity != null && entity instanceof TERockVendor){return new CORockVendor(player.inventory, (TERockVendor) entity);}
				break;
			case cutting_station_id:
				if (entity != null && entity instanceof TECuttingStation){return new COCuttingStation(player.inventory, (TECuttingStation) entity);}
				break;
			case carving_bench_id:
				if (entity != null && entity instanceof TECarvingRack){return new COCarvingRack(player.inventory, (TECarvingRack) entity);}
				break;
		}
        return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x,y,z));
		switch(ID) {
			default: return null;
			case rock_vendor_id:
				if (entity != null && entity instanceof TERockVendor){return new UIRockVendor(player.inventory, (TERockVendor) entity);}
				break;
			case cutting_station_id:
				if (entity != null && entity instanceof TECuttingStation){return new UICuttingStation(player.inventory, (TECuttingStation) entity);}
				break;
			case carving_bench_id:
				if (entity != null && entity instanceof TECarvingRack){return new UICarvingRack(player.inventory, (TECarvingRack) entity);}
				break;
		}
        return null;
	}

}