package com.FlappyBird;

import java.util.Vector;

public class BoundList {
	
	public static Vector<Bound> Blist = new Vector<Bound>();
	
	public static void addLast(Bound bound){
		Blist.add(bound);
	}
	
	public static Bound removeHead(){
		return Blist.remove(0);
	}

}
