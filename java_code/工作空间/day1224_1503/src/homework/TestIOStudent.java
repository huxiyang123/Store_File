package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestIOStudent {

	public static void main(String[] args) {
		Reader file = null;
		try {
			file = new FileReader("E:" + File.separator + "��ҵ" + File.separator
					+ "Android1503����.txt");	
			random(file);
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} 
	}

	public static void random(Reader file) {
		BufferedReader br = new BufferedReader(file);
		StringBuffer sb = new StringBuffer();

		String len = null;
		try {
			while ((len = br.readLine()) != null) {

				sb.append(len);
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��  
			}
		}

		//String s = new String(sb);

	//	String[] array = new String[s.length()];
			String[] array = sb.toString().split(",");		
		int num = (int) (Math.random() * array.length);
		System.out.println(array[num]);
	}
}
