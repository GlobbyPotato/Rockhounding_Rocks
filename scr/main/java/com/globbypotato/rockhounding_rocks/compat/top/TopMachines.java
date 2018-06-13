package com.globbypotato.rockhounding_rocks.compat.top;

import javax.annotation.Nullable;

import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECarvingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TECuttingStation;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TESculptingBenchAnimated;
import com.globbypotato.rockhounding_rocks.machines.tileentity.TEStoneRammerAnimated;
import com.google.common.base.Function;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ITheOneProbe;
import mcjty.theoneprobe.api.NumberFormat;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TopMachines implements IProbeInfoProvider{

	@Override
	public String getID() {
        return Reference.MODID + ":" + "cutting_station";
	}

	@Override
	public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        final TileEntity te = world.getTileEntity(data.getPos());
		if(te != null){
			if(te instanceof TECuttingStation){
				TECuttingStation tank = (TECuttingStation)te;
				probeInfo.progress(tank.getPower(), tank.getPowerMax(), probeInfo.defaultProgressStyle().suffix(" ticks").filledColor(0xFFFFB400).alternateFilledColor(0xFFFF7200).borderColor(0x000000).numberFormat(NumberFormat.FULL));
				probeInfo.progress(tank.inputTank.getFluidAmount(), tank.inputTank.getCapacity(), probeInfo.defaultProgressStyle()
																										.suffix(" mB")
																										.filledColor(0xFF08FFF6)
																										.alternateFilledColor(0xFF0893FF)
																										.borderColor(0x000000)
																										.numberFormat(NumberFormat.FULL));
			}
			if(te instanceof TEStoneRammerAnimated){
				TEStoneRammerAnimated tank = (TEStoneRammerAnimated)te;
				if(tank.getCooktime() > 0){
					int adv = (tank.getCooktime() * 100) / tank.getCooktimeMax();
					String perc = adv + "%";
					probeInfo.progress(tank.getCooktime(), tank.getCooktimeMax(), probeInfo.defaultProgressStyle().suffix(perc).filledColor(0xFFFFB400).alternateFilledColor(0xFFFF7200).borderColor(0x000000).numberFormat(NumberFormat.NONE));
				}
			}
			if(te instanceof TECarvingBenchAnimated){
				TECarvingBenchAnimated tank = (TECarvingBenchAnimated)te;
				if(tank.getCooktime() > 0){
					int adv = (tank.getCooktime() * 100) / tank.getCooktimeMax();
					String perc = adv + "%";
					probeInfo.progress(tank.getCooktime(), tank.getCooktimeMax(), probeInfo.defaultProgressStyle().suffix(perc).filledColor(0xFFFFB400).alternateFilledColor(0xFFFF7200).borderColor(0x000000).numberFormat(NumberFormat.NONE));
				}
			}
			if(te instanceof TESculptingBenchAnimated){
				TESculptingBenchAnimated tank = (TESculptingBenchAnimated)te;
				if(tank.getCooktime() > 0){
					int adv = (tank.getCooktime() * 100) / tank.getCooktimeMax();
					String perc = adv + "%";
					probeInfo.progress(tank.getCooktime(), tank.getCooktimeMax(), probeInfo.defaultProgressStyle().suffix(perc).filledColor(0xFFFFB400).alternateFilledColor(0xFFFF7200).borderColor(0x000000).numberFormat(NumberFormat.NONE));
				}
			}

		}
	}

    public static class getTOP implements Function<ITheOneProbe, Void> {
        public static ITheOneProbe top;

        @Nullable
        @Override
        public Void apply (ITheOneProbe theOneProbe) {

        	top = theOneProbe;
            top.registerProvider(new TopMachines());
//            top.registerProbeConfigProvider(new EnergyInfo());
            return null;
        }
    }

}