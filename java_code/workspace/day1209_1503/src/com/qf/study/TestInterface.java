package com.qf.study;
/*
 * 接口：interface
 *   是抽象类的一种特列，其中所有方法都是抽象的
 *  作用：
 *    1  明确子类必须遵守的规范，即接口定义规范
 *    2 实现了Java类的多继承。只是继承规范（即只是继承了方法声明）
 *  语法：
 *     [修饰符]  interface  接口名  {
 *         	[public static final]  变量;
 *          [public]   返回值类型  方法名(); 
 *     }
 *     备注：
 *        接口中定义的方法不适用abstract。
 *     使用：在子类中使用
 *        [修饰符]  class  类名  implements  接口{
 *        
 *        }
 *  多态
 *    语法
 *       父类名  变量名  = new  子类
 *    特点：
 *     1 对父类的方法进行了override
 *     2 子类当做父类的对象使用是向上转型
 *  对象的类型转换
 *   1 
 *   2 父类的对象转换为子类
 *  
 * intstanceof  判断对象是否是某个类的对象
 *   语法   对象  instanceof  类名
 *       返回Boolean类型的值
 *   
 */
public class TestInterface {
	public static void main(String[] args) {
		Animal a = new Mouse();
		if(a interfaceof Dog){
			
		}
	}
}
