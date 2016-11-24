package com.qf;

public class Child extends Father {
	void study(){
		super.eat();
		System.out.println("childstudy"+name+age+sex);
		System.out.println(super.age+this.name);
	}
	Child(){
		super(29);
		System.out.println("superµ÷ÓÃ"+super.age);
		super.eat();
	}
}
