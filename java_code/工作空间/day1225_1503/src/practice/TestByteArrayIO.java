package practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestByteArrayIO {

	public static void main(String[] args) {
		// ����
		ByteArrayInputStream bais = new ByteArrayInputStream(
				"hello world".getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int ch = 0;
		while ((ch = bais.read()) != -1) {
			// int result = ch-32;
			int result = Character.toUpperCase(ch);
			// ��ת����Ľ����������������Ļ�������
			 baos.write(result);

		}
		OutputStream os = null;
		try {
			os = new FileOutputStream("2.txt");
			baos.writeTo(os);
			baos.writeTo(System.out);
			baos.flush();
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

		// System.out.println(new String(baos.write("2.txt")));

	}

}
