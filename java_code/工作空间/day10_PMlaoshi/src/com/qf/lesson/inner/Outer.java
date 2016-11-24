package com.qf.lesson.inner;
/*
 * 内部类： 包含在其他类中的类。包含内部类的类称为外部类。内部类是外部类的组成部分。
 *    可以访问外部类的private成员。
 *    分类：
 *     1 成员内部类：
 *        可以当做外部类的一个普通成员变量。
 *        定义：
 *       [修饰符] 外部类类名{
 *         外部类的成员变量;
 *         外部类的成员方法;
 *         [修饰符]  内部类名{
 *          
 *         }
 *       }
 *   调用方法：必须通过外部类的对象进行调用
 *   步骤：
 *    1)外部类类名  外部类变量  = new 外部类类名();
 *    2)外部类类名.内部类名  内部类变量   = 外部类变量.new 内部类名(); *     
 *     2 静态内部类：使用static修饰的内部类。可以看做外部类的一个static的成员变量
 *     定义：
 *       [修饰符] 外部类类名{
 *         外部类的成员变量;
 *         外部类的成员方法;
 *         [修饰符] static  内部类名{
 *          
 *         }
 *       } 
 *    调用方式:使用外部类直接方法，因为该类可以看做是外部类的一个static变量
 *     步骤：
 *       外部类类名.内部类名  内部类变量   = new 外部类变量.内部类名();
 *     
 *     3 局部内部类: 在方法中定义的内部类。只能使用默认修饰符。仅作了解，使用极少
 *        [修饰符] 外部类类名{
 *         外部类的成员变量;
 *         外部类的成员方法(){        
 *           内部类名{
 *          
 *           }       
 *         }; *         
 *       } 
 *       使用：
 *         在方法中初始化和使用：
 *         内部类名 变量 = new  内部类名();  
 *       
 *     4 匿名内部类：基于抽象类和接口
 *       new  抽象类或接口(){
 *         抽象类或接口中方法的实现。
 *       };
 *    如果内部类只被使用一次，可以使用匿名内部类；如果在当前类中多次使用，则定义为成员内部类 ；多个类均使用，则定义为单独的外部类。 
 */
public class Outer {
    private String name = "Outer类";
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	class Inner{
      private int age = 18;    
      public void display(){
    	  System.out.println("名字"+name+";age"+this.age);
      }
    }
    
    public void say(){
    	class Inner{
    		String name = "";
    		void doSome(){
    			System.out.println("我是局部内部类");
    		}
    	}
    	
    	Inner i = new Inner();
    	i.name = "lisi";
    	i.doSome();
    }
    		
}
