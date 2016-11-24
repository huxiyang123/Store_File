package study;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/*
 * Properties��ʹ�ã�
 *    ��ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء�
 *    �����б���ÿ���������Ӧֵ����һ���ַ�����
 * ���췽����
 *   Properties()��  ����һ����Ĭ��ֵ�Ŀ������б� 
 * ������
 *   1 load(InputStream inStream)�� ���������ж�ȡ�����б�����Ԫ�ضԣ���
 *   2 getProperty(String key)��  ��ָ���ļ��ڴ������б����������ԡ�
 *   3 setProperty(String key, String value)�� ���� Hashtable �ķ��� put�����˽⣩
 * ʹ�ó�����
 *   ϵͳ�����ļ��У�ʵ�����õĶ�̬�޸ġ���Ҫ����������Ϣ�Ķ�ȡ��
 */
public class TestProperties {

	public static void main(String[] args) {
		Properties ps = new Properties();
		try {
			//���ļ����ķ�ʽ���������ļ�
			ps.load(TestProperties.class.getResourceAsStream("db.properties"));
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
        //��ȡ��Ӧ���Ե�ֵ
		String uname = ps.getProperty("username");
		String pw = ps.getProperty("password");
		System.out.println(uname + " ;" + pw);
		//���ö�Ӧ���Ե�ֵ
		ps.setProperty("username", "hellworld");
		//�����µ�����
		ps.setProperty("test", "test");
		try {
			//�µ�����ֵ���б���
			OutputStream os = new FileOutputStream("/db.properties");
			ps.store(os,"");
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}

