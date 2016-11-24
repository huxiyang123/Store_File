package com.qf;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * DataOutputStream DataInputStream的使用
 */
public class TestDataIO {

	public static void main(String[] args) {
		File file  = new File("1.dat");
		OutputStream os = null;
		DataOutputStream dos = null;
		
		InputStream is = null;
		DataInputStream dis = null;
		try {
			 os= new FileOutputStream(file);
			 dos= new DataOutputStream(os);
			dos.writeBoolean(true);
			dos.writeDouble(3.1425926);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				dos.close();
				os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	
		try {
			 is = new FileInputStream(file);
			 dis= new DataInputStream(is);
			boolean flag = dis.readBoolean();
			System.out.println(flag);
			double pi = dis.readDouble();
			System.out.println(pi);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				dis.close();
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
