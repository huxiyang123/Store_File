package com.qf.lesson;

public class ManRobot extends FatherRobot {
	@Override
	void operate() {
		System.out.println("我接受主人的实时控制");
	}

	@Override
	void power() {
		System.out.println("我快没电了才去充电");
	}
}
