package StudyIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * �ַ���������Ԫ�����ַ�Ϊ��λ
 * 	Writer��д���ַ����ĳ�����
 * 	      ������
 * 		1 write(String str) д���ַ����� 
  		2 write(String str, int off, int len)д���ַ�����ĳһ���֡� 
		3 close() �رմ�������Ҫ��ˢ������ 
 		4 flush() ˢ�¸����Ļ��塣 �ر�ʱ �����
	ʵ���ࣺ
	  FileWriter(File file)  ���ݸ����� File����һ�� FileWriter ����
 * 	
 */
public class TestWriter {

	public static void main(String[] args) {
		Writer w = null;
		try {
			 w = new FileWriter("2.txt");
			 w.write("�Ҳ�ϲ��������");
			w.flush();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			try {
				w.flush();
				w.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}

	}

}
