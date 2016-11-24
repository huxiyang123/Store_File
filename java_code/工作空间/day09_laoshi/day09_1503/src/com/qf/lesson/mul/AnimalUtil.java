package com.qf.lesson.mul;

public class AnimalUtil {
	
	//普通方法实现，没有用通用性
	public static void doShout(Cat cat) {
		cat.shout();
	}
	//普通方法实现，没有用通用性
	public static void doShout2(Dog dog){
		dog.shout();
	}
	
	//使用多态实现代码的通用型和向后兼容
	public static void doSameShout(Animal a){
		a.shout();
	}
	
	

}
