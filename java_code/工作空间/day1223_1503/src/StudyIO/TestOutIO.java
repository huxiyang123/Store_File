package StudyIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * OutputStream:
  	 1 close() �رմ���������ͷ�������йص�����ϵͳ��Դ. 
 	 2 write(byte[] b) �� b.length ���ֽڴ�ָ���� byte ����д���������� 
 	 3 write(byte[] b, int off, int len) ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д���������� 
  	 4 write(int b) ��ָ�����ֽ�д���������� 
	 5 flush()  ˢ�´��������ǿ��д�����л��������ֽڡ�
	 
	ʵ���ࣺ
	  FileOutputStream(File file) ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
	д�ļ����裺
	  1 ����FileOutputStream
 */
public class TestOutIO {

	public static void main(String[] args) {
		OutputStream os =null;
		try {
			os = new FileOutputStream("1.txt",true);
			os.write(97);
			//os.flush();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			try {
				os.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}		
	}
}
