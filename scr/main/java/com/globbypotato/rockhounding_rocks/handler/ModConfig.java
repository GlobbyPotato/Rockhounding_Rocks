package com.globbypotato.rockhounding_rocks.handler;

import com.globbypotato.rockhounding_rocks.world.RocksGenerator;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfig {

	public static boolean CAN_USE_FOUNTAINS;
	public static int speedCuttingStation;
	public static int bladeUses;

	public static boolean ENABLE_POLISHED;
	public static boolean ENABLE_BRICKS;
	public static boolean ENABLE_SLABS;
	public static boolean ENABLE_SHORTS;
	public static boolean ENABLE_DEBOSSED;
	public static boolean ENABLE_FLOORS;
	public static boolean ENABLE_TILES;
	public static boolean ENABLE_CARVED;
	public static boolean ENABLE_COLUMNS;
	public static boolean ENABLE_DORICS;
	public static boolean ENABLE_TETRAS;
	public static boolean ENABLE_POSTS;
	public static boolean ENABLE_SEGMENTED;
	public static boolean ENABLE_FANCY;
	public static boolean ENABLE_STELE;
	public static boolean ENABLE_FOUNTAINS;
	public static boolean ENABLE_LANTERNS;

	public static int[] dimensions = new int[]{};

	public static void loadConfig(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		RocksGenerator.GENERAL_ENABLER = config.get(		"Absolute", 			"Generate Rocks", 		true,	"Wether to generate the rocks. Overworld only.").getBoolean();
		RocksGenerator.CLOUDS_ENABLER = config.get(			"Absolute", 			"Clouds Enabler", 		true,	"Wether to use clouds or patches generation").getBoolean();
		RocksGenerator.BIOMES_ENABLER = config.get(			"Absolute", 			"Biome Filter Enabler", true,	"Wether to filter rocks by biome or randomly generate").getBoolean();
		RocksGenerator.CLOUDS_FREQUENCY = config.get(		"Absolute", 			"Clouds Frequency",		1,	 	"Possible clouds per chunk", 1, 10).getInt();
		RocksGenerator.CLOUDS_CHANCE = config.get(			"Absolute", 			"Clouds Chance",		70,	 	"Percentage chance a patch/cloud will be generated", 1, 100).getInt();
		RocksGenerator.CLOUDS_MIN_SIZE = config.get(		"Absolute", 			"Clouds Min Size", 		16,		"Minimum cloud size").getInt();
		RocksGenerator.CLOUDS_MAX_SIZE = config.get(		"Absolute", 			"Clouds Max Size", 		48,		"Maximum cloud size").getInt();

		dimensions = config.get(							"Absolute_dimensions",  "dimension whitelist", dimensions, "Additional allowed dimensions").getIntList();

		CAN_USE_FOUNTAINS = config.get(						"Absolute_misc",		"Fountains Water", 		true,	"Wether water in fountains can be used").getBoolean();
		speedCuttingStation = config.get(					"Absolute_misc",		"Speed Cutting Station",200,	"Operation speed of the Cutting Station").getInt();
		bladeUses = config.get(								"Absolute_misc",		"Cutting Blade uses",	600,	"Uses for the blade inside the Cutting Station").getInt();

		ENABLE_POLISHED = config.get(						"Absolute_parts",		"Polished Blocks", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_BRICKS = config.get(							"Absolute_parts",		"Bricks", 				true,	"Enable/Disable this block").getBoolean();
		ENABLE_SLABS = config.get(							"Absolute_parts",		"Double Slabs", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_SHORTS = config.get(							"Absolute_parts",		"Short Bricks", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_DEBOSSED = config.get(						"Absolute_parts",		"Debossed Blocks", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_FLOORS = config.get(							"Absolute_parts",		"Parquet Tiles", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_TILES = config.get(							"Absolute_parts",		"Tiles", 				true,	"Enable/Disable this block").getBoolean();
		ENABLE_CARVED = config.get(							"Absolute_parts",		"Carved Blocks", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_COLUMNS = config.get(						"Absolute_parts",		"Fluted Columns", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_DORICS = config.get(							"Absolute_parts",		"Doric Columns", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_TETRAS = config.get(							"Absolute_parts",		"Tetrapylons", 			true,	"Enable/Disable this block").getBoolean();
		ENABLE_POSTS = config.get(							"Absolute_parts",		"Pedestals", 			true,	"Enable/Disable this block").getBoolean();
		ENABLE_SEGMENTED = config.get(						"Absolute_parts",		"Segmented Columns",	true,	"Enable/Disable this block").getBoolean();
		ENABLE_FANCY = config.get(							"Absolute_parts",		"Fancy Columns", 		true,	"Enable/Disable this block").getBoolean();
		ENABLE_STELE = config.get(							"Absolute_parts",		"Steles", 				true,	"Enable/Disable this block").getBoolean();
		ENABLE_FOUNTAINS = config.get(						"Absolute_parts",		"Fountains", 			true,	"Enable/Disable this block").getBoolean();
		ENABLE_LANTERNS = config.get(						"Absolute_parts",		"Lanterns", 			true,	"Enable/Disable this block").getBoolean();

		RocksGenerator.ROCKS_FREQUENCY[0]  = config.get(	"Black Aventurine", 	"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[0]  = config.get(	"Black Aventurine", 	"Biome type", 	"LUSH").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[0]  = config.get(	"Black Aventurine", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[0]  = config.get(	"Black Aventurine", 	"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[0]  = config.get(	"Black Aventurine", 	"Min level", 	35).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[0]  = config.get(	"Black Aventurine", 	"Max level",	49).getInt();

		RocksGenerator.ROCKS_FREQUENCY[1]  = config.get(	"Basanite", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[1]  = config.get(	"Basanite", 			"Biome type", 	"SANDY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[1]  = config.get(	"Basanite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[1]  = config.get(	"Basanite", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[1]  = config.get(	"Basanite", 			"Min level", 	33).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[1]  = config.get(	"Basanite", 			"Max level",	56).getInt();

		RocksGenerator.ROCKS_FREQUENCY[2]  = config.get(	"Black Granite", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[2]  = config.get(	"Black Granite", 		"Biome type", 	"DENSE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[2]  = config.get(	"Black Granite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[2]  = config.get(	"Black Granite", 		"Max Size",		9).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[2]  = config.get(	"Black Granite", 		"Min level", 	39).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[2]  = config.get(	"Black Granite", 		"Max level",	186).getInt();

		RocksGenerator.ROCKS_FREQUENCY[3]  = config.get(	"Jet", 					"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[3]  = config.get(	"Jet", 					"Biome type", 	"CONIFEROUS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[3]  = config.get(	"Jet", 					"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[3]  = config.get(	"Jet", 					"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[3]  = config.get(	"Jet", 					"Min level", 	60).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[3]  = config.get(	"Jet", 					"Max level",	120).getInt();

		RocksGenerator.ROCKS_FREQUENCY[4]  = config.get(	"Luxulyanite", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[4]  = config.get(	"Luxulyanite", 			"Biome type", 	"PLAINS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[4]  = config.get(	"Luxulyanite", 			"Min Size", 	2).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[4]  = config.get(	"Luxulyanite", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[4]  = config.get(	"Luxulyanite", 			"Min level", 	49).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[4]  = config.get(	"Luxulyanite", 			"Max level",	87).getInt();

		RocksGenerator.ROCKS_FREQUENCY[5]  = config.get(	"Black Onyx", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[5]  = config.get(	"Black Onyx", 			"Biome type", 	"SPOOKY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[5]  = config.get(	"Black Onyx", 			"Min Size", 	3).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[5]  = config.get(	"Black Onyx", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[5]  = config.get(	"Black Onyx", 			"Min level", 	38).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[5]  = config.get(	"Black Onyx", 			"Max level",	56).getInt();

		RocksGenerator.ROCKS_FREQUENCY[6]  = config.get(	"Portoro", 				"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[6]  = config.get(	"Portoro", 				"Biome type", 	"BEACH").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[6]  = config.get(	"Portoro", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[6]  = config.get(	"Portoro", 				"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[6]  = config.get(	"Portoro", 				"Min level", 	15).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[6]  = config.get(	"Portoro", 				"Max level",	64).getInt();

		RocksGenerator.ROCKS_FREQUENCY[7]  = config.get(	"Snowflake Obsidian", 	"Frequency", 	6).getInt();
			RocksGenerator.ROCKS_BIOME[7]  = config.get(	"Snowflake Obsidian", 	"Biome type", 	"MAGICAL").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[7]  = config.get(	"Snowflake Obsidian", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[7]  = config.get(	"Snowflake Obsidian", 	"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[7]  = config.get(	"Snowflake Obsidian", 	"Min level", 	1).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[7]  = config.get(	"Snowflake Obsidian", 	"Max level",	30).getInt();

		RocksGenerator.ROCKS_FREQUENCY[8]  = config.get(	"Black Tiger Eye", 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[8]  = config.get(	"Black Tiger Eye", 		"Biome type", 	"MESA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[8]  = config.get(	"Black Tiger Eye", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[8]  = config.get(	"Black Tiger Eye", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[8]  = config.get(	"Black Tiger Eye", 		"Min level", 	19).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[8]  = config.get(	"Black Tiger Eye", 		"Max level",	43).getInt();

		RocksGenerator.ROCKS_FREQUENCY[9]  = config.get(	"Slate", 				"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[9]  = config.get(	"Slate", 				"Biome type", 	"HOT").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[9]  = config.get(	"Slate", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[9]  = config.get(	"Slate", 				"Max Size",		16).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[9]  = config.get(	"Slate", 				"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[9]  = config.get(	"Slate", 				"Max level",	69).getInt();

		RocksGenerator.ROCKS_FREQUENCY[10]  = config.get(	"Gabbro", 				"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[10]  = config.get(	"Gabbro", 				"Biome type", 	"SAVANNA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[10]  = config.get(	"Gabbro", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[10]  = config.get(	"Gabbro", 				"Max Size",		14).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[10]  = config.get(	"Gabbro", 				"Min level", 	14).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[10]  = config.get(	"Gabbro", 				"Max level",	33).getInt();

		RocksGenerator.ROCKS_FREQUENCY[11]  = config.get(	"Blue Aventurine", 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[11]  = config.get(	"Blue Aventurine", 		"Biome type", 	"OCEAN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[11]  = config.get(	"Blue Aventurine", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[11]  = config.get(	"Blue Aventurine", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[11]  = config.get(	"Blue Aventurine", 		"Min level", 	15).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[11]  = config.get(	"Blue Aventurine", 		"Max level",	37).getInt();

		RocksGenerator.ROCKS_FREQUENCY[12]  = config.get(	"Chrysocolla", 			"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[12]  = config.get(	"Chrysocolla", 			"Biome type", 	"SWAMP").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[12]  = config.get(	"Chrysocolla", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[12]  = config.get(	"Chrysocolla", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[12]  = config.get(	"Chrysocolla", 			"Min level", 	23).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[12]  = config.get(	"Chrysocolla", 			"Max level",	58).getInt();

		RocksGenerator.ROCKS_FREQUENCY[13]  = config.get(	"Blue Granite", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[13]  = config.get(	"Blue Granite", 		"Biome type", 	"WASTELAND").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[13]  = config.get(	"Blue Granite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[13]  = config.get(	"Blue Granite", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[13]  = config.get(	"Blue Granite", 		"Min level", 	45).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[13]  = config.get(	"Blue Granite", 		"Max level",	169).getInt();

		RocksGenerator.ROCKS_FREQUENCY[14]  = config.get(	"Blue Jasper", 			"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[14]  = config.get(	"Blue Jasper", 			"Biome type", 	"SAVANNA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[14]  = config.get(	"Blue Jasper", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[14]  = config.get(	"Blue Jasper", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[14]  = config.get(	"Blue Jasper", 			"Min level", 	13).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[14]  = config.get(	"Blue Jasper", 			"Max level",	49).getInt();

		RocksGenerator.ROCKS_FREQUENCY[15]  = config.get(	"Labradorite", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[15]  = config.get(	"Labradorite", 			"Biome type", 	"MAGICAL").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[15]  = config.get(	"Labradorite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[15]  = config.get(	"Labradorite", 			"Max Size",		9).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[15]  = config.get(	"Labradorite", 			"Min level", 	10).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[15]  = config.get(	"Labradorite", 			"Max level",	31).getInt();

		RocksGenerator.ROCKS_FREQUENCY[16]  = config.get(	"Larimar", 				"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[16]  = config.get(	"Larimar", 				"Biome type", 	"WET").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[16]  = config.get(	"Larimar", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[16]  = config.get(	"Larimar", 				"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[16]  = config.get(	"Larimar", 				"Min level", 	45).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[16]  = config.get(	"Larimar", 				"Max level",	64).getInt();

		RocksGenerator.ROCKS_FREQUENCY[17]  = config.get(	"Blue Onyx", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[17]  = config.get(	"Blue Onyx", 			"Biome type", 	"JUNGLE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[17]  = config.get(	"Blue Onyx", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[17]  = config.get(	"Blue Onyx", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[17]  = config.get(	"Blue Onyx", 			"Min level", 	25).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[17]  = config.get(	"Blue Onyx", 			"Max level",	151).getInt();

		RocksGenerator.ROCKS_FREQUENCY[18]  = config.get(	"Pietersite", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[18]  = config.get(	"Pietersite", 			"Biome type", 	"BEACH").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[18]  = config.get(	"Pietersite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[18]  = config.get(	"Pietersite", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[18]  = config.get(	"Pietersite", 			"Min level", 	35).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[18]  = config.get(	"Pietersite", 			"Max level",	199).getInt();

		RocksGenerator.ROCKS_FREQUENCY[19]  = config.get(	"Sodalite", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[19]  = config.get(	"Sodalite", 			"Biome type", 	"SPARSE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[19]  = config.get(	"Sodalite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[19]  = config.get(	"Sodalite", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[19]  = config.get(	"Sodalite", 			"Min level", 	23).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[19]  = config.get(	"Sodalite", 			"Max level",	48).getInt();

		RocksGenerator.ROCKS_FREQUENCY[20]  = config.get(	"Blue Tiger Eye", 		"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[20]  = config.get(	"Blue Tiger Eye", 		"Biome type", 	"HILLS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[20]  = config.get(	"Blue Tiger Eye", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[20]  = config.get(	"Blue Tiger Eye", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[20]  = config.get(	"Blue Tiger Eye", 		"Min level", 	35).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[20]  = config.get(	"Blue Tiger Eye", 		"Max level",	65).getInt();

		RocksGenerator.ROCKS_FREQUENCY[21]  = config.get(	"Azurite", 				"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[21]  = config.get(	"Azurite", 				"Biome type", 	"MUSHROOM").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[21]  = config.get(	"Azurite", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[21]  = config.get(	"Azurite", 				"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[21]  = config.get(	"Azurite", 				"Min level", 	40).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[21]  = config.get(	"Azurite", 				"Max level",	80).getInt();

		RocksGenerator.ROCKS_FREQUENCY[22]  = config.get(	"Brown Aventurine", 	"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[22]  = config.get(	"Brown Aventurine", 	"Biome type", 	"DEAD").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[22]  = config.get(	"Brown Aventurine", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[22]  = config.get(	"Brown Aventurine", 	"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[22]  = config.get(	"Brown Aventurine", 	"Min level", 	50).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[22]  = config.get(	"Brown Aventurine", 	"Max level",	100).getInt();

		RocksGenerator.ROCKS_FREQUENCY[23]  = config.get(	"Laterite", 			"Frequency", 	13).getInt();
			RocksGenerator.ROCKS_BIOME[23]  = config.get(	"Laterite", 			"Biome type", 	"SWAMP").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[23]  = config.get(	"Laterite", 			"Min Size", 	8).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[23]  = config.get(	"Laterite", 			"Max Size",		16).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[23]  = config.get(	"Laterite", 			"Min level", 	45).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[23]  = config.get(	"Laterite", 			"Max level",	72).getInt();

		RocksGenerator.ROCKS_FREQUENCY[24]  = config.get(	"Brown Carnelian", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[24]  = config.get(	"Brown Carnelian", 		"Biome type", 	"CONIFEROUS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[24]  = config.get(	"Brown Carnelian", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[24]  = config.get(	"Brown Carnelian", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[24]  = config.get(	"Brown Carnelian", 		"Min level", 	50).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[24]  = config.get(	"Brown Carnelian", 		"Max level",	80).getInt();

		RocksGenerator.ROCKS_FREQUENCY[25]  = config.get(	"Brown Porphyry", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[25]  = config.get(	"Brown Porphyry", 		"Biome type", 	"MUSHROOM").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[25]  = config.get(	"Brown Porphyry", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[25]  = config.get(	"Brown Porphyry", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[25]  = config.get(	"Brown Porphyry", 		"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[25]  = config.get(	"Brown Porphyry", 		"Max level",	150).getInt();

		RocksGenerator.ROCKS_FREQUENCY[26]  = config.get(	"Scoria", 				"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[26]  = config.get(	"Scoria", 				"Biome type", 	"DENSE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[26]  = config.get(	"Scoria", 				"Min Size", 	5).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[26]  = config.get(	"Scoria", 				"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[26]  = config.get(	"Scoria", 				"Min level", 	12).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[26]  = config.get(	"Scoria", 				"Max level",	105).getInt();

		RocksGenerator.ROCKS_FREQUENCY[27]  = config.get(	"Smoky Quartz", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[27]  = config.get(	"Smoky Quartz", 		"Biome type", 	"COLD").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[27]  = config.get(	"Smoky Quartz", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[27]  = config.get(	"Smoky Quartz", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[27]  = config.get(	"Smoky Quartz", 		"Min level", 	32).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[27]  = config.get(	"Smoky Quartz", 		"Max level",	77).getInt();

		RocksGenerator.ROCKS_FREQUENCY[28]  = config.get(	"Bronzite", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[28]  = config.get(	"Bronzite", 			"Biome type", 	"SPARSE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[28]  = config.get(	"Bronzite", 			"Min Size", 	3).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[28]  = config.get(	"Bronzite", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[28]  = config.get(	"Bronzite", 			"Min level", 	53).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[28]  = config.get(	"Bronzite", 			"Max level",	168).getInt();

		RocksGenerator.ROCKS_FREQUENCY[29]  = config.get(	"Tiger Iron", 			"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[29]  = config.get(	"Tiger Iron", 			"Biome type", 	"WET").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[29]  = config.get(	"Tiger Iron", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[29]  = config.get(	"Tiger Iron", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[29]  = config.get(	"Tiger Iron", 			"Min level", 	18).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[29]  = config.get(	"Tiger Iron", 			"Max level",	39).getInt();

		RocksGenerator.ROCKS_FREQUENCY[30]  = config.get(	"Arkose", 				"Frequency", 	12).getInt();
			RocksGenerator.ROCKS_BIOME[30]  = config.get(	"Arkose", 				"Biome type", 	"SANDY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[30]  = config.get(	"Arkose", 				"Min Size", 	8).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[30]  = config.get(	"Arkose", 				"Max Size",		16).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[30]  = config.get(	"Arkose", 				"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[30]  = config.get(	"Arkose", 				"Max level",	100).getInt();

		RocksGenerator.ROCKS_FREQUENCY[31]  = config.get(	"Ignimbrite", 			"Frequency", 	12).getInt();
			RocksGenerator.ROCKS_BIOME[31]  = config.get(	"Ignimbrite", 			"Biome type", 	"HILLS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[31]  = config.get(	"Ignimbrite", 			"Min Size", 	8).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[31]  = config.get(	"Ignimbrite", 			"Max Size",		16).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[31]  = config.get(	"Ignimbrite", 			"Min level", 	80).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[31]  = config.get(	"Ignimbrite", 			"Max level",	200).getInt();

		RocksGenerator.ROCKS_FREQUENCY[32]  = config.get(	"Gneiss", 				"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[32]  = config.get(	"Gneiss", 				"Biome type", 	"CONIFEROUS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[32]  = config.get(	"Gneiss", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[32]  = config.get(	"Gneiss", 				"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[32]  = config.get(	"Gneiss", 				"Min level", 	20).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[32]  = config.get(	"Gneiss", 				"Max level",	150).getInt();

		RocksGenerator.ROCKS_FREQUENCY[33]  = config.get(	"Pumice", 				"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[33]  = config.get(	"Pumice", 				"Biome type", 	"MOUNTAIN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[33]  = config.get(	"Pumice", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[33]  = config.get(	"Pumice", 				"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[33]  = config.get(	"Pumice", 				"Min level", 	70).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[33]  = config.get(	"Pumice", 				"Max level",	220).getInt();

		RocksGenerator.ROCKS_FREQUENCY[34]  = config.get(	"Gray Granite", 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[34]  = config.get(	"Gray Granite", 		"Biome type", 	"OCEAN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[34]  = config.get(	"Gray Granite", 		"Min Size", 	8).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[34]  = config.get(	"Gray Granite", 		"Max Size",		16).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[34]  = config.get(	"Gray Granite", 		"Min level", 	40).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[34]  = config.get(	"Gray Granite", 		"Max level",	196).getInt();

		RocksGenerator.ROCKS_FREQUENCY[35]  = config.get(	"Gray Onyx", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[35]  = config.get(	"Gray Onyx", 			"Biome type", 	"WET").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[35]  = config.get(	"Gray Onyx", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[35]  = config.get(	"Gray Onyx", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[35]  = config.get(	"Gray Onyx", 			"Min level", 	50).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[35]  = config.get(	"Gray Onyx", 			"Max level",	126).getInt();

		RocksGenerator.ROCKS_FREQUENCY[36]  = config.get(	"Gray Porphyry", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[36]  = config.get(	"Gray Porphyry", 		"Biome type", 	"HOT").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[36]  = config.get(	"Gray Porphyry", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[36]  = config.get(	"Gray Porphyry", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[36]  = config.get(	"Gray Porphyry", 		"Min level", 	55).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[36]  = config.get(	"Gray Porphyry", 		"Max level",	186).getInt();

		RocksGenerator.ROCKS_FREQUENCY[37]  = config.get(	"Spiderweb Jasper", 	"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[37]  = config.get(	"Spiderweb Jasper", 	"Biome type", 	"COLD").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[37]  = config.get(	"Spiderweb Jasper", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[37]  = config.get(	"Spiderweb Jasper", 	"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[37]  = config.get(	"Spiderweb Jasper", 	"Min level", 	49).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[37]  = config.get(	"Spiderweb Jasper", 	"Max level",	76).getInt();

		RocksGenerator.ROCKS_FREQUENCY[38]  = config.get(	"Gray Trachyte", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[38]  = config.get(	"Gray Trachyte", 		"Biome type", 	"SANDY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[38]  = config.get(	"Gray Trachyte", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[38]  = config.get(	"Gray Trachyte", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[38]  = config.get(	"Gray Trachyte", 		"Min level", 	39).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[38]  = config.get(	"Gray Trachyte", 		"Max level",	196).getInt();

		RocksGenerator.ROCKS_FREQUENCY[39]  = config.get(	"Gray Travertine", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[39]  = config.get(	"Gray Travertine", 		"Biome type", 	"HILLS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[39]  = config.get(	"Gray Travertine", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[39]  = config.get(	"Gray Travertine", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[39]  = config.get(	"Gray Travertine", 		"Min level", 	32).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[39]  = config.get(	"Gray Travertine", 		"Max level",	96).getInt();

		RocksGenerator.ROCKS_FREQUENCY[40]  = config.get(	"Gray Tuff", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[40]  = config.get(	"Gray Tuff", 			"Biome type", 	"DEAD").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[40]  = config.get(	"Gray Tuff", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[40]  = config.get(	"Gray Tuff", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[40]  = config.get(	"Gray Tuff", 			"Min level", 	40).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[40]  = config.get(	"Gray Tuff", 			"Max level",	82).getInt();

		RocksGenerator.ROCKS_FREQUENCY[41]  = config.get(	"Zebra Jasper", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[41]  = config.get(	"Zebra Jasper", 		"Biome type", 	"MESA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[41]  = config.get(	"Zebra Jasper", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[41]  = config.get(	"Zebra Jasper", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[41]  = config.get(	"Zebra Jasper", 		"Min level", 	42).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[41]  = config.get(	"Zebra Jasper", 		"Max level",	160).getInt();

		RocksGenerator.ROCKS_FREQUENCY[42]  = config.get(	"Dacite", 				"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[42]  = config.get(	"Dacite", 				"Biome type", 	"MOUNTAIN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[42]  = config.get(	"Dacite", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[42]  = config.get(	"Dacite", 				"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[42]  = config.get(	"Dacite", 				"Min level", 	72).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[42]  = config.get(	"Dacite", 				"Max level",	200).getInt();

		RocksGenerator.ROCKS_FREQUENCY[43]  = config.get(	"Migmatite", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[43]  = config.get(	"Migmatite", 			"Biome type", 	"HOT").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[43]  = config.get(	"Migmatite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[43]  = config.get(	"Migmatite", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[43]  = config.get(	"Migmatite", 			"Min level", 	13).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[43]  = config.get(	"Migmatite", 			"Max level",	23).getInt();

		RocksGenerator.ROCKS_FREQUENCY[44]  = config.get(	"Amazonite",	 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[44]  = config.get(	"Amazonite",		 	"Biome type", 	"RIVER").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[44]  = config.get(	"Amazonite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[44]  = config.get(	"Amazonite", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[44]  = config.get(	"Amazonite", 			"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[44]  = config.get(	"Amazonite", 			"Max level",	100).getInt();

		RocksGenerator.ROCKS_FREQUENCY[45]  = config.get(	"Green Aventurine",	 	"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[45]  = config.get(	"Green Aventurine",		"Biome type", 	"DEAD").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[45]  = config.get(	"Green Aventurine", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[45]  = config.get(	"Green Aventurine", 	"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[45]  = config.get(	"Green Aventurine", 	"Min level", 	20).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[45]  = config.get(	"Green Aventurine", 	"Max level",	50).getInt();

		RocksGenerator.ROCKS_FREQUENCY[46]  = config.get(	"Green Granite",	 	"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[46]  = config.get(	"Green Granite",		"Biome type", 	"SPOOKY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[46]  = config.get(	"Green Granite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[46]  = config.get(	"Green Granite", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[46]  = config.get(	"Green Granite", 		"Min level", 	40).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[46]  = config.get(	"Green Granite", 		"Max level",	170).getInt();

		RocksGenerator.ROCKS_FREQUENCY[47]  = config.get(	"Green Onyx",		 	"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[47]  = config.get(	"Green Onyx",			"Biome type", 	"WASTELAND").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[47]  = config.get(	"Green Onyx", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[47]  = config.get(	"Green Onyx", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[47]  = config.get(	"Green Onyx", 			"Min level", 	33).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[47]  = config.get(	"Green Onyx", 			"Max level",	140).getInt();

		RocksGenerator.ROCKS_FREQUENCY[48]  = config.get(	"Green Porphyry",	 	"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[48]  = config.get(	"Green Porphyry",		"Biome type", 	"FOREST").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[48]  = config.get(	"Green Porphyry", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[48]  = config.get(	"Green Porphyry", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[48]  = config.get(	"Green Porphyry", 		"Min level", 	58).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[48]  = config.get(	"Green Porphyry", 		"Max level",	180).getInt();

		RocksGenerator.ROCKS_FREQUENCY[49]  = config.get(	"Green Jasper",	 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[49]  = config.get(	"Green Jasper",			"Biome type", 	"DRY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[49]  = config.get(	"Green Jasper", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[49]  = config.get(	"Green Jasper", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[49]  = config.get(	"Green Jasper", 		"Min level", 	25).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[49]  = config.get(	"Green Jasper", 		"Max level",	49).getInt();

		RocksGenerator.ROCKS_FREQUENCY[50]  = config.get(	"Bloodstone",	 		"Frequency", 	6).getInt();
			RocksGenerator.ROCKS_BIOME[50]  = config.get(	"Bloodstone",			"Biome type", 	"HOT").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[50]  = config.get(	"Bloodstone", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[50]  = config.get(	"Bloodstone", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[50]  = config.get(	"Bloodstone", 			"Min level", 	19).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[50]  = config.get(	"Bloodstone", 			"Max level",	41).getInt();

		RocksGenerator.ROCKS_FREQUENCY[51]  = config.get(	"Jadeitite",	 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[51]  = config.get(	"Jadeitite",			"Biome type", 	"PLAINS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[51]  = config.get(	"Jadeitite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[51]  = config.get(	"Jadeitite", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[51]  = config.get(	"Jadeitite", 			"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[51]  = config.get(	"Jadeitite", 			"Max level",	50).getInt();

		RocksGenerator.ROCKS_FREQUENCY[52]  = config.get(	"Malachite",	 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[52]  = config.get(	"Malachite",			"Biome type", 	"JUNGLE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[52]  = config.get(	"Malachite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[52]  = config.get(	"Malachite", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[52]  = config.get(	"Malachite", 			"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[52]  = config.get(	"Malachite", 			"Max level",	80).getInt();

		RocksGenerator.ROCKS_FREQUENCY[53]  = config.get(	"Serpentinite",	 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[53]  = config.get(	"Serpentinite",			"Biome type", 	"MOUNTAIN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[53]  = config.get(	"Serpentinite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[53]  = config.get(	"Serpentinite", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[53]  = config.get(	"Serpentinite", 		"Min level", 	60).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[53]  = config.get(	"Serpentinite", 		"Max level",	190).getInt();

		RocksGenerator.ROCKS_FREQUENCY[54]  = config.get(	"Zoisite",	 			"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[54]  = config.get(	"Zoisite",				"Biome type", 	"FOREST").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[54]  = config.get(	"Zoisite", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[54]  = config.get(	"Zoisite", 				"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[54]  = config.get(	"Zoisite", 				"Min level", 	20).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[54]  = config.get(	"Zoisite", 				"Max level",	40).getInt();

		RocksGenerator.ROCKS_FREQUENCY[55]  = config.get(	"Green Tiger Eye",	 	"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[55]  = config.get(	"Green Tiger Eye",		"Biome type", 	"WASTELAND").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[55]  = config.get(	"Green Tiger Eye", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[55]  = config.get(	"Green Tiger Eye", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[55]  = config.get(	"Green Tiger Eye", 		"Min level", 	20).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[55]  = config.get(	"Green Tiger Eye", 		"Max level",	52).getInt();

		RocksGenerator.ROCKS_FREQUENCY[56]  = config.get(	"Green Tuff",	 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[56]  = config.get(	"Green Tuff",			"Biome type", 	"DENSE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[56]  = config.get(	"Green Tuff", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[56]  = config.get(	"Green Tuff", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[56]  = config.get(	"Green Tuff", 			"Min level", 	59).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[56]  = config.get(	"Green Tuff", 			"Max level",	124).getInt();

		RocksGenerator.ROCKS_FREQUENCY[57]  = config.get(	"Unakite",	 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[57]  = config.get(	"Unakite",				"Biome type", 	"SNOWY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[57]  = config.get(	"Unakite", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[57]  = config.get(	"Unakite", 				"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[57]  = config.get(	"Unakite", 				"Min level", 	50).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[57]  = config.get(	"Unakite", 				"Max level",	90).getInt();

		RocksGenerator.ROCKS_FREQUENCY[58]  = config.get(	"Chrysoprase",	 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[58]  = config.get(	"Chrysoprase",			"Biome type", 	"FOREST").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[58]  = config.get(	"Chrysoprase", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[58]  = config.get(	"Chrysoprase", 			"Max Size",		9).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[58]  = config.get(	"Chrysoprase", 			"Min level", 	40).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[58]  = config.get(	"Chrysoprase", 			"Max level",	85).getInt();

		RocksGenerator.ROCKS_FREQUENCY[59]  = config.get(	"Rainforest Jasper",	"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[59]  = config.get(	"Rainforest Jasper",	"Biome type", 	"JUNGLE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[59]  = config.get(	"Rainforest Jasper", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[59]  = config.get(	"Rainforest Jasper", 	"Max Size",		9).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[59]  = config.get(	"Rainforest Jasper", 	"Min level", 	44).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[59]  = config.get(	"Rainforest Jasper", 	"Max level",	86).getInt();

		RocksGenerator.ROCKS_FREQUENCY[60]  = config.get(	"Glauconite", 			"Frequency", 	11).getInt();
			RocksGenerator.ROCKS_BIOME[60]  = config.get(	"Glauconite", 			"Biome type", 	"OCEAN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[60]  = config.get(	"Glauconite", 			"Min Size", 	8).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[60]  = config.get(	"Glauconite", 			"Max Size",		16).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[60]  = config.get(	"Glauconite", 			"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[60]  = config.get(	"Glauconite", 			"Max level",	60).getInt();

		RocksGenerator.ROCKS_FREQUENCY[61]  = config.get(	"Dunite",				"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[61]  = config.get(	"Dunite",				"Biome type", 	"PLAINS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[61]  = config.get(	"Dunite", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[61]  = config.get(	"Dunite", 				"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[61]  = config.get(	"Dunite", 				"Min level", 	24).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[61]  = config.get(	"Dunite", 				"Max level",	42).getInt();

		RocksGenerator.ROCKS_FREQUENCY[62]  = config.get(	"Rhodochrosite", 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[62]  = config.get(	"Rhodochrosite", 		"Biome type", 	"SPOOKY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[62]  = config.get(	"Rhodochrosite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[62]  = config.get(	"Rhodochrosite", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[62]  = config.get(	"Rhodochrosite", 		"Min level", 	39).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[62]  = config.get(	"Rhodochrosite", 		"Max level",	86).getInt();

		RocksGenerator.ROCKS_FREQUENCY[63]  = config.get(	"Kakortokite", 			"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[63]  = config.get(	"Kakortokite", 			"Biome type", 	"SNOWY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[63]  = config.get(	"Kakortokite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[63]  = config.get(	"Kakortokite", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[63]  = config.get(	"Kakortokite", 			"Min level", 	35).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[63]  = config.get(	"Kakortokite", 			"Max level",	181).getInt();

		RocksGenerator.ROCKS_FREQUENCY[64]  = config.get(	"Pink Granite", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[64]  = config.get(	"Pink Granite", 		"Biome type", 	"DENSE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[64]  = config.get(	"Pink Granite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[64]  = config.get(	"Pink Granite", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[64]  = config.get(	"Pink Granite", 		"Min level", 	34).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[64]  = config.get(	"Pink Granite", 		"Max level",	80).getInt();

		RocksGenerator.ROCKS_FREQUENCY[65]  = config.get(	"Pink Onyx", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[65]  = config.get(	"Pink Onyx", 			"Biome type", 	"MUSHROOM").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[65]  = config.get(	"Pink Onyx", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[65]  = config.get(	"Pink Onyx", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[65]  = config.get(	"Pink Onyx", 			"Min level", 	39).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[65]  = config.get(	"Pink Onyx", 			"Max level",	176).getInt();

		RocksGenerator.ROCKS_FREQUENCY[66]  = config.get(	"Pink Trachyte", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[66]  = config.get(	"Pink Trachyte", 		"Biome type", 	"OCEAN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[66]  = config.get(	"Pink Trachyte", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[66]  = config.get(	"Pink Trachyte", 		"Max Size",		20).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[66]  = config.get(	"Pink Trachyte", 		"Min level", 	40).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[66]  = config.get(	"Pink Trachyte", 		"Max level",	78).getInt();

		RocksGenerator.ROCKS_FREQUENCY[67]  = config.get(	"Pink Porphyry", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[67]  = config.get(	"Pink Porphyry", 		"Biome type", 	"WASTELAND").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[67]  = config.get(	"Pink Porphyry", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[67]  = config.get(	"Pink Porphyry", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[67]  = config.get(	"Pink Porphyry", 		"Min level", 	18).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[67]  = config.get(	"Pink Porphyry", 		"Max level",	66).getInt();

		RocksGenerator.ROCKS_FREQUENCY[68]  = config.get(	"Pink Travertine", 		"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[68]  = config.get(	"Pink Travertine", 		"Biome type", 	"BEACH").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[68]  = config.get(	"Pink Travertine", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[68]  = config.get(	"Pink Travertine", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[68]  = config.get(	"Pink Travertine", 		"Min level", 	50).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[68]  = config.get(	"Pink Travertine", 		"Max level",	180).getInt();

		RocksGenerator.ROCKS_FREQUENCY[69]  = config.get(	"Rhodonite", 			"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[69]  = config.get(	"Rhodonite", 			"Biome type", 	"LUSH").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[69]  = config.get(	"Rhodonite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[69]  = config.get(	"Rhodonite", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[69]  = config.get(	"Rhodonite", 			"Min level", 	29).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[69]  = config.get(	"Rhodonite", 			"Max level",	53).getInt();

		RocksGenerator.ROCKS_FREQUENCY[70]  = config.get(	"Charoite", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[70]  = config.get(	"Charoite", 			"Biome type", 	"SNOWY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[70]  = config.get(	"Charoite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[70]  = config.get(	"Charoite", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[70]  = config.get(	"Charoite", 			"Min level", 	19).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[70]  = config.get(	"Charoite", 			"Max level",	41).getInt();

		RocksGenerator.ROCKS_FREQUENCY[71]  = config.get(	"Jasperoid", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[71]  = config.get(	"Jasperoid", 			"Biome type", 	"MUSHROOM").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[71]  = config.get(	"Jasperoid", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[71]  = config.get(	"Jasperoid", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[71]  = config.get(	"Jasperoid", 			"Min level", 	10).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[71]  = config.get(	"Jasperoid", 			"Max level",	128).getInt();

		RocksGenerator.ROCKS_FREQUENCY[72]  = config.get(	"Sugilite", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[72]  = config.get(	"Sugilite", 			"Biome type", 	"HILLS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[72]  = config.get(	"Sugilite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[72]  = config.get(	"Sugilite", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[72]  = config.get(	"Sugilite", 			"Min level", 	33).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[72]  = config.get(	"Sugilite", 			"Max level",	55).getInt();

		RocksGenerator.ROCKS_FREQUENCY[73]  = config.get(	"Stichtite", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[73]  = config.get(	"Stichtite", 			"Biome type", 	"HOT").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[73]  = config.get(	"Stichtite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[73]  = config.get(	"Stichtite", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[73]  = config.get(	"Stichtite", 			"Min level", 	40).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[73]  = config.get(	"Stichtite", 			"Max level",	82).getInt();

		RocksGenerator.ROCKS_FREQUENCY[74]  = config.get(	"Dumortierite", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[74]  = config.get(	"Dumortierite", 		"Biome type", 	"COLD").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[74]  = config.get(	"Dumortierite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[74]  = config.get(	"Dumortierite", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[74]  = config.get(	"Dumortierite", 		"Min level", 	43).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[74]  = config.get(	"Dumortierite", 		"Max level",	191).getInt();

		RocksGenerator.ROCKS_FREQUENCY[75]  = config.get(	"Purple Porphyry", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[75]  = config.get(	"Purple Porphyry", 		"Biome type", 	"DRY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[75]  = config.get(	"Purple Porphyry", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[75]  = config.get(	"Purple Porphyry", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[75]  = config.get(	"Purple Porphyry", 		"Min level", 	47).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[75]  = config.get(	"Purple Porphyry", 		"Max level",	169).getInt();

		RocksGenerator.ROCKS_FREQUENCY[76]  = config.get(	"Aplite", 				"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[76]  = config.get(	"Aplite", 				"Biome type", 	"SANDY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[76]  = config.get(	"Aplite", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[76]  = config.get(	"Aplite", 				"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[76]  = config.get(	"Aplite", 				"Min level", 	49).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[76]  = config.get(	"Aplite", 				"Max level",	160).getInt();

		RocksGenerator.ROCKS_FREQUENCY[77]  = config.get(	"Red Carnelian", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[77]  = config.get(	"Red Carnelian", 		"Biome type", 	"CONIFEROUS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[77]  = config.get(	"Red Carnelian", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[77]  = config.get(	"Red Carnelian", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[77]  = config.get(	"Red Carnelian", 		"Min level", 	21).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[77]  = config.get(	"Red Carnelian", 		"Max level",	37).getInt();

		RocksGenerator.ROCKS_FREQUENCY[78]  = config.get(	"Red Aventurine", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[78]  = config.get(	"Red Aventurine", 		"Biome type", 	"MESA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[78]  = config.get(	"Red Aventurine", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[78]  = config.get(	"Red Aventurine", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[78]  = config.get(	"Red Aventurine", 		"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[78]  = config.get(	"Red Aventurine", 		"Max level",	47).getInt();

		RocksGenerator.ROCKS_FREQUENCY[79]  = config.get(	"Red Granite", 			"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[79]  = config.get(	"Red Granite", 			"Biome type", 	"MOUNTAIN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[79]  = config.get(	"Red Granite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[79]  = config.get(	"Red Granite", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[79]  = config.get(	"Red Granite", 			"Min level", 	20).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[79]  = config.get(	"Red Granite", 			"Max level",	190).getInt();

		RocksGenerator.ROCKS_FREQUENCY[80]  = config.get(	"Red Onyx", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[80]  = config.get(	"Red Onyx", 			"Biome type", 	"SAVANNA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[80]  = config.get(	"Red Onyx", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[80]  = config.get(	"Red Onyx", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[80]  = config.get(	"Red Onyx", 			"Min level", 	60).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[80]  = config.get(	"Red Onyx", 			"Max level",	113).getInt();

		RocksGenerator.ROCKS_FREQUENCY[81]  = config.get(	"Red Porphyry", 		"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[81]  = config.get(	"Red Porphyry", 		"Biome type", 	"LUSH").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[81]  = config.get(	"Red Porphyry", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[81]  = config.get(	"Red Porphyry", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[81]  = config.get(	"Red Porphyry", 		"Min level", 	19).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[81]  = config.get(	"Red Porphyry", 		"Max level",	195).getInt();

		RocksGenerator.ROCKS_FREQUENCY[82]  = config.get(	"Red Jasper", 			"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[82]  = config.get(	"Red Jasper", 			"Biome type", 	"MESA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[82]  = config.get(	"Red Jasper", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[82]  = config.get(	"Red Jasper", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[82]  = config.get(	"Red Jasper", 			"Min level", 	37).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[82]  = config.get(	"Red Jasper", 			"Max level",	65).getInt();

		RocksGenerator.ROCKS_FREQUENCY[83]  = config.get(	"Rose Red", 			"Frequency", 	11).getInt();
			RocksGenerator.ROCKS_BIOME[83]  = config.get(	"Rose Red", 			"Biome type", 	"SANDY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[83]  = config.get(	"Rose Red", 			"Min Size", 	8).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[83]  = config.get(	"Rose Red", 			"Max Size",		16).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[83]  = config.get(	"Rose Red", 			"Min level", 	47).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[83]  = config.get(	"Rose Red", 			"Max level",	95).getInt();

		RocksGenerator.ROCKS_FREQUENCY[84]  = config.get(	"Sunstone", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[84]  = config.get(	"Sunstone", 			"Biome type", 	"SPARSE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[84]  = config.get(	"Sunstone", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[84]  = config.get(	"Sunstone", 			"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[84]  = config.get(	"Sunstone", 			"Min level", 	23).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[84]  = config.get(	"Sunstone", 			"Max level",	40).getInt();

		RocksGenerator.ROCKS_FREQUENCY[85]  = config.get(	"Red Trachyte", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[85]  = config.get(	"Red Trachyte", 		"Biome type", 	"MESA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[85]  = config.get(	"Red Trachyte", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[85]  = config.get(	"Red Trachyte", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[85]  = config.get(	"Red Trachyte", 		"Min level", 	55).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[85]  = config.get(	"Red Trachyte", 		"Max level",	170).getInt();

		RocksGenerator.ROCKS_FREQUENCY[86]  = config.get(	"Noreena Jasper", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[86]  = config.get(	"Noreena Jasper", 		"Biome type", 	"OCEAN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[86]  = config.get(	"Noreena Jasper", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[86]  = config.get(	"Noreena Jasper", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[86]  = config.get(	"Noreena Jasper", 		"Min level", 	38).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[86]  = config.get(	"Noreena Jasper", 		"Max level",	68).getInt();

		RocksGenerator.ROCKS_FREQUENCY[87]  = config.get(	"Mookaite Jasper", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[87]  = config.get(	"Mookaite Jasper", 		"Biome type", 	"JUNGLE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[87]  = config.get(	"Mookaite Jasper", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[87]  = config.get(	"Mookaite Jasper", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[87]  = config.get(	"Mookaite Jasper", 		"Min level", 	15).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[87]  = config.get(	"Mookaite Jasper", 		"Max level",	40).getInt();

		RocksGenerator.ROCKS_FREQUENCY[88]  = config.get(	"Red Tiger Eye", 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[88]  = config.get(	"Red Tiger Eye", 		"Biome type", 	"DRY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[88]  = config.get(	"Red Tiger Eye", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[88]  = config.get(	"Red Tiger Eye", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[88]  = config.get(	"Red Tiger Eye", 		"Min level", 	45).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[88]  = config.get(	"Red Tiger Eye", 		"Max level",	80).getInt();

		RocksGenerator.ROCKS_FREQUENCY[89]  = config.get(	"Jaspilite", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[89]  = config.get(	"Jaspilite", 			"Biome type", 	"PLAINS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[89]  = config.get(	"Jaspilite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[89]  = config.get(	"Jaspilite", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[89]  = config.get(	"Jaspilite", 			"Min level", 	18).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[89]  = config.get(	"Jaspilite", 			"Max level",	33).getInt();

		RocksGenerator.ROCKS_FREQUENCY[90]  = config.get(	"Alabaster", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[90]  = config.get(	"Alabaster", 			"Biome type", 	"SAVANNA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[90]  = config.get(	"Alabaster", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[90]  = config.get(	"Alabaster", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[90]  = config.get(	"Alabaster", 			"Min level", 	50).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[90]  = config.get(	"Alabaster", 			"Max level",	177).getInt();

		RocksGenerator.ROCKS_FREQUENCY[91]  = config.get(	"Chalk", 				"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[91]  = config.get(	"Chalk", 				"Biome type", 	"RIVER").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[91]  = config.get(	"Chalk", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[91]  = config.get(	"Chalk", 				"Max Size",		16).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[91]  = config.get(	"Chalk", 				"Min level", 	20).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[91]  = config.get(	"Chalk", 				"Max level",	103).getInt();

		RocksGenerator.ROCKS_FREQUENCY[92]  = config.get(	"White Granite", 		"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[92]  = config.get(	"White Granite", 		"Biome type", 	"RIVER").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[92]  = config.get(	"White Granite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[92]  = config.get(	"White Granite", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[92]  = config.get(	"White Granite", 		"Min level", 	22).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[92]  = config.get(	"White Granite", 		"Max level",	87).getInt();

		RocksGenerator.ROCKS_FREQUENCY[93]  = config.get(	"White Onyx", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[93]  = config.get(	"White Onyx", 			"Biome type", 	"COLD").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[93]  = config.get(	"White Onyx", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[93]  = config.get(	"White Onyx", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[93]  = config.get(	"White Onyx", 			"Min level", 	21).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[93]  = config.get(	"White Onyx", 			"Max level",	153).getInt();

		RocksGenerator.ROCKS_FREQUENCY[94]  = config.get(	"Moonstone", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[94]  = config.get(	"Moonstone", 			"Biome type", 	"MAGICAL").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[94]  = config.get(	"Moonstone", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[94]  = config.get(	"Moonstone", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[94]  = config.get(	"Moonstone", 			"Min level", 	10).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[94]  = config.get(	"Moonstone", 			"Max level",	23).getInt();

		RocksGenerator.ROCKS_FREQUENCY[95]  = config.get(	"Porcelain Jasper", 	"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[95]  = config.get(	"Porcelain Jasper", 	"Biome type", 	"FOREST").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[95]  = config.get(	"Porcelain Jasper", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[95]  = config.get(	"Porcelain Jasper", 	"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[95]  = config.get(	"Porcelain Jasper", 	"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[95]  = config.get(	"Porcelain Jasper", 	"Max level",	56).getInt();

		RocksGenerator.ROCKS_FREQUENCY[96]  = config.get(	"Milky Quartz", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[96]  = config.get(	"Milky Quartz", 		"Biome type", 	"MOUNTAIN").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[96]  = config.get(	"Milky Quartz", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[96]  = config.get(	"Milky Quartz", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[96]  = config.get(	"Milky Quartz", 		"Min level", 	41).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[96]  = config.get(	"Milky Quartz", 		"Max level",	191).getInt();

		RocksGenerator.ROCKS_FREQUENCY[97]  = config.get(	"White Tuff", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[97]  = config.get(	"White Tuff", 			"Biome type", 	"PLAINS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[97]  = config.get(	"White Tuff", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[97]  = config.get(	"White Tuff", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[97]  = config.get(	"White Tuff", 			"Min level", 	42).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[97]  = config.get(	"White Tuff", 			"Max level",	183).getInt();

		RocksGenerator.ROCKS_FREQUENCY[98]  = config.get(	"Ocean Jasper", 		"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[98]  = config.get(	"Ocean Jasper", 		"Biome type", 	"SPARSE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[98]  = config.get(	"Ocean Jasper", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[98]  = config.get(	"Ocean Jasper", 		"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[98]  = config.get(	"Ocean Jasper", 		"Min level", 	20).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[98]  = config.get(	"Ocean Jasper", 		"Max level",	43).getInt();

		RocksGenerator.ROCKS_FREQUENCY[99]  = config.get(	"Howlite", 				"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[99]  = config.get(	"Howlite", 				"Biome type", 	"LUSH").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[99]  = config.get(	"Howlite", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[99]  = config.get(	"Howlite", 				"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[99]  = config.get(	"Howlite", 				"Min level", 	54).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[99]  = config.get(	"Howlite", 				"Max level",	155).getInt();

		RocksGenerator.ROCKS_FREQUENCY[100]  = config.get(	"Dalmatian Jasper", 	"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[100]  = config.get(	"Dalmatian Jasper", 	"Biome type", 	"MAGICAL").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[100]  = config.get(	"Dalmatian Jasper", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[100]  = config.get(	"Dalmatian Jasper", 	"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[100]  = config.get(	"Dalmatian Jasper", 	"Min level", 	14).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[100]  = config.get(	"Dalmatian Jasper", 	"Max level",	35).getInt();

		RocksGenerator.ROCKS_FREQUENCY[101]  = config.get(	"Diatomite", 			"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[101]  = config.get(	"Diatomite", 			"Biome type", 	"JUNGLE").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[101]  = config.get(	"Diatomite", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[101]  = config.get(	"Diatomite", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[101]  = config.get(	"Diatomite", 			"Min level", 	48).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[101]  = config.get(	"Diatomite", 			"Max level",	66).getInt();

		RocksGenerator.ROCKS_FREQUENCY[102]  = config.get(	"Yellow Aventurine", 	"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[102]  = config.get(	"Yellow Aventurine", 	"Biome type", 	"SNOWY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[102]  = config.get(	"Yellow Aventurine", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[102]  = config.get(	"Yellow Aventurine", 	"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[102]  = config.get(	"Yellow Aventurine", 	"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[102]  = config.get(	"Yellow Aventurine", 	"Max level",	80).getInt();

		RocksGenerator.ROCKS_FREQUENCY[103]  = config.get(	"Yellow Granite", 		"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[103]  = config.get(	"Yellow Granite", 		"Biome type", 	"SPOOKY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[103]  = config.get(	"Yellow Granite", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[103]  = config.get(	"Yellow Granite", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[103]  = config.get(	"Yellow Granite", 		"Min level", 	45).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[103]  = config.get(	"Yellow Granite", 		"Max level",	120).getInt();

		RocksGenerator.ROCKS_FREQUENCY[104]  = config.get(	"Yellow Jasper", 		"Frequency", 	7).getInt();
			RocksGenerator.ROCKS_BIOME[104]  = config.get(	"Yellow Jasper", 		"Biome type", 	"SAVANNA").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[104]  = config.get(	"Yellow Jasper", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[104]  = config.get(	"Yellow Jasper", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[104]  = config.get(	"Yellow Jasper", 		"Min level", 	41).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[104]  = config.get(	"Yellow Jasper", 		"Max level",	75).getInt();

		RocksGenerator.ROCKS_FREQUENCY[105]  = config.get(	"Yellow Onyx", 			"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[105]  = config.get(	"Yellow Onyx", 			"Biome type", 	"BEACH").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[105]  = config.get(	"Yellow Onyx", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[105]  = config.get(	"Yellow Onyx", 			"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[105]  = config.get(	"Yellow Onyx", 			"Min level", 	45).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[105]  = config.get(	"Yellow Onyx", 			"Max level",	175).getInt();

		RocksGenerator.ROCKS_FREQUENCY[106]  = config.get(	"Yellow Porphyry", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[106]  = config.get(	"Yellow Porphyry", 		"Biome type", 	"SWAMP").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[106]  = config.get(	"Yellow Porphyry", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[106]  = config.get(	"Yellow Porphyry", 		"Max Size",		10).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[106]  = config.get(	"Yellow Porphyry", 		"Min level", 	35).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[106]  = config.get(	"Yellow Porphyry", 		"Max level",	165).getInt();

		RocksGenerator.ROCKS_FREQUENCY[107]  = config.get(	"Yellow Tiger Eye", 	"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[107]  = config.get(	"Yellow Tiger Eye", 	"Biome type", 	"MAGICAL").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[107]  = config.get(	"Yellow Tiger Eye", 	"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[107]  = config.get(	"Yellow Tiger Eye", 	"Max Size",		8).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[107]  = config.get(	"Yellow Tiger Eye", 	"Min level", 	10).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[107]  = config.get(	"Yellow Tiger Eye", 	"Max level",	45).getInt();

		RocksGenerator.ROCKS_FREQUENCY[108]  = config.get(	"Yellow Trachyte", 		"Frequency", 	9).getInt();
			RocksGenerator.ROCKS_BIOME[108]  = config.get(	"Yellow Trachyte", 		"Biome type", 	"DEAD").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[108]  = config.get(	"Yellow Trachyte", 		"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[108]  = config.get(	"Yellow Trachyte", 		"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[108]  = config.get(	"Yellow Trachyte", 		"Min level", 	16).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[108]  = config.get(	"Yellow Trachyte", 		"Max level",	140).getInt();

		RocksGenerator.ROCKS_FREQUENCY[109]  = config.get(	"Yellow Tuff", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[109]  = config.get(	"Yellow Tuff", 			"Biome type", 	"HILLS").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[109]  = config.get(	"Yellow Tuff", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[109]  = config.get(	"Yellow Tuff", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[109]  = config.get(	"Yellow Tuff", 			"Min level", 	20).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[109]  = config.get(	"Yellow Tuff", 			"Max level",	120).getInt();

		RocksGenerator.ROCKS_FREQUENCY[110]  = config.get(	"Mudstone", 			"Frequency", 	10).getInt();
			RocksGenerator.ROCKS_BIOME[110]  = config.get(	"Mudstone", 			"Biome type", 	"WET").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[110]  = config.get(	"Mudstone", 			"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[110]  = config.get(	"Mudstone", 			"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[110]  = config.get(	"Mudstone", 			"Min level", 	30).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[110]  = config.get(	"Mudstone", 			"Max level",	94).getInt();

		RocksGenerator.ROCKS_FREQUENCY[111]  = config.get(	"Felsite", 				"Frequency", 	8).getInt();
			RocksGenerator.ROCKS_BIOME[111]  = config.get(	"Felsite", 				"Biome type", 	"DRY").getString();
		 RocksGenerator.ROCKS_MIN_SIZE[111]  = config.get(	"Felsite", 				"Min Size", 	4).getInt();
		 RocksGenerator.ROCKS_MAX_SIZE[111]  = config.get(	"Felsite", 				"Max Size",		12).getInt();
		 RocksGenerator.ROCKS_MIN_VEIN[111]  = config.get(	"Felsite", 				"Min level", 	15).getInt();
		 RocksGenerator.ROCKS_MAX_VEIN[111]  = config.get(	"Felsite", 				"Max level",	31).getInt();

	    if (config.hasChanged()) {
	    	config.save();
	    }
	}
}