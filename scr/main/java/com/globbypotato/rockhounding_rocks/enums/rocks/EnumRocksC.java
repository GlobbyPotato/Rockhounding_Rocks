package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumRocksC implements BaseEnum{

	GNEISS(2, 4.0F, "Silver", "pickaxe"),
	PUMICE(1, 3.0F, "Silver", "pickaxe"),
	GRAY_GRANITE(1, 3.5F, "Gray", "pickaxe"),
	GRAY_ONYX(2, 3.7F, "Silver", "pickaxe"),
	GRAY_PORPHYRY(1, 3.2F, "Gray", "pickaxe"),
	SPIDERWEB_JASPER(2, 3.3F, "Silver", "pickaxe"),
	GRAY_TRACHYTE(1, 2.8F, "Gray", "pickaxe"),
	GRAY_TRAVERTINE(1, 2.5F, "Silver", "pickaxe"),
	GRAY_TUFF(1, 2.0F, "Gray", "pickaxe"),
	ZEBRA_JASPER(2, 3.3F, "White", "pickaxe"),
	DACITE(1, 3.0F, "Gray", "pickaxe"),
	MIGMATITE(1, 3.1F, "Gray", "pickaxe"),
	AMAZONITE(0, 2.8F, "Cyan", "pickaxe"),
	GREEN_AVENTURINE(2, 3.3F, "Lime", "pickaxe"),
	GREEN_GRANITE(1, 3.4F, "Green", "pickaxe"),
	GREEN_ONYX(2, 3.8F, "Green", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumRocksC(int harvest, float hardness, String color, String tool) {
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