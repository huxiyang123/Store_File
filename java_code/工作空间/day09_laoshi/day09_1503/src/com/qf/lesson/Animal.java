package com.qf.lesson;

public abstract class Animal extends Object {
	String name;
	int age;

	abstract void eat();

	abstract void shout();

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

	// public String toString(){
	// return "[name: "+name + ";age:"+age+"]";
	// }
}
