package com.globbypotato.rockhounding_rocks.enums.rocks.extra;

import com.globbypotato.rockhounding_rocks.enums.rocks.BaseEnum;

public enum EnumClay implements BaseEnum{

	HARDENED_BLACK(2, 3.3F, "Black"),
	HARDENED_RED(2, 4.0F, "Red"),
	HARDENED_GREEN(1, 3.3F, "Green"),
	HARDENED_BROWN(0, 1.0F, "Brown"),
	HARDENED_BLUE(2, 2.2F, "Blue"),
	HARDENED_PURPLE(2, 3.2F, "Purple"),
	HARDENED_CYAN(0, 3.8F, "Cyan"),
	HARDENED_SILVER(1, 2.4F, "Silver"),
	HARDENED_GRAY(1, 3.1F, "Gray"),
	HARDENED_PINK(1, 1.9F, "Pink"),
	HARDENED_LIME(2, 4.4F, "Lime"),
	HARDENED_YELLOW(2, 3.2F, "Yellow"),
	HARDENED_LIGHT_BLUE(0, 1.8F, "LightBlue"),
	HARDENED_MAGENTA(2, 3.0F, "Magenta"),
	HARDENED_ORANGE(2, 3.5F, "Orange"),
	HARDENED_WHITE(1, 2.2F, "White");

	private int harvest;
	private float hardness;
	private String color;
	private EnumClay(int harvest, float hardness, String color) {
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