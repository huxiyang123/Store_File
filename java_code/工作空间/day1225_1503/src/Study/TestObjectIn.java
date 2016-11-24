package Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/*
 * 反序列化对象:
 * 	ObjectOutputStream:用于恢复那些以前序列化的对象。
 * 	构造方法：
 * 	  ObjectInputStream(InputStream in)：创建从指定 InputStream 读取的 ObjectInputStream。
 * 	方法：
 * 	  1 readObject()从 ObjectInputStream 读取对象。	
 */
public class TestObjectIn {

	public static void main(String[] args) {
		//反序列化
		InputStream is = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream("2.obj");
			ois = new ObjectInputStream(is);
			User u = (User) ois.readObject();
			System.out.println(u);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
 