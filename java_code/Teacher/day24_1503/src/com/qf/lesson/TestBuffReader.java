package com.qf.lesson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/*
 * 读取文本文件内容
 */
public class TestBuffReader {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			Reader r = new FileReader("1.txt");
			br = new BufferedReader(r);
			//每次读取一行
//			String temp = null;
//			while((temp = br.readLine())!= null){
//				System.out.println(temp);
//			}
			//每次读入一个字符数组中
			char[] cs = new char[1024];
			int len = 0;
			while((len=br.read(cs))!=-1){
				String str = new String(cs,0,len);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
