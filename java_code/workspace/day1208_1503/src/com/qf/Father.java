package com.qf;

public class Father {
	int age;
	String name ;
	char sex;
	static void eat(){
		//System.out.println("父类"+name+age+sex);
		System.out.println("父类");
	}
	void say(){
		System.out.println("this 调用");
	}
	public Father(int age) {
		
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.say();			//this调用成员方法时，可以不放在第一行
		System.out.println("父类"+age);
	}
	
}
