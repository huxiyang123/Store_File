package studychangeIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * ������ �����ڽڵ���֮��
 * 		�Զ�д�������ṩ�˻���Ĺ��ܣ�����˶�д��Ч�ʣ���������һЩ�µķ���
 * 	���ࣺ
 * 		1	BufferedInputStream����InputStream�����˰�װ
 * 		ԭ���ڴ��� BufferedInputStream ʱ���ᴴ��һ���ڲ����������顣
 * 			�ڶ�ȡ���������е��ֽ�ʱ���ɸ�����Ҫ�Ӱ������������ٴ������ڲ�������
 * 			һ��������ֽ�
 * 		���췽����
 * 			BufferedInputStream(InputStream in)��
 * 			����һ�� BufferedInputStream ��������������������� in���Ա㽫��ʹ�á�
 * 		������
 * 			read();
 * 			read(byte[] b, int off, int len)������ƫ��������ʼ�����ֽڶ�ȡ��ָ���� byte������,����ʵ�ʶ�ȡ���ֽ�����
 * 			close();�ر������ͷ���ص�ϵͳ��Դ
 * 		ʵ�ֲ��裺
 * 			1 ��������ڵ�������
 * 			2 �������뻺���������Բ���1�Ľڵ�Ϊ����Ϊ����������
 * 			3 �ر���
 * 		2	BufferedOutputSream����OutputStream�����˻���
 * 			 �������ֽ�д��ײ�������У����������ÿ���ֽ�д����õײ�ϵͳ
 * 		���췽����
 * 			BufferedOutputSream(OutputStream out):����һ���µĻ������������
 * 	���裺
 * 		1 ��������ڵ�������
 * 		2 ������������������Բ���1�Ľڵ�������Ϊ����
 * 		3 �رջ���������
 * 		3	BufferedReder����Reader���л���
 * 			readline():��һ���ı��ļ����С�
 * 			read()����һ���ַ�
 * 			read(char[] b, int off, int len)������ƫ��������ʼ�����ֽڶ�ȡ��ָ���� char������,����ʵ�ʶ�ȡ���ֽ�����
 * 			close();�ر������ͷ���ص�ϵͳ��Դ
 * 		4	BufferedWriter����Writer���а�װ
 */
public class TestBufferedIO {

	public static void main(String[] args) {
		InputStream is = null;
		BufferedInputStream bis = null;
		try {
			is = new FileInputStream("2.txt");
			bis = new BufferedInputStream(is);
			byte[] by = new byte[1024];
			int len = 0;
			while((len=bis.read(by))!=-1){
				System.out.println(new String(by,0,len));
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				bis.close();
				is.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
