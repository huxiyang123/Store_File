package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;

/*
 * �쳣��
 * 	  �����������ڼ䷢���Ĳ��������¼��������쳣��������ֹ��
 *  �쳣���ࣺ
 *  	1 Error��JVM�ڲ��������Դ�ľ����µĴ��󣬳���Ա����
 *  	2 Exception 
 *  		1  һ���쳣�����ܼ��쳣�����봦�������޷�����
 *  		2 ����ʱ�쳣�����ܼ��쳣������������Ҫ��ǿ�ƴ�����쳣���Ǳ�̵��߼�����
 *  �쳣�����裺
 *  	�����쳣��ʱ�򣬻��Զ�����һ���쳣����
 *    	�����Ķ��󽻸�jvm���д����������Ϊthrow�׳��쳣
 *    	jvm������ܴ�����쳣�Ĵ��룬����ҵ��������Ӧ���쳣����Ϊ�쳣�Ĳ�׽��catch�������û���ҵ�����jvm�쳣�˳���������ֹ��
 *  �����쳣��
 *    �﷨��
 *      try{
 *      	���ܻ�����쳣�Ĵ���
 *      }
 *      ������������������
 *      catch(�쳣����  �쳣��������){
 *      	����ƥ����쳣ʱ��Ĵ������
 *      }
 *      finally{
 *      ����ִ�гɹ����쳣��ִ�еĴ���
 *      }
 *    ע�⣺
 * throws �׳��쳣����
 * 		���쳣��֪����δ������׳��쳣��
 * 	�ص㣺
 * 		1   ˭����˭����
 * 		2 main����������쳣�ܼ��쳣��������throws���Է��ܼ��쳣��ǿ����һ�������쳣��������ֹ��
 * 		3 �Է��ܼ��쳣ʹ��throws�������á�
 *   �﷨   ��
 *     ������ throws �쳣���ͣ��쳣����2........{
 *     
 *     }
 * throw	 	
 */
public class TestException {
	public static void main(String[] args) {
	
		System.out.println("���п�ʼ");
		divide(3,0);
		System.out.println("���н���");
	}
	public static void divide(int x,int y){
		System.out.println(x/y);
	}
	//�ܼ��쳣��ʹ��throws�������߱��봦����쳣�������쳣������ϵͳ�Զ��׳�
	public static void read(){
		File file = new File("d:/hello.txt");
		try{
			InputStream is = new FileInputStream(file);
			System.out.println("��ȡ�ļ�����");
			is.read();
			is.close();
		}catch(FileNotFoundException e){
			System.out.println("�ļ������ڣ����½���������"+e.getMessage());
			e.printStackTrace();
			
		}
		catch(IOException e2){
			System.out.println("�ļ���ȡ���󣡣�����"+e2.getMessage());
			e2.printStackTrace();
		}
		catch(Exception ex){
			System.out.println("δ֪�쳣");
			ex.printStackTrace();
		}
		finally{
		
		}
		public static void write(){;
			File file1 = new File("d:/hello.txt");
			OutputStream os = new FileOutputStream(file);
		}
	}
}
