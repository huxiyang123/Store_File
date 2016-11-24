package com.qf.lesson;
/*
 * Object类：
 *    是所有类的祖先类。所有没有使用extends关键字的类，默认继承于Object
 *    方法：
 *      1）equals(Object other):当前对象和传入的对象是否相等(内存地址是否相同)。返回boolean类型
 *      2）getClass():返回此 Object 的运行时类。
 *      3）hashCode():返回该对象的哈希码值。可以近似的认为是对象的内存地址。
 *      4)toString():返回对象的字符串表示。建议自定义类均覆盖toString();
 *      
 * abstract:
 *    1 抽象方法： [修饰符] abstract 返回类型  方法名();
 *      1)包含抽象方法的类一定是抽象类，必须使用abstract修饰。
 *      2)父类只是定义了规范(就是只定义方法名)，但是没有实现(没有方法体)。由子类根据需要自行实现。
 *    2 抽象类：[修饰符] abstract class 类名{
 *       成员变量
 *       方法();
 *      }
 *      1）抽象类不一定有抽象方法。
 *      2)抽象类中可以包含完整的方法(即有方法体的方法)
 *      3)抽象类不能实例化(不能new对象)
 *    3 抽象类的实现类：
 *      [修饰符] class 类名  extends 抽象类{
 *        必须覆盖抽象类的抽象方法;
 *      }
 *      1)完整的抽象类的子类必须覆盖父类中抽象方法。
 *      2)抽象类的子类如果没有覆盖父类的抽象方法，则子类也是抽象类。
 *      3)完全覆盖了抽象父类中的抽象方法的子类，如果子类中定义了抽象方法，子类仍然是抽象类。
 *      
 */
public class TestObject {

	public static void main(String[] args) {
		/*
		Animal  a = new Animal();
		Animal b = new Animal();
		boolean flag = a.equals(b);
		System.out.println("a对象和b对象是相等的吗："+flag);
		System.out.println("a==b是相等的吗？"+(a==b));
        System.out.println("======");
        
        System.out.println(a.getClass());
        
        a.name = "Dog";
        b.name= "Pig";
        
        a.age = 2;
        b.age = 3;
        
        System.out.println("name: "+a.name + ";age:"+a.age);
        System.out.println("name: "+b.name + ";age:"+b.age);
        System.out.println("======");
        System.out.println(a.toString());
        System.out.println(b);
        */
	}

}
