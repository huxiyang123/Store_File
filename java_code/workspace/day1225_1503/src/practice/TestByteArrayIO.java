package practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestByteArrayIO {

	public static void main(String[] args) {
		// 放置
		ByteArrayInputStream bais = new ByteArrayInputStream(
				"hello world".getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int ch = 0;
		while ((ch = bais.read()) != -1) {
			// int result = ch-32;
			int result = Character.toUpperCase(ch);
			// 把转换后的结果方法输出输出对象的缓冲区中
			 baos.write(result);

		}
		OutputStream os = null;
		try {
			os = new FileOutputStream("2.txt");
			baos.writeTo(os);
			baos.writeTo(System.out);
			baos.flush();
		} catch (FileNotFoundException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
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

		// System.out.println(new String(baos.write("2.txt")));

	}

}
