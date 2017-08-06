package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.handler.Reference;

public enum EnumRockList implements BaseEnum{
	BLACK_AVENTURINE("rocksA"),
	BASANITE("rocksA"),
	BLACK_GRANITE("rocksA"),
	JET("rocksA"),
	LUXULYANITE("rocksA"),
	BLACK_ONYX("rocksA"),
	PORTORO("rocksA"),
	SNOWFLAKE_OBSIDIAN("rocksA"),
	BLACK_TIGER_EYE("rocksA"),
	SLATE("rocksA"),
	GABBRO("rocksA"),
	BLUE_AVENTURINE("rocksA"),
	CHRYSOCOLLA("rocksA"),
	BLUE_GRANITE("rocksA"),
	BLUE_JASPER("rocksA"),
	LABRADORITE("rocksA"),
	LARIMAR("rocksB"),
	BLUE_ONYX("rocksB"),
	PIETERSITE("rocksB"),
	SODALITE("rocksB"),
	BLUE_TIGER_EYE("rocksB"),
	AZURITE("rocksB"),
	BROWN_AVENTURINE("rocksB"),
	LATERITE("rocksB"),
	BROWN_CARNELIAN("rocksB"),
	BROWN_PORPHYRY("rocksB"),
	SCORIA("rocksB"),
	SMOKY_QUARTZ("rocksB"),
	BRONZITE("rocksB"),
	TIGER_IRON("rocksB"),
	ARKOSE("rocksB"),
	IGNIMBRITE("rocksB"),
	GNEISS("rocksC"),
	PUMICE("rocksC"),
	GRAY_GRANITE("rocksC"),
	GRAY_ONYX("rocksC"),
	GRAY_PORPHYRY("rocksC"),
	SPIDERWEB_JASPER("rocksC"),
	GRAY_TRACHYTE("rocksC"),
	GRAY_TRAVERTINE("rocksC"),
	GRAY_TUFF("rocksC"),
	ZEBRA_JASPER("rocksC"),
	DACITE("rocksC"),
	MIGMATITE("rocksC"),
	AMAZONITE("rocksC"),
	GREEN_AVENTURINE("rocksC"),
	GREEN_GRANITE("rocksC"),
	GREEN_ONYX("rocksC"),
	GREEN_PORPHYRY("rocksD"),
	GREEN_JASPER("rocksD"),
	BLOODSTONE("rocksD"),
	JADEITE("rocksD"),
	MALACHITE("rocksD"),
	SERPENTINITE("rocksD"),
	ZOISITE("rocksD"),
	GREEN_TIGER_EYE("rocksD"),
	GREEN_TUFF("rocksD"),
	UNAKITE("rocksD"),
	CHRYSOPRASE("rocksD"),
	RAINFOREST_JASPER("rocksD"),
	GLAUCONITE("rocksD"),
	DUNITE("rocksD"),
	RHODOCHROSITE("rocksD"),
	KAKORTOKITE("rocksD"),
	PINK_GRANITE("rocksE"),
	PINK_ONYX("rocksE"),
	PINK_TRACHYTE("rocksE"),
	PINK_PORPHYRY("rocksE"),
	PINK_TRAVERTINE("rocksE"),
	RHODONITE("rocksE"),
	CHAROITE("rocksE"),
	JASPEROID("rocksE"),
	SUGILITE("rocksE"),
	STICHTITE("rocksE"),
	DUMORTIERITE("rocksE"),
	PURPLE_PORPHYRY("rocksE"),
	APLITE("rocksE"),
	RED_CARNELIAN("rocksE"),
	RED_AVENTURINE("rocksE"),
	RED_GRANITE("rocksE"),
	RED_ONYX("rocksF"),
	RED_PORPHYRY("rocksF"),
	RED_JASPER("rocksF"),
	ROSE_RED("rocksF"),
	SUNSTONE("rocksF"),
	RED_TRACHYTE("rocksF"),
	NOREENA_JASPER("rocksF"),
	MOOKAITE_JASPER("rocksF"),
	RED_TIGER_EYE("rocksF"),
	JASPILITE("rocksF"),
	ALABASTER("rocksF"),
	CHALK("rocksF"),
	WHITE_GRANITE("rocksF"),
	WHITE_ONYX("rocksF"),
	MOONSTONE("rocksF"),
	PORCELAIN_JASPER("rocksF"),
	MILKY_QUARTZ("rocksG"),
	WHITE_TUFF("rocksG"),
	OCEAN_JASPER("rocksG"),
	HOWLITE("rocksG"),
	DALMATIAN_JASPER("rocksG"),
	DIATOMITE("rocksG"),
	YELLOW_AVENTURINE("rocksG"),
	YELLOW_GRANITE("rocksG"),
	YELLOW_JASPER("rocksG"),
	YELLOW_ONYX("rocksG"),
	YELLOW_PORPHYRY("rocksG"),
	YELLOW_TIGER_EYE("rocksG"),
	YELLOW_TRACHYTE("rocksG"),
	YELLOW_TUFF("rocksG"),
	MUDSTONE("rocksG"),
	FELSITE("rocksG");

	private String baseBlock;
	EnumRockList(String baseBlock){
		this.baseBlock = baseBlock;
	}
	//---------CUSTOM----------------
	public static int size(){
		return values().length;
	}

	public static String name(int index) {
		return values()[index].getName();
	}

	private static String formalName(int index) {
		return name(index).substring(0, 1).toUpperCase() + name(index).substring(1);
	}

	//---------ENUM----------------
	public static String[] getNames(){
		String[] temp = new String[size()];
		for(int i = 0; i < size(); i++){
			temp[i] = getDisplayName(i);
		}
		return temp;
	}

	public static String getDisplayName(int index){
		return formalName(index).replace("_", " ");
	}

	public static String[] getUnlocNames(){
		String[] temp = new String[size()];
		for(int i = 0; i < size(); i++){
			temp[i] = getDisplayName(i);
		}
		return temp;
	}

	public static String[] getBlockNames(){
		String[] temp = new String[size()];
		for(int i = 0; i < size(); i++){
			temp[i] = getBlockName(i);
		}
		return temp;
	}

	public static String getBlockName(int index){
		return values()[index].baseBlock;
	}

	public static String getUnlocName(int index){
		String unloc = "tile." + Reference.MODID + ":" + getBlockName(index) + "."+ name(index);
		return unloc.toLowerCase();
	}

	public String getbaseBlock(){
		return this.baseBlock;
	}
}