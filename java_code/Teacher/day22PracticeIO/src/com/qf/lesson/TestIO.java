package com.qf.lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * I/O流：文件和应用程序之间进行数据通信的通道
 *   分类：站在当前应用程序的角度看
 *    1 按照流向：
 *      输入流：程序可以从中读取数据的I/O流
 *      输出流：程序可以向其中写入数据的I/O流
 *    2 按照传输单位：
 *      字节流：以字节为单位传输数据的I/O流
 *      字符流：以字符为单位传输数据的I/O流
 *    3 按照功能：
 *      节点流：直接操作底层文件的流
 *      处理流：对其他流进行功能封装和扩展的流
 * I/O流的父类：都是抽象类
 *   1 InputStream: 输入流，传入单位是字节(8bit)。是字节输入流的所有类的超类。
 *    方法：
 *     1 read():从输入流中读取数据的下一个字节。
 *     2 read(byte[] b):从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *     3 read(byte[] b, int off, int len):将输入流中最多 len 个数据字节读入 byte 数组。
 *     4 close():关闭此输入流并释放与该流关联的所有系统资源。
 *     实现类FileInputStream: 从文件系统中的某个文件中获得输入字节.
 *       构造方法：
 *        FileInputStream(File file):根据file创建输入文件流
 *        FileInputStream(String name):根据name创见面输入文件流
 *     步骤：
 *      1 创建FileInputStream对象
 *      2 调用对应的方法获取结果
 *      3 关闭输入流  
 */
public class TestIO {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("1.txt");
			int b = 0;
			//每次读取一个字节
			while((b=is.read())!=-1){
				System.out.print((char)b);
			}			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			
		}
	}

}
