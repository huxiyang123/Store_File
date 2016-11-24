package practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile:��������ȡ���ܣ����Զ�ȡָ��λ�õ����ݣ�֧�ֶ�����ļ��Ķ�ȡ��д�롣
 * 	ʹ�ó�����
 * 		���ֽ������ļ���ȡ��д�롣
 * ���췽��:
 * 		RandomAccessFile(String name, String mode)�������ж�ȡ��������д�루��ѡ������������ļ��������ļ�����ָ�����ơ�
 * 	  mode ����ָ�����Դ��ļ��ķ���ģʽ��("r","rw")
 * 		"r" ��ֻ����ʽ�򿪡����ý��������κ� write �������������׳� IOException��  
		"rw" ���Ա��ȡ��д�롣������ļ��в����ڣ����Դ������ļ���  
	������
		read()�Ӵ��ļ��ж�ȡһ�������ֽڡ� 
 		read(byte[] b)����� b.length �������ֽڴӴ��ļ����� byte ���顣 
		seek(long pos)���õ����ļ���ͷ���������ļ�ָ��ƫ�������ڸ�λ�÷�����һ����ȡ��д�������
		skipBytes(int n)������������� n ���ֽ��Զ����������ֽڡ�
		writeChars(String s)���ַ����н�һ���ַ���д����ļ���
 */
public class TestRandomFile {

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("4.txt", "rw");
			raf.write("lixi".getBytes());
			raf.writeInt(19);
			raf.write("bini".getBytes());
			raf.writeInt(43);
			raf.write("lisi".getBytes());
			raf.writeInt(23);
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				raf.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//��ʼ��ȡ�ļ�����
		try {
			RandomAccessFile raf2  = new RandomAccessFile("4.txt","r");	
			raf2.skipBytes(8);

			int len = 4;
			String str="";
			for(int i=0;i<4;i++){
					str+=(char)raf2.readByte();
			}
			System.out.println("����"+str);
			System.out.println(str+"����"+raf2.readInt());
			raf2.seek(0);
			int len1 = 4;
			String str1="";
			for(int i=0;i<4;i++){
					str1+=(char)raf2.readByte();
			}
			System.out.println("����"+str1);
			System.out.println(str1+"����"+raf2.readInt());
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
