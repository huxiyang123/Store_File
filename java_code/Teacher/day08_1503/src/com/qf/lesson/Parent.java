package com.qf.lesson;

/*
 * 继承：extends 
 *   子类可以调用父类的属性和方法。
 *   父类：被子类继承的类。
 *   子类：继承父类的类
 * 原因:
 *   1 增强代码的复用
 *   2 扩展父类的功能：增加新功能或重新实现父类已有的功能
 *   3 明确父类和子类之间的关系
 *   
 * 语法：
 *   子类   extends 父类{
 *    子类的成员变量；
 *    子类的方法();
 *   }
 * 特点：
 *   1 父类的private修饰的属性和方法均不能被继承
 *   2 父类的构造方法不能被继承
 *   3 调用子类的构造方法时，首先调用父类的构造方法：
 *     1）当父类有无参构造方法时，JVM会自动调用,在子类的构造方法第一行默认添加了super()。
 *     2） 当父类没有无参构造方法时，必须在子类的构造方法第一行显式调用:super(参数);
 *   4 java是单继承，即extends后面只能有一个父类。
 *   5 没有使用extends关键字的类，默认继承Object类。Object类是所有类的祖先类。
 *  super和this：
 *     1)super代表当前对象的父类对象，this代表当前对象。
 *     2)构造方法中，super调用父类构造方法和this调用其他构造方法不能共存。原因是都必须放在代码第一个行 
 *  super关键字：当前对象的父对象
 *    在子类的非static方法中（在子类的static方法中不能使用super）：
 *     1 调用父类属性：super.属性
 *     2 调用父类方法：super.方法
 *    在子类的构造方法中：
 *     3 调用父类构造方法：super(参数)，必须是第一行代码
 */
public class Parent {
	String name;
	private int age;
	String sex = "男";

	// public Parent() {
	// System.out.println("我是Parent类的构造方法!!!");
	// }

	void say() {
		System.out.println("父类say: " + name + ";" + age + ";" + sex);
	}

	public Parent(String name) {
		super();
		this.name = name;
		System.out.println("Parent父类有参构造方法！！！！！");
	}

	static void eat() {
		System.out.println("父类eat: ");

	}
}
