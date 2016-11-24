package studychangeIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;

/*
 * ���裺
 * 	1 ����Reader�ַ�������
 * 	2 ��������BufferedReader����ʹ�ò���1�Ķ�����Ϊ����
 * 	3 
 * 	4 ����������close�رյײ�Ľڵ�������Ҳ�ᱻһ���ر�
 */

public class TestBufferedReader {

	public static void main(String[] args) {
		Reader r=null;
		BufferedReader br = null;
		try {
			r = new FileReader("2.txt");
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		br = new BufferedReader(r);
		char[] ch = new char[1024];
		int  temp = 0;
		try {
			while((temp=br.read(ch))!=-1){
				System.out.println(new String(ch,0,temp));
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}

	}

}
