package homework23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 * 将一张图片copy到另一张图片中
 */

public class TestCopy {

	public static void main(String[] args) {
		File file = new File("E:\\java文件\\java笔记\\private私有.png");
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(file);
			os = new FileOutputStream("e:\\nihao.png");
			byte[] c = new byte[(int) file.length()];
			while(is.read(c)!=-1){
				os.write(c);
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
				os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
