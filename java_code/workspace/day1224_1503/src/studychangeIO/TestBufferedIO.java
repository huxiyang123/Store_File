package studychangeIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 缓冲流 ：基于节点流之上
 * 		对读写的数据提供了缓冲的功能，提高了读写的效率，还增加了一些新的方法
 * 	分类：
 * 		1	BufferedInputStream：对InputStream进行了包装
 * 		原理：在创建 BufferedInputStream 时，会创建一个内部缓冲区数组。
 * 			在读取或跳过流中的字节时，可根据需要从包含的输入流再次填充该内部缓冲区
 * 			一次填充多个字节
 * 		构造方法：
 * 			BufferedInputStream(InputStream in)：
 * 			创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 * 		方法：
 * 			read();
 * 			read(byte[] b, int off, int len)：给定偏移量处开始将各字节读取到指定的 byte数组中,返回实际读取的字节数。
 * 			close();关闭流并释放相关的系统资源
 * 		实现步骤：
 * 			1 创建输入节点流对象
 * 			2 创建输入缓冲流对象，以步骤1的节点为对象为构造器参数
 * 			3 关闭流
 * 		2	BufferedOutputSream：对OutputStream进行了缓冲
 * 			 将各个字节写入底层输出流中，而不必针对每次字节写入调用底层系统
 * 		构造方法：
 * 			BufferedOutputSream(OutputStream out):创建一个新的缓冲输出流，将
 * 	步骤：
 * 		1 创建输出节点流对象
 * 		2 创建输出缓冲流对象，以步骤1的节点流对象为参数
 * 		3 关闭缓冲流对象，
 * 		3	BufferedReder：对Reader进行缓冲
 * 			readline():读一个文本文件的行。
 * 			read()：读一个字符
 * 			read(char[] b, int off, int len)：给定偏移量处开始将各字节读取到指定的 char数组中,返回实际读取的字节数。
 * 			close();关闭流并释放相关的系统资源
 * 		4	BufferedWriter：对Writer进行包装
 */
public class TestBufferedIO {

	public static void main(String[] args) {
		InputStream is = null;
		BufferedInputStream bis = null;
		try {
			is = new FileInputStream("2.txt");
			bis = new BufferedInputStream(is);
			byte[] by = new byte[1024];
			int len = 0;
			while((len=bis.read(by))!=-1){
				System.out.println(new String(by,0,len));
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				bis.close();
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
