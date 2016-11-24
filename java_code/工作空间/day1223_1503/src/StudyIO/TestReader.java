package StudyIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * Reader:用于读取字符流的抽象类
 */
public class TestReader {

	public static void main(String[] args) {
		/*
		 * 用Reader方法读取文件值
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		

	}

}
