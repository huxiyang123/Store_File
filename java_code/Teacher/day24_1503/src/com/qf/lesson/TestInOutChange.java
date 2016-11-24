package com.qf.lesson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 * 使用转换流，实现在控制台回显输入的内容
 *  步骤：
 *   1 根据System.in获取输入字节流
 *   2 使用InputStreamReader转换流转换字节流为字符流
 *   3 获取输入的结果。
 *   4 根据System.out获取输出字节流
 *   5 使用OutputStreamWriter转换字符为字节流中的数据。
 *   6 调用转换流的write()方法
 *   7 关闭流
 */
public class TestInOutChange {
	public static void main(String[] args) {
		// 输入字节流
		InputStream is = System.in;
		// 输入转换流
		InputStreamReader isr = new InputStreamReader(is);

		// 输出字节流
		PrintStream ps = System.out;// OutputStream ps = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(ps);

		// 实际读取的字符长度
		int len = 0;
		char[] cs = new char[1024];
		try {
			while ((len = isr.read(cs)) != -1) {
				String temp = new String(cs, 0, len);
				osw.write("转换后： "+temp);
				osw.flush();
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				osw.close();
				ps.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
