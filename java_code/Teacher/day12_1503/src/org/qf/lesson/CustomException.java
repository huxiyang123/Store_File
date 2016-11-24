package org.qf.lesson;
/*
 * 自定义异常：
 *   场景：现有异常类不满足业务要求，需要自己创建继承Exception或子类的新异常类型。
 *   语法：
 *      异常类名  extends  Exception(或子类){
 *      
 *      }
 *   通常会基于父类的构造方法实现自定义异常类的各种构造方法。
 *   自定义异常可以认为是一种受检异常，throw自定义对象时候必须在方法声明后添加throws 自定义异常类型
 * 实践：
 *   1 仔细观察异常的类型和行号。
 *   2 使用第三方或JDK提供的类时，查看方法声明的异常部分。知道异常如何处理则使用try。。。catch处理，否则再throws
 *   3 减少try中的代码
 *   4 catch捕获异常时候,除了必须的提示信息之外，最好打印异常的堆栈信息(即调用e.printStack())，便于日后的查错。
 */
public class CustomException extends Exception { 
   //通常父类构造方法已可满足需要，无需定义新的方法
   public CustomException(String msg){
	   super(msg);
   }
   //确实需要定义新的方法，和普通类一样定义就行了。catch处直接使用即可。
   public void displayError(){
	   System.out.println("出错详细信息");
   }
}
