package com.qf.lesson;

public class Animal<A, B> {
	private A name;
	private B age;

	public B getAge() {
		return age;
	}

	public void setAge(B age) {
		this.age = age;
	}

	public void setName(A name) {
		this.name = name;
	}

	public A getName() {
		return name;
	}

	public Animal() {

	}
	
	

}
