package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/*
 * 复制文本文件
 */
public class TestFileCopy {

	public static void main(String[] args) {
		Reader re =null;
		try {
			re = new FileReader("TestOutIO.java");
			char[] ch =new char[1024];
			int len = 0;
			while((len=re.read(ch))!=-1){
				String str = new String(ch,0,len);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try {
				if(re!=null)
				re.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
