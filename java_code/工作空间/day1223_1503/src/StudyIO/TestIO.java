package StudyIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * I/O流：文件和应用程序之间进行数据通信的通道
 * 	分类：站在当前应用程序的角度看
 * 	  1 按照流向：都是以字节为单位传输
 * 	 	输入流：程序可以从中读取数据的I/O流
 * 		输出流：程序可以向其中写入数据的I/O流	
 * 	  2 按照传输单位：
 * 		字节流：以字节为单位传输数据的I/O流；
 * 		字符流：以字符为单位传输数据的I/O流
 * 	  3 按照功能：
 * 		节点流：直接操作底层文件的流
 * 		处理流：对其他流进行连接和扩展的流
 * I/O流的父类：
 * 	  InputStream:输入流，传输单位为字节；传入单位是字节（8bit）
 * 	 方法：
 * 		1 read():从输入流中读取数据的下一个字节。
 * 		2 read(byte[] b)：从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 * 		3 read(byte[] b, int off, int len)：将输入流中最多 len 个数据字节读入 byte 数组。
 * 	     构造方法：
 * 		FileInputStream()
 * 	  步骤：
 * 		1 创建File
 * 	   	3 关闭输入流
 */

public class TestIO {
	public static void main(String[] args) {
		File file = new File("1.txt");
		InputStream is = null;

		try {
			is = new FileInputStream(file);
			// 读取一个字节
			int b = 0;
			while ((b = is.read()) != -1) {

				System.out.print((char) b + " ");
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}
}
