package com.globbypotato.rockhounding_rocks.enums.rocks.extra;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumVanilla implements BaseEnum{

	STONE(0, 2.0F, "Gray", "pickaxe"),
	COBBLESTONE(0, 2.0F, "Gray", "pickaxe"),
	HARDENED_CLAY(0, 2.0F, "Brown", "pickaxe"),
	BROWN_NETHERBRICK(0, 2.0F, "Brown", "pickaxe"),
	RED_NETHERBRICK(0, 2.0F, "Red", "pickaxe"),
	SANDSTONE(0, 2.0F, "Yellow", "pickaxe"),
	RED_SANDSTONE(0, 2.0F, "Orange", "pickaxe"),
	BONE_BLOCK (0, 2.0F, "Red", "pickaxe"),
	END_STONE(0, 2.0F, "Yellow", "pickaxe"),
	GRANITE(0, 2.0F, "Brown", "pickaxe"),
	ANDESITE(0, 2.0F, "Gray", "pickaxe"),
	DIORITE(0, 2.0F, "White", "pickaxe"),
	PRISMARINE(0, 2.0F, "Cyan", "pickaxe"),
	QUARTZ(0, 2.0F, "White", "pickaxe"),
	NETHER_WART(2, 2.0F, "Red", "pickaxe"),
	SNOW(0, 2.0F, "White", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumVanilla(int harvest, float hardness, String color, String tool) {
		this.harvest = harvest;
		this.hardness = hardness;
		this.color = color;
		this.tool = tool;
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