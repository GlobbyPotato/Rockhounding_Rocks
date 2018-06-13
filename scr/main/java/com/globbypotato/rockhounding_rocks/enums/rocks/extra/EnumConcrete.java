package com.globbypotato.rockhounding_rocks.enums.rocks.extra;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumConcrete implements BaseEnum{

	BLACK(0, 2.0F, "Black", "pickaxe"),
	RED(0, 2.0F, "Red", "pickaxe"),
	GREEN(0, 2.0F, "Green", "pickaxe"),
	BROWN(0, 2.0F, "Brown", "pickaxe"),
	BLUE(0, 2.0F, "Blue", "pickaxe"),
	PURPLE(0, 2.0F, "Purple", "pickaxe"),
	CYAN(0, 2.0F, "Cyan", "pickaxe"),
	SILVER(0, 2.0F, "Silver", "pickaxe"),
	GRAY(0, 2.0F, "Gray", "pickaxe"),
	PINK(0, 2.0F, "Pink", "pickaxe"),
	LIME(0, 2.0F, "Lime", "pickaxe"),
	YELLOW(0, 2.0F, "Yellow", "pickaxe"),
	LIGHT_BLUE(0, 2.0F, "LightBlue", "pickaxe"),
	MAGENTA(0, 2.0F, "Magenta", "pickaxe"),
	ORANGE(0, 2.0F, "Orange", "pickaxe"),
	WHITE(0, 2.0F, "White", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumConcrete(int harvest, float hardness, String color, String tool) {
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