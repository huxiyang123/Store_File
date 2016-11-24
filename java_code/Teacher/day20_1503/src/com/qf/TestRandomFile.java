package com.qf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile: 完成随机读取功能，可以读取指定位置的内容。 支持对随机访问文件的读取和写入。
 *  使用场景：
 *    跨字节数的文件读取和写入。
 *  构造方法：
 *    RandomAccessFile(String name, String mode)：
 *       创建从中读取和向其中写入（可选）的随机访问文件流，该文件具有指定名称。 
 *       mode 参数指定用以打开文件的访问模式：
 *        "r" 以只读方式打开。调用结果对象的任何 write 方法都将导致抛出 IOException。  
 "rw" 打开以便读取和写入。如果该文件尚不存在，则尝试创建该文件。  
 方法：
 read()： 从此文件中读取一个数据字节。
 read(byte[] b)： 将最多 b.length 个数据字节从此文件读入 byte 数组。  
 seek(long pos)： 设置到此文件开头测量到的文件指针偏移量，在该位置发生下一个读取或写入操作。
 skipBytes(int n)： 尝试跳过输入的 n 个字节以丢弃跳过的字节。    
 writeChars(String s)： 按字符序列将一个字符串写入该文件。
 步骤：
  1 创建RandomAccessFile对象，指定访问模式。
  2 调用对应的方法
  3 close关闭流和系统资源
 
 */
public class TestRandomFile {

	public static void main(String[] args) {
		//写入开始
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("2.txt", "rw");
			//测试中文对应的byte长度，和编码有关。我的环境是UTF-8编码，每个中文占3个字节
			//System.out.println("语文".getBytes().length);
			raf.write("刘永".getBytes());
			raf.writeInt(18);
			raf.write("范卯".getBytes());
			raf.writeInt(19);
			raf.write("崔力".getBytes());
			raf.writeInt(20);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		//读取文件内容开始
		try {
			RandomAccessFile raf2 = new RandomAccessFile("2.txt","r");
			//每个中文占3个字节，名字是两个汉字，则占6个字节；年龄是int，占4个字节。
			//忽略10个字节
			raf2.skipBytes(10);
			//名字占的字节数
			int len = 6;
			String str = "";
			//获取名字，占len个字节
			byte[] bs = new byte[len];
			for(int i=0;i<len;i++){
				//此处不能使用str2+=(char)raf2.readByte();
				bs[i] = raf2.readByte();
			}
			str = new String(bs,0,len);
			System.out.println("名字:"+str);
			//获取年龄，int默认4个字节
			System.out.println("年龄"+raf2.readInt());
			System.out.println("========");
			//设置文件开头到指针的偏移量，为0就是在开头位置
			raf2.seek(0);
			
			String str2 = "";
			for(int i=0;i<len;i++){
				bs[i] = raf2.readByte();
			}
			str2 = new String(bs,0,len);
			System.out.println("名字:"+str2);
			System.out.println("年龄"+raf2.readInt());
			System.out.println("========");
			//跳过名字6个字节和年龄4个字节
			raf2.skipBytes(10);
			String str3 = "";
			for(int i=0;i<len;i++){
				//str3+=(char)raf2.readByte();
				bs[i] = raf2.readByte();
			}
			str3 = new String(bs,0,len);
			System.out.println("name:"+str3);
			System.out.println("年龄"+raf2.readInt());
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
