package StudyIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * I/O�����ļ���Ӧ�ó���֮���������ͨ�ŵ�ͨ��
 * 	���ࣺվ�ڵ�ǰӦ�ó���ĽǶȿ�
 * 	  1 �������򣺶������ֽ�Ϊ��λ����
 * 	 	��������������Դ��ж�ȡ���ݵ�I/O��
 * 		��������������������д�����ݵ�I/O��	
 * 	  2 ���մ��䵥λ��
 * 		�ֽ��������ֽ�Ϊ��λ�������ݵ�I/O����
 * 		�ַ��������ַ�Ϊ��λ�������ݵ�I/O��
 * 	  3 ���չ��ܣ�
 * 		�ڵ�����ֱ�Ӳ����ײ��ļ�����
 * 		�����������������������Ӻ���չ����
 * I/O���ĸ��ࣺ
 * 	  InputStream:�����������䵥λΪ�ֽڣ����뵥λ���ֽڣ�8bit��
 * 	 ������
 * 		1 read():���������ж�ȡ���ݵ���һ���ֽڡ�
 * 		2 read(byte[] b)�����������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С�
 * 		3 read(byte[] b, int off, int len)��������������� len �������ֽڶ��� byte ���顣
 * 	     ���췽����
 * 		FileInputStream()
 * 	  ���裺
 * 		1 ����File
 * 	   	3 �ر�������
 */

public class TestIO {
	public static void main(String[] args) {
		File file = new File("1.txt");
		InputStream is = null;

		try {
			is = new FileInputStream(file);
			// ��ȡһ���ֽ�
			int b = 0;
			while ((b = is.read()) != -1) {

				System.out.print((char) b + " ");
			}
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}

	}
}
