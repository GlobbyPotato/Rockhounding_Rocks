package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumRocksE implements BaseEnum{

	PINK_GRANITE(1, 2.5F, "Pink", "pickaxe"),
	PINK_ONYX(2, 3.5F, "Pink", "pickaxe"),
	PINK_TRACHYTE(1, 3.1F, "Pink", "pickaxe"),
	PINK_PORPHYRY(1, 2.5F, "Pink", "pickaxe"),
	PINK_TRAVERTINE(1, 2.2F, "Pink", "pickaxe"),
	RHODONITE(1, 2.6F, "Pink", "pickaxe"),
	CHAROITE(1, 3.0F, "Purple", "pickaxe"),
	JASPEROID(1, 2.2F, "Purple", "pickaxe"),
	SUGILITE(1, 3.3F, "Magenta", "pickaxe"),
	STICHTITE(2, 4.0F, "Magenta", "pickaxe"),
	DUMORTIERITE(2, 4.3F, "Purple", "pickaxe"),
	PURPLE_PORPHYRY(1, 2.9F, "Purple", "pickaxe"),
	APLITE(1, 3.7F, "Purple", "pickaxe"),
	RED_CARNELIAN(2, 4.3F, "Red", "pickaxe"),
	RED_AVENTURINE(2, 3.7F, "Red", "pickaxe"),
	RED_GRANITE(1, 2.9F, "Red", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumRocksE(int harvest, float hardness, String color, String tool) {
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

	public String tool(){
		return this.tool;
	}

}