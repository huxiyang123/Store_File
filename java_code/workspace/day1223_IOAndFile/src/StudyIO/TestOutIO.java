package StudyIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * OutputStream:
  	 1 close() 关闭此输出流并释放与此流有关的所有系统资源. 
 	 2 write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。 
 	 3 write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。 
  	 4 write(int b) 将指定的字节写入此输出流。 
	 5 flush()  刷新此输出流并强制写出所有缓冲的输出字节。
	 
	实现类：
	  FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
	写文件步骤：
	  1 创建FileOutputStream
 */
public class TestOutIO {

	public static void main(String[] args) {
		OutputStream os =null;
		try {
			os = new FileOutputStream("1.txt",true);
			os.write(97);
			//os.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try {
				os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}		
	}
}
