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
 * 3  将一张图片拷贝到其他文件夹下。
 */
public class TestCopy {

	public static void main(String[] args) {
		InputStream is=null;
		OutputStream os =null;
		try {
			is = new FileInputStream("d:\\test.\\截图.bmp");
			os = new FileOutputStream("c:\\新建文本文档.bmp",true);
			
			byte[] bs = new byte[512];
			
			while(is.read(bs)!=-1){
				os.write(bs);
			
			}
			
			//os.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try {
				if(os!=null)
				os.close();
				if(is!=null)
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}

}
