package StudyIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * Reader:���ڶ�ȡ�ַ����ĳ�����
 */
public class TestReader {

	public static void main(String[] args) {
		/*
		 * ��Reader������ȡ�ļ�ֵ
		 */
		Reader r = null;
		try {
			r =new FileReader("2.txt");
			char[] c = new char[1024];
			int len = 0;
			while((len=r.read(c))!=-1){
				String str = new String(c,0,len);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		

	}

}
