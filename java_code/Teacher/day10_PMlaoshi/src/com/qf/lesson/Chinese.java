package com.qf.lesson;

public class Chinese extends Man implements Mover{
	@Override
	void eat() {
		System.out.println("我是中国人，我喜欢吃面条!!");
	}

	@Override
	void sleep() {
		System.out.println("我是中国人，我喜欢睡炕");
	}

	@Override
	public void move() {
		System.out.println("我喜欢骑公共自行车上下班");
		
	}

	@Override
	public void say() {
		System.out.println("我是中国人，说中国话!!!!");		
	}

}
