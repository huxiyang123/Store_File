package com.qf.lesson;
/*
 * 懒汉模式
 */
public class DesignPattern {
   private static DesignPattern dp;
   private DesignPattern(){
	   System.out.println("DesignPattern构造方法初始化");
   }
   
   public static DesignPattern getInstance(){
	   if(null==dp){
		   dp = new DesignPattern();
	   }
	   return dp;
   }
   
   void play(){
	   System.out.println("我是DesignPattern的play()");
   }
}
