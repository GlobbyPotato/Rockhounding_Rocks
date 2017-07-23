package com.globbypotato.rockhounding_rocks.enums.rocks;

import net.minecraft.util.IStringSerializable;

public enum EnumRocksC implements BaseEnum{

	GNEISS(2, 4.0F, "Silver"),
	PUMICE(1, 3.0F, "Silver"),
	GRAY_GRANITE(1, 3.5F, "Gray"),
	GRAY_ONYX(2, 3.7F, "Silver"),
	GRAY_PORPHYRY(1, 3.2F, "Gray"),
	SPIDERWEB_JASPER(2, 3.3F, "Silver"),
	GRAY_TRACHYTE(1, 2.8F, "Gray"),
	GRAY_TRAVERTINE(1, 2.5F, "Silver"),
	GRAY_TUFF(1, 2.0F, "Gray"),
	ZEBRA_JASPER(2, 3.3F, "White"),
	DACITE(1, 3.0F, "Gray"),
	MIGMATITE(1, 3.1F, "Gray"),
	AMAZONITE(0, 2.8F, "Cyan"),
	GREEN_AVENTURINE(2, 3.3F, "Lime"),
	GREEN_GRANITE(1, 3.4F, "Green"),
	GREEN_ONYX(2, 3.8F, "Green");

	private int harvest;
	private float hardness;
	private String color;
	private EnumRocksC(int harvest, float hardness, String color) {
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