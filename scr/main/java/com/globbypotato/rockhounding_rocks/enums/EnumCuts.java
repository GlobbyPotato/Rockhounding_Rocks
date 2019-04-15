package com.globbypotato.rockhounding_rocks.enums;

public enum EnumCuts implements BaseEnum {
	CUSTOMIZED			("Customized Cut"),
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
	FLUTED				("Fluted Column"),
	DORIC				("Doric Column"),
	TETRAPYLON			("Tetrapylon"),
	PEDESTAL			("Pedestal"),
	SEGMENTED			("Segmented Column"),
	POST				("Segmented Post"),
	STELE				("Stele"),
	FOUNTAIN			("Fountain"),
	LANTERN				("Lantern"),
	TWISTED				("Twisted Slabs"),
	PILLAR				("Fluted Block");

	private String name;
	EnumCuts(String name){
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