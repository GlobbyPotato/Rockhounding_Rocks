package com.globbypotato.rockhounding_rocks.enums.rocks;

import net.minecraft.util.IStringSerializable;

public enum EnumRocksG implements BaseEnum{

	MILKY_QUARTZ(2, 3.3F, "White"),
	WHITE_TUFF(1, 2.1F, "White"),
	OCEAN_JASPER(0, 2.7F, "White"),
	HOWLITE(0, 2.0F, "White"),
	DALMATIAN_JASPER(2, 4.3F, "White"),
	DIATOMITE(0, 1.0F, "White"),
	YELLOW_AVENTURINE(2, 3.3F, "Yellow"),
	YELLOW_GRANITE(1, 2.9F, "Yellow"),
	YELLOW_JASPER(2, 3.4F, "Yellow"),
	YELLOW_ONYX(2, 3.6F, "Yellow"),
	YELLOW_PORPHYRY(1, 2.5F, "Yellow"),
	YELLOW_TIGER_EYE(1, 3.0F, "Yellow"),
	YELLOW_TRACHYTE(1, 2.4F, "Yellow"),
	YELLOW_TUFF(1, 2.2F, "Yellow"),
	MUDSTONE(1, 1.7F, "Yellow"),
	FELSITE(1, 2.5F, "Yellow");

	private int harvest;
	private float hardness;
	private String color;
	private EnumRocksG(int harvest, float hardness, String color) {
		this.harvest = harvest;
		this.hardness = hardness;
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

}