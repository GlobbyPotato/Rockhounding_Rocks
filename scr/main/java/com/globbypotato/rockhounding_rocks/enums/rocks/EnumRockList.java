package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;
import com.globbypotato.rockhounding_rocks.handler.Reference;

public enum EnumRockList implements BaseEnum{
	BLACK_AVENTURINE("rocks_a"),
	BASANITE("rocks_a"),
	BLACK_GRANITE("rocks_a"),
	JET("rocks_a"),
	LUXULYANITE("rocks_a"),
	BLACK_ONYX("rocks_a"),
	PORTORO("rocks_a"),
	SNOWFLAKE_OBSIDIAN("rocks_a"),
	BLACK_TIGER_EYE("rocks_a"),
	SLATE("rocks_a"),
	GABBRO("rocks_a"),
	BLUE_AVENTURINE("rocks_a"),
	CHRYSOCOLLA("rocks_a"),
	BLUE_GRANITE("rocks_a"),
	BLUE_JASPER("rocks_a"),
	LABRADORITE("rocks_a"),
	LARIMAR("rocks_b"),
	BLUE_ONYX("rocks_b"),
	PIETERSITE("rocks_b"),
	SODALITE("rocks_b"),
	BLUE_TIGER_EYE("rocks_b"),
	AZURITE("rocks_b"),
	BROWN_AVENTURINE("rocks_b"),
	LATERITE("rocks_b"),
	BROWN_CARNELIAN("rocks_b"),
	BROWN_PORPHYRY("rocks_b"),
	SCORIA("rocks_b"),
	SMOKY_QUARTZ("rocks_b"),
	BRONZITE("rocks_b"),
	TIGER_IRON("rocks_b"),
	ARKOSE("rocks_b"),
	IGNIMBRITE("rocks_b"),
	GNEISS("rocks_c"),
	PUMICE("rocks_c"),
	GRAY_GRANITE("rocks_c"),
	GRAY_ONYX("rocks_c"),
	GRAY_PORPHYRY("rocks_c"),
	SPIDERWEB_JASPER("rocks_c"),
	GRAY_TRACHYTE("rocks_c"),
	GRAY_TRAVERTINE("rocks_c"),
	GRAY_TUFF("rocks_c"),
	ZEBRA_JASPER("rocks_c"),
	DACITE("rocks_c"),
	MIGMATITE("rocks_c"),
	AMAZONITE("rocks_c"),
	GREEN_AVENTURINE("rocks_c"),
	GREEN_GRANITE("rocks_c"),
	GREEN_ONYX("rocks_c"),
	GREEN_PORPHYRY("rocks_d"),
	GREEN_JASPER("rocks_d"),
	BLOODSTONE("rocks_d"),
	JADEITE("rocks_d"),
	MALACHITE("rocks_d"),
	SERPENTINITE("rocks_d"),
	ZOISITE("rocks_d"),
	GREEN_TIGER_EYE("rocks_d"),
	GREEN_TUFF("rocks_d"),
	UNAKITE("rocks_d"),
	CHRYSOPRASE("rocks_d"),
	RAINFOREST_JASPER("rocks_d"),
	GLAUCONITE("rocks_d"),
	DUNITE("rocks_d"),
	RHODOCHROSITE("rocks_d"),
	KAKORTOKITE("rocks_d"),
	PINK_GRANITE("rocks_e"),
	PINK_ONYX("rocks_e"),
	PINK_TRACHYTE("rocks_e"),
	PINK_PORPHYRY("rocks_e"),
	PINK_TRAVERTINE("rocks_e"),
	RHODONITE("rocks_e"),
	CHAROITE("rocks_e"),
	JASPEROID("rocks_e"),
	SUGILITE("rocks_e"),
	STICHTITE("rocks_e"),
	DUMORTIERITE("rocks_e"),
	PURPLE_PORPHYRY("rocks_e"),
	APLITE("rocks_e"),
	RED_CARNELIAN("rocks_e"),
	RED_AVENTURINE("rocks_e"),
	RED_GRANITE("rocks_e"),
	RED_ONYX("rocks_f"),
	RED_PORPHYRY("rocks_f"),
	RED_JASPER("rocks_f"),
	ROSE_RED("rocks_f"),
	SUNSTONE("rocks_f"),
	RED_TRACHYTE("rocks_f"),
	NOREENA_JASPER("rocks_f"),
	MOOKAITE_JASPER("rocks_f"),
	RED_TIGER_EYE("rocks_f"),
	JASPILITE("rocks_f"),
	ALABASTER("rocks_f"),
	CHALK("rocks_f"),
	WHITE_GRANITE("rocks_f"),
	WHITE_ONYX("rocks_f"),
	MOONSTONE("rocks_f"),
	PORCELAIN_JASPER("rocks_f"),
	MILKY_QUARTZ("rocks_g"),
	WHITE_TUFF("rocks_g"),
	OCEAN_JASPER("rocks_g"),
	HOWLITE("rocks_g"),
	DALMATIAN_JASPER("rocks_g"),
	DIATOMITE("rocks_g"),
	YELLOW_AVENTURINE("rocks_g"),
	YELLOW_GRANITE("rocks_g"),
	YELLOW_JASPER("rocks_g"),
	YELLOW_ONYX("rocks_g"),
	YELLOW_PORPHYRY("rocks_g"),
	YELLOW_TIGER_EYE("rocks_g"),
	YELLOW_TRACHYTE("rocks_g"),
	YELLOW_TUFF("rocks_g"),
	MUDSTONE("rocks_g"),
	FELSITE("rocks_g"),
	APACHE_RHYOLITE("rocks_h"),
	AMMOLITE("rocks_h"),
	DENDRITIC_OPAL("rocks_h"),
	OOLITE("rocks_h"),
	GRAY_SCHIST("rocks_h"),
	GUADALUPE_JASPER("rocks_h"),
	TREE_AGATE("rocks_h"),
	BLUE_SCHIST("rocks_h"),
	UMBER("rocks_h"),
	BRECCIA("rocks_h"),
	ACTINOLITE("rocks_h"),
	MADAGASCAR_RHYOLITE("rocks_h"),
	WONDERSTONE("rocks_h"),
	OPAL("rocks_h"),
	APATITE("rocks_h"),
	ECLOGITE("rocks_h");

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