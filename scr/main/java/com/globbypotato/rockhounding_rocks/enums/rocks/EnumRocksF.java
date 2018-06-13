package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumRocksF implements BaseEnum{

	RED_ONYX(2, 3.6F, "Red", "pickaxe"),
	RED_PORPHYRY(1, 3.0F, "Red", "pickaxe"),
	RED_JASPER(2, 3.5F, "Red", "pickaxe"),
	ROSE_RED(1, 2.0F, "Orange", "pickaxe"),
	SUNSTONE(1, 2.6F, "Orange", "pickaxe"),
	RED_TRACHYTE(1, 2.3F, "Red", "pickaxe"),
	NOREENA_JASPER(2, 3.2F, "Red", "pickaxe"),
	MOOKAITE_JASPER(2, 3.3F, "Red", "pickaxe"),
	RED_TIGER_EYE(1, 3.4F, "Red", "pickaxe"),
	JASPILITE(1, 2.8F, "Red", "pickaxe"),
	ALABASTER(0, 1.3F, "White", "pickaxe"),
	CHALK(0, 0.8F, "White", "pickaxe"),
	WHITE_GRANITE(1, 2.9F, "White", "pickaxe"),
	WHITE_ONYX(2, 3.4F, "White", "pickaxe"),
	MOONSTONE(1, 3.0F, "LightBlue", "pickaxe"),
	PORCELAIN_JASPER(2, 3.7F, "Silver", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumRocksF(int harvest, float hardness, String color, String tool) {
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