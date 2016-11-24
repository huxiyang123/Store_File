package com.qf.lesson.callback;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test implements Callback {
	
	
	public static void main(String[] args) {
		System.out.println("main begin!!!!");
		Test test = new Test();
		String path = "http://localhost:8080//first/images/fish.jpg";
		HttpUtils.download(path, test);
		//使用匿名内部类
//		HttpUtils.download(path, new Callback(){
//		   public void send(InputStream is){
//			   
//		   };
//		});
		System.out.println("main do something other!!!");
		System.out.println("main over!!!!");
	}

	@Override
	public void send(InputStream is) {
		System.out.println("main method is invoked!!!!");
		System.out.println(Thread.currentThread().getName()+" is running");
		OutputStream os = null;
		try {
			os = new FileOutputStream("cb.jpg");
			byte[] bs = new byte[1024];
			int len = 0;
			while((len=is.read(bs))!=-1){
				os.write(bs, 0, len);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			if(os!=null){
				try {
					os.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
