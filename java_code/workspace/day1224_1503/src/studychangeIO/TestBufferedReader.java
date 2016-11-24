package studychangeIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;

/*
 * 步骤：
 * 	1 创建Reader字符流对象
 * 	2 创建缓冲BufferedReader对象，使用步骤1的对象最为参数
 * 	3 
 * 	4 缓冲流对象close关闭底层的节点流对象也会被一并关闭
 */

public class TestBufferedReader {

	public static void main(String[] args) {
		Reader r=null;
		BufferedReader br = null;
		try {
			r = new FileReader("2.txt");
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
