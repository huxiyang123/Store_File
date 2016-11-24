package com.qf.homework;
/*
 * 单例模式：
 *   1 私有化private构造器，外部不可实例化对象
 *   2 创建一个变量，创建对象赋给这个变量。
 *   使用static final修饰，final目的是引用不可变，static修饰是因为static方法会调用这个变量
 *   3 创建一个static的方法，返回前面定义的变量。static是因为外部无法通过对象方法
 */
public class User {
	private static final User u = new User();

	private User() {
	}

	public static User getInstance() {		
		return u;
	}

}
