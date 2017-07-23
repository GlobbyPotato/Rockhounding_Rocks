package com.globbypotato.rockhounding_rocks.enums.rocks;

import net.minecraft.util.IStringSerializable;

public enum EnumRocksF implements BaseEnum{

	RED_ONYX(2, 3.6F, "Red"),
	RED_PORPHYRY(1, 3.0F, "Red"),
	RED_JASPER(2, 3.5F, "Red"),
	ROSE_RED(1, 2.0F, "Orange"),
	SUNSTONE(1, 2.6F, "Orange"),
	RED_TRACHYTE(1, 2.3F, "Red"),
	NOREENA_JASPER(2, 3.2F, "Red"),
	MOOKAITE_JASPER(2, 3.3F, "Red"),
	RED_TIGER_EYE(1, 3.4F, "Red"),
	JASPILITE(1, 2.8F, "Red"),
	ALABASTER(0, 1.3F, "White"),
	CHALK(0, 0.8F, "White"),
	WHITE_GRANITE(1, 2.9F, "White"),
	WHITE_ONYX(2, 3.4F, "White"),
	MOONSTONE(1, 3.0F, "LightBlue"),
	PORCELAIN_JASPER(2, 3.7F, "Silver");

	private int harvest;
	private float hardness;
	private String color;
	private EnumRocksF(int harvest, float hardness, String color) {
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