package com.FlappyBird;

import java.util.Vector;

public class FloorList {
	
	public static Vector<Floor>  Flist = new Vector<Floor>();
	
	public static void addLast(Floor floor){
		Flist.add(floor);
	}

	public static Floor moveFirst(){
		return Flist.remove(0);
	}
	
	public static Floor getHead(){
		return Flist.get(0);
	}
}
