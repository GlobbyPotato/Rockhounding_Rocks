package com.globbypotato.rockhounding_rocks.enums;

public enum EnumMachines implements BaseEnum {
	CUTTING_STATION,
	ROCK_VENDOR,
	MILL_WHEEL,
	MILL_WHEEL_ANIMATED,
	ROCK_PLATFORM,
	STONE_RAMMER,
	STONE_RAMMER_ANIMATED,
	CARVING_BENCH,
	CARVING_BENCH_ANIMATED,
	CARVING_RACK,
	SCULPTING_BENCH,
	SCULPTING_BENCH_ANIMATED;

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