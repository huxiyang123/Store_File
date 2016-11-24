package com.qf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*
 * 对象流：使用I/O方式保存或获取对象的信息
 *   序列化：使用ObjectOutputStream保存基本数据类型或对象的机制
 *   反序列化：使用ObjectInputStream读取基本数据类型或对象的机制
 * 能被序列化的对象对应的类必须java.io.Serializable接口。
 *   1 ObjectOutputStream: 
 *    构造方法：
 *     ObjectOutputStream(OutputStream out)： 创建写入指定 OutputStream 的 ObjectOutputStream。
 *    方法：
 *     writeObject(Object obj)： 将指定的对象写入 ObjectOutputStream。   
 *     close():关闭流
 *     
 *    步骤：
 *     1 创建可以序列化的对象
 *     2 创建对应的节点输出流
 *     3 创建对应的对象输出流、
 *     4 调用对象流的writeObject(Object obj)
 *     5 close流。
 *  对象的默认序列化机制写入的内容是：对象的类，类签名，以及非瞬态(transient修饰)和非静态(static修饰)字段的值。     
 */ 
public class TestObject {

	public static void main(String[] args) {
		//序列化：对象------>I/O流------>持久化的文件		
		User u = new User("崔力",18);
		u.setCountry("大陆");
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			 os = new FileOutputStream("1.obj");
			 oos= new ObjectOutputStream(os);
			 oos.writeInt(123);
			 oos.writeObject(u);
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				oos.close();
				os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
