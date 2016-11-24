package com.qf.inner;
/*
 * 内部类：包含在其他类里面。包含内部类的类叫外部类；内部类是外部类的一部分。
 * 	  作用：使用外部类的私有方法
 *    特点：可以访问外部类的私有private成员
 *    分类：
 *       1 成员内部类：
 *    		可以当作一个普通的成员变量。
 *    		定义：
 *      		[修饰符]  外部类名{
 *      			外部类的成员变量；
 *      			外部类的成员方法；
 *                  [修饰符]   内部类名{
 *                  
 *                  }
 *      		}
 *      	调用方式:必须通过外部类的对象来调用
 *      		1) 外部类名  变量 = new 外部类名();
 *      	 	2) 外部类名.内部类名 内部类变量 = 外部类名().new 内部类名();
 *      
 *       2 静态内部类:使用static修饰的内部类，看做外部类的一个静态成员
 *       	调用方式：
 *       		外部类名.内部类名 内部类变量 = 外部类名().new 内部类名();
 *       3 局部内部类：在方法中定义的内部类。只能使用默认修饰符
 *       
 *       4 匿名内部类：基于抽象类和接口
 *           	new 抽象类或接口(){
 *              	抽象类或接口中方法的实现
 *              }
 *      注：如果内部类只能使用一次，可以使用匿名内部类；如果在当前类中多次使用，则定义
 */
public class Outer {
	private String name1 = "Outer类";
	
	private static String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	class Inner{
		private int age = 16;
		public void display(){
			System.out.println("名字"+name+";年龄"+this.age);
		}
	}
	public void say(){			//局部内部类
		class Inner{
			String name2;
			
		}
	}
}
