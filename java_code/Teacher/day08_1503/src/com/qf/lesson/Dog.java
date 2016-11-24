package com.qf.lesson;
/*
 * 覆盖父类的方法
 */

public class Dog extends Animal {
   public void shout(){
	   System.out.println("汪汪！！！！");
   }
   
   static void doSome(){
	  System.out.println("non static doSome"); 
   }
}
