package com.qf.lesson;
/*
 * 类的初始化顺序：
 *   1 没有使用extends关键字：
 *     1)首先进行static变量和代码块的初始化，按照声明顺序，先声明先加载。
 *     2)然后进行成员变量的初始化，按照声明顺序，先声明先加载。
 *     3)构造方法的初始化。 
 *   2 继承结构初始化：
 *     1) 继承体系的所有静态成员初始化,先父类,后子类.
       2) 父类构造器初始化完成（普通成员的初始化-->构造函数的调用) 
       3) 子类构造器初始化（普通成员-->构造函数）
 */
public class Chinese extends Parent{
   private int age = 19;
   
   private static String country = "中国";
  
   static{
	   System.out.println("国籍是: "+country);
	   System.out.println("静态代码块初始化！！！");
   }
  
   
   public Chinese(int sAge) {
	 super("test");
	 System.out.println("默认年龄："+age);
	 System.out.println("构造方法初始化!!!!");
	 this.age = sAge;
	 System.out.println("实际年龄:"+age);
   }
   
   static{
	   System.out.println("静态代码块111");
   }
}
