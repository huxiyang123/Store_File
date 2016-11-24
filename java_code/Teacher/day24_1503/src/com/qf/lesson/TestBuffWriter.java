package com.qf.lesson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestBuffWriter {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			Writer w = new FileWriter("1.txt");
			 bw = new BufferedWriter(w);
			bw.write("hello world11");
			bw.newLine();
			bw.write("hello world2");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
