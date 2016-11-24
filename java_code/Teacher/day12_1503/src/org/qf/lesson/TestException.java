package org.qf.lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 异常：
 *    程序在运行期间发生的不正常的事件，发生异常后流程终止。
 *    异常分类：
 *      1 Error:JVM内部错误或资源耗尽导致的错误，程序员无需处理。
 *      2 Exception:
 *        1)一般异常(或受检异常)：编译器要求必须处理的异常。不处理则编译无法通过。是外界因素导致的。
 *        例如：文件无法找到 java.io.FileNotFoundException 
 *        2)运行时异常(或非受检异常)RuntimeException：编译器不要求强制处理的异常。是编程时的逻辑错误，程序员应该积极避免。
 *        例如：组下标越界：java.lang.ArrayIndexOutOfBoundsException
 * 异常处理步骤：
 *   1 发生异常时候，会自动产生一个异常对象。
 *   2 产生的异常对象会交给JVM进行，这个过程称为throw抛出异常
 *   3 JVM会查找能处理该异常的代码。如果找到，则进行对应的处理，称为异常的捕获。没有找到处理代码，则JVM异常退出，程序终止。
 * 异常处理：
 *  语法：
 *   try{
 *     可能会出现异常的代码。
 *   }
 *   ......
 *   catch(异常类型   异常变量声明){
 *      出现匹配异常时候的处理代码。
 *   }
 *   [
 *    finally{
 *      无论执行成功或发生异常均会执行的代码
 *    }
 *   ]
 *   注意：
 *     1  出现异常后处理代码中应该添加异常对象相关信息。e.printStackTrace();或者e.getMessage();
 *     2  捕获异常时候，如果异常存在子父类关系，则需要把子类异常定义在前面，否则会被父类捕获，导致子类异常处理不会被执行。
 *     3  JDK1.7以后，如果异常处理代码逻辑相同，可以把不同父类的子类集中在一个catch处理中。Exception1 e1|Exception2 e2
 *     4  finally代码块中代码无论如何均会执行
 * throws 抛出异常类型：
 *    对异常不知道如何处理，则抛出异常。
 *    特点：
 *      1 谁调用该方法，谁处理。
 *      2 main方法中必须对受检异常进行处理，不能throws。对非受检异常不做强制要求，但是一旦异常出现，程序终止。
 *      3 对非受检异常使用throws不起作用。
 *    语法：
 *      方法名()  throws 异常类型[,异常类型2......]{
 *        
 *      }
 * throw:抛出异常对象
 *   注意：
 *      1 对于运行时异常(或非受检异常)，直接throw异常对象就行了
 *      2 对于一般异常(或受检异常),throw异常对象后，方法必须同时throws异常类型
 * throws和throw的区别：
 *   1 声明的地方不同：throws用于方法声明后面，throw则在方法体中
 *   2 声明的类型不同：throws抛出异常类型,throw则抛出异常对象。    
 */
public class TestException {

	public static void main(String[] args) {
		System.out.println("开始！！！！");	
		divide(3,0);
//		try {
//			read();
//			
//		} catch (FileNotFoundException e1) {
//			System.out.println("文件丢失" + e1.getMessage());
//		}
//		catch(IOException e2){
//			System.out.println("文件处理有误："+e2.getMessage());
//		}
//		catch(Exception e){
//		  	System.out.println("其他异常"+e.getMessage());
//		}
		try {
			write();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("执行完毕");
	}

	public static void divide(int x, int y) throws ArithmeticException{
		
		System.out.println(x / y);
	}
    //受检异常，使用throws抛出，该方法的调用者必须处理该异常。其中的异常对象是系统自动抛出的。
	public static void read() throws FileNotFoundException, IOException {
		File file = new File("d:/学习.txt");
		InputStream isr = null;

		isr = new FileInputStream(file);
		System.out.println("读取文件！！！");
		isr.read();

	}
	//异常对象由编程人员抛出
	public static void write() throws FileNotFoundException{
		File file = new File("d:/hello444.txt");
		try{
			InputStream isr =  new FileInputStream(file);
		}catch(Exception e){
			throw new  FileNotFoundException("这是我写的：出错了");
		}
	}
}
