package com.qf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 内存流：
 *   使用内存实现文件流的I/O操作。底层使用字节数组实现。
 *   1 ByteArrayInputStream:包含一个内部缓冲区，该缓冲区包含从流中读取的字节。
 *     构造方法：
 *      ByteArrayInputStream(byte[] buf)：  创建一个 ByteArrayInputStream，使用 buf 作为其缓冲区数组。
 *     方法：
 *      read():读取一个字节
 *      read(byte[] bs,int offset,int len):将最多 len 个数据字节从此输入流读入 byte 数组。
 *   2 ByteArrayOutputStream:实现了一个输出流，其中的数据被写入一个 byte 数组。
 *     构造方法：
 *      ByteArrayOutputStream()：  创建一个新的 byte 数组输出流。
 *     方法：
 *      write(int b)：将指定的字节写入此 byte 数组输出流。
 *      write(byte[] b, int off, int len)： 将指定 byte 数组中从偏移量 off 开始的
 *      toByteArray()： 创建一个新分配的 byte 数组。
 *      toString()： 使用平台默认的字符集，通过解码字节将缓冲区内容转换为字符串。
 */
public class TestMemory {

	public static void main(String[] args) {
		// 放置byte在内部缓冲区
		ByteArrayInputStream bais = new ByteArrayInputStream(
				"hello world".getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int ch = 0;
		while ((ch = bais.read()) != -1) {
			// int result = ch - 32;
			int result = Character.toUpperCase(ch);
			// 把转换后的结果方法输出对象流的缓冲区中
			baos.write(result);
		}

		// String str = baos.toString();
		// System.out.println(str);
		OutputStream os = null;
		try {
			os = new FileOutputStream("1.txt");
			baos.writeTo(System.out);
			baos.flush();
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
