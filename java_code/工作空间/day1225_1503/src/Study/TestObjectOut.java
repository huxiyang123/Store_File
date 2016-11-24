package Study;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*
 * 对象流：使用I/O方式保存或获取对象的信息
 * 		序列化：使用ObjectOutputStream保存基本数据类型或对象的机制。
 * 		反序列化：使用ObjectInputStream读取基本数据类型或对象的机制。
 * 能被序列化的对象，对应的类型必须Java.io.Serializable接口。
 * 	1 ObjectOutputStream:
 * 	  构造方法：
 * 		ObjectOutputStream(OutputStream out)：创建写入指定 OutputStream 的 ObjectOutputStream。
 * 	  方法：
 * 		writeObject(Object obj)
 * 			
 */
public class TestObjectOut {

	public static void main(String[] args) {
		//序列化。将对象------》I/O流----》持久化的文件
		User u = new User("崔丽",19);		
		OutputStream os=null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream("2.obj");
			
			 oos = new ObjectOutputStream(os);
			 
			 oos.writeObject(u);//当此处写入多个对象时，在反序列中的顺序要与之相符。

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
