package com.globbypotato.rockhounding_rocks.enums.rocks;

public enum EnumRocksA implements BaseEnum{

	BLACK_AVENTURINE(2, 3.3F, "Black"),
	BASANITE(2, 4.0F, "Black"),
	BLACK_GRANITE(1, 3.3F, "Black"),
	JET(0, 1.0F, "Black"),
	LUXULYANITE(2, 2.2F, "Black"),
	BLACK_ONYX(2, 3.2F, "Black"),
	PORTORO(0, 3.8F, "Black"),
	SNOWFLAKE_OBSIDIAN(1, 2.4F, "Black"),
	BLACK_TIGER_EYE(1, 3.1F, "Black"),
	SLATE(1, 1.9F, "Black"),
	GABBRO(2, 4.4F, "Black"),
	BLUE_AVENTURINE(2, 3.2F, "LightBlue"),
	CHRYSOCOLLA(0, 1.8F, "Cyan"),
	BLUE_GRANITE(2, 3.0F, "Blue"),
	BLUE_JASPER(2, 3.5F, "Blue"),
	LABRADORITE(1, 2.2F, "Blue");

	private int harvest;
	private float hardness;
	private String color;
	private EnumRocksA(int harvest, float hardness, String color) {
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