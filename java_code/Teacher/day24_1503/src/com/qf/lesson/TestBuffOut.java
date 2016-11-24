package com.qf.lesson;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestBuffOut {

	public static void main(String[] args) {
		OutputStream os = null;
		BufferedOutputStream bos = null;
		try {
			os = new FileOutputStream("1.txt");
			bos = new BufferedOutputStream(os);
			bos.write("hello world8888".getBytes());
			//bos.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				bos.close();				
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
        
	}

}
