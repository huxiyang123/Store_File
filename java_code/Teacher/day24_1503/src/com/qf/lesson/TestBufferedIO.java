package com.qf.lesson;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 * 缓冲流读取键盘输入
 */
public class TestBufferedIO {

	public static void main(String[] args) {
		InputStream is = System.in;
		OutputStream os = System.out;

		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		byte[] buff = new byte[1024];
		int len = 0;
		
		try {
			while((len = bis.read(buff))!=-1){			
				bos.write(buff,0,len);
				bos.flush();
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
