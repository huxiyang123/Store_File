package homework23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 * ��һ��ͼƬcopy����һ��ͼƬ��
 */

public class TestCopy {

	public static void main(String[] args) {
		File file = new File("E:\\java�ļ�\\java�ʼ�\\private˽��.png");
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(file);
			os = new FileOutputStream("e:\\nihao.png");
			byte[] c = new byte[(int) file.length()];
			while(is.read(c)!=-1){
				os.write(c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				os.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
