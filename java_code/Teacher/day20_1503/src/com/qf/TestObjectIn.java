package com.qf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/*
 * 反序列化对象：
 *    ObjectInputStream用于恢复那些以前序列化的对象。
 *  构造方法：
 *    ObjectInputStream(InputStream in)： 创建从指定 InputStream 读取的 ObjectInputStream。
 *  方法：
 *    readObject()： 从 ObjectInputStream 读取对象。
 *    close()：          关闭输入流。
 *  步骤：
 *    1 创建对应的InputStream流
 *    2 创建ObjectInputStream对象，使用步骤1的输入节点流对象
 *    3 使用readObject()方法获取对象
 *    4 关闭流
 */
public class TestObjectIn {

	public static void main(String[] args) {
		//反序列化：I/O流数据------>对象
		InputStream is = null;
		ObjectInputStream ois = null;
		try {
			 is = new FileInputStream("1.obj");
			 ois = new ObjectInputStream(is);
			 int str = ois.readInt();
			 System.out.println(str);
			 User u = (User) ois.readObject();
			 System.out.println(u);
		} catch (FileNotFoundException |ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				ois.close();
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
