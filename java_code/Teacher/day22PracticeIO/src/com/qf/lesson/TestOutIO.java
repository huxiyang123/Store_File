package com.qf.lesson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 2  OutputStream：输出字节流。输出字节流的所有类的超类。输出流接受输出字节并将这些字节发送到某个接收器。
 *    方法：
 *      1 write(byte[] b)： 将 b.length 个字节从指定的 byte 数组写入此输出流。
 *      2 write(byte[] b, int off, int len)：将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 *      3 write(int b) 将指定的字节写入此输出流。
 *      4 flush() 刷新此输出流并强制写出所有缓冲的输出字节。
 *      5 close() 关闭此输出流并释放与此流有关的所有系统资源。
 *  实现类：
 *     FileOutputStream:
 *    构造方法：
 *     FileOutputStream(File file):向指定文件中写入内容
 *     FileOutputStream(String name):向名称name的文件中写入内容
 *     (使用boolean append指是否为添加操作)。
 *    写文件步骤：
 *     1 创建FileOutputStream对象
 *     2 调用对应的write方法
 *     3 关闭输出流
 */
public class TestOutIO {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("1.txt", true);
			// 每次写一个字节
			// os.write(65);
			// 每次写多个字节
			os.write("my first io".getBytes(), 0, 10);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
