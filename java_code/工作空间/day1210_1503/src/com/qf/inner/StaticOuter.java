package com.qf.inner;

public class StaticOuter {
	private String name = "zhangsdan";
	private static country = "zhongguo";
	//StaticOuter so = new 
	static class Inner{
		private int age;
		public void display(){
			System.out.println("country:"+country);
		}
	}
}
