package com.qf.duoTai;

public class IndustryRobot extends FatherRobot implements Mover {

	@Override
	void power() {
		System.out.println("我是工业机器人，我设置一次程序就一直运行");
	}

	@Override
	void operate() {
		System.out.println("我是工业机器人，我会工作");
	}

	@Override
	public void move() {
		System.out.println("我是工业机器人，用轨道来回移动");
		
	}

	@Override
	public void say() {
		System.out.println("我是工业机器人，只能说规定的内容");
		
	}
	
}
