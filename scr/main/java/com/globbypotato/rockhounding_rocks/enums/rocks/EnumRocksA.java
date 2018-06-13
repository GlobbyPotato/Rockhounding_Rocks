package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumRocksA implements BaseEnum{

	BLACK_AVENTURINE(2, 3.3F, "Black", "pickaxe"),
	BASANITE(2, 4.0F, "Black", "pickaxe"),
	BLACK_GRANITE(1, 3.3F, "Black", "pickaxe"),
	JET(0, 1.0F, "Black", "pickaxe"),
	LUXULYANITE(2, 2.2F, "Black", "pickaxe"),
	BLACK_ONYX(2, 3.2F, "Black", "pickaxe"),
	PORTORO(0, 3.8F, "Black", "pickaxe"),
	SNOWFLAKE_OBSIDIAN(1, 2.4F, "Black", "pickaxe"),
	BLACK_TIGER_EYE(1, 3.1F, "Black", "pickaxe"),
	SLATE(1, 1.9F, "Black", "pickaxe"),
	GABBRO(2, 4.4F, "Black", "pickaxe"),
	BLUE_AVENTURINE(2, 3.2F, "LightBlue", "pickaxe"),
	CHRYSOCOLLA(0, 1.8F, "Cyan", "pickaxe"),
	BLUE_GRANITE(2, 3.0F, "Blue", "pickaxe"),
	BLUE_JASPER(2, 3.5F, "Blue", "pickaxe"),
	LABRADORITE(1, 2.2F, "Blue", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumRocksA(int harvest, float hardness, String color, String tool) {
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