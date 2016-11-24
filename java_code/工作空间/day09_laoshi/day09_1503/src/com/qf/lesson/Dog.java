package com.qf.lesson;

public class Dog extends Animal implements Animal2{

	@Override
	void eat() {
		System.out.println("我喜欢啃骨头！！！！");

	}

	@Override
	void shout() {
		System.out.println("汪汪！！！！！");

	}

	@Override
	public void sleep() {
		System.out.println("我喜欢睡狗窝！！");
		
	}

	@Override
	public void run() {
		System.out.println("我喜欢跟着主人一起散步！！！！");
		
	}
	
	public void guard(){
		System.out.println("我能看门！！！！");
	}

}
