package com.qf.lesson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 转换流：
 *   1 输入转换流：
 *   InputStreamReader:是字节流通向字符流的桥梁
 *     构造方法：
 *      InputStreamReader(InputStream is):创建一个使用默认字符集的 InputStreamReader。
 *     方法：
 *      read()： 读取单个字符。、
 *      read(char[] cbuf, int offset, int length)： 将字符读入数组中的某一部分。
 *      close():关闭该流并释放与之关联的所有资源。
 *    使用步骤：
 *       1  创建对应的输入流对象(节点流)
 *       2  创建转换流对象，把步骤1的对象作为构造方法的参数
 *       3  调用对应的方法
 *       4  关闭流
 *   
 */
public class TestChange {

	public static void main(String[] args) {
		//输入字节流对象
		InputStream is = System.in;
		//转换为字符流
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("请输入:");
		try {
			int len = 0;
			char[] cs = new char[1024];
			//读取输入流中的数据到cs字符数组中
			while((len=isr.read(cs))!=-1){
				String str = new String(cs,0,len);
				System.out.println("键盘输入是："+str);				
			}		
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				isr.close();
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
        
	}

}
