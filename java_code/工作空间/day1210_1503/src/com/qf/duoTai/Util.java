package com.qf.duoTai;

public class Util {
	//ͨ���ӿ�ʵ�ֲ�ͬ���͵Ķ�����Ե��ù�ͬ�ķ���
	public static void useCommon(Mover m){
		m.move();
		m.say();
	}
	//ͬһ����Ĳ�ͬʵ������Ե��ù�ͬ�ķ���
	public static void useCommon2(FatherRobot f){
		f.operate();
		f.power();
	}
	public static void useCommon3(Man m){
		m.eat();
		m.sleep();
	}
}
