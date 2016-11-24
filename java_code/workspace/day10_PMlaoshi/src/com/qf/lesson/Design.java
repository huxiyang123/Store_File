package com.qf.lesson;
/*
 * 模式：代码编写中一些好的方法或实现。
 *   分类：其中的两种
 *   1 单例模式：实现该模式的类只能有一个对象。
 *     步骤：
 *       1)构造方法私有化。目的是防止在外部创建对象。
 *       2)创建私有的类变量，把创建的对象赋给该变量。
 *       3)创建公有的static返回类型为类类型的方法，返回步骤2创建的类变量。(只有static类型的方法可以通过类名方法)
 *       4)步骤2的类变量类型修改为static(以便static方法使用)
 *   根据创建对象时机的不同，分为饿汉模式和饱汉模式。
 *     1）创建引用类型变量的同时进行对象的创建。成为饿汉模式
 *     2）调用时候进行判断，对象存在则直接返回，否则才开始对象的创建。
 *   2 简单工厂模式：产生对象的工厂方法
 *     步骤：
 *       1）  创建一个public static的，返回类型为子类的父类型方法，同时设置一个String类型参数。
 *       2）  方法中，根据类型的不同，返回子类的new产生的对象。
 *     
 */
public class Design {
   private static Design instance = new Design();
   private Design(){
	   System.out.println("构造方法初始化");
   }
   
   public static  Design getInstance(){
	   return instance;
   }
   
   void display(){
	   System.out.println("我是Design的display()");
   }
}
