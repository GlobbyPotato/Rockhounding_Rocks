package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumRocksG implements BaseEnum{

	MILKY_QUARTZ(2, 3.3F, "White", "pickaxe"),
	WHITE_TUFF(1, 2.1F, "White", "pickaxe"),
	OCEAN_JASPER(0, 2.7F, "White", "pickaxe"),
	HOWLITE(1, 2.0F, "White", "pickaxe"),
	DALMATIAN_JASPER(2, 4.3F, "White", "pickaxe"),
	DIATOMITE(0, 1.0F, "White", "shovel"),
	YELLOW_AVENTURINE(2, 3.3F, "Yellow", "pickaxe"),
	YELLOW_GRANITE(1, 2.9F, "Yellow", "pickaxe"),
	YELLOW_JASPER(2, 3.4F, "Yellow", "pickaxe"),
	YELLOW_ONYX(2, 3.6F, "Yellow", "pickaxe"),
	YELLOW_PORPHYRY(1, 2.5F, "Yellow", "pickaxe"),
	YELLOW_TIGER_EYE(1, 3.0F, "Yellow", "pickaxe"),
	YELLOW_TRACHYTE(1, 2.4F, "Yellow", "pickaxe"),
	YELLOW_TUFF(1, 2.2F, "Yellow", "pickaxe"),
	MUDSTONE(1, 1.7F, "Yellow", "pickaxe"),
	FELSITE(1, 2.5F, "Yellow", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumRocksG(int harvest, float hardness, String color, String tool) {
		this.harvest = harvest;
		this.hardness = hardness;
		this.tool = tool;
		this.color = color;
	}

	//---------CUSTOM----------------
	public static int size(){
		return values().length;
	}

	public static String name(int index) {
		return values()[index].getName();
	}

	//---------ENUM----------------
	public static String[] getNames(){
		String[] temp = new String[size()];
		for(int i = 0; i < size(); i++){
			temp[i] = getName(i);
		}
		return temp;
	}

	public static String getName(int index){
		return name(index);
	}

	public int harvest(){
		return this.harvest;
	}

	public float hardness(){
		return this.hardness;
	}

	public String color(){
		return this.color;
	}

	public String tool(){
		return this.tool;
	}

}