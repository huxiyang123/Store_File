package practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class TestDate {

	public static void main(String[] args) {
		DataInputStream bais=null;
		DataOutputStream baos = null;
		try {
		
			baos = new DataOutputStream(new FileOutputStream("3.txt"));
			baos.writeBoolean(true);
			baos.writeInt(123);
			baos.writeDouble(3.4);
		
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				baos.close();
				
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
		
//		InputStream is = null;
//		
//			try {
//				is = new FileInputStream("2.txt");
//				bais = new DataInputStream(is);
//				System.out.println(bais.readBoolean());
//				System.out.println(bais.readInt());
//				double d = bais.readDouble();
//				
//				
//				System.out.println(d);
				
				
//			} catch (IOException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
//			finally{
//				try {
//					bais.close();
//				} catch (IOException e) {
//					// TODO 自动生成的 catch 块
//					e.printStackTrace();
//				}
//			}


	}

}
