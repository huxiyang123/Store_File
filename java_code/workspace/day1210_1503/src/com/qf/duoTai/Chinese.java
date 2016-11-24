package com.qf.duoTai;

public class Chinese extends Man implements Mover{

	@Override
	void eat() {
		System.out.println("我是中国人，我喜欢吃面。。。。");
	}

	@Override
	void sleep() {
		System.out.println("我是中国人，我喜欢睡炕。。。。");
	}

	@Override
	public void move() {
		System.out.println("我是中国人，我喜欢骑自行车");
		
	}

	@Override
	public void say() {
		System.out.println("我是中国人，说中国话，，，，汉语");
		
	}
	
	
}
