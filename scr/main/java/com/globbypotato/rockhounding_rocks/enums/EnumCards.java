package com.globbypotato.rockhounding_rocks.enums;

public enum EnumCards implements BaseEnum {
	PLAIN				("Plain Block"),
	POLISHED			("Polished Block"),
	SLAB				("Double Slab"),
	BRICKS				("Bricks"),
	SHORT				("Short Bricks"),
	DEBOSSED			("Debossed Tile"),
	FLOOR				("Parquet Tile"),
	PAVES				("Paving Tile"),
	TILE				("Tile"),
	CARVED				("Carved Block"),
	PILLAR				("Fluted Block");


	private String name;
	EnumCards(String name){
		this.name = name;
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

	public String getCut(){
		return this.name;
	}

}