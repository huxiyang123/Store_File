package com.qf.lesson;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 缓冲流：基于相应的节点流之上 。
 *    对读写的数据提供了缓冲的功能，提高了读写的效率，还增加了一些新的方法.
 *  注意：
               对于缓冲输出流，写出的数据会先缓存在内存缓冲区中，关闭此流前要用flush()方法将缓存区的数据立刻写出。
               关闭过滤流(缓冲流的父类)时，会自动关闭过滤流所包装的所有底层流。

 * 分类：
 *   1 BufferedInputStream: 对InputStream输入字节流进行了包装
 *    原理：在创建 BufferedInputStream 时，会创建一个内部缓冲区数组。
 *        在读取或跳过流中的字节时，可根据需要从包含的输入流再次填充该内部缓冲区，一次填充多个字节。
 *    构造方法：
 *      BufferedInputStream(InputStream in)： 创建一个 BufferedInputStream 并保存其参数，即输入流 in  
 *      方法：
 *       read():读取一个字节
 *       read(byte[] bs,int offset,int length):给定偏移量处开始将各字节读取到指定的 byte 数组中，返回实际读取的字节数
 *       close():关闭流并释放相关的系统资源。 
 *     实现步骤：
 *       1 创建输入节点流对象
 *       2 创建输入缓冲流对象，以步骤1的节点流对象为构造器参数
 *       3 关闭流
 *   2 BufferedOutputStream:对OutputStream进行缓冲。
 *     将各个字节写入底层输出流中，而不必针对每次字节写入调用底层系统。
 *    构造方法：
 *      BufferedOutputStream(OutputStream out)： 创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *    方法：
 *      write(int b): 写入单个字节
 *      write(byte[] bs,int offset,int len):从偏移量 off 开始的 len 个字节写入此缓冲的输出流
 *      flush():刷新此缓冲的输出流。
 *     实现步骤：
 *      1 创建输出节点流对象
 *      2 创建输出缓冲流对象，以步骤1的节点流对象为参数
 *      3 关闭缓冲流对象。（底层的节点流也一并被关闭了）
 *   3 BufferedReader:对Reader进行缓冲
 *     从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。 *   
 *     构造器：
 *       BufferedReader(Reader in)：  创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 *     方法：
 *       readLine():读取一个文本行。
 *       read():读取一个字符
 *       read(char[] cs,int offset,int len):读入字符数组的某一部分。
 *       close():关闭缓冲流并释放系统资源
 *     步骤：
 *       1 创建Reader字符流对象
 *       2 创建缓冲BufferedReader对象，使用步骤1的对象作为参数
 *       3 调用对应的方法
 *       4 缓冲流对象close关闭。底层的节点流对象也会被一并关闭
 *   4 BufferedWriter:对Writer进行包装
 *     将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。
 *    构造器：
 *      BufferedWriter(Writer out)： 创建一个使用默认大小输出缓冲区的缓冲字符输出流。
 *    方法：
 *      write(char c):写入单个字符
 *      write(char[] cs,int offset,int len)：写入字符数组的一部分
 *      write(String s,int offset,int len):写入字符串的一部分
 *      flush():刷新缓冲流中的数据
 *      close():关闭缓冲流和系统相关资源
 *      newLine():创建新行
 */
public class TestBuffer {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("1.txt");
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		BufferedInputStream bis = new BufferedInputStream(is);
		//实际读取字节长度
        int len = 0;
        //字节缓冲数组
        byte[] bs = new byte[1024];        
        try {
			while((len = bis.read(bs))!=-1){
				String  str = new String(bs,0,len);
				System.out.print(str);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        finally{
        	try {
				bis.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
        }
        }

}
