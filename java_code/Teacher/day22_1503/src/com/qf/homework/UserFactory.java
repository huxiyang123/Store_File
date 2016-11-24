package com.qf.homework;
/*
 *简单工厂模式：
 *  根据传入的参数每次产生新的对象。
 *  通常和多态结合使用
 */
public class UserFactory {
   public static Animal getInstance(String type){
	   if(type.equals("man")){
		   return new Man();
	   }
	   else {
		   return new Dog();
	   }
	      }
}
