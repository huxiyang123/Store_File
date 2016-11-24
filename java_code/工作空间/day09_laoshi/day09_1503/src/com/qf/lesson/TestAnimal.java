package com.qf.lesson;

public class TestAnimal {

	public static void main(String[] args) {
		Dog  dog  = new Dog();
		dog.age = 1;
		dog.name = "大黄";
		dog.eat();
		dog.shout();
		System.out.println(dog);
		
		Cat cat = new Cat();
		cat.age = 2;
		cat.name = "富贵";
		cat.eat();
		cat.shout();
		System.out.println(cat.toString());
	}

}
