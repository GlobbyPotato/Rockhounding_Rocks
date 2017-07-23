package com.globbypotato.rockhounding_rocks.enums.rocks;

public enum EnumRocksB implements BaseEnum{

	LARIMAR(1, 2.4F, "LightBlue"),
	BLUE_ONYX(2, 3.8F, "LightBlue"),
	PIETERSITE(2, 4.0F, "Blue"),
	SODALITE(1, 2.4F, "Blue"),
	BLUE_TIGER_EYE(1, 3.4F, "Blue"),
	AZURITE(0, 1.5F, "Blue"),
	BROWN_AVENTURINE(2, 3.3F, "Orange"),
	LATERITE(0, 1.2F, "Orange"),
	BROWN_CARNELIAN(2, 3.8F, "Brown"),
	BROWN_PORPHYRY(1, 3.2F, "Brown"),
	SCORIA(1, 2.4F, "Brown"),
	SMOKY_QUARTZ(2, 3.4F, "Brown"),
	BRONZITE(1, 3.0F, "Brown"),
	TIGER_IRON(1, 3.2F, "Brown"),
	ARKOSE(1, 1.1F, "Brown"),
	IGNIMBRITE(0, 1.3F, "Brown");

	private int harvest;
	private float hardness;
	private String color;
	private EnumRocksB(int harvest, float hardness, String color) {
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