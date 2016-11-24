package com.qf.lesson.callback;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 图片下载的工具类
 */
public class HttpUtils {
	//下载方法：path为url地址，back是调用者
  public static void download(String path,Callback back){
	  //执行下载
	  new Thread(){
		  @Override
		public void run() {
			  HttpURLConnection huc;
			try {
				URL url = new URL(path);
				  huc = (HttpURLConnection) url.openConnection();
				  huc.setRequestMethod("GET");
				  if(huc.getResponseCode()==HttpURLConnection.HTTP_OK){
					  Thread.sleep(3000);
					  //回调通知者
					  back.send(huc.getInputStream());				 
				  }
			} catch (MalformedURLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}		 
		}
	  }.start();
	  
	 
  }
}
