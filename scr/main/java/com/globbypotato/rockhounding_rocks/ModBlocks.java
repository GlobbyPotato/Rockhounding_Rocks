package com.globbypotato.rockhounding_rocks;

import com.globbypotato.rockhounding_core.blocks.itemblocks.BaseMetaIB;
import com.globbypotato.rockhounding_core.blocks.itemblocks.PoweredMetaIB;
import com.globbypotato.rockhounding_core.handlers.RegistryHandler;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoA;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoB;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoC;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoClay;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoConcrete;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoD;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoE;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoF;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoG;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoH;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoVanilla;
import com.globbypotato.rockhounding_rocks.blocks.decos.DecoVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.decos.PlainVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksA;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksB;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksC;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksClay;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksConcrete;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksD;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksE;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksF;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksG;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksH;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksVanilla;
import com.globbypotato.rockhounding_rocks.blocks.decos.RocksVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsA;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsB;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsC;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsClay;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsConcrete;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsD;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsE;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsF;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsG;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsH;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsVanilla;
import com.globbypotato.rockhounding_rocks.blocks.pillars.ColumnsVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsA;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsB;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsC;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsClay;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsConcrete;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsD;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsE;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsF;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsG;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsH;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsVanilla;
import com.globbypotato.rockhounding_rocks.blocks.pillars.DoricsVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyA;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyB;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyC;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyClay;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyConcrete;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyD;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyE;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyF;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyG;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyH;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyVanilla;
import com.globbypotato.rockhounding_rocks.blocks.pillars.FancyVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsA;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsB;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsC;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsClay;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsConcrete;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsD;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsE;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsF;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsG;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsH;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsVanilla;
import com.globbypotato.rockhounding_rocks.blocks.pillars.PedestalsVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleA;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleB;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleC;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleClay;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleConcrete;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleD;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleE;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleF;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleG;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleH;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleVanilla;
import com.globbypotato.rockhounding_rocks.blocks.pillars.SteleVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasA;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasB;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasC;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasClay;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasConcrete;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasD;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasE;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasF;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasG;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasH;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasVanilla;
import com.globbypotato.rockhounding_rocks.blocks.pillars.TetrasVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsA;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsB;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsC;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsClay;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsConcrete;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsD;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsE;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsF;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsG;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsH;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsVanilla;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.FountainsVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsA;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsB;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsC;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsClay;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsConcrete;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsD;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsE;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsF;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsG;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsH;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsVanilla;
import com.globbypotato.rockhounding_rocks.blocks.sculpts.LanternsVanilla2;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBlocksA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBlocksB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBlocksC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBlocksD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBlocksE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBlocksF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBlocksG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBlocksH;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBricksA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBricksB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBricksC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBricksD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBricksE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBricksF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBricksG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfBricksH;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfCarvedA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfCarvedB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfCarvedC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfCarvedD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfCarvedE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfCarvedF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfCarvedG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfCarvedH;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfDebossA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfDebossB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfDebossC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfDebossD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfDebossE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfDebossF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfDebossG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfDebossH;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfFloorsA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfFloorsB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfFloorsC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfFloorsD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfFloorsE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfFloorsF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfFloorsG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfFloorsH;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPavesA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPavesB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPavesC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPavesD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPavesE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPavesF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPavesG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPavesH;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPolishedA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPolishedB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPolishedC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPolishedD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPolishedE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPolishedF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPolishedG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfPolishedH;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfShortsA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfShortsB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfShortsC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfShortsD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfShortsE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfShortsF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfShortsG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfShortsH;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfSlabs_IB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfTilesA;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfTilesB;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfTilesC;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfTilesD;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfTilesE;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfTilesF;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfTilesG;
import com.globbypotato.rockhounding_rocks.blocks.slabs.HalfTilesH;
import com.globbypotato.rockhounding_rocks.enums.EnumMachines;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksA;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksB;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksC;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksD;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksE;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksF;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksG;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksH;
import com.globbypotato.rockhounding_rocks.enums.rocks.extra.EnumClay;
import com.globbypotato.rockhounding_rocks.enums.rocks.extra.EnumConcrete;
import com.globbypotato.rockhounding_rocks.enums.rocks.extra.EnumVanilla;
import com.globbypotato.rockhounding_rocks.enums.rocks.extra.EnumVanilla2;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.machines.Machines;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.MODID)
public class ModBlocks {

	public static final Block ROCKS_A = new RocksA(EnumRocksA.getNames(), "rocks_a");
	public static final Block ROCKS_B = new RocksB(EnumRocksB.getNames(), "rocks_b");
	public static final Block ROCKS_C = new RocksC(EnumRocksC.getNames(), "rocks_c");
	public static final Block ROCKS_D = new RocksD(EnumRocksD.getNames(), "rocks_d");
	public static final Block ROCKS_E = new RocksE(EnumRocksE.getNames(), "rocks_e");
	public static final Block ROCKS_F = new RocksF(EnumRocksF.getNames(), "rocks_f");
	public static final Block ROCKS_G = new RocksG(EnumRocksG.getNames(), "rocks_g");
	public static final Block ROCKS_H = new RocksH(EnumRocksH.getNames(), "rocks_h");

	public static final Block BLOCKS_A = new RocksA(EnumRocksA.getNames(), "blocks_a");
	public static final Block BLOCKS_B = new RocksB(EnumRocksB.getNames(), "blocks_b");
	public static final Block BLOCKS_C = new RocksC(EnumRocksC.getNames(), "blocks_c");
	public static final Block BLOCKS_D = new RocksD(EnumRocksD.getNames(), "blocks_d");
	public static final Block BLOCKS_E = new RocksE(EnumRocksE.getNames(), "blocks_e");
	public static final Block BLOCKS_F = new RocksF(EnumRocksF.getNames(), "blocks_f");
	public static final Block BLOCKS_G = new RocksG(EnumRocksG.getNames(), "blocks_g");
	public static final Block BLOCKS_H = new RocksH(EnumRocksH.getNames(), "blocks_h");
	public static final Block BLOCKS_VANILLA2 = new PlainVanilla2(EnumVanilla2.getNames(), "blocks_vanilla2");

	public static final Block POLISHED_A = new RocksA(EnumRocksA.getNames(), "polished_a");
	public static final Block POLISHED_B = new RocksB(EnumRocksB.getNames(), "polished_b");
	public static final Block POLISHED_C = new RocksC(EnumRocksC.getNames(), "polished_c");
	public static final Block POLISHED_D = new RocksD(EnumRocksD.getNames(), "polished_d");
	public static final Block POLISHED_E = new RocksE(EnumRocksE.getNames(), "polished_e");
	public static final Block POLISHED_F = new RocksF(EnumRocksF.getNames(), "polished_f");
	public static final Block POLISHED_G = new RocksG(EnumRocksG.getNames(), "polished_g");
	public static final Block POLISHED_H = new RocksH(EnumRocksH.getNames(), "polished_h");
	public static final Block POLISHED_CLAY = new RocksClay(EnumClay.getNames(), "polished_clay");
	public static final Block POLISHED_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "polished_vanilla");
	public static final Block POLISHED_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "polished_vanilla2");
	public static final Block POLISHED_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "polished_concrete");

	public static final Block BRICKS_A = new RocksA(EnumRocksA.getNames(), "bricks_a");
	public static final Block BRICKS_B = new RocksB(EnumRocksB.getNames(), "bricks_b");
	public static final Block BRICKS_C = new RocksC(EnumRocksC.getNames(), "bricks_c");
	public static final Block BRICKS_D = new RocksD(EnumRocksD.getNames(), "bricks_d");
	public static final Block BRICKS_E = new RocksE(EnumRocksE.getNames(), "bricks_e");
	public static final Block BRICKS_F = new RocksF(EnumRocksF.getNames(), "bricks_f");
	public static final Block BRICKS_G = new RocksG(EnumRocksG.getNames(), "bricks_g");
	public static final Block BRICKS_H = new RocksH(EnumRocksH.getNames(), "bricks_h");
	public static final Block BRICKS_CLAY = new RocksClay(EnumClay.getNames(), "bricks_clay");
	public static final Block BRICKS_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "bricks_vanilla");
	public static final Block BRICKS_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "bricks_vanilla2");
	public static final Block BRICKS_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "bricks_concrete");

	public static final Block PAVES_A = new RocksA(EnumRocksA.getNames(), "paves_a");
	public static final Block PAVES_B = new RocksB(EnumRocksB.getNames(), "paves_b");
	public static final Block PAVES_C = new RocksC(EnumRocksC.getNames(), "paves_c");
	public static final Block PAVES_D = new RocksD(EnumRocksD.getNames(), "paves_d");
	public static final Block PAVES_E = new RocksE(EnumRocksE.getNames(), "paves_e");
	public static final Block PAVES_F = new RocksF(EnumRocksF.getNames(), "paves_f");
	public static final Block PAVES_G = new RocksG(EnumRocksG.getNames(), "paves_g");
	public static final Block PAVES_H = new RocksH(EnumRocksH.getNames(), "paves_h");
	public static final Block PAVES_CLAY = new RocksClay(EnumClay.getNames(), "paves_clay");
	public static final Block PAVES_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "paves_vanilla");
	public static final Block PAVES_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "paves_vanilla2");
	public static final Block PAVES_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "paves_concrete");

	public static final Block SLABS_A = new RocksA(EnumRocksA.getNames(), "slabs_a");
	public static final Block SLABS_B = new RocksB(EnumRocksB.getNames(), "slabs_b");
	public static final Block SLABS_C = new RocksC(EnumRocksC.getNames(), "slabs_c");
	public static final Block SLABS_D = new RocksD(EnumRocksD.getNames(), "slabs_d");
	public static final Block SLABS_E = new RocksE(EnumRocksE.getNames(), "slabs_e");
	public static final Block SLABS_F = new RocksF(EnumRocksF.getNames(), "slabs_f");
	public static final Block SLABS_G = new RocksG(EnumRocksG.getNames(), "slabs_g");
	public static final Block SLABS_H = new RocksH(EnumRocksH.getNames(), "slabs_h");
	public static final Block SLABS_CLAY = new RocksClay(EnumClay.getNames(), "slabs_clay");
	public static final Block SLABS_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "slabs_vanilla");
	public static final Block SLABS_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "slabs_vanilla2");
	public static final Block SLABS_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "slabs_concrete");

	public static final Block SHORTS_A = new RocksA(EnumRocksA.getNames(), "shorts_a");
	public static final Block SHORTS_B = new RocksB(EnumRocksB.getNames(), "shorts_b");
	public static final Block SHORTS_C = new RocksC(EnumRocksC.getNames(), "shorts_c");
	public static final Block SHORTS_D = new RocksD(EnumRocksD.getNames(), "shorts_d");
	public static final Block SHORTS_E = new RocksE(EnumRocksE.getNames(), "shorts_e");
	public static final Block SHORTS_F = new RocksF(EnumRocksF.getNames(), "shorts_f");
	public static final Block SHORTS_G = new RocksG(EnumRocksG.getNames(), "shorts_g");
	public static final Block SHORTS_H = new RocksH(EnumRocksH.getNames(), "shorts_h");
	public static final Block SHORTS_CLAY = new RocksClay(EnumClay.getNames(), "shorts_clay");
	public static final Block SHORTS_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "shorts_vanilla");
	public static final Block SHORTS_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "shorts_vanilla2");
	public static final Block SHORTS_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "shorts_concrete");

	public static final Block TILES_A = new RocksA(EnumRocksA.getNames(), "tiles_a");
	public static final Block TILES_B = new RocksB(EnumRocksB.getNames(), "tiles_b");
	public static final Block TILES_C = new RocksC(EnumRocksC.getNames(), "tiles_c");
	public static final Block TILES_D = new RocksD(EnumRocksD.getNames(), "tiles_d");
	public static final Block TILES_E = new RocksE(EnumRocksE.getNames(), "tiles_e");
	public static final Block TILES_F = new RocksF(EnumRocksF.getNames(), "tiles_f");
	public static final Block TILES_G = new RocksG(EnumRocksG.getNames(), "tiles_g");
	public static final Block TILES_H = new RocksH(EnumRocksH.getNames(), "tiles_h");
	public static final Block TILES_CLAY = new RocksClay(EnumClay.getNames(), "tiles_clay");
	public static final Block TILES_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "tiles_vanilla");
	public static final Block TILES_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "tiles_vanilla2");
	public static final Block TILES_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "tiles_concrete");

	public static final Block DEBOSS_A = new RocksA(EnumRocksA.getNames(), "deboss_a");
	public static final Block DEBOSS_B = new RocksB(EnumRocksB.getNames(), "deboss_b");
	public static final Block DEBOSS_C = new RocksC(EnumRocksC.getNames(), "deboss_c");
	public static final Block DEBOSS_D = new RocksD(EnumRocksD.getNames(), "deboss_d");
	public static final Block DEBOSS_E = new RocksE(EnumRocksE.getNames(), "deboss_e");
	public static final Block DEBOSS_F = new RocksF(EnumRocksF.getNames(), "deboss_f");
	public static final Block DEBOSS_G = new RocksG(EnumRocksG.getNames(), "deboss_g");
	public static final Block DEBOSS_H = new RocksH(EnumRocksH.getNames(), "deboss_h");
	public static final Block DEBOSS_CLAY = new RocksClay(EnumClay.getNames(), "deboss_clay");
	public static final Block DEBOSS_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "deboss_vanilla");
	public static final Block DEBOSS_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "deboss_vanilla2");
	public static final Block DEBOSS_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "deboss_concrete");

	public static final Block FLOORS_A = new RocksA(EnumRocksA.getNames(), "floors_a");
	public static final Block FLOORS_B = new RocksB(EnumRocksB.getNames(), "floors_b");
	public static final Block FLOORS_C = new RocksC(EnumRocksC.getNames(), "floors_c");
	public static final Block FLOORS_D = new RocksD(EnumRocksD.getNames(), "floors_d");
	public static final Block FLOORS_E = new RocksE(EnumRocksE.getNames(), "floors_e");
	public static final Block FLOORS_F = new RocksF(EnumRocksF.getNames(), "floors_f");
	public static final Block FLOORS_G = new RocksG(EnumRocksG.getNames(), "floors_g");
	public static final Block FLOORS_H = new RocksH(EnumRocksH.getNames(), "floors_h");
	public static final Block FLOORS_CLAY = new RocksClay(EnumClay.getNames(), "floors_clay");
	public static final Block FLOORS_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "floors_vanilla");
	public static final Block FLOORS_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "floors_vanilla2");
	public static final Block FLOORS_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "floors_concrete");

	public static final Block CARVED_A = new RocksA(EnumRocksA.getNames(), "carved_a");
	public static final Block CARVED_B = new RocksB(EnumRocksB.getNames(), "carved_b");
	public static final Block CARVED_C = new RocksC(EnumRocksC.getNames(), "carved_c");
	public static final Block CARVED_D = new RocksD(EnumRocksD.getNames(), "carved_d");
	public static final Block CARVED_E = new RocksE(EnumRocksE.getNames(), "carved_e");
	public static final Block CARVED_F = new RocksF(EnumRocksF.getNames(), "carved_f");
	public static final Block CARVED_G = new RocksG(EnumRocksG.getNames(), "carved_g");
	public static final Block CARVED_H = new RocksH(EnumRocksH.getNames(), "carved_h");
	public static final Block CARVED_CLAY = new RocksClay(EnumClay.getNames(), "carved_clay");
	public static final Block CARVED_VANILLA = new RocksVanilla(EnumVanilla.getNames(), "carved_vanilla");
	public static final Block CARVED_VANILLA2 = new RocksVanilla2(EnumVanilla2.getNames(), "carved_vanilla2");
	public static final Block CARVED_CONCRETE = new RocksConcrete(EnumConcrete.getNames(), "carved_concrete");

	public static final Block SEGMENTED_A = new DecoA(EnumRocksA.getNames(), "segmented_a");
	public static final Block SEGMENTED_B = new DecoB(EnumRocksB.getNames(), "segmented_b");
	public static final Block SEGMENTED_C = new DecoC(EnumRocksC.getNames(), "segmented_c");
	public static final Block SEGMENTED_D = new DecoD(EnumRocksD.getNames(), "segmented_d");
	public static final Block SEGMENTED_E = new DecoE(EnumRocksE.getNames(), "segmented_e");
	public static final Block SEGMENTED_F = new DecoF(EnumRocksF.getNames(), "segmented_f");
	public static final Block SEGMENTED_G = new DecoG(EnumRocksG.getNames(), "segmented_g");
	public static final Block SEGMENTED_H = new DecoH(EnumRocksG.getNames(), "segmented_h");
	public static final Block SEGMENTED_CLAY = new DecoClay(EnumClay.getNames(), "segmented_clay");
	public static final Block SEGMENTED_VANILLA = new DecoVanilla(EnumVanilla.getNames(), "segmented_vanilla");
	public static final Block SEGMENTED_VANILLA2 = new DecoVanilla2(EnumVanilla2.getNames(), "segmented_vanilla2");
	public static final Block SEGMENTED_CONCRETE = new DecoConcrete(EnumConcrete.getNames(), "segmented_concrete");

	public static final Block FOUNTAINS_A = new FountainsA(EnumRocksA.getNames(), "fountains_a");
	public static final Block FOUNTAINS_B = new FountainsB(EnumRocksB.getNames(), "fountains_b");
	public static final Block FOUNTAINS_C = new FountainsC(EnumRocksC.getNames(), "fountains_c");
	public static final Block FOUNTAINS_D = new FountainsD(EnumRocksD.getNames(), "fountains_d");
	public static final Block FOUNTAINS_E = new FountainsE(EnumRocksE.getNames(), "fountains_e");
	public static final Block FOUNTAINS_F = new FountainsF(EnumRocksF.getNames(), "fountains_f");
	public static final Block FOUNTAINS_G = new FountainsG(EnumRocksG.getNames(), "fountains_g");
	public static final Block FOUNTAINS_H = new FountainsH(EnumRocksH.getNames(), "fountains_h");
	public static final Block FOUNTAINS_CLAY = new FountainsClay(EnumClay.getNames(), "fountains_clay");
	public static final Block FOUNTAINS_VANILLA = new FountainsVanilla(EnumVanilla.getNames(), "fountains_vanilla");
	public static final Block FOUNTAINS_VANILLA2 = new FountainsVanilla2(EnumVanilla2.getNames(), "fountains_vanilla2");
	public static final Block FOUNTAINS_CONCRETE = new FountainsConcrete(EnumConcrete.getNames(), "fountains_concrete");

	public static final Block LANTERNS_A = new LanternsA(EnumRocksA.getNames(), "lanterns_a");
	public static final Block LANTERNS_B = new LanternsB(EnumRocksB.getNames(), "lanterns_b");
	public static final Block LANTERNS_C = new LanternsC(EnumRocksC.getNames(), "lanterns_c");
	public static final Block LANTERNS_D = new LanternsD(EnumRocksD.getNames(), "lanterns_d");
	public static final Block LANTERNS_E = new LanternsE(EnumRocksE.getNames(), "lanterns_e");
	public static final Block LANTERNS_F = new LanternsF(EnumRocksF.getNames(), "lanterns_f");
	public static final Block LANTERNS_G = new LanternsG(EnumRocksG.getNames(), "lanterns_g");
	public static final Block LANTERNS_H = new LanternsH(EnumRocksH.getNames(), "lanterns_h");
	public static final Block LANTERNS_CLAY = new LanternsClay(EnumClay.getNames(), "lanterns_clay");
	public static final Block LANTERNS_VANILLA = new LanternsVanilla(EnumVanilla.getNames(), "lanterns_vanilla");
	public static final Block LANTERNS_VANILLA2 = new LanternsVanilla2(EnumVanilla2.getNames(), "lanterns_vanilla2");
	public static final Block LANTERNS_CONCRETE = new LanternsConcrete(EnumConcrete.getNames(), "lanterns_concrete");

	public static final Block PEDESTALS_A = new PedestalsA(EnumRocksA.getNames(), "posts_a");
	public static final Block PEDESTALS_B = new PedestalsB(EnumRocksB.getNames(), "posts_b");
	public static final Block PEDESTALS_C = new PedestalsC(EnumRocksC.getNames(), "posts_c");
	public static final Block PEDESTALS_D = new PedestalsD(EnumRocksD.getNames(), "posts_d");
	public static final Block PEDESTALS_E = new PedestalsE(EnumRocksE.getNames(), "posts_e");
	public static final Block PEDESTALS_F = new PedestalsF(EnumRocksF.getNames(), "posts_f");
	public static final Block PEDESTALS_G = new PedestalsG(EnumRocksG.getNames(), "posts_g");
	public static final Block PEDESTALS_H = new PedestalsH(EnumRocksH.getNames(), "posts_h");
	public static final Block PEDESTALS_CLAY = new PedestalsClay(EnumClay.getNames(), "posts_clay");
	public static final Block PEDESTALS_VANILLA = new PedestalsVanilla(EnumVanilla.getNames(), "posts_vanilla");
	public static final Block PEDESTALS_VANILLA2 = new PedestalsVanilla2(EnumVanilla2.getNames(), "posts_vanilla2");
	public static final Block PEDESTALS_CONCRETE = new PedestalsConcrete(EnumConcrete.getNames(), "posts_concrete");

	public static final Block TETRAS_A = new TetrasA(EnumRocksA.getNames(), "tetras_a");
	public static final Block TETRAS_B = new TetrasB(EnumRocksB.getNames(), "tetras_b");
	public static final Block TETRAS_C = new TetrasC(EnumRocksC.getNames(), "tetras_c");
	public static final Block TETRAS_D = new TetrasD(EnumRocksD.getNames(), "tetras_d");
	public static final Block TETRAS_E = new TetrasE(EnumRocksE.getNames(), "tetras_e");
	public static final Block TETRAS_F = new TetrasF(EnumRocksF.getNames(), "tetras_f");
	public static final Block TETRAS_G = new TetrasG(EnumRocksG.getNames(), "tetras_g");
	public static final Block TETRAS_H = new TetrasH(EnumRocksH.getNames(), "tetras_h");
	public static final Block TETRAS_CLAY = new TetrasClay(EnumClay.getNames(), "tetras_clay");
	public static final Block TETRAS_VANILLA = new TetrasVanilla(EnumVanilla.getNames(), "tetras_vanilla");
	public static final Block TETRAS_VANILLA2 = new TetrasVanilla2(EnumVanilla2.getNames(), "tetras_vanilla2");
	public static final Block TETRAS_CONCRETE = new TetrasConcrete(EnumConcrete.getNames(), "tetras_concrete");

	public static final Block COLUMNS_A = new ColumnsA(EnumRocksA.getNames(), "columns_a");
	public static final Block COLUMNS_B = new ColumnsB(EnumRocksB.getNames(), "columns_b");
	public static final Block COLUMNS_C = new ColumnsC(EnumRocksC.getNames(), "columns_c");
	public static final Block COLUMNS_D = new ColumnsD(EnumRocksD.getNames(), "columns_d");
	public static final Block COLUMNS_E = new ColumnsE(EnumRocksE.getNames(), "columns_e");
	public static final Block COLUMNS_F = new ColumnsF(EnumRocksF.getNames(), "columns_f");
	public static final Block COLUMNS_G = new ColumnsG(EnumRocksG.getNames(), "columns_g");
	public static final Block COLUMNS_H = new ColumnsH(EnumRocksH.getNames(), "columns_h");
	public static final Block COLUMNS_CLAY = new ColumnsClay(EnumClay.getNames(), "columns_clay");
	public static final Block COLUMNS_VANILLA = new ColumnsVanilla(EnumVanilla.getNames(), "columns_vanilla");
	public static final Block COLUMNS_VANILLA2 = new ColumnsVanilla2(EnumVanilla2.getNames(), "columns_vanilla2");
	public static final Block COLUMNS_CONCRETE = new ColumnsConcrete(EnumConcrete.getNames(), "columns_concrete");

	public static final Block DORICS_A = new DoricsA(EnumRocksA.getNames(), "dorics_a");
	public static final Block DORICS_B = new DoricsB(EnumRocksB.getNames(), "dorics_b");
	public static final Block DORICS_C = new DoricsC(EnumRocksC.getNames(), "dorics_c");
	public static final Block DORICS_D = new DoricsD(EnumRocksD.getNames(), "dorics_d");
	public static final Block DORICS_E = new DoricsE(EnumRocksE.getNames(), "dorics_e");
	public static final Block DORICS_F = new DoricsF(EnumRocksF.getNames(), "dorics_f");
	public static final Block DORICS_G = new DoricsG(EnumRocksG.getNames(), "dorics_g");
	public static final Block DORICS_H = new DoricsH(EnumRocksH.getNames(), "dorics_h");
	public static final Block DORICS_CLAY = new DoricsClay(EnumClay.getNames(), "dorics_clay");
	public static final Block DORICS_VANILLA = new DoricsVanilla(EnumVanilla.getNames(), "dorics_vanilla");
	public static final Block DORICS_VANILLA2 = new DoricsVanilla2(EnumVanilla2.getNames(), "dorics_vanilla2");
	public static final Block DORICS_CONCRETE = new DoricsConcrete(EnumConcrete.getNames(), "dorics_concrete");

	public static final Block FANCYS_A = new FancyA(EnumRocksA.getNames(), "fancys_a");
	public static final Block FANCYS_B = new FancyB(EnumRocksB.getNames(), "fancys_b");
	public static final Block FANCYS_C = new FancyC(EnumRocksC.getNames(), "fancys_c");
	public static final Block FANCYS_D = new FancyD(EnumRocksD.getNames(), "fancys_d");
	public static final Block FANCYS_E = new FancyE(EnumRocksE.getNames(), "fancys_e");
	public static final Block FANCYS_F = new FancyF(EnumRocksF.getNames(), "fancys_f");
	public static final Block FANCYS_G = new FancyG(EnumRocksG.getNames(), "fancys_g");
	public static final Block FANCYS_H = new FancyH(EnumRocksH.getNames(), "fancys_h");
	public static final Block FANCYS_CLAY = new FancyClay(EnumClay.getNames(), "fancys_clay");
	public static final Block FANCYS_VANILLA = new FancyVanilla(EnumVanilla.getNames(), "fancys_vanilla");
	public static final Block FANCYS_VANILLA2 = new FancyVanilla2(EnumVanilla2.getNames(), "fancys_vanilla2");
	public static final Block FANCYS_CONCRETE = new FancyConcrete(EnumConcrete.getNames(), "fancys_concrete");

	public static final Block STELES_A = new SteleA(EnumRocksA.getNames(), "steles_a");
	public static final Block STELES_B = new SteleB(EnumRocksB.getNames(), "steles_b");
	public static final Block STELES_C = new SteleC(EnumRocksC.getNames(), "steles_c");
	public static final Block STELES_D = new SteleD(EnumRocksD.getNames(), "steles_d");
	public static final Block STELES_E = new SteleE(EnumRocksE.getNames(), "steles_e");
	public static final Block STELES_F = new SteleF(EnumRocksF.getNames(), "steles_f");
	public static final Block STELES_G = new SteleG(EnumRocksG.getNames(), "steles_g");
	public static final Block STELES_H = new SteleH(EnumRocksH.getNames(), "steles_h");
	public static final Block STELES_CLAY = new SteleClay(EnumClay.getNames(), "steles_clay");
	public static final Block STELES_VANILLA = new SteleVanilla(EnumVanilla.getNames(), "steles_vanilla");
	public static final Block STELES_VANILLA2 = new SteleVanilla2(EnumVanilla2.getNames(), "steles_vanilla2");
	public static final Block STELES_CONCRETE = new SteleConcrete(EnumConcrete.getNames(), "steles_concrete");

	public static final Block TWISTED_A = new DecoA(EnumRocksA.getNames(), "twisted_a");
	public static final Block TWISTED_B = new DecoB(EnumRocksB.getNames(), "twisted_b");
	public static final Block TWISTED_C = new DecoC(EnumRocksC.getNames(), "twisted_c");
	public static final Block TWISTED_D = new DecoD(EnumRocksD.getNames(), "twisted_d");
	public static final Block TWISTED_E = new DecoE(EnumRocksE.getNames(), "twisted_e");
	public static final Block TWISTED_F = new DecoF(EnumRocksF.getNames(), "twisted_f");
	public static final Block TWISTED_G = new DecoG(EnumRocksG.getNames(), "twisted_g");
	public static final Block TWISTED_H = new DecoH(EnumRocksH.getNames(), "twisted_h");
	public static final Block TWISTED_CLAY = new DecoClay(EnumClay.getNames(), "twisted_clay");
	public static final Block TWISTED_VANILLA = new DecoVanilla(EnumVanilla.getNames(), "twisted_vanilla");
	public static final Block TWISTED_VANILLA2 = new DecoVanilla2(EnumVanilla2.getNames(), "twisted_vanilla2");
	public static final Block TWISTED_CONCRETE = new DecoConcrete(EnumConcrete.getNames(), "twisted_concrete");

	public static final Block HALF_BLOCKS_A_LO = new HalfBlocksA("half_blocks_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_BLOCKS_A_HI = new HalfBlocksA("half_blocks_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_BLOCKS_B_LO = new HalfBlocksB("half_blocks_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_BLOCKS_B_HI = new HalfBlocksB("half_blocks_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_BLOCKS_C_LO = new HalfBlocksC("half_blocks_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_BLOCKS_C_HI = new HalfBlocksC("half_blocks_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_BLOCKS_D_LO = new HalfBlocksD("half_blocks_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_BLOCKS_D_HI = new HalfBlocksD("half_blocks_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_BLOCKS_E_LO = new HalfBlocksE("half_blocks_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_BLOCKS_E_HI = new HalfBlocksE("half_blocks_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_BLOCKS_F_LO = new HalfBlocksF("half_blocks_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_BLOCKS_F_HI = new HalfBlocksF("half_blocks_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_BLOCKS_G_LO = new HalfBlocksG("half_blocks_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_BLOCKS_G_HI = new HalfBlocksG("half_blocks_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_BLOCKS_H_LO = new HalfBlocksH("half_blocks_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_BLOCKS_H_HI = new HalfBlocksH("half_blocks_h_hi", EnumRocksH.getNames(), false);

	public static final Block HALF_BRICKS_A_LO = new HalfBricksA("half_bricks_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_BRICKS_A_HI = new HalfBricksA("half_bricks_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_BRICKS_B_LO = new HalfBricksB("half_bricks_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_BRICKS_B_HI = new HalfBricksB("half_bricks_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_BRICKS_C_LO = new HalfBricksC("half_bricks_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_BRICKS_C_HI = new HalfBricksC("half_bricks_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_BRICKS_D_LO = new HalfBricksD("half_bricks_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_BRICKS_D_HI = new HalfBricksD("half_bricks_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_BRICKS_E_LO = new HalfBricksE("half_bricks_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_BRICKS_E_HI = new HalfBricksE("half_bricks_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_BRICKS_F_LO = new HalfBricksF("half_bricks_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_BRICKS_F_HI = new HalfBricksF("half_bricks_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_BRICKS_G_LO = new HalfBricksG("half_bricks_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_BRICKS_G_HI = new HalfBricksG("half_bricks_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_BRICKS_H_LO = new HalfBricksH("half_bricks_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_BRICKS_H_HI = new HalfBricksH("half_bricks_h_hi", EnumRocksH.getNames(), false);

	public static final Block HALF_POLISHED_A_LO = new HalfPolishedA("half_polished_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_POLISHED_A_HI = new HalfPolishedA("half_polished_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_POLISHED_B_LO = new HalfPolishedB("half_polished_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_POLISHED_B_HI = new HalfPolishedB("half_polished_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_POLISHED_C_LO = new HalfPolishedC("half_polished_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_POLISHED_C_HI = new HalfPolishedC("half_polished_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_POLISHED_D_LO = new HalfPolishedD("half_polished_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_POLISHED_D_HI = new HalfPolishedD("half_polished_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_POLISHED_E_LO = new HalfPolishedE("half_polished_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_POLISHED_E_HI = new HalfPolishedE("half_polished_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_POLISHED_F_LO = new HalfPolishedF("half_polished_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_POLISHED_F_HI = new HalfPolishedF("half_polished_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_POLISHED_G_LO = new HalfPolishedG("half_polished_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_POLISHED_G_HI = new HalfPolishedG("half_polished_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_POLISHED_H_LO = new HalfPolishedH("half_polished_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_POLISHED_H_HI = new HalfPolishedH("half_polished_h_hi", EnumRocksH.getNames(), false);

	public static final Block HALF_TILES_A_LO = new HalfTilesA("half_tiles_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_TILES_A_HI = new HalfTilesA("half_tiles_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_TILES_B_LO = new HalfTilesB("half_tiles_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_TILES_B_HI = new HalfTilesB("half_tiles_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_TILES_C_LO = new HalfTilesC("half_tiles_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_TILES_C_HI = new HalfTilesC("half_tiles_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_TILES_D_LO = new HalfTilesD("half_tiles_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_TILES_D_HI = new HalfTilesD("half_tiles_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_TILES_E_LO = new HalfTilesE("half_tiles_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_TILES_E_HI = new HalfTilesE("half_tiles_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_TILES_F_LO = new HalfTilesF("half_tiles_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_TILES_F_HI = new HalfTilesF("half_tiles_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_TILES_G_LO = new HalfTilesG("half_tiles_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_TILES_G_HI = new HalfTilesG("half_tiles_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_TILES_H_LO = new HalfTilesH("half_tiles_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_TILES_H_HI = new HalfTilesH("half_tiles_h_hi", EnumRocksH.getNames(), false);

	public static final Block HALF_CARVED_A_LO = new HalfCarvedA("half_carved_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_CARVED_A_HI = new HalfCarvedA("half_carved_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_CARVED_B_LO = new HalfCarvedB("half_carved_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_CARVED_B_HI = new HalfCarvedB("half_carved_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_CARVED_C_LO = new HalfCarvedC("half_carved_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_CARVED_C_HI = new HalfCarvedC("half_carved_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_CARVED_D_LO = new HalfCarvedD("half_carved_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_CARVED_D_HI = new HalfCarvedD("half_carved_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_CARVED_E_LO = new HalfCarvedE("half_carved_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_CARVED_E_HI = new HalfCarvedE("half_carved_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_CARVED_F_LO = new HalfCarvedF("half_carved_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_CARVED_F_HI = new HalfCarvedF("half_carved_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_CARVED_G_LO = new HalfCarvedG("half_carved_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_CARVED_G_HI = new HalfCarvedG("half_carved_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_CARVED_H_LO = new HalfCarvedH("half_carved_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_CARVED_H_HI = new HalfCarvedH("half_carved_h_hi", EnumRocksH.getNames(), false);

	public static final Block HALF_SHORTS_A_LO = new HalfShortsA("half_shorts_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_SHORTS_A_HI = new HalfShortsA("half_shorts_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_SHORTS_B_LO = new HalfShortsB("half_shorts_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_SHORTS_B_HI = new HalfShortsB("half_shorts_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_SHORTS_C_LO = new HalfShortsC("half_shorts_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_SHORTS_C_HI = new HalfShortsC("half_shorts_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_SHORTS_D_LO = new HalfShortsD("half_shorts_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_SHORTS_D_HI = new HalfShortsD("half_shorts_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_SHORTS_E_LO = new HalfShortsE("half_shorts_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_SHORTS_E_HI = new HalfShortsE("half_shorts_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_SHORTS_F_LO = new HalfShortsF("half_shorts_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_SHORTS_F_HI = new HalfShortsF("half_shorts_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_SHORTS_G_LO = new HalfShortsG("half_shorts_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_SHORTS_G_HI = new HalfShortsG("half_shorts_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_SHORTS_H_LO = new HalfShortsH("half_shorts_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_SHORTS_H_HI = new HalfShortsH("half_shorts_h_hi", EnumRocksH.getNames(), false);

	public static final Block HALF_DEBOSS_A_LO = new HalfDebossA("half_deboss_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_DEBOSS_A_HI = new HalfDebossA("half_deboss_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_DEBOSS_B_LO = new HalfDebossB("half_deboss_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_DEBOSS_B_HI = new HalfDebossB("half_deboss_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_DEBOSS_C_LO = new HalfDebossC("half_deboss_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_DEBOSS_C_HI = new HalfDebossC("half_deboss_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_DEBOSS_D_LO = new HalfDebossD("half_deboss_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_DEBOSS_D_HI = new HalfDebossD("half_deboss_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_DEBOSS_E_LO = new HalfDebossE("half_deboss_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_DEBOSS_E_HI = new HalfDebossE("half_deboss_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_DEBOSS_F_LO = new HalfDebossF("half_deboss_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_DEBOSS_F_HI = new HalfDebossF("half_deboss_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_DEBOSS_G_LO = new HalfDebossG("half_deboss_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_DEBOSS_G_HI = new HalfDebossG("half_deboss_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_DEBOSS_H_LO = new HalfDebossH("half_deboss_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_DEBOSS_H_HI = new HalfDebossH("half_deboss_h_hi", EnumRocksH.getNames(), false);

	public static final Block HALF_FLOORS_A_LO = new HalfFloorsA("half_floors_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_FLOORS_A_HI = new HalfFloorsA("half_floors_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_FLOORS_B_LO = new HalfFloorsB("half_floors_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_FLOORS_B_HI = new HalfFloorsB("half_floors_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_FLOORS_C_LO = new HalfFloorsC("half_floors_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_FLOORS_C_HI = new HalfFloorsC("half_floors_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_FLOORS_D_LO = new HalfFloorsD("half_floors_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_FLOORS_D_HI = new HalfFloorsD("half_floors_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_FLOORS_E_LO = new HalfFloorsE("half_floors_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_FLOORS_E_HI = new HalfFloorsE("half_floors_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_FLOORS_F_LO = new HalfFloorsF("half_floors_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_FLOORS_F_HI = new HalfFloorsF("half_floors_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_FLOORS_G_LO = new HalfFloorsG("half_floors_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_FLOORS_G_HI = new HalfFloorsG("half_floors_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_FLOORS_H_LO = new HalfFloorsH("half_floors_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_FLOORS_H_HI = new HalfFloorsH("half_floors_h_hi", EnumRocksH.getNames(), false);

	public static final Block HALF_PAVES_A_LO = new HalfPavesA("half_paves_a_lo", EnumRocksA.getNames(), true);
	public static final Block HALF_PAVES_A_HI = new HalfPavesA("half_paves_a_hi", EnumRocksA.getNames(), false);
	public static final Block HALF_PAVES_B_LO = new HalfPavesB("half_paves_b_lo", EnumRocksB.getNames(), true);
	public static final Block HALF_PAVES_B_HI = new HalfPavesB("half_paves_b_hi", EnumRocksB.getNames(), false);
	public static final Block HALF_PAVES_C_LO = new HalfPavesC("half_paves_c_lo", EnumRocksC.getNames(), true);
	public static final Block HALF_PAVES_C_HI = new HalfPavesC("half_paves_c_hi", EnumRocksC.getNames(), false);
	public static final Block HALF_PAVES_D_LO = new HalfPavesD("half_paves_d_lo", EnumRocksD.getNames(), true);
	public static final Block HALF_PAVES_D_HI = new HalfPavesD("half_paves_d_hi", EnumRocksD.getNames(), false);
	public static final Block HALF_PAVES_E_LO = new HalfPavesE("half_paves_e_lo", EnumRocksE.getNames(), true);
	public static final Block HALF_PAVES_E_HI = new HalfPavesE("half_paves_e_hi", EnumRocksE.getNames(), false);
	public static final Block HALF_PAVES_F_LO = new HalfPavesF("half_paves_f_lo", EnumRocksF.getNames(), true);
	public static final Block HALF_PAVES_F_HI = new HalfPavesF("half_paves_f_hi", EnumRocksF.getNames(), false);
	public static final Block HALF_PAVES_G_LO = new HalfPavesG("half_paves_g_lo", EnumRocksG.getNames(), true);
	public static final Block HALF_PAVES_G_HI = new HalfPavesG("half_paves_g_hi", EnumRocksG.getNames(), false);
	public static final Block HALF_PAVES_H_LO = new HalfPavesH("half_paves_h_lo", EnumRocksH.getNames(), true);
	public static final Block HALF_PAVES_H_HI = new HalfPavesH("half_paves_h_hi", EnumRocksH.getNames(), false);

	public static final Block MACHINES = new Machines("machines");

	@Mod.EventBusSubscriber(modid = Reference.MODID)
	public static class RegistrationHandler {

		// register the block block
		@SubscribeEvent
		public static void registerBlock(final RegistryEvent.Register<Block> event) {
			final IForgeRegistry<Block> registry = event.getRegistry();

			registry.register(MACHINES);

			registry.register(ROCKS_A);
			registry.register(ROCKS_B);
			registry.register(ROCKS_C);
			registry.register(ROCKS_D);
			registry.register(ROCKS_E);
			registry.register(ROCKS_F);
			registry.register(ROCKS_G);
			registry.register(ROCKS_H);
	
			registry.register(BLOCKS_A);
			registry.register(BLOCKS_B);
			registry.register(BLOCKS_C);
			registry.register(BLOCKS_D);
			registry.register(BLOCKS_E);
			registry.register(BLOCKS_F);
			registry.register(BLOCKS_G);
			registry.register(BLOCKS_H);
			registry.register(BLOCKS_VANILLA2);

			if(ModConfig.ENABLE_HALF_SLAB){
				registry.register(HALF_BLOCKS_A_LO);
				registry.register(HALF_BLOCKS_A_HI);
				registry.register(HALF_BLOCKS_B_LO);
				registry.register(HALF_BLOCKS_B_HI);
				registry.register(HALF_BLOCKS_C_LO);
				registry.register(HALF_BLOCKS_C_HI);
				registry.register(HALF_BLOCKS_D_LO);
				registry.register(HALF_BLOCKS_D_HI);
				registry.register(HALF_BLOCKS_E_LO);
				registry.register(HALF_BLOCKS_E_HI);
				registry.register(HALF_BLOCKS_F_LO);
				registry.register(HALF_BLOCKS_F_HI);
				registry.register(HALF_BLOCKS_G_LO);
				registry.register(HALF_BLOCKS_G_HI);
				registry.register(HALF_BLOCKS_H_LO);
				registry.register(HALF_BLOCKS_H_HI);
			}

			if(ModConfig.ENABLE_DECO){
				if(ModConfig.ENABLE_POLISHED){
					registry.register(POLISHED_A);
					registry.register(POLISHED_B);
					registry.register(POLISHED_C);
					registry.register(POLISHED_D);
					registry.register(POLISHED_E);
					registry.register(POLISHED_F);
					registry.register(POLISHED_G);
					registry.register(POLISHED_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(POLISHED_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(POLISHED_VANILLA);
						registry.register(POLISHED_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(POLISHED_CONCRETE);
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(HALF_POLISHED_A_LO);
						registry.register(HALF_POLISHED_A_HI);
						registry.register(HALF_POLISHED_B_LO);
						registry.register(HALF_POLISHED_B_HI);
						registry.register(HALF_POLISHED_C_LO);
						registry.register(HALF_POLISHED_C_HI);
						registry.register(HALF_POLISHED_D_LO);
						registry.register(HALF_POLISHED_D_HI);
						registry.register(HALF_POLISHED_E_LO);
						registry.register(HALF_POLISHED_E_HI);
						registry.register(HALF_POLISHED_F_LO);
						registry.register(HALF_POLISHED_F_HI);
						registry.register(HALF_POLISHED_G_LO);
						registry.register(HALF_POLISHED_G_HI);
						registry.register(HALF_POLISHED_H_LO);
						registry.register(HALF_POLISHED_H_HI);
					}
				}

				if(ModConfig.ENABLE_BRICKS){
					registry.register(BRICKS_A);
					registry.register(BRICKS_B);
					registry.register(BRICKS_C);
					registry.register(BRICKS_D);
					registry.register(BRICKS_E);
					registry.register(BRICKS_F);
					registry.register(BRICKS_G);
					registry.register(BRICKS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(BRICKS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(BRICKS_VANILLA);
						registry.register(BRICKS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(BRICKS_CONCRETE);
					}			
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(HALF_BRICKS_A_LO);
						registry.register(HALF_BRICKS_A_HI);
						registry.register(HALF_BRICKS_B_LO);
						registry.register(HALF_BRICKS_B_HI);
						registry.register(HALF_BRICKS_C_LO);
						registry.register(HALF_BRICKS_C_HI);
						registry.register(HALF_BRICKS_D_LO);
						registry.register(HALF_BRICKS_D_HI);
						registry.register(HALF_BRICKS_E_LO);
						registry.register(HALF_BRICKS_E_HI);
						registry.register(HALF_BRICKS_F_LO);
						registry.register(HALF_BRICKS_F_HI);
						registry.register(HALF_BRICKS_G_LO);
						registry.register(HALF_BRICKS_G_HI);
						registry.register(HALF_BRICKS_H_LO);
						registry.register(HALF_BRICKS_H_HI);
					}
				}

				if(ModConfig.ENABLE_PAVES){
					registry.register(PAVES_A);
					registry.register(PAVES_B);
					registry.register(PAVES_C);
					registry.register(PAVES_D);
					registry.register(PAVES_E);
					registry.register(PAVES_F);
					registry.register(PAVES_G);
					registry.register(PAVES_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(PAVES_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(PAVES_VANILLA);
						registry.register(PAVES_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(PAVES_CONCRETE);
					}			
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(HALF_PAVES_A_LO);
						registry.register(HALF_PAVES_A_HI);
						registry.register(HALF_PAVES_B_LO);
						registry.register(HALF_PAVES_B_HI);
						registry.register(HALF_PAVES_C_LO);
						registry.register(HALF_PAVES_C_HI);
						registry.register(HALF_PAVES_D_LO);
						registry.register(HALF_PAVES_D_HI);
						registry.register(HALF_PAVES_E_LO);
						registry.register(HALF_PAVES_E_HI);
						registry.register(HALF_PAVES_F_LO);
						registry.register(HALF_PAVES_F_HI);
						registry.register(HALF_PAVES_G_LO);
						registry.register(HALF_PAVES_G_HI);
						registry.register(HALF_PAVES_H_LO);
						registry.register(HALF_PAVES_H_HI);
					}
				}

				if(ModConfig.ENABLE_SLABS){
					registry.register(SLABS_A);
					registry.register(SLABS_B);
					registry.register(SLABS_C);
					registry.register(SLABS_D);
					registry.register(SLABS_E);
					registry.register(SLABS_F);
					registry.register(SLABS_G);
					registry.register(SLABS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(SLABS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(SLABS_VANILLA);
						registry.register(SLABS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(SLABS_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_SHORTS){
					registry.register(SHORTS_A);
					registry.register(SHORTS_B);
					registry.register(SHORTS_C);
					registry.register(SHORTS_D);
					registry.register(SHORTS_E);
					registry.register(SHORTS_F);
					registry.register(SHORTS_G);
					registry.register(SHORTS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(SHORTS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(SHORTS_VANILLA);
						registry.register(SHORTS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(SHORTS_CONCRETE);
					}			
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(HALF_SHORTS_A_LO);
						registry.register(HALF_SHORTS_A_HI);
						registry.register(HALF_SHORTS_B_LO);
						registry.register(HALF_SHORTS_B_HI);
						registry.register(HALF_SHORTS_C_LO);
						registry.register(HALF_SHORTS_C_HI);
						registry.register(HALF_SHORTS_D_LO);
						registry.register(HALF_SHORTS_D_HI);
						registry.register(HALF_SHORTS_E_LO);
						registry.register(HALF_SHORTS_E_HI);
						registry.register(HALF_SHORTS_F_LO);
						registry.register(HALF_SHORTS_F_HI);
						registry.register(HALF_SHORTS_G_LO);
						registry.register(HALF_SHORTS_G_HI);
						registry.register(HALF_SHORTS_H_LO);
						registry.register(HALF_SHORTS_H_HI);
					}
				}

				if(ModConfig.ENABLE_TILES){
					registry.register(TILES_A);
					registry.register(TILES_B);
					registry.register(TILES_C);
					registry.register(TILES_D);
					registry.register(TILES_E);
					registry.register(TILES_F);
					registry.register(TILES_G);
					registry.register(TILES_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(TILES_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(TILES_VANILLA);
						registry.register(TILES_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(TILES_CONCRETE);
					}			
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(HALF_TILES_A_LO);
						registry.register(HALF_TILES_A_HI);
						registry.register(HALF_TILES_B_LO);
						registry.register(HALF_TILES_B_HI);
						registry.register(HALF_TILES_C_LO);
						registry.register(HALF_TILES_C_HI);
						registry.register(HALF_TILES_D_LO);
						registry.register(HALF_TILES_D_HI);
						registry.register(HALF_TILES_E_LO);
						registry.register(HALF_TILES_E_HI);
						registry.register(HALF_TILES_F_LO);
						registry.register(HALF_TILES_F_HI);
						registry.register(HALF_TILES_G_LO);
						registry.register(HALF_TILES_G_HI);
						registry.register(HALF_TILES_H_LO);
						registry.register(HALF_TILES_H_HI);
					}
				}

				if(ModConfig.ENABLE_DEBOSSED){
					registry.register(DEBOSS_A);
					registry.register(DEBOSS_B);
					registry.register(DEBOSS_C);
					registry.register(DEBOSS_D);
					registry.register(DEBOSS_E);
					registry.register(DEBOSS_F);
					registry.register(DEBOSS_G);
					registry.register(DEBOSS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(DEBOSS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(DEBOSS_VANILLA);
						registry.register(DEBOSS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(DEBOSS_CONCRETE);
					}			
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(HALF_DEBOSS_A_LO);
						registry.register(HALF_DEBOSS_A_HI);
						registry.register(HALF_DEBOSS_B_LO);
						registry.register(HALF_DEBOSS_B_HI);
						registry.register(HALF_DEBOSS_C_LO);
						registry.register(HALF_DEBOSS_C_HI);
						registry.register(HALF_DEBOSS_D_LO);
						registry.register(HALF_DEBOSS_D_HI);
						registry.register(HALF_DEBOSS_E_LO);
						registry.register(HALF_DEBOSS_E_HI);
						registry.register(HALF_DEBOSS_F_LO);
						registry.register(HALF_DEBOSS_F_HI);
						registry.register(HALF_DEBOSS_G_LO);
						registry.register(HALF_DEBOSS_G_HI);
						registry.register(HALF_DEBOSS_H_LO);
						registry.register(HALF_DEBOSS_H_HI);
					}
				}

				if(ModConfig.ENABLE_FLOORS){
					registry.register(FLOORS_A);
					registry.register(FLOORS_B);
					registry.register(FLOORS_C);
					registry.register(FLOORS_D);
					registry.register(FLOORS_E);
					registry.register(FLOORS_F);
					registry.register(FLOORS_G);
					registry.register(FLOORS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(FLOORS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(FLOORS_VANILLA);
						registry.register(FLOORS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(FLOORS_CONCRETE);
					}			
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(HALF_FLOORS_A_LO);
						registry.register(HALF_FLOORS_A_HI);
						registry.register(HALF_FLOORS_B_LO);
						registry.register(HALF_FLOORS_B_HI);
						registry.register(HALF_FLOORS_C_LO);
						registry.register(HALF_FLOORS_C_HI);
						registry.register(HALF_FLOORS_D_LO);
						registry.register(HALF_FLOORS_D_HI);
						registry.register(HALF_FLOORS_E_LO);
						registry.register(HALF_FLOORS_E_HI);
						registry.register(HALF_FLOORS_F_LO);
						registry.register(HALF_FLOORS_F_HI);
						registry.register(HALF_FLOORS_G_LO);
						registry.register(HALF_FLOORS_G_HI);
						registry.register(HALF_FLOORS_H_LO);
						registry.register(HALF_FLOORS_H_HI);
					}
				}

				if(ModConfig.ENABLE_CARVED){
					registry.register(CARVED_A);
					registry.register(CARVED_B);
					registry.register(CARVED_C);
					registry.register(CARVED_D);
					registry.register(CARVED_E);
					registry.register(CARVED_F);
					registry.register(CARVED_G);
					registry.register(CARVED_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(CARVED_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(CARVED_VANILLA);
						registry.register(CARVED_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(CARVED_CONCRETE);
					}			
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(HALF_CARVED_A_LO);
						registry.register(HALF_CARVED_A_HI);
						registry.register(HALF_CARVED_B_LO);
						registry.register(HALF_CARVED_B_HI);
						registry.register(HALF_CARVED_C_LO);
						registry.register(HALF_CARVED_C_HI);
						registry.register(HALF_CARVED_D_LO);
						registry.register(HALF_CARVED_D_HI);
						registry.register(HALF_CARVED_E_LO);
						registry.register(HALF_CARVED_E_HI);
						registry.register(HALF_CARVED_F_LO);
						registry.register(HALF_CARVED_F_HI);
						registry.register(HALF_CARVED_G_LO);
						registry.register(HALF_CARVED_G_HI);
						registry.register(HALF_CARVED_H_LO);
						registry.register(HALF_CARVED_H_HI);
					}
				}
			}

			if(ModConfig.ENABLE_SCULPT){
				if(ModConfig.ENABLE_SEGMENTED){
					registry.register(SEGMENTED_A);
					registry.register(SEGMENTED_B);
					registry.register(SEGMENTED_C);
					registry.register(SEGMENTED_D);
					registry.register(SEGMENTED_E);
					registry.register(SEGMENTED_F);
					registry.register(SEGMENTED_G);
					registry.register(SEGMENTED_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(SEGMENTED_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(SEGMENTED_VANILLA);
						registry.register(SEGMENTED_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(SEGMENTED_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_FOUNTAINS){
					registry.register(FOUNTAINS_A);
					registry.register(FOUNTAINS_B);
					registry.register(FOUNTAINS_C);
					registry.register(FOUNTAINS_D);
					registry.register(FOUNTAINS_E);
					registry.register(FOUNTAINS_F);
					registry.register(FOUNTAINS_G);
					registry.register(FOUNTAINS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(FOUNTAINS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(FOUNTAINS_VANILLA);
						registry.register(FOUNTAINS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(FOUNTAINS_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_LANTERNS){
					registry.register(LANTERNS_A);
					registry.register(LANTERNS_B);
					registry.register(LANTERNS_C);
					registry.register(LANTERNS_D);
					registry.register(LANTERNS_E);
					registry.register(LANTERNS_F);
					registry.register(LANTERNS_G);
					registry.register(LANTERNS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(LANTERNS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(LANTERNS_VANILLA);
						registry.register(LANTERNS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(LANTERNS_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_PEDESTALS){
					registry.register(PEDESTALS_A);
					registry.register(PEDESTALS_B);
					registry.register(PEDESTALS_C);
					registry.register(PEDESTALS_D);
					registry.register(PEDESTALS_E);
					registry.register(PEDESTALS_F);
					registry.register(PEDESTALS_G);
					registry.register(PEDESTALS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(PEDESTALS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(PEDESTALS_VANILLA);
						registry.register(PEDESTALS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(PEDESTALS_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_TETRAS){
					registry.register(TETRAS_A);
					registry.register(TETRAS_B);
					registry.register(TETRAS_C);
					registry.register(TETRAS_D);
					registry.register(TETRAS_E);
					registry.register(TETRAS_F);
					registry.register(TETRAS_G);
					registry.register(TETRAS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(TETRAS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(TETRAS_VANILLA);
						registry.register(TETRAS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(TETRAS_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_COLUMNS){
					registry.register(COLUMNS_A);
					registry.register(COLUMNS_B);
					registry.register(COLUMNS_C);
					registry.register(COLUMNS_D);
					registry.register(COLUMNS_E);
					registry.register(COLUMNS_F);
					registry.register(COLUMNS_G);
					registry.register(COLUMNS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(COLUMNS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(COLUMNS_VANILLA);
						registry.register(COLUMNS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(COLUMNS_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_DORICS){
					registry.register(DORICS_A);
					registry.register(DORICS_B);
					registry.register(DORICS_C);
					registry.register(DORICS_D);
					registry.register(DORICS_E);
					registry.register(DORICS_F);
					registry.register(DORICS_G);
					registry.register(DORICS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(DORICS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(DORICS_VANILLA);
						registry.register(DORICS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(DORICS_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_FANCY){
					registry.register(FANCYS_A);
					registry.register(FANCYS_B);
					registry.register(FANCYS_C);
					registry.register(FANCYS_D);
					registry.register(FANCYS_E);
					registry.register(FANCYS_F);
					registry.register(FANCYS_G);
					registry.register(FANCYS_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(FANCYS_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(FANCYS_VANILLA);
						registry.register(FANCYS_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(FANCYS_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_STELE){
					registry.register(STELES_A);
					registry.register(STELES_B);
					registry.register(STELES_C);
					registry.register(STELES_D);
					registry.register(STELES_E);
					registry.register(STELES_F);
					registry.register(STELES_G);
					registry.register(STELES_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(STELES_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(STELES_VANILLA);
						registry.register(STELES_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(STELES_CONCRETE);
					}			
				}

				if(ModConfig.ENABLE_TWISTED){
					registry.register(TWISTED_A);
					registry.register(TWISTED_B);
					registry.register(TWISTED_C);
					registry.register(TWISTED_D);
					registry.register(TWISTED_E);
					registry.register(TWISTED_F);
					registry.register(TWISTED_G);
					registry.register(TWISTED_H);
					if(ModConfig.ENABLE_CLAY){
						registry.register(TWISTED_CLAY);
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(TWISTED_VANILLA);
						registry.register(TWISTED_VANILLA2);
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(TWISTED_CONCRETE);
					}			
				}
			}

		}

		// register the itemblock
		@SubscribeEvent
		public static void registerItemBlock(final RegistryEvent.Register<Item> event) {
			final IForgeRegistry<Item> registry = event.getRegistry();

			registry.register(new PoweredMetaIB(MACHINES, EnumMachines.getNames()).setRegistryName(MACHINES.getRegistryName()));

			registry.register(new BaseMetaIB(ROCKS_A, EnumRocksA.getNames()).setRegistryName(ROCKS_A.getRegistryName()));
			registry.register(new BaseMetaIB(ROCKS_B, EnumRocksB.getNames()).setRegistryName(ROCKS_B.getRegistryName()));
			registry.register(new BaseMetaIB(ROCKS_C, EnumRocksC.getNames()).setRegistryName(ROCKS_C.getRegistryName()));
			registry.register(new BaseMetaIB(ROCKS_D, EnumRocksD.getNames()).setRegistryName(ROCKS_D.getRegistryName()));
			registry.register(new BaseMetaIB(ROCKS_E, EnumRocksE.getNames()).setRegistryName(ROCKS_E.getRegistryName()));
			registry.register(new BaseMetaIB(ROCKS_F, EnumRocksF.getNames()).setRegistryName(ROCKS_F.getRegistryName()));
			registry.register(new BaseMetaIB(ROCKS_G, EnumRocksG.getNames()).setRegistryName(ROCKS_G.getRegistryName()));
			registry.register(new BaseMetaIB(ROCKS_H, EnumRocksH.getNames()).setRegistryName(ROCKS_H.getRegistryName()));

			registry.register(new BaseMetaIB(BLOCKS_A, EnumRocksA.getNames()).setRegistryName(BLOCKS_A.getRegistryName()));
			registry.register(new BaseMetaIB(BLOCKS_B, EnumRocksB.getNames()).setRegistryName(BLOCKS_B.getRegistryName()));
			registry.register(new BaseMetaIB(BLOCKS_C, EnumRocksC.getNames()).setRegistryName(BLOCKS_C.getRegistryName()));
			registry.register(new BaseMetaIB(BLOCKS_D, EnumRocksD.getNames()).setRegistryName(BLOCKS_D.getRegistryName()));
			registry.register(new BaseMetaIB(BLOCKS_E, EnumRocksE.getNames()).setRegistryName(BLOCKS_E.getRegistryName()));
			registry.register(new BaseMetaIB(BLOCKS_F, EnumRocksF.getNames()).setRegistryName(BLOCKS_F.getRegistryName()));
			registry.register(new BaseMetaIB(BLOCKS_G, EnumRocksG.getNames()).setRegistryName(BLOCKS_G.getRegistryName()));
			registry.register(new BaseMetaIB(BLOCKS_H, EnumRocksH.getNames()).setRegistryName(BLOCKS_H.getRegistryName()));
			registry.register(new BaseMetaIB(BLOCKS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(BLOCKS_VANILLA2.getRegistryName()));

			if(ModConfig.ENABLE_HALF_SLAB){
				registry.register(new HalfSlabs_IB(HALF_BLOCKS_A_LO, HALF_BLOCKS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_BLOCKS_A_LO.getRegistryName()));
				registry.register(new BaseMetaIB(HALF_BLOCKS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_BLOCKS_A_HI.getRegistryName()));
				registry.register(new HalfSlabs_IB(HALF_BLOCKS_B_LO, HALF_BLOCKS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_BLOCKS_B_LO.getRegistryName()));
				registry.register(new BaseMetaIB(HALF_BLOCKS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_BLOCKS_B_HI.getRegistryName()));
				registry.register(new HalfSlabs_IB(HALF_BLOCKS_C_LO, HALF_BLOCKS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_BLOCKS_C_LO.getRegistryName()));
				registry.register(new BaseMetaIB(HALF_BLOCKS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_BLOCKS_C_HI.getRegistryName()));
				registry.register(new HalfSlabs_IB(HALF_BLOCKS_D_LO, HALF_BLOCKS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_BLOCKS_D_LO.getRegistryName()));
				registry.register(new BaseMetaIB(HALF_BLOCKS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_BLOCKS_D_HI.getRegistryName()));
				registry.register(new HalfSlabs_IB(HALF_BLOCKS_E_LO, HALF_BLOCKS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_BLOCKS_E_LO.getRegistryName()));
				registry.register(new BaseMetaIB(HALF_BLOCKS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_BLOCKS_E_HI.getRegistryName()));
				registry.register(new HalfSlabs_IB(HALF_BLOCKS_F_LO, HALF_BLOCKS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_BLOCKS_F_LO.getRegistryName()));
				registry.register(new BaseMetaIB(HALF_BLOCKS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_BLOCKS_F_HI.getRegistryName()));
				registry.register(new HalfSlabs_IB(HALF_BLOCKS_G_LO, HALF_BLOCKS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_BLOCKS_G_LO.getRegistryName()));
				registry.register(new BaseMetaIB(HALF_BLOCKS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_BLOCKS_G_HI.getRegistryName()));
				registry.register(new HalfSlabs_IB(HALF_BLOCKS_H_LO, HALF_BLOCKS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_BLOCKS_H_LO.getRegistryName()));
				registry.register(new BaseMetaIB(HALF_BLOCKS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_BLOCKS_H_HI.getRegistryName()));
			}

			if(ModConfig.ENABLE_DECO){
				if(ModConfig.ENABLE_POLISHED){
					registry.register(new BaseMetaIB(POLISHED_A, EnumRocksA.getNames()).setRegistryName(POLISHED_A.getRegistryName()));
					registry.register(new BaseMetaIB(POLISHED_B, EnumRocksB.getNames()).setRegistryName(POLISHED_B.getRegistryName()));
					registry.register(new BaseMetaIB(POLISHED_C, EnumRocksC.getNames()).setRegistryName(POLISHED_C.getRegistryName()));
					registry.register(new BaseMetaIB(POLISHED_D, EnumRocksD.getNames()).setRegistryName(POLISHED_D.getRegistryName()));
					registry.register(new BaseMetaIB(POLISHED_E, EnumRocksE.getNames()).setRegistryName(POLISHED_E.getRegistryName()));
					registry.register(new BaseMetaIB(POLISHED_F, EnumRocksF.getNames()).setRegistryName(POLISHED_F.getRegistryName()));
					registry.register(new BaseMetaIB(POLISHED_G, EnumRocksG.getNames()).setRegistryName(POLISHED_G.getRegistryName()));
					registry.register(new BaseMetaIB(POLISHED_H, EnumRocksH.getNames()).setRegistryName(POLISHED_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(POLISHED_CLAY, EnumClay.getNames()).setRegistryName(POLISHED_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(POLISHED_VANILLA, EnumVanilla.getNames()).setRegistryName(POLISHED_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(POLISHED_VANILLA2, EnumVanilla2.getNames()).setRegistryName(POLISHED_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(POLISHED_CONCRETE, EnumConcrete.getNames()).setRegistryName(POLISHED_CONCRETE.getRegistryName()));
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(new HalfSlabs_IB(HALF_POLISHED_A_LO, HALF_POLISHED_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_POLISHED_A_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_POLISHED_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_POLISHED_A_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_POLISHED_B_LO, HALF_POLISHED_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_POLISHED_B_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_POLISHED_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_POLISHED_B_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_POLISHED_C_LO, HALF_POLISHED_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_POLISHED_C_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_POLISHED_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_POLISHED_C_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_POLISHED_D_LO, HALF_POLISHED_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_POLISHED_D_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_POLISHED_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_POLISHED_D_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_POLISHED_E_LO, HALF_POLISHED_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_POLISHED_E_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_POLISHED_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_POLISHED_E_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_POLISHED_F_LO, HALF_POLISHED_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_POLISHED_F_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_POLISHED_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_POLISHED_F_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_POLISHED_G_LO, HALF_POLISHED_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_POLISHED_G_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_POLISHED_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_POLISHED_G_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_POLISHED_H_LO, HALF_POLISHED_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_POLISHED_H_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_POLISHED_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_POLISHED_H_HI.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_BRICKS){
					registry.register(new BaseMetaIB(BRICKS_A, EnumRocksA.getNames()).setRegistryName(BRICKS_A.getRegistryName()));
					registry.register(new BaseMetaIB(BRICKS_B, EnumRocksB.getNames()).setRegistryName(BRICKS_B.getRegistryName()));
					registry.register(new BaseMetaIB(BRICKS_C, EnumRocksC.getNames()).setRegistryName(BRICKS_C.getRegistryName()));
					registry.register(new BaseMetaIB(BRICKS_D, EnumRocksD.getNames()).setRegistryName(BRICKS_D.getRegistryName()));
					registry.register(new BaseMetaIB(BRICKS_E, EnumRocksE.getNames()).setRegistryName(BRICKS_E.getRegistryName()));
					registry.register(new BaseMetaIB(BRICKS_F, EnumRocksF.getNames()).setRegistryName(BRICKS_F.getRegistryName()));
					registry.register(new BaseMetaIB(BRICKS_G, EnumRocksG.getNames()).setRegistryName(BRICKS_G.getRegistryName()));
					registry.register(new BaseMetaIB(BRICKS_H, EnumRocksH.getNames()).setRegistryName(BRICKS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(BRICKS_CLAY, EnumClay.getNames()).setRegistryName(BRICKS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(BRICKS_VANILLA, EnumVanilla.getNames()).setRegistryName(BRICKS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(BRICKS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(BRICKS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(BRICKS_CONCRETE, EnumConcrete.getNames()).setRegistryName(BRICKS_CONCRETE.getRegistryName()));
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(new HalfSlabs_IB(HALF_BRICKS_A_LO, HALF_BRICKS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_BRICKS_A_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_BRICKS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_BRICKS_A_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_BRICKS_B_LO, HALF_BRICKS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_BRICKS_B_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_BRICKS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_BRICKS_B_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_BRICKS_C_LO, HALF_BRICKS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_BRICKS_C_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_BRICKS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_BRICKS_C_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_BRICKS_D_LO, HALF_BRICKS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_BRICKS_D_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_BRICKS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_BRICKS_D_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_BRICKS_E_LO, HALF_BRICKS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_BRICKS_E_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_BRICKS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_BRICKS_E_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_BRICKS_F_LO, HALF_BRICKS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_BRICKS_F_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_BRICKS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_BRICKS_F_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_BRICKS_G_LO, HALF_BRICKS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_BRICKS_G_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_BRICKS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_BRICKS_G_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_BRICKS_H_LO, HALF_BRICKS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_BRICKS_H_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_BRICKS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_BRICKS_H_HI.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_PAVES){
					registry.register(new BaseMetaIB(PAVES_A, EnumRocksA.getNames()).setRegistryName(PAVES_A.getRegistryName()));
					registry.register(new BaseMetaIB(PAVES_B, EnumRocksB.getNames()).setRegistryName(PAVES_B.getRegistryName()));
					registry.register(new BaseMetaIB(PAVES_C, EnumRocksC.getNames()).setRegistryName(PAVES_C.getRegistryName()));
					registry.register(new BaseMetaIB(PAVES_D, EnumRocksD.getNames()).setRegistryName(PAVES_D.getRegistryName()));
					registry.register(new BaseMetaIB(PAVES_E, EnumRocksE.getNames()).setRegistryName(PAVES_E.getRegistryName()));
					registry.register(new BaseMetaIB(PAVES_F, EnumRocksF.getNames()).setRegistryName(PAVES_F.getRegistryName()));
					registry.register(new BaseMetaIB(PAVES_G, EnumRocksG.getNames()).setRegistryName(PAVES_G.getRegistryName()));
					registry.register(new BaseMetaIB(PAVES_H, EnumRocksH.getNames()).setRegistryName(PAVES_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(PAVES_CLAY, EnumClay.getNames()).setRegistryName(PAVES_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(PAVES_VANILLA, EnumVanilla.getNames()).setRegistryName(PAVES_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(PAVES_VANILLA2, EnumVanilla2.getNames()).setRegistryName(PAVES_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(PAVES_CONCRETE, EnumConcrete.getNames()).setRegistryName(PAVES_CONCRETE.getRegistryName()));
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(new HalfSlabs_IB(HALF_PAVES_A_LO, HALF_PAVES_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_PAVES_A_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_PAVES_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_PAVES_A_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_PAVES_B_LO, HALF_PAVES_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_PAVES_B_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_PAVES_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_PAVES_B_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_PAVES_C_LO, HALF_PAVES_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_PAVES_C_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_PAVES_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_PAVES_C_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_PAVES_D_LO, HALF_PAVES_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_PAVES_D_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_PAVES_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_PAVES_D_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_PAVES_E_LO, HALF_PAVES_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_PAVES_E_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_PAVES_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_PAVES_E_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_PAVES_F_LO, HALF_PAVES_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_PAVES_F_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_PAVES_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_PAVES_F_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_PAVES_G_LO, HALF_PAVES_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_PAVES_G_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_PAVES_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_PAVES_G_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_PAVES_H_LO, HALF_PAVES_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_PAVES_H_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_PAVES_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_PAVES_H_HI.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_SLABS){
					registry.register(new BaseMetaIB(SLABS_A, EnumRocksA.getNames()).setRegistryName(SLABS_A.getRegistryName()));
					registry.register(new BaseMetaIB(SLABS_B, EnumRocksB.getNames()).setRegistryName(SLABS_B.getRegistryName()));
					registry.register(new BaseMetaIB(SLABS_C, EnumRocksC.getNames()).setRegistryName(SLABS_C.getRegistryName()));
					registry.register(new BaseMetaIB(SLABS_D, EnumRocksD.getNames()).setRegistryName(SLABS_D.getRegistryName()));
					registry.register(new BaseMetaIB(SLABS_E, EnumRocksE.getNames()).setRegistryName(SLABS_E.getRegistryName()));
					registry.register(new BaseMetaIB(SLABS_F, EnumRocksF.getNames()).setRegistryName(SLABS_F.getRegistryName()));
					registry.register(new BaseMetaIB(SLABS_G, EnumRocksG.getNames()).setRegistryName(SLABS_G.getRegistryName()));
					registry.register(new BaseMetaIB(SLABS_H, EnumRocksH.getNames()).setRegistryName(SLABS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(SLABS_CLAY, EnumClay.getNames()).setRegistryName(SLABS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(SLABS_VANILLA, EnumVanilla.getNames()).setRegistryName(SLABS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(SLABS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(SLABS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(SLABS_CONCRETE, EnumConcrete.getNames()).setRegistryName(SLABS_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_SHORTS){
					registry.register(new BaseMetaIB(SHORTS_A, EnumRocksA.getNames()).setRegistryName(SHORTS_A.getRegistryName()));
					registry.register(new BaseMetaIB(SHORTS_B, EnumRocksB.getNames()).setRegistryName(SHORTS_B.getRegistryName()));
					registry.register(new BaseMetaIB(SHORTS_C, EnumRocksC.getNames()).setRegistryName(SHORTS_C.getRegistryName()));
					registry.register(new BaseMetaIB(SHORTS_D, EnumRocksD.getNames()).setRegistryName(SHORTS_D.getRegistryName()));
					registry.register(new BaseMetaIB(SHORTS_E, EnumRocksE.getNames()).setRegistryName(SHORTS_E.getRegistryName()));
					registry.register(new BaseMetaIB(SHORTS_F, EnumRocksF.getNames()).setRegistryName(SHORTS_F.getRegistryName()));
					registry.register(new BaseMetaIB(SHORTS_G, EnumRocksG.getNames()).setRegistryName(SHORTS_G.getRegistryName()));
					registry.register(new BaseMetaIB(SHORTS_H, EnumRocksH.getNames()).setRegistryName(SHORTS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(SHORTS_CLAY, EnumClay.getNames()).setRegistryName(SHORTS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(SHORTS_VANILLA, EnumVanilla.getNames()).setRegistryName(SHORTS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(SHORTS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(SHORTS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(SHORTS_CONCRETE, EnumConcrete.getNames()).setRegistryName(SHORTS_CONCRETE.getRegistryName()));
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(new HalfSlabs_IB(HALF_SHORTS_A_LO, HALF_SHORTS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_SHORTS_A_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_SHORTS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_SHORTS_A_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_SHORTS_B_LO, HALF_SHORTS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_SHORTS_B_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_SHORTS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_SHORTS_B_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_SHORTS_C_LO, HALF_SHORTS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_SHORTS_C_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_SHORTS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_SHORTS_C_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_SHORTS_D_LO, HALF_SHORTS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_SHORTS_D_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_SHORTS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_SHORTS_D_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_SHORTS_E_LO, HALF_SHORTS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_SHORTS_E_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_SHORTS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_SHORTS_E_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_SHORTS_F_LO, HALF_SHORTS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_SHORTS_F_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_SHORTS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_SHORTS_F_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_SHORTS_G_LO, HALF_SHORTS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_SHORTS_G_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_SHORTS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_SHORTS_G_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_SHORTS_H_LO, HALF_SHORTS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_SHORTS_H_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_SHORTS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_SHORTS_H_HI.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_TILES){
					registry.register(new BaseMetaIB(TILES_A, EnumRocksA.getNames()).setRegistryName(TILES_A.getRegistryName()));
					registry.register(new BaseMetaIB(TILES_B, EnumRocksB.getNames()).setRegistryName(TILES_B.getRegistryName()));
					registry.register(new BaseMetaIB(TILES_C, EnumRocksC.getNames()).setRegistryName(TILES_C.getRegistryName()));
					registry.register(new BaseMetaIB(TILES_D, EnumRocksD.getNames()).setRegistryName(TILES_D.getRegistryName()));
					registry.register(new BaseMetaIB(TILES_E, EnumRocksE.getNames()).setRegistryName(TILES_E.getRegistryName()));
					registry.register(new BaseMetaIB(TILES_F, EnumRocksF.getNames()).setRegistryName(TILES_F.getRegistryName()));
					registry.register(new BaseMetaIB(TILES_G, EnumRocksG.getNames()).setRegistryName(TILES_G.getRegistryName()));
					registry.register(new BaseMetaIB(TILES_H, EnumRocksH.getNames()).setRegistryName(TILES_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(TILES_CLAY, EnumClay.getNames()).setRegistryName(TILES_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(TILES_VANILLA, EnumVanilla.getNames()).setRegistryName(TILES_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(TILES_VANILLA2, EnumVanilla2.getNames()).setRegistryName(TILES_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(TILES_CONCRETE, EnumConcrete.getNames()).setRegistryName(TILES_CONCRETE.getRegistryName()));
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(new HalfSlabs_IB(HALF_TILES_A_LO, HALF_TILES_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_TILES_A_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_TILES_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_TILES_A_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_TILES_B_LO, HALF_TILES_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_TILES_B_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_TILES_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_TILES_B_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_TILES_C_LO, HALF_TILES_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_TILES_C_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_TILES_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_TILES_C_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_TILES_D_LO, HALF_TILES_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_TILES_D_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_TILES_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_TILES_D_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_TILES_E_LO, HALF_TILES_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_TILES_E_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_TILES_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_TILES_E_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_TILES_F_LO, HALF_TILES_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_TILES_F_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_TILES_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_TILES_F_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_TILES_G_LO, HALF_TILES_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_TILES_G_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_TILES_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_TILES_G_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_TILES_H_LO, HALF_TILES_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_TILES_H_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_TILES_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_TILES_H_HI.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_DEBOSSED){
					registry.register(new BaseMetaIB(DEBOSS_A, EnumRocksA.getNames()).setRegistryName(DEBOSS_A.getRegistryName()));
					registry.register(new BaseMetaIB(DEBOSS_B, EnumRocksB.getNames()).setRegistryName(DEBOSS_B.getRegistryName()));
					registry.register(new BaseMetaIB(DEBOSS_C, EnumRocksC.getNames()).setRegistryName(DEBOSS_C.getRegistryName()));
					registry.register(new BaseMetaIB(DEBOSS_D, EnumRocksD.getNames()).setRegistryName(DEBOSS_D.getRegistryName()));
					registry.register(new BaseMetaIB(DEBOSS_E, EnumRocksE.getNames()).setRegistryName(DEBOSS_E.getRegistryName()));
					registry.register(new BaseMetaIB(DEBOSS_F, EnumRocksF.getNames()).setRegistryName(DEBOSS_F.getRegistryName()));
					registry.register(new BaseMetaIB(DEBOSS_G, EnumRocksG.getNames()).setRegistryName(DEBOSS_G.getRegistryName()));
					registry.register(new BaseMetaIB(DEBOSS_H, EnumRocksH.getNames()).setRegistryName(DEBOSS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(DEBOSS_CLAY, EnumClay.getNames()).setRegistryName(DEBOSS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(DEBOSS_VANILLA, EnumVanilla.getNames()).setRegistryName(DEBOSS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(DEBOSS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(DEBOSS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(DEBOSS_CONCRETE, EnumConcrete.getNames()).setRegistryName(DEBOSS_CONCRETE.getRegistryName()));
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(new HalfSlabs_IB(HALF_DEBOSS_A_LO, HALF_DEBOSS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_DEBOSS_A_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_DEBOSS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_DEBOSS_A_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_DEBOSS_B_LO, HALF_DEBOSS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_DEBOSS_B_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_DEBOSS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_DEBOSS_B_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_DEBOSS_C_LO, HALF_DEBOSS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_DEBOSS_C_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_DEBOSS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_DEBOSS_C_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_DEBOSS_D_LO, HALF_DEBOSS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_DEBOSS_D_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_DEBOSS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_DEBOSS_D_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_DEBOSS_E_LO, HALF_DEBOSS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_DEBOSS_E_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_DEBOSS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_DEBOSS_E_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_DEBOSS_F_LO, HALF_DEBOSS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_DEBOSS_F_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_DEBOSS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_DEBOSS_F_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_DEBOSS_G_LO, HALF_DEBOSS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_DEBOSS_G_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_DEBOSS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_DEBOSS_G_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_DEBOSS_H_LO, HALF_DEBOSS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_DEBOSS_H_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_DEBOSS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_DEBOSS_H_HI.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_FLOORS){
					registry.register(new BaseMetaIB(FLOORS_A, EnumRocksA.getNames()).setRegistryName(FLOORS_A.getRegistryName()));
					registry.register(new BaseMetaIB(FLOORS_B, EnumRocksB.getNames()).setRegistryName(FLOORS_B.getRegistryName()));
					registry.register(new BaseMetaIB(FLOORS_C, EnumRocksC.getNames()).setRegistryName(FLOORS_C.getRegistryName()));
					registry.register(new BaseMetaIB(FLOORS_D, EnumRocksD.getNames()).setRegistryName(FLOORS_D.getRegistryName()));
					registry.register(new BaseMetaIB(FLOORS_E, EnumRocksE.getNames()).setRegistryName(FLOORS_E.getRegistryName()));
					registry.register(new BaseMetaIB(FLOORS_F, EnumRocksF.getNames()).setRegistryName(FLOORS_F.getRegistryName()));
					registry.register(new BaseMetaIB(FLOORS_G, EnumRocksG.getNames()).setRegistryName(FLOORS_G.getRegistryName()));
					registry.register(new BaseMetaIB(FLOORS_H, EnumRocksH.getNames()).setRegistryName(FLOORS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(FLOORS_CLAY, EnumClay.getNames()).setRegistryName(FLOORS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(FLOORS_VANILLA, EnumVanilla.getNames()).setRegistryName(FLOORS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(FLOORS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(FLOORS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(FLOORS_CONCRETE, EnumConcrete.getNames()).setRegistryName(FLOORS_CONCRETE.getRegistryName()));
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(new HalfSlabs_IB(HALF_FLOORS_A_LO, HALF_FLOORS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_FLOORS_A_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_FLOORS_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_FLOORS_A_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_FLOORS_B_LO, HALF_FLOORS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_FLOORS_B_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_FLOORS_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_FLOORS_B_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_FLOORS_C_LO, HALF_FLOORS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_FLOORS_C_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_FLOORS_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_FLOORS_C_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_FLOORS_D_LO, HALF_FLOORS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_FLOORS_D_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_FLOORS_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_FLOORS_D_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_FLOORS_E_LO, HALF_FLOORS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_FLOORS_E_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_FLOORS_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_FLOORS_E_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_FLOORS_F_LO, HALF_FLOORS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_FLOORS_F_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_FLOORS_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_FLOORS_F_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_FLOORS_G_LO, HALF_FLOORS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_FLOORS_G_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_FLOORS_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_FLOORS_G_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_FLOORS_H_LO, HALF_FLOORS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_FLOORS_H_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_FLOORS_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_FLOORS_H_HI.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_CARVED){
					registry.register(new BaseMetaIB(CARVED_A, EnumRocksA.getNames()).setRegistryName(CARVED_A.getRegistryName()));
					registry.register(new BaseMetaIB(CARVED_B, EnumRocksB.getNames()).setRegistryName(CARVED_B.getRegistryName()));
					registry.register(new BaseMetaIB(CARVED_C, EnumRocksC.getNames()).setRegistryName(CARVED_C.getRegistryName()));
					registry.register(new BaseMetaIB(CARVED_D, EnumRocksD.getNames()).setRegistryName(CARVED_D.getRegistryName()));
					registry.register(new BaseMetaIB(CARVED_E, EnumRocksE.getNames()).setRegistryName(CARVED_E.getRegistryName()));
					registry.register(new BaseMetaIB(CARVED_F, EnumRocksF.getNames()).setRegistryName(CARVED_F.getRegistryName()));
					registry.register(new BaseMetaIB(CARVED_G, EnumRocksG.getNames()).setRegistryName(CARVED_G.getRegistryName()));
					registry.register(new BaseMetaIB(CARVED_H, EnumRocksH.getNames()).setRegistryName(CARVED_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(CARVED_CLAY, EnumClay.getNames()).setRegistryName(CARVED_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(CARVED_VANILLA, EnumVanilla.getNames()).setRegistryName(CARVED_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(CARVED_VANILLA2, EnumVanilla2.getNames()).setRegistryName(CARVED_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(CARVED_CONCRETE, EnumConcrete.getNames()).setRegistryName(CARVED_CONCRETE.getRegistryName()));
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						registry.register(new HalfSlabs_IB(HALF_CARVED_A_LO, HALF_CARVED_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_CARVED_A_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_CARVED_A_HI, EnumRocksA.getNames()).setRegistryName(HALF_CARVED_A_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_CARVED_B_LO, HALF_CARVED_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_CARVED_B_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_CARVED_B_HI, EnumRocksB.getNames()).setRegistryName(HALF_CARVED_B_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_CARVED_C_LO, HALF_CARVED_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_CARVED_C_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_CARVED_C_HI, EnumRocksC.getNames()).setRegistryName(HALF_CARVED_C_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_CARVED_D_LO, HALF_CARVED_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_CARVED_D_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_CARVED_D_HI, EnumRocksD.getNames()).setRegistryName(HALF_CARVED_D_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_CARVED_E_LO, HALF_CARVED_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_CARVED_E_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_CARVED_E_HI, EnumRocksE.getNames()).setRegistryName(HALF_CARVED_E_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_CARVED_F_LO, HALF_CARVED_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_CARVED_F_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_CARVED_F_HI, EnumRocksF.getNames()).setRegistryName(HALF_CARVED_F_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_CARVED_G_LO, HALF_CARVED_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_CARVED_G_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_CARVED_G_HI, EnumRocksG.getNames()).setRegistryName(HALF_CARVED_G_HI.getRegistryName()));
						registry.register(new HalfSlabs_IB(HALF_CARVED_H_LO, HALF_CARVED_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_CARVED_H_LO.getRegistryName()));
						registry.register(new BaseMetaIB(HALF_CARVED_H_HI, EnumRocksH.getNames()).setRegistryName(HALF_CARVED_H_HI.getRegistryName()));
					}
				}
			}

			if(ModConfig.ENABLE_SCULPT){
				if(ModConfig.ENABLE_SEGMENTED){
					registry.register(new BaseMetaIB(SEGMENTED_A, EnumRocksA.getNames()).setRegistryName(SEGMENTED_A.getRegistryName()));
					registry.register(new BaseMetaIB(SEGMENTED_B, EnumRocksB.getNames()).setRegistryName(SEGMENTED_B.getRegistryName()));
					registry.register(new BaseMetaIB(SEGMENTED_C, EnumRocksC.getNames()).setRegistryName(SEGMENTED_C.getRegistryName()));
					registry.register(new BaseMetaIB(SEGMENTED_D, EnumRocksD.getNames()).setRegistryName(SEGMENTED_D.getRegistryName()));
					registry.register(new BaseMetaIB(SEGMENTED_E, EnumRocksE.getNames()).setRegistryName(SEGMENTED_E.getRegistryName()));
					registry.register(new BaseMetaIB(SEGMENTED_F, EnumRocksF.getNames()).setRegistryName(SEGMENTED_F.getRegistryName()));
					registry.register(new BaseMetaIB(SEGMENTED_G, EnumRocksG.getNames()).setRegistryName(SEGMENTED_G.getRegistryName()));
					registry.register(new BaseMetaIB(SEGMENTED_H, EnumRocksH.getNames()).setRegistryName(SEGMENTED_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(SEGMENTED_CLAY, EnumClay.getNames()).setRegistryName(SEGMENTED_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(SEGMENTED_VANILLA, EnumVanilla.getNames()).setRegistryName(SEGMENTED_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(SEGMENTED_VANILLA2, EnumVanilla2.getNames()).setRegistryName(SEGMENTED_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(SEGMENTED_CONCRETE, EnumConcrete.getNames()).setRegistryName(SEGMENTED_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_FOUNTAINS){
					registry.register(new BaseMetaIB(FOUNTAINS_A, EnumRocksA.getNames()).setRegistryName(FOUNTAINS_A.getRegistryName()));
					registry.register(new BaseMetaIB(FOUNTAINS_B, EnumRocksB.getNames()).setRegistryName(FOUNTAINS_B.getRegistryName()));
					registry.register(new BaseMetaIB(FOUNTAINS_C, EnumRocksC.getNames()).setRegistryName(FOUNTAINS_C.getRegistryName()));
					registry.register(new BaseMetaIB(FOUNTAINS_D, EnumRocksD.getNames()).setRegistryName(FOUNTAINS_D.getRegistryName()));
					registry.register(new BaseMetaIB(FOUNTAINS_E, EnumRocksE.getNames()).setRegistryName(FOUNTAINS_E.getRegistryName()));
					registry.register(new BaseMetaIB(FOUNTAINS_F, EnumRocksF.getNames()).setRegistryName(FOUNTAINS_F.getRegistryName()));
					registry.register(new BaseMetaIB(FOUNTAINS_G, EnumRocksG.getNames()).setRegistryName(FOUNTAINS_G.getRegistryName()));
					registry.register(new BaseMetaIB(FOUNTAINS_H, EnumRocksH.getNames()).setRegistryName(FOUNTAINS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(FOUNTAINS_CLAY, EnumClay.getNames()).setRegistryName(FOUNTAINS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(FOUNTAINS_VANILLA, EnumVanilla.getNames()).setRegistryName(FOUNTAINS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(FOUNTAINS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(FOUNTAINS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(FOUNTAINS_CONCRETE, EnumConcrete.getNames()).setRegistryName(FOUNTAINS_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_LANTERNS){
					registry.register(new BaseMetaIB(LANTERNS_A, EnumRocksA.getNames()).setRegistryName(LANTERNS_A.getRegistryName()));
					registry.register(new BaseMetaIB(LANTERNS_B, EnumRocksB.getNames()).setRegistryName(LANTERNS_B.getRegistryName()));
					registry.register(new BaseMetaIB(LANTERNS_C, EnumRocksC.getNames()).setRegistryName(LANTERNS_C.getRegistryName()));
					registry.register(new BaseMetaIB(LANTERNS_D, EnumRocksD.getNames()).setRegistryName(LANTERNS_D.getRegistryName()));
					registry.register(new BaseMetaIB(LANTERNS_E, EnumRocksE.getNames()).setRegistryName(LANTERNS_E.getRegistryName()));
					registry.register(new BaseMetaIB(LANTERNS_F, EnumRocksF.getNames()).setRegistryName(LANTERNS_F.getRegistryName()));
					registry.register(new BaseMetaIB(LANTERNS_G, EnumRocksG.getNames()).setRegistryName(LANTERNS_G.getRegistryName()));
					registry.register(new BaseMetaIB(LANTERNS_H, EnumRocksH.getNames()).setRegistryName(LANTERNS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(LANTERNS_CLAY, EnumClay.getNames()).setRegistryName(LANTERNS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(LANTERNS_VANILLA, EnumVanilla.getNames()).setRegistryName(LANTERNS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(LANTERNS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(LANTERNS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(LANTERNS_CONCRETE, EnumConcrete.getNames()).setRegistryName(LANTERNS_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_PEDESTALS){
					registry.register(new BaseMetaIB(PEDESTALS_A, EnumRocksA.getNames()).setRegistryName(PEDESTALS_A.getRegistryName()));
					registry.register(new BaseMetaIB(PEDESTALS_B, EnumRocksB.getNames()).setRegistryName(PEDESTALS_B.getRegistryName()));
					registry.register(new BaseMetaIB(PEDESTALS_C, EnumRocksC.getNames()).setRegistryName(PEDESTALS_C.getRegistryName()));
					registry.register(new BaseMetaIB(PEDESTALS_D, EnumRocksD.getNames()).setRegistryName(PEDESTALS_D.getRegistryName()));
					registry.register(new BaseMetaIB(PEDESTALS_E, EnumRocksE.getNames()).setRegistryName(PEDESTALS_E.getRegistryName()));
					registry.register(new BaseMetaIB(PEDESTALS_F, EnumRocksF.getNames()).setRegistryName(PEDESTALS_F.getRegistryName()));
					registry.register(new BaseMetaIB(PEDESTALS_G, EnumRocksG.getNames()).setRegistryName(PEDESTALS_G.getRegistryName()));
					registry.register(new BaseMetaIB(PEDESTALS_H, EnumRocksH.getNames()).setRegistryName(PEDESTALS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(PEDESTALS_CLAY, EnumClay.getNames()).setRegistryName(PEDESTALS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(PEDESTALS_VANILLA, EnumVanilla.getNames()).setRegistryName(PEDESTALS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(PEDESTALS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(PEDESTALS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(PEDESTALS_CONCRETE, EnumConcrete.getNames()).setRegistryName(PEDESTALS_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_TETRAS){
					registry.register(new BaseMetaIB(TETRAS_A, EnumRocksA.getNames()).setRegistryName(TETRAS_A.getRegistryName()));
					registry.register(new BaseMetaIB(TETRAS_B, EnumRocksB.getNames()).setRegistryName(TETRAS_B.getRegistryName()));
					registry.register(new BaseMetaIB(TETRAS_C, EnumRocksC.getNames()).setRegistryName(TETRAS_C.getRegistryName()));
					registry.register(new BaseMetaIB(TETRAS_D, EnumRocksD.getNames()).setRegistryName(TETRAS_D.getRegistryName()));
					registry.register(new BaseMetaIB(TETRAS_E, EnumRocksE.getNames()).setRegistryName(TETRAS_E.getRegistryName()));
					registry.register(new BaseMetaIB(TETRAS_F, EnumRocksF.getNames()).setRegistryName(TETRAS_F.getRegistryName()));
					registry.register(new BaseMetaIB(TETRAS_G, EnumRocksG.getNames()).setRegistryName(TETRAS_G.getRegistryName()));
					registry.register(new BaseMetaIB(TETRAS_H, EnumRocksH.getNames()).setRegistryName(TETRAS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(TETRAS_CLAY, EnumClay.getNames()).setRegistryName(TETRAS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(TETRAS_VANILLA, EnumVanilla.getNames()).setRegistryName(TETRAS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(TETRAS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(TETRAS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(TETRAS_CONCRETE, EnumConcrete.getNames()).setRegistryName(TETRAS_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_COLUMNS){
					registry.register(new BaseMetaIB(COLUMNS_A, EnumRocksA.getNames()).setRegistryName(COLUMNS_A.getRegistryName()));
					registry.register(new BaseMetaIB(COLUMNS_B, EnumRocksB.getNames()).setRegistryName(COLUMNS_B.getRegistryName()));
					registry.register(new BaseMetaIB(COLUMNS_C, EnumRocksC.getNames()).setRegistryName(COLUMNS_C.getRegistryName()));
					registry.register(new BaseMetaIB(COLUMNS_D, EnumRocksD.getNames()).setRegistryName(COLUMNS_D.getRegistryName()));
					registry.register(new BaseMetaIB(COLUMNS_E, EnumRocksE.getNames()).setRegistryName(COLUMNS_E.getRegistryName()));
					registry.register(new BaseMetaIB(COLUMNS_F, EnumRocksF.getNames()).setRegistryName(COLUMNS_F.getRegistryName()));
					registry.register(new BaseMetaIB(COLUMNS_G, EnumRocksG.getNames()).setRegistryName(COLUMNS_G.getRegistryName()));
					registry.register(new BaseMetaIB(COLUMNS_H, EnumRocksH.getNames()).setRegistryName(COLUMNS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(COLUMNS_CLAY, EnumClay.getNames()).setRegistryName(COLUMNS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(COLUMNS_VANILLA, EnumVanilla.getNames()).setRegistryName(COLUMNS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(COLUMNS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(COLUMNS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(COLUMNS_CONCRETE, EnumConcrete.getNames()).setRegistryName(COLUMNS_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_DORICS){
					registry.register(new BaseMetaIB(DORICS_A, EnumRocksA.getNames()).setRegistryName(DORICS_A.getRegistryName()));
					registry.register(new BaseMetaIB(DORICS_B, EnumRocksB.getNames()).setRegistryName(DORICS_B.getRegistryName()));
					registry.register(new BaseMetaIB(DORICS_C, EnumRocksC.getNames()).setRegistryName(DORICS_C.getRegistryName()));
					registry.register(new BaseMetaIB(DORICS_D, EnumRocksD.getNames()).setRegistryName(DORICS_D.getRegistryName()));
					registry.register(new BaseMetaIB(DORICS_E, EnumRocksE.getNames()).setRegistryName(DORICS_E.getRegistryName()));
					registry.register(new BaseMetaIB(DORICS_F, EnumRocksF.getNames()).setRegistryName(DORICS_F.getRegistryName()));
					registry.register(new BaseMetaIB(DORICS_G, EnumRocksG.getNames()).setRegistryName(DORICS_G.getRegistryName()));
					registry.register(new BaseMetaIB(DORICS_H, EnumRocksH.getNames()).setRegistryName(DORICS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(DORICS_CLAY, EnumClay.getNames()).setRegistryName(DORICS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(DORICS_VANILLA, EnumVanilla.getNames()).setRegistryName(DORICS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(DORICS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(DORICS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(DORICS_CONCRETE, EnumConcrete.getNames()).setRegistryName(DORICS_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_FANCY){
					registry.register(new BaseMetaIB(FANCYS_A, EnumRocksA.getNames()).setRegistryName(FANCYS_A.getRegistryName()));
					registry.register(new BaseMetaIB(FANCYS_B, EnumRocksB.getNames()).setRegistryName(FANCYS_B.getRegistryName()));
					registry.register(new BaseMetaIB(FANCYS_C, EnumRocksC.getNames()).setRegistryName(FANCYS_C.getRegistryName()));
					registry.register(new BaseMetaIB(FANCYS_D, EnumRocksD.getNames()).setRegistryName(FANCYS_D.getRegistryName()));
					registry.register(new BaseMetaIB(FANCYS_E, EnumRocksE.getNames()).setRegistryName(FANCYS_E.getRegistryName()));
					registry.register(new BaseMetaIB(FANCYS_F, EnumRocksF.getNames()).setRegistryName(FANCYS_F.getRegistryName()));
					registry.register(new BaseMetaIB(FANCYS_G, EnumRocksG.getNames()).setRegistryName(FANCYS_G.getRegistryName()));
					registry.register(new BaseMetaIB(FANCYS_H, EnumRocksH.getNames()).setRegistryName(FANCYS_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(FANCYS_CLAY, EnumClay.getNames()).setRegistryName(FANCYS_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(FANCYS_VANILLA, EnumVanilla.getNames()).setRegistryName(FANCYS_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(FANCYS_VANILLA2, EnumVanilla2.getNames()).setRegistryName(FANCYS_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(FANCYS_CONCRETE, EnumConcrete.getNames()).setRegistryName(FANCYS_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_STELE){
					registry.register(new BaseMetaIB(STELES_A, EnumRocksA.getNames()).setRegistryName(STELES_A.getRegistryName()));
					registry.register(new BaseMetaIB(STELES_B, EnumRocksB.getNames()).setRegistryName(STELES_B.getRegistryName()));
					registry.register(new BaseMetaIB(STELES_C, EnumRocksC.getNames()).setRegistryName(STELES_C.getRegistryName()));
					registry.register(new BaseMetaIB(STELES_D, EnumRocksD.getNames()).setRegistryName(STELES_D.getRegistryName()));
					registry.register(new BaseMetaIB(STELES_E, EnumRocksE.getNames()).setRegistryName(STELES_E.getRegistryName()));
					registry.register(new BaseMetaIB(STELES_F, EnumRocksF.getNames()).setRegistryName(STELES_F.getRegistryName()));
					registry.register(new BaseMetaIB(STELES_G, EnumRocksG.getNames()).setRegistryName(STELES_G.getRegistryName()));
					registry.register(new BaseMetaIB(STELES_H, EnumRocksH.getNames()).setRegistryName(STELES_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(STELES_CLAY, EnumClay.getNames()).setRegistryName(STELES_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(STELES_VANILLA, EnumVanilla.getNames()).setRegistryName(STELES_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(STELES_VANILLA2, EnumVanilla2.getNames()).setRegistryName(STELES_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(STELES_CONCRETE, EnumConcrete.getNames()).setRegistryName(STELES_CONCRETE.getRegistryName()));
					}
				}

				if(ModConfig.ENABLE_TWISTED){
					registry.register(new BaseMetaIB(TWISTED_A, EnumRocksA.getNames()).setRegistryName(TWISTED_A.getRegistryName()));
					registry.register(new BaseMetaIB(TWISTED_B, EnumRocksB.getNames()).setRegistryName(TWISTED_B.getRegistryName()));
					registry.register(new BaseMetaIB(TWISTED_C, EnumRocksC.getNames()).setRegistryName(TWISTED_C.getRegistryName()));
					registry.register(new BaseMetaIB(TWISTED_D, EnumRocksD.getNames()).setRegistryName(TWISTED_D.getRegistryName()));
					registry.register(new BaseMetaIB(TWISTED_E, EnumRocksE.getNames()).setRegistryName(TWISTED_E.getRegistryName()));
					registry.register(new BaseMetaIB(TWISTED_F, EnumRocksF.getNames()).setRegistryName(TWISTED_F.getRegistryName()));
					registry.register(new BaseMetaIB(TWISTED_G, EnumRocksG.getNames()).setRegistryName(TWISTED_G.getRegistryName()));
					registry.register(new BaseMetaIB(TWISTED_H, EnumRocksH.getNames()).setRegistryName(TWISTED_H.getRegistryName()));
					if(ModConfig.ENABLE_CLAY){
						registry.register(new BaseMetaIB(TWISTED_CLAY, EnumClay.getNames()).setRegistryName(TWISTED_CLAY.getRegistryName()));
					}
					if(ModConfig.ENABLE_VANILLA){
						registry.register(new BaseMetaIB(TWISTED_VANILLA, EnumVanilla.getNames()).setRegistryName(TWISTED_VANILLA.getRegistryName()));
						registry.register(new BaseMetaIB(TWISTED_VANILLA2, EnumVanilla2.getNames()).setRegistryName(TWISTED_VANILLA2.getRegistryName()));
					}
					if(ModConfig.ENABLE_CONCRETE){
						registry.register(new BaseMetaIB(TWISTED_CONCRETE, EnumConcrete.getNames()).setRegistryName(TWISTED_CONCRETE.getRegistryName()));
					}
				}
			}
		}

		// register the item model
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event){

			RegistryHandler.registerMetaModel(MACHINES, EnumMachines.getNames());

			RegistryHandler.registerMetaModel(ROCKS_A, EnumRocksA.getNames());
			RegistryHandler.registerMetaModel(ROCKS_B, EnumRocksB.getNames());
			RegistryHandler.registerMetaModel(ROCKS_C, EnumRocksC.getNames());
			RegistryHandler.registerMetaModel(ROCKS_D, EnumRocksD.getNames());
			RegistryHandler.registerMetaModel(ROCKS_E, EnumRocksE.getNames());
			RegistryHandler.registerMetaModel(ROCKS_F, EnumRocksF.getNames());
			RegistryHandler.registerMetaModel(ROCKS_G, EnumRocksG.getNames());
			RegistryHandler.registerMetaModel(ROCKS_H, EnumRocksH.getNames());

			RegistryHandler.registerMetaModel(BLOCKS_A, EnumRocksA.getNames());
			RegistryHandler.registerMetaModel(BLOCKS_B, EnumRocksB.getNames());
			RegistryHandler.registerMetaModel(BLOCKS_C, EnumRocksC.getNames());
			RegistryHandler.registerMetaModel(BLOCKS_D, EnumRocksD.getNames());
			RegistryHandler.registerMetaModel(BLOCKS_E, EnumRocksE.getNames());
			RegistryHandler.registerMetaModel(BLOCKS_F, EnumRocksF.getNames());
			RegistryHandler.registerMetaModel(BLOCKS_G, EnumRocksG.getNames());
			RegistryHandler.registerMetaModel(BLOCKS_H, EnumRocksH.getNames());
			RegistryHandler.registerMetaModel(BLOCKS_VANILLA2, EnumVanilla2.getNames());

			if(ModConfig.ENABLE_HALF_SLAB){
				RegistryHandler.registerMetaModel(HALF_BLOCKS_A_LO, EnumRocksA.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_A_HI, EnumRocksA.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_B_LO, EnumRocksB.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_B_HI, EnumRocksB.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_C_LO, EnumRocksC.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_C_HI, EnumRocksC.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_D_LO, EnumRocksD.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_D_HI, EnumRocksD.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_E_LO, EnumRocksE.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_E_HI, EnumRocksE.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_F_LO, EnumRocksF.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_F_HI, EnumRocksF.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_G_LO, EnumRocksG.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_G_HI, EnumRocksG.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_H_LO, EnumRocksH.getNames());
				RegistryHandler.registerMetaModel(HALF_BLOCKS_H_HI, EnumRocksH.getNames());
			}

			if(ModConfig.ENABLE_DECO){
				if(ModConfig.ENABLE_POLISHED){
					RegistryHandler.registerMetaModel(POLISHED_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(POLISHED_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(POLISHED_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(POLISHED_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(POLISHED_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(POLISHED_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(POLISHED_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(POLISHED_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(POLISHED_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(POLISHED_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(POLISHED_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(POLISHED_CONCRETE, EnumConcrete.getNames());
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						RegistryHandler.registerMetaModel(HALF_POLISHED_A_LO, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_A_HI, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_B_LO, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_B_HI, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_C_LO, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_C_HI, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_D_LO, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_D_HI, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_E_LO, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_E_HI, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_F_LO, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_F_HI, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_G_LO, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_G_HI, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_H_LO, EnumRocksH.getNames());
						RegistryHandler.registerMetaModel(HALF_POLISHED_H_HI, EnumRocksH.getNames());
					}
				}

				if(ModConfig.ENABLE_BRICKS){
					RegistryHandler.registerMetaModel(BRICKS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(BRICKS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(BRICKS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(BRICKS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(BRICKS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(BRICKS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(BRICKS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(BRICKS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(BRICKS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(BRICKS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(BRICKS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(BRICKS_CONCRETE, EnumConcrete.getNames());
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						RegistryHandler.registerMetaModel(HALF_BRICKS_A_LO, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_A_HI, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_B_LO, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_B_HI, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_C_LO, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_C_HI, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_D_LO, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_D_HI, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_E_LO, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_E_HI, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_F_LO, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_F_HI, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_G_LO, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_G_HI, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_H_LO, EnumRocksH.getNames());
						RegistryHandler.registerMetaModel(HALF_BRICKS_H_HI, EnumRocksH.getNames());
					}
				}

				if(ModConfig.ENABLE_PAVES){
					RegistryHandler.registerMetaModel(PAVES_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(PAVES_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(PAVES_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(PAVES_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(PAVES_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(PAVES_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(PAVES_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(PAVES_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(PAVES_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(PAVES_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(PAVES_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(PAVES_CONCRETE, EnumConcrete.getNames());
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						RegistryHandler.registerMetaModel(HALF_PAVES_A_LO, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_A_HI, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_B_LO, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_B_HI, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_C_LO, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_C_HI, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_D_LO, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_D_HI, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_E_LO, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_E_HI, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_F_LO, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_F_HI, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_G_LO, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_G_HI, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_H_LO, EnumRocksH.getNames());
						RegistryHandler.registerMetaModel(HALF_PAVES_H_HI, EnumRocksH.getNames());
					}
				}

				if(ModConfig.ENABLE_SLABS){
					RegistryHandler.registerMetaModel(SLABS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(SLABS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(SLABS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(SLABS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(SLABS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(SLABS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(SLABS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(SLABS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(SLABS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(SLABS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(SLABS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(SLABS_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_SHORTS){
					RegistryHandler.registerMetaModel(SHORTS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(SHORTS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(SHORTS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(SHORTS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(SHORTS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(SHORTS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(SHORTS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(SHORTS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(SHORTS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(SHORTS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(SHORTS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(SHORTS_CONCRETE, EnumConcrete.getNames());
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						RegistryHandler.registerMetaModel(HALF_SHORTS_A_LO, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_A_HI, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_B_LO, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_B_HI, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_C_LO, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_C_HI, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_D_LO, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_D_HI, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_E_LO, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_E_HI, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_F_LO, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_F_HI, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_G_LO, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_G_HI, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_H_LO, EnumRocksH.getNames());
						RegistryHandler.registerMetaModel(HALF_SHORTS_H_HI, EnumRocksH.getNames());
					}
				}

				if(ModConfig.ENABLE_TILES){
					RegistryHandler.registerMetaModel(TILES_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(TILES_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(TILES_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(TILES_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(TILES_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(TILES_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(TILES_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(TILES_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(TILES_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(TILES_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(TILES_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(TILES_CONCRETE, EnumConcrete.getNames());
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						RegistryHandler.registerMetaModel(HALF_TILES_A_LO, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_A_HI, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_B_LO, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_B_HI, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_C_LO, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_C_HI, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_D_LO, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_D_HI, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_E_LO, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_E_HI, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_F_LO, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_F_HI, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_G_LO, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_G_HI, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_H_LO, EnumRocksH.getNames());
						RegistryHandler.registerMetaModel(HALF_TILES_H_HI, EnumRocksH.getNames());
					}
				}

				if(ModConfig.ENABLE_DEBOSSED){
					RegistryHandler.registerMetaModel(DEBOSS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(DEBOSS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(DEBOSS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(DEBOSS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(DEBOSS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(DEBOSS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(DEBOSS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(DEBOSS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(DEBOSS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(DEBOSS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(DEBOSS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(DEBOSS_CONCRETE, EnumConcrete.getNames());
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						RegistryHandler.registerMetaModel(HALF_DEBOSS_A_LO, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_A_HI, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_B_LO, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_B_HI, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_C_LO, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_C_HI, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_D_LO, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_D_HI, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_E_LO, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_E_HI, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_F_LO, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_F_HI, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_G_LO, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_G_HI, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_H_LO, EnumRocksH.getNames());
						RegistryHandler.registerMetaModel(HALF_DEBOSS_H_HI, EnumRocksH.getNames());
					}
				}

				if(ModConfig.ENABLE_FLOORS){
					RegistryHandler.registerMetaModel(FLOORS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(FLOORS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(FLOORS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(FLOORS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(FLOORS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(FLOORS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(FLOORS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(FLOORS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(FLOORS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(FLOORS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(FLOORS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(FLOORS_CONCRETE, EnumConcrete.getNames());
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						RegistryHandler.registerMetaModel(HALF_FLOORS_A_LO, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_A_HI, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_B_LO, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_B_HI, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_C_LO, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_C_HI, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_D_LO, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_D_HI, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_E_LO, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_E_HI, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_F_LO, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_F_HI, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_G_LO, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_G_HI, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_H_LO, EnumRocksH.getNames());
						RegistryHandler.registerMetaModel(HALF_FLOORS_H_HI, EnumRocksH.getNames());
					}
				}

				if(ModConfig.ENABLE_CARVED){
					RegistryHandler.registerMetaModel(CARVED_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(CARVED_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(CARVED_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(CARVED_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(CARVED_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(CARVED_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(CARVED_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(CARVED_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(CARVED_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(CARVED_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(CARVED_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(CARVED_CONCRETE, EnumConcrete.getNames());
					}
					if(ModConfig.ENABLE_HALF_SLAB){
						RegistryHandler.registerMetaModel(HALF_CARVED_A_LO, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_A_HI, EnumRocksA.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_B_LO, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_B_HI, EnumRocksB.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_C_LO, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_C_HI, EnumRocksC.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_D_LO, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_D_HI, EnumRocksD.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_E_LO, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_E_HI, EnumRocksE.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_F_LO, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_F_HI, EnumRocksF.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_G_LO, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_G_HI, EnumRocksG.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_H_LO, EnumRocksH.getNames());
						RegistryHandler.registerMetaModel(HALF_CARVED_H_HI, EnumRocksH.getNames());
					}
				}
			}

			if(ModConfig.ENABLE_SCULPT){
				if(ModConfig.ENABLE_SEGMENTED){
					RegistryHandler.registerMetaModel(SEGMENTED_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(SEGMENTED_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(SEGMENTED_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(SEGMENTED_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(SEGMENTED_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(SEGMENTED_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(SEGMENTED_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(SEGMENTED_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(SEGMENTED_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(SEGMENTED_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(SEGMENTED_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(SEGMENTED_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_FOUNTAINS){
					RegistryHandler.registerMetaModel(FOUNTAINS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(FOUNTAINS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(FOUNTAINS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(FOUNTAINS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(FOUNTAINS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(FOUNTAINS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(FOUNTAINS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(FOUNTAINS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(FOUNTAINS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(FOUNTAINS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(FOUNTAINS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(FOUNTAINS_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_LANTERNS){
					RegistryHandler.registerMetaModel(LANTERNS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(LANTERNS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(LANTERNS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(LANTERNS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(LANTERNS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(LANTERNS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(LANTERNS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(LANTERNS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(LANTERNS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(LANTERNS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(LANTERNS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(LANTERNS_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_PEDESTALS){
					RegistryHandler.registerMetaModel(PEDESTALS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(PEDESTALS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(PEDESTALS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(PEDESTALS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(PEDESTALS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(PEDESTALS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(PEDESTALS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(PEDESTALS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(PEDESTALS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(PEDESTALS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(PEDESTALS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(PEDESTALS_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_TETRAS){
					RegistryHandler.registerMetaModel(TETRAS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(TETRAS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(TETRAS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(TETRAS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(TETRAS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(TETRAS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(TETRAS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(TETRAS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(TETRAS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(TETRAS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(TETRAS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(TETRAS_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_COLUMNS){
					RegistryHandler.registerMetaModel(COLUMNS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(COLUMNS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(COLUMNS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(COLUMNS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(COLUMNS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(COLUMNS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(COLUMNS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(COLUMNS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(COLUMNS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(COLUMNS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(COLUMNS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(COLUMNS_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_DORICS){
					RegistryHandler.registerMetaModel(DORICS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(DORICS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(DORICS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(DORICS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(DORICS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(DORICS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(DORICS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(DORICS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(DORICS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(DORICS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(DORICS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(DORICS_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_FANCY){
					RegistryHandler.registerMetaModel(FANCYS_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(FANCYS_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(FANCYS_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(FANCYS_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(FANCYS_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(FANCYS_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(FANCYS_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(FANCYS_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(FANCYS_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(FANCYS_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(FANCYS_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(FANCYS_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_STELE){
					RegistryHandler.registerMetaModel(STELES_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(STELES_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(STELES_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(STELES_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(STELES_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(STELES_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(STELES_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(STELES_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(STELES_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(STELES_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(STELES_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(STELES_CONCRETE, EnumConcrete.getNames());
					}
				}

				if(ModConfig.ENABLE_TWISTED){
					RegistryHandler.registerMetaModel(TWISTED_A, EnumRocksA.getNames());
					RegistryHandler.registerMetaModel(TWISTED_B, EnumRocksB.getNames());
					RegistryHandler.registerMetaModel(TWISTED_C, EnumRocksC.getNames());
					RegistryHandler.registerMetaModel(TWISTED_D, EnumRocksD.getNames());
					RegistryHandler.registerMetaModel(TWISTED_E, EnumRocksE.getNames());
					RegistryHandler.registerMetaModel(TWISTED_F, EnumRocksF.getNames());
					RegistryHandler.registerMetaModel(TWISTED_G, EnumRocksG.getNames());
					RegistryHandler.registerMetaModel(TWISTED_H, EnumRocksH.getNames());
					if(ModConfig.ENABLE_CLAY){
						RegistryHandler.registerMetaModel(TWISTED_CLAY, EnumClay.getNames());
					}
					if(ModConfig.ENABLE_VANILLA){
						RegistryHandler.registerMetaModel(TWISTED_VANILLA, EnumVanilla.getNames());
						RegistryHandler.registerMetaModel(TWISTED_VANILLA2, EnumVanilla2.getNames());
					}
					if(ModConfig.ENABLE_CONCRETE){
						RegistryHandler.registerMetaModel(TWISTED_CONCRETE, EnumConcrete.getNames());
					}
				}
			}

		}
	}

}