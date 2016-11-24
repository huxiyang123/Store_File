package com.qf.lesson;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * 输出转换流：OutputStreamWriter，是字符流通向字节流的桥梁
 *   构造方法：
 *     OutputStreamWriter(OutputStream out)： 创建使用默认字符编码的 OutputStreamWriter。
 *   方法：
 *     write(char[] cbuf, int off, int len):写入字符数组的某一部分。
 *     write(int c): 写入单个字符。
 *     write(String str, int off, int len):写入字符串的某一部分。
 *   步骤：
 */
public class TestOutChange {

	public static void main(String[] args) {
		OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        try {
			osw.write("I come from  OutputStreamWriter");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        finally{
        	try {
				osw.close();
				os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
        }
	}

}
