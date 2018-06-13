package com.globbypotato.rockhounding_rocks.enums.rocks.extra;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumVanilla2 implements BaseEnum{

	PURPUR(1, 2.0F, "Purple", "pickaxe"),
	GLOWSTONE(0, 2.0F, "Yellow", "pickaxe"),
	ICE_PACKED(0, 0.5F, "LightBlue", "pickaxe"),
	BROWN_MUSHROOM(0, 2.0F, "Brown", "axe"),
	RED_MUSHROOM(0, 2.0F, "Red", "axe"),
	SIDE_MUSHROOM(0, 2.0F, "Brown", "axe"),
	DARK_PRISMARINE(0, 2.0F, "Green", "pickaxe"),
	SPONGE (0, 2.0F, "Yellow", "shovel"),
	MYCELIUM(0, 2.0F, "Purple", "shovel"),
	LEATHER(0, 2.0F, "Orange", "pickaxe"),
	OAK_WOOD(0, 2.0F, "Brown", "axe"),
	BIRCH_WOOD(0, 2.0F, "Yellow", "axe"),
	JUNGLE_WOOD(0, 2.0F, "Orange", "axe"),
	SPRUCE_WOOD(0, 2.0F, "Brown", "axe"),
	DARK_OAK_WOOD(0, 2.0F, "Brown", "axe"),
	ACACIA_WOOD(0, 2.0F, "Orange", "axe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumVanilla2(int harvest, float hardness, String color, String tool) {
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