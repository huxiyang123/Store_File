package com.qf;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * PrintWriter打印流的使用：
 *   构造方法：
 *     PrintWriter(OutputStream out)根据现有的 OutputStream 创建不带自动行刷新的新 PrintWriter。
 *     PrintWriter(Writer out)创建不带自动行刷新的新 PrintWriter。
 *   方法： 
 *     print(String str):打印字符串
 *     close():关闭流。不然内存中数据不会写入到对应流中
 *     
 */
public class TestPrintWriter {

	public static void main(String[] args) {
		//打印到控制台
//		PrintWriter pw = new PrintWriter(System.out);
//        pw.write("hello world");
//        pw.close();
		
		
        //打印到文本文件中
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("1.txt"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
        pw.print("I come from PrintWriter!!!!");
        pw.close();
	}

}
