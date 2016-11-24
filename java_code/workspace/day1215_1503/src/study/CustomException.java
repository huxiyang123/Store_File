package study;
/*
 *自定义异常：
 *	场景：现有异常类不满足业务要求，
 *	语法：
 *		异常类名 extends Exception(子类){
 *		
 *		}
 *	通常会基于父类的构造方法实现自定义类的各种构造方法.
 *	自定义异常
 *	实践：
 *	  4 catch捕获异常时候，除了必要的提示信息外，最好
 */
public class CustomException extends Exception{
	public CustomException(String msg){
		super(msg);
	}
	public void dispalyError(){
		System.out.println("haohoahoaoahahaho");
	}
}
