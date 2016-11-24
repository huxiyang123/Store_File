package StudyIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * 字符流：处理单元是以字符为单位
 * 	Writer：写入字符流的抽象类
 * 	      方法：
 * 		1 write(String str) 写入字符串。 
  		2 write(String str, int off, int len)写入字符串的某一部分。 
		3 close() 关闭此流，但要先刷新它。 
 		4 flush() 刷新该流的缓冲。 关闭时 必须加
	实现类：
	  FileWriter(File file)  根据给定的 File创建一个 FileWriter 对象。
 * 	
 */
public class TestWriter {

	public static void main(String[] args) {
		Writer w = null;
		try {
			 w = new FileWriter("2.txt");
			 w.write("我不喜欢雾霾！");
			w.flush();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try {
				w.flush();
				w.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
