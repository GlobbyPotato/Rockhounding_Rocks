package com.globbypotato.rockhounding_rocks.enums.rocks;

import com.globbypotato.rockhounding_rocks.enums.BaseEnum;

public enum EnumRocksH implements BaseEnum{

	APACHE_RHYOLITE(2, 2.3F, "Pink", "pickaxe"),
	AMMOLITE(0, 0.5F, "Brown", "shovel"),
	DENDRITIC_OPAL(2, 2.7F, "Yellow", "pickaxe"),
	OOLITE(0, 0.5F, "Green", "pickaxe"),
	GRAY_SCHIST(1, 3.3F, "Gray", "pickaxe"),
	GUADALUPE_JASPER(1, 2.0F, "Orange", "pickaxe"),
	TREE_AGATE(2, 3.3F, "White", "pickaxe"),
	BLUE_SCHIST(1, 3.3F, "LightBlue", "pickaxe"),
	UMBER(0, 1.0F, "Brown", "pickaxe"),
	BRECCIA(1, 1.9F, "Yellow", "pickaxe"),
	ACTINOLITE(0, 1.5F, "Lime", "pickaxe"),
	MADAGASCAR_RHYOLITE(2, 3.0F, "Black", "pickaxe"),
	WONDERSTONE(2, 2.4F, "Orange", "pickaxe"),
	OPAL(1, 2.2F, "LightBlue", "pickaxe"),
	APATITE(1, 1.7F, "Blue", "pickaxe"),
	ECLOGITE(2, 3.5F, "Lime", "pickaxe");

	private int harvest;
	private float hardness;
	private String tool;
	private String color;
	private EnumRocksH(int harvest, float hardness, String color, String tool) {
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