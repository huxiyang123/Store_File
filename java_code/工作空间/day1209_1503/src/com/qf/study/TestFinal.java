package com.qf.study;

/*
 * final关键字：终态的
 *  1 修饰类
 *    语法：
 *      [修饰符] final class 类名{}
 *    特点：
 *        该类不能被继承。例 ：String
 *  2 修饰成员变量
 *      [修饰符]  final 数据类型    变量名；
 *    特点:
 *         变量的值不能被修改，基本数据类型的值不能修改。
 *         引用数据类型引用的对象不能被修改
 *  3 修饰方法：
 *    语法：
 *      [修饰符]  final 返回类型   方法名(){
 *      
 *      }
 *    特点：
 *      方法不能被子类覆盖override。  
 */
public class TestFinal {
	public static void main(String[] args) {
		Chinese c = new Chinese();
		c.say();
		c.shout();
	}
}
