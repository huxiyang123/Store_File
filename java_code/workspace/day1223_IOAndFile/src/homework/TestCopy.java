package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

/*
 * 3  ��һ��ͼƬ�����������ļ����¡�
 */
public class TestCopy {

	public static void main(String[] args) {
		InputStream is=null;
		OutputStream os =null;
		try {
			is = new FileInputStream("d:\\test.\\��ͼ.bmp");
			os = new FileOutputStream("c:\\�½��ı��ĵ�.bmp",true);
			
			byte[] bs = new byte[512];
			
			while(is.read(bs)!=-1){
				os.write(bs);
			
			}
			
			//os.flush();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			try {
				if(os!=null)
				os.close();
				if(is!=null)
				is.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
	}

}
