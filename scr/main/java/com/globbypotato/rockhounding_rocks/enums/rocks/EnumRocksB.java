package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumRocksB implements BaseEnum{

	LARIMAR(1, 2.4F, "LightBlue", "pickaxe"),
	BLUE_ONYX(2, 3.8F, "LightBlue", "pickaxe"),
	PIETERSITE(2, 4.0F, "Blue", "pickaxe"),
	SODALITE(1, 2.4F, "Blue", "pickaxe"),
	BLUE_TIGER_EYE(1, 3.4F, "Blue", "pickaxe"),
	AZURITE(0, 1.5F, "Blue", "pickaxe"),
	BROWN_AVENTURINE(2, 3.3F, "Orange", "pickaxe"),
	LATERITE(0, 1.2F, "Orange", "pickaxe"),
	BROWN_CARNELIAN(2, 3.8F, "Brown", "pickaxe"),
	BROWN_PORPHYRY(1, 3.2F, "Brown", "pickaxe"),
	SCORIA(1, 2.4F, "Brown", "pickaxe"),
	SMOKY_QUARTZ(2, 3.4F, "Brown", "pickaxe"),
	BRONZITE(1, 3.0F, "Brown", "pickaxe"),
	TIGER_IRON(1, 3.2F, "Brown", "pickaxe"),
	ARKOSE(1, 1.1F, "Brown", "pickaxe"),
	IGNIMBRITE(0, 1.3F, "Brown", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumRocksB(int harvest, float hardness, String color, String tool) {
		this.harvest = harvest;
		this.tool = tool;
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

	public String tool(){
		return this.tool;
	}

}