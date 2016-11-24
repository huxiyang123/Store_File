package com.qf.duoTai;

public class Util {
	//通过接口实现不同类型的对象可以调用共同的方法
	public static void useCommon(Mover m){
		m.move();
		m.say();
	}
	//同一父类的不同实现类可以调用共同的方法
	public static void useCommon2(FatherRobot f){
		f.operate();
		f.power();
	}
	public static void useCommon3(Man m){
		m.eat();
		m.sleep();
	}
}
