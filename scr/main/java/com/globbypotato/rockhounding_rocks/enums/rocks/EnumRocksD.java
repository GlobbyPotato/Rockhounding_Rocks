package com.globbypotato.rockhounding_rocks.enums.rocks;

public enum EnumRocksD implements BaseEnum{

	GREEN_PORPHYRY(1, 2.7F, "Green"),
	GREEN_JASPER(2, 3.2F, "Green"),
	BLOODSTONE(2, 2.5F, "Green"),
	JADEITE(0, 2.0F, "Lime"),
	MALACHITE(0, 2.1F, "Green"),
	SERPENTINITE(0, 1.9F, "Green"),
	ZOISITE(1, 2.8F, "Green"),
	GREEN_TIGER_EYE(1, 2.7F, "Green"),
	GREEN_TUFF(1, 1.8F, "Green"),
	UNAKITE(2, 3.6F, "Green"),
	CHRYSOPRASE(2, 4.0F, "Green"),
	RAINFOREST_JASPER(2, 3.7F, "Green"),
	GLAUCONITE(0, 1.0F, "Cyan"),
	DUNITE(0, 2.2F, "Lime"),
	RHODOCHROSITE(0, 1.7F, "Pink"),
	KAKORTOKITE(1, 2.6F, "White");

	private int harvest;
	private float hardness;
	private String color;
	private EnumRocksD(int harvest, float hardness, String color) {
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