package practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile:完成随机读取功能，可以读取指定位置的内容，支持对随机文件的读取和写入。
 * 	使用场景：
 * 		跨字节数的文件读取和写入。
 * 构造方法:
 * 		RandomAccessFile(String name, String mode)创建从中读取和向其中写入（可选）的随机访问文件流，该文件具有指定名称。
 * 	  mode 参数指定用以打开文件的访问模式。("r","rw")
 * 		"r" 以只读方式打开。调用结果对象的任何 write 方法都将导致抛出 IOException。  
		"rw" 打开以便读取和写入。如果该文件尚不存在，则尝试创建该文件。  
	方法：
		read()从此文件中读取一个数据字节。 
 		read(byte[] b)将最多 b.length 个数据字节从此文件读入 byte 数组。 
		seek(long pos)设置到此文件开头测量到的文件指针偏移量，在该位置发生下一个读取或写入操作。
		skipBytes(int n)尝试跳过输入的 n 个字节以丢弃跳过的字节。
		writeChars(String s)按字符序列将一个字符串写入该文件。
 */
public class TestRandomFile {

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("4.txt", "rw");
			raf.write("lixi".getBytes());
			raf.writeInt(19);
			raf.write("bini".getBytes());
			raf.writeInt(43);
			raf.write("lisi".getBytes());
			raf.writeInt(23);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				raf.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//开始读取文件内容
		try {
			RandomAccessFile raf2  = new RandomAccessFile("4.txt","r");	
			raf2.skipBytes(8);

			int len = 4;
			String str="";
			for(int i=0;i<4;i++){
					str+=(char)raf2.readByte();
			}
			System.out.println("名字"+str);
			System.out.println(str+"年龄"+raf2.readInt());
			raf2.seek(0);
			int len1 = 4;
			String str1="";
			for(int i=0;i<4;i++){
					str1+=(char)raf2.readByte();
			}
			System.out.println("名字"+str1);
			System.out.println(str1+"年龄"+raf2.readInt());
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
