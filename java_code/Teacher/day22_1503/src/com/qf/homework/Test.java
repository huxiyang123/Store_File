package com.qf.homework;

public class Test {
	public static void main(String[] args) {
		Manager  f  = new Father();
		  Son son = new Son(f);
		  son.walkLong();
	}  
}
