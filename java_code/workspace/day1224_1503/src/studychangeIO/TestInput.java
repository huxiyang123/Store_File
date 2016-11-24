package studychangeIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * ת������
 * 	1 ����ת����InputStreamReader:�ֽ���ת��Ϊ�ַ���������
 * 	   ���췽����
 * 		InputStreamReader():����ʹ�ø����ַ�����InputStreamReader��
 * 	   ������
 * 		read():��ȡ�����ֽ�
 * 		read(char[] cbuf, int offset, int length) ���ַ����������е�ĳһ����
 * 		close() �رո������ͷ���֮������������Դ��
 */
public class TestInput {

	public static void main(String[] args) {
		//����������
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("�����룺");
		try {
			int len = 0;
			char[] c = new char[1024];
			
			while((len = isr.read(c))!=-1){
				String str = new String(c,0,len);
				System.out.println("����������ǣ�"+str);
			}			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {				
					isr.close();
					is.close();
	
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
