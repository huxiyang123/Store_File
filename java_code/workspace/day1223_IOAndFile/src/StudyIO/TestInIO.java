package StudyIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestInIO {

	public static void main(String[] args) {
		InputStream is=null;
		try {
			is = new FileInputStream("1.txt");
			byte[] bs = new byte[512];
			int len = 0;
			while((len=is.read(bs))!=-1){
				String str = new String(bs,0,len);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		

	}

}
