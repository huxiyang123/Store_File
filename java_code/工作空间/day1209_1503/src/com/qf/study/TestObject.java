package com.qf.study;
/*
 * Object类
 *   是所有类的祖先类。所有没有使用extends关键字的类，默认继承Object
 *    方法：
 *      1 equals：当前对象与传入对象是否相等（地址是否相等）
 * 抽象类abstract
 * 	  1 抽象方法      
 * 	
 * 	  protected 
 */
public class TestObject {
	public static void main(String[] args) {
		Mouse a = new Mouse();
		Mouse b = new Mouse();
		b.shout();
		a.age=23;
		a.name= "zhangsan";
		b.age=56;
		b.name="lisi";
		a.eat();
		boolean c = a.equals(b);
		System.out.println(c);
		boolean v = a==b;
		System.out.println(v+"==========");
		System.out.println(b.toString());//这里的.toString可以省略
		System.out.println(b.hashCode());
		
	}
}
