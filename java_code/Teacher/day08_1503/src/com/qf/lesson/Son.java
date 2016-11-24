package com.qf.lesson;

public class Son extends Parent{
	public Son() {
		//super();//JVM默认添加了，前提条件父类有无参构造方法。
		super("zhangsan");		
		System.out.println("我是Son类的构造方法！！！！！");
	}
   void study(){
	   System.out.println("儿子类say: 喜欢学习");
	   System.out.println(super.sex);
	   super.say();
	   super.eat();
   }  
}
