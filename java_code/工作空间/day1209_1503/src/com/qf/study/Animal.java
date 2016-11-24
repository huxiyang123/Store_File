package com.qf.study;

 abstract public class Animal {
	String name;
	int age;
	abstract void eat();
	void shout(){
		System.out.println("ด๓ษ๙หต");
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	
}
