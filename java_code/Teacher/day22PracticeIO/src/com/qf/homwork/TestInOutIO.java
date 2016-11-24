package com.qf.homwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestInOutIO {

	public static void main(String[] args) {
		// 创建文件
		File file = new File("temp.txt");
		if (!file.exists()) {
			try {
				// 创建新文件
				if (!file.createNewFile()) {
					System.out.println("创建文件失败");
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			os.write("hello china!!!!".getBytes());
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		}

		// 开始读文件
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			byte[] bs = new byte[1024];
			int len = 0;
			while ((len = is.read(bs)) != -1) {
				String str = new String(bs, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
