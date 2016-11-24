package com.qf.lesson.inner;

public class StaticOuter {
   private String name = "zhangsan";
   
   private static String country = "china";
   
   static class Inner{
	   private int age = 18;
	   public void display(){
		   String n = new StaticOuter().name;
		   System.out.println("country: "+country+"age："+this.age);
	   }
   }
}
