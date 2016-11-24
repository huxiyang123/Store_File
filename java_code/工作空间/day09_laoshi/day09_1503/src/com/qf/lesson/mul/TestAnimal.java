package com.qf.lesson.mul;

public class TestAnimal {

	public static void main(String[] args) {
		Cat c = new Cat();
		AnimalUtil.doShout(c);

		Dog d = new Dog();
		AnimalUtil.doShout2(d);
		
		System.out.println("==============");
		
		AnimalUtil.doSameShout(c);
		AnimalUtil.doSameShout(d);
		
		AnimalUtil.doSameShout(new Pig());
	}

}
