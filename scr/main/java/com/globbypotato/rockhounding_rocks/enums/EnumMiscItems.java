package com.globbypotato.rockhounding_rocks.enums;

public enum EnumMiscItems implements BaseEnum {
	FISH_OIL,
	TIMBER,
	PADDLE,
	WOODEN_GEAR,
	SLEDGEHAMMER;

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

}