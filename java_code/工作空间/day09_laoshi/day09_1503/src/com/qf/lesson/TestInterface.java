package com.qf.lesson;
/*
 * 接口：interface
 *   是抽象类的一种特例，其中所有方法都是抽象的。
 *   作用：
 *    1 明确子类必须遵守的规范。即接口定义规范。
 *    2 实现了java类的多继承。只是继承规范(即只是继承了方法声明)
 * 语法：
 *   [修饰符]  interface 接口名{
 *      [public static final] 变量;
 *      [public] 返回类型  方法名();
 *   }
 * 备注：
 *   接口中定义的方法不使用abstract修饰符。
 * 使用：在子类（实现类）中使用
 *   [修饰符]  class 类名  implements 接口名{
 *      接口中所有方法的实现。
 *   }
 * 注意：
 *   1  implements可以实现多个接口。多个接口之间使用逗号分隔。  
 *   2  extends和implemnts可以共用，但extends在前，implements在后。
 *   
 * 多态：
 *    子类对象可以作为父类对象使用。在程序中凡是需要父类对象的地方，都可以用子类对象代替。
 *   实现方式：
 *     1 父类：
 *       语法：父类   变量名  = new  子类();
 *     2 抽象类：
 *       语法：抽象类名  变量名  = new  抽象类的实现类();
 *     3 interface接口：
 *       语法：  接口名   变量名  =  new  接口的实现类();
 *  特点：
 *     1 对父类的方法进行了overriding重写。
 *     2 最终调用方法根据实际的对象的方法决定。
 *     3 子类当做父类的对象使用是向上转型
 *  对象的类型转换：
 *     1  子类当做父类的对象使用是向上转型
 *     2  父类的对象转换为子类
 *     
 *  instanceof 判断对象是否是某个类的对象
 *  语法： 对象  instanceof  类名   
 *  返回boolean类型的值。
  */
public class TestInterface {
	
    public static void main(String[] args) {
//		American  a = new American();
//		a.eat();
//		a.play();
//		//a.name = "";
//		System.out.println(Animal2.name);
//		
//		EnlishMan e = new EnlishMan();
//		e.eat();
//		e.play();	
    	
//    	Person p = new American();
//    	p.eat();
//    	p.play();
    	
    	
    	Animal  a= new Dog();
    	a.eat();
		a.shout();
		System.out.println("======");
		
		//类型判断
		if(a instanceof Dog){
			Dog d = (Dog)a;
			d.guard();
		}
		
		
		
		Animal c = new Cat();
		if(c instanceof Dog){
		Dog d2 = (Dog) c;
		d2.guard();
		}
		
				
//		Mother m = new Daughter();
//		m.say();
		
	}
}
