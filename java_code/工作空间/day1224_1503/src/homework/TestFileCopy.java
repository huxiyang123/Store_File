package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
/*
 * 复制文本文件
 */
public class TestFileCopy {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("TestOutIO.java"));
			bw = new BufferedWriter(new FileWriter("2.txt"));
			char[] ch =new char[1024];
			int len = 0;
			while((len=br.read(ch))!=-1){
				bw.write(ch);
				bw.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try {
				if(bw!=null)
					bw.close();
				if(br!=null)
				br.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
