package org.qf.lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestMyException {

	public static void main(String[] args) {
//		try {
//			divide(3, 0);
//		} catch (CustomException e) {
//			System.out.println(e.getMessage());
//		}
		try {
			write();
		} catch (CustomException e) {
		  e.displayError();
		}
		System.out.println("结束!!!");
	}

	public static void divide(int x, int y) throws CustomException {
		int result = 0;
		try {
			result = x / y;
		} catch (Exception e) {
			throw new CustomException("分母不能为零");
		}
		System.out.println(result);
	}
	
	
	//异常对象由编程人员抛出
		public static void write() throws CustomException{
			File file = new File("d:/hello444.txt");
			try{
				InputStream isr =  new FileInputStream(file);
			}catch(Exception e){
				throw new  CustomException("这是我写的：出错了");
			}
		}

}
