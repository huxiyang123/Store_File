package world;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestHello {
	public static void main(String[] args) {
		ByteArrayInputStream bi = new ByteArrayInputStream(
				"hello world".getBytes());
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		int ch = 0;
		while ((ch = bi.read()) != -1) {

			 bo.write(ch);
			 try {
				bo.flush();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		OutputStream os = null;
		try {
			os = new FileOutputStream("2.txt");
			bo.writeTo(os);
			bo.writeTo(System.out);
			bo.flush();
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}