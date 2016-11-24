package com.qf.lesson;
/*
 * 方法的override覆盖
 *   原因：
 *     父类的方法不满足子类的要求。
 *   特点：
 *     1 在子类中定义
 *     2 方法名和父类方法名相同，而且参数类型  数量  顺序相同
 *     3 子类中方法的修饰符不能比父类的修饰范围小。至少是大于等于
 *     4 通常子类方法的方法体和父类不相同
 *     5 父类的static方法被重写后，static修饰符不能改变
 *  overload重载和overriding重写(或覆盖)的区别：
 *     1)场景：overload是在同一个类中，而overriding发生在子类和父类之间
 *     2)方法的要求：overload方法名相同，但是参数类型  顺序 或数量不能相同;overriding中方法名 参数类型 顺序和数量必须相同
 *     3)访问权限：overload没有要求；overriding时候子类的访问权限不能小于父类中方法的访问权限。
 */
public class Animal {
  public  void  shout(){
	   System.out.println("Animal 叫");
   }
  static void doSome(){
	  System.out.println("static Animal doSome");
  }
}
