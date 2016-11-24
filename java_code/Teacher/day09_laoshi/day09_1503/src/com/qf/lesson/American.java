package com.qf.lesson;

public class American implements Person,Animal2{

	@Override
	public void eat() {
		System.out.println("我喜欢吃披萨");
		
	}

	@Override
	public void play() {
		System.out.println("我喜欢橄榄球");
		
	}

	@Override
	public void sleep() {
		System.out.println("我喜欢睡地板");
		
	}

	@Override
	public void run() {
		System.out.println("我是萝卜丝，我跑的快！！！");
		
	}
  
}
