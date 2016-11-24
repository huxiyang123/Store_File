package com.qf.first;
/*
 * 权限修饰符：
 *    指定修饰符修饰成员变量或方法或类的访问权限。
 *    分类：
 *      1 修饰变量  方法：
 *        private 仅在当前类中使用，其他类中不可见。
 *        default（该关键字不存在，没有修饰符就是default）:仅在同一个包中可见。
 *        protected:同一个包中或不同包的子类中
 *        public：没有限制
 *        private --->默认---->protected---->public
 *      2 修饰类
 *         default（该关键字不存在，没有修饰符就是default）:仅在同一个包中的类可以使用，其他包无法使用
 *         public :没有限制，只要import该类对应的包就行了。
*/ 
public class Person {
   private String name;
   int age;
   protected String address;
   public String country;  
   
   
   private void shout1(){
	  System.out.println("private 方法");
   }   
   
   void shout(){
	   System.out.println(this.name);
   }
   
   protected void shout3(){
	   System.out.println("protected方法");
   }
   
   public void shout4(){
	   System.out.println("public 方法");
	   shout5();
   }
   
   public static void shout5(){
	   
   }
}
