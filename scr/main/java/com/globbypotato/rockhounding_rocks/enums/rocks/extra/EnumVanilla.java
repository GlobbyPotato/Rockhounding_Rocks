package com.globbypotato.rockhounding_rocks.enums.rocks.extra;

import com.globbypotato.rockhounding_rocks.enums.rocks.BaseEnum;

public enum EnumVanilla implements BaseEnum{

	STONE(2, 3.3F, "Gray"),
	COBBLESTONE(2, 4.0F, "Gray"),
	HARDENED_CLAY(1, 3.3F, "Brown"),
	BROWN_NETHERBRICK(2, 2.2F, "Brown"),
	RED_NETHERBRICK(2, 3.5F, "Red"),
	SANDSTONE(2, 3.2F, "Yellow"),
	RED_SANDSTONE(0, 3.8F, "Orange"),
	BONE_BLOCK (1, 2.4F, "Red"),
	END_STONE(0, 1.0F, "Yellow"),
	GRANITE(1, 3.1F, "Brown"),
	ANDESITE(1, 1.9F, "Gray"),
	DIORITE(2, 4.4F, "White"),
	PRISMARINE(2, 3.2F, "Cyan"),
	QUARTZ(0, 1.8F, "White"),
	NETHER_WART(2, 3.0F, "Red"),
	SNOW(1, 2.2F, "White");

	private int harvest;
	private float hardness;
	private String color;
	private EnumVanilla(int harvest, float hardness, String color) {
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