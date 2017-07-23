package com.globbypotato.rockhounding_rocks.enums.rocks;

import net.minecraft.util.IStringSerializable;

public enum EnumRocksE implements BaseEnum{

	PINK_GRANITE(1, 2.5F, "Pink"),
	PINK_ONYX(2, 3.5F, "Pink"),
	PINK_TRACHYTE(1, 3.1F, "Pink"),
	PINK_PORPHYRY(1, 2.5F, "Pink"),
	PINK_TRAVERTINE(1, 2.2F, "Pink"),
	RHODONITE(1, 2.6F, "Pink"),
	CHAROITE(1, 3.0F, "Purple"),
	JASPEROID(1, 2.2F, "Purple"),
	SUGILITE(1, 3.3F, "Magenta"),
	STICHTITE(2, 4.0F, "Magenta"),
	DUMORTIERITE(2, 4.3F, "Purple"),
	PURPLE_PORPHYRY(1, 2.9F, "Purple"),
	APLITE(1, 3.7F, "Purple"),
	RED_CARNELIAN(2, 4.3F, "Red"),
	RED_AVENTURINE(2, 3.7F, "Red"),
	RED_GRANITE(1, 2.9F, "Red");

	private int harvest;
	private float hardness;
	private String color;
	private EnumRocksE(int harvest, float hardness, String color) {
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
		for(int i = 0; i <size(); i++){
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