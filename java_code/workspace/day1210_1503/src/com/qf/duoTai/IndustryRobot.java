package com.qf.duoTai;

public class IndustryRobot extends FatherRobot implements Mover {

	@Override
	void power() {
		System.out.println("���ǹ�ҵ�����ˣ�������һ�γ����һֱ����");
	}

	@Override
	void operate() {
		System.out.println("���ǹ�ҵ�����ˣ��һṤ��");
	}

	@Override
	public void move() {
		System.out.println("���ǹ�ҵ�����ˣ��ù�������ƶ�");
		
	}

	@Override
	public void say() {
		System.out.println("���ǹ�ҵ�����ˣ�ֻ��˵�涨������");
		
	}
	
}
