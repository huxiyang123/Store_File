package com.qf.duoTai;

public class ManRobot extends IndustryRobot{

	@Override
	void power() {
		System.out.println("我是民用机器人，我接受主人的实时操控");
	}

	@Override
	void operate() {
		System.out.println("我是民用机器人，我快没电了才去充电");
	}
	
}
