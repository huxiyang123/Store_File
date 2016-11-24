package com.qf.homework;

public class TestWeek {

	public static void main(String[] args) {
		TestWeek.display(Week.TUESDAY);

	}
	
	public static void display(Week w){
		switch(w){
		case MONDAY:
			 System.out.println(w.getName());
			 break;
	    default:
	    	System.out.println(w.getName());
		}
	}

}
