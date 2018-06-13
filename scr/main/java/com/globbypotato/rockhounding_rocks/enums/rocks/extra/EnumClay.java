package com.globbypotato.rockhounding_rocks.enums.rocks.extra;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumClay implements BaseEnum{

	HARDENED_BLACK(0, 2.0F, "Black", "pickaxe"),
	HARDENED_RED(0, 2.0F, "Red", "pickaxe"),
	HARDENED_GREEN(0, 2.0F, "Green", "pickaxe"),
	HARDENED_BROWN(0, 2.0F, "Brown", "pickaxe"),
	HARDENED_BLUE(0, 2.0F, "Blue", "pickaxe"),
	HARDENED_PURPLE(0, 2.0F, "Purple", "pickaxe"),
	HARDENED_CYAN(0, 2.0F, "Cyan", "pickaxe"),
	HARDENED_SILVER(0, 2.0F, "Silver", "pickaxe"),
	HARDENED_GRAY(0, 2.0F, "Gray", "pickaxe"),
	HARDENED_PINK(0, 2.0F, "Pink", "pickaxe"),
	HARDENED_LIME(0, 2.0F, "Lime", "pickaxe"),
	HARDENED_YELLOW(0, 2.0F, "Yellow", "pickaxe"),
	HARDENED_LIGHT_BLUE(0, 2.0F, "LightBlue", "pickaxe"),
	HARDENED_MAGENTA(0, 2.0F, "Magenta", "pickaxe"),
	HARDENED_ORANGE(0, 2.0F, "Orange", "pickaxe"),
	HARDENED_WHITE(0, 2.0F, "White", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumClay(int harvest, float hardness, String color, String tool) {
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