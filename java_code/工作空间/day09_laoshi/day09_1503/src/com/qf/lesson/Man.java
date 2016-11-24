package com.qf.lesson;

public class Man {
  String name;
  final int age = 18;
  
  void say(){
	  System.out.println("我可以被子类overriding!!!!");
  }
  
  final void  shout(){
	  System.out.println("我不能被override!!!!!");
  }
}
