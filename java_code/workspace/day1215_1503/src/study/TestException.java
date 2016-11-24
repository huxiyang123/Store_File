package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;

/*
 * 异常：
 * 	  程序在运行期间发生的不正常的事件，发生异常后流程终止。
 *  异常分类：
 *  	1 Error：JVM内部错误或资源耗尽导致的错误，程序员务处理。
 *  	2 Exception 
 *  		1  一般异常（或受检异常）必须处理，否则无法编译
 *  		2 运行时异常（非受检异常）：编译器不要求强制处理的异常，是编程的逻辑错误，
 *  异常处理步骤：
 *  	发生异常的时候，会自动产生一个异常对象。
 *    	产生的对象交给jvm进行处理，这个过程为throw抛出异常
 *    	jvm会查找能处理该异常的代码，如果找到，则处理对应的异常，成为异常的捕捉（catch）；如果没有找到，则jvm异常退出，程序终止。
 *  处理异常：
 *    语法：
 *      try{
 *      	可能会出现异常的代码
 *      }
 *      。。。。。。。。。
 *      catch(异常类型  异常变量声明){
 *      	出现匹配的异常时候的处理代码
 *      }
 *      finally{
 *      无论执行成功或异常均执行的代码
 *      }
 *    注意：
 * throws 抛出异常类型
 * 		对异常不知道如何处理，则抛出异常。
 * 	特点：
 * 		1   谁调用谁处理。
 * 		2 main方法必须对异常受检异常处理，不能throws。对非受检异常不强求处理，一旦出现异常，程序终止。
 * 		3 对非受检异常使用throws不起作用。
 *   语法   ：
 *     方法名 throws 异常类型，异常类型2........{
 *     
 *     }
 * throw	 	
 */
public class TestException {
	public static void main(String[] args) {
	
		System.out.println("运行开始");
		divide(3,0);
		System.out.println("运行结束");
	}
	public static void divide(int x,int y){
		System.out.println(x/y);
	}
	//受检异常，使用throws，调用者必须处理该异常，其中异常对象是系统自动抛出
	public static void read(){
		File file = new File("d:/hello.txt");
		try{
			InputStream is = new FileInputStream(file);
			System.out.println("读取文件！！");
			is.read();
			is.close();
		}catch(FileNotFoundException e){
			System.out.println("文件不存在，请新建！！！！"+e.getMessage());
			e.printStackTrace();
			
		}
		catch(IOException e2){
			System.out.println("文件读取有误！！！！"+e2.getMessage());
			e2.printStackTrace();
		}
		catch(Exception ex){
			System.out.println("未知异常");
			ex.printStackTrace();
		}
		finally{
		
		}
		public static void write(){;
			File file1 = new File("d:/hello.txt");
			OutputStream os = new FileOutputStream(file);
		}
	}
}
