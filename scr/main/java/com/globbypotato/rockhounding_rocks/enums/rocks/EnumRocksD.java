package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumRocksD implements BaseEnum{

	GREEN_PORPHYRY(1, 2.7F, "Green", "pickaxe"),
	GREEN_JASPER(2, 3.2F, "Green", "pickaxe"),
	BLOODSTONE(2, 2.5F, "Green", "pickaxe"),
	JADEITE(0, 2.0F, "Lime", "pickaxe"),
	MALACHITE(0, 2.1F, "Green", "pickaxe"),
	SERPENTINITE(0, 1.9F, "Green", "pickaxe"),
	ZOISITE(1, 2.8F, "Green", "pickaxe"),
	GREEN_TIGER_EYE(1, 2.7F, "Green", "pickaxe"),
	GREEN_TUFF(1, 1.8F, "Green", "pickaxe"),
	UNAKITE(2, 3.6F, "Green", "pickaxe"),
	CHRYSOPRASE(2, 4.0F, "Green", "pickaxe"),
	RAINFOREST_JASPER(2, 3.7F, "Green", "pickaxe"),
	GLAUCONITE(0, 1.0F, "Cyan", "pickaxe"),
	DUNITE(0, 2.2F, "Lime", "pickaxe"),
	RHODOCHROSITE(0, 1.7F, "Pink", "pickaxe"),
	KAKORTOKITE(1, 2.6F, "White", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumRocksD(int harvest, float hardness, String color, String tool) {
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