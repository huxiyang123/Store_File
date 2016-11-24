package com.qf.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
/*
 * Post方式请求Web服务器数据
 *  步骤：
 *    1 创建URL对象，传入url地址。不需要在url后跟参数
 *    2 建立连接，返回HttpURLConnection对象。
 *    3 设置请求方法POST
 *    4 对POST方法必须设置setOutput（）为true.因为参数需要通过OutputStream写出
 *    5 使用HttpURLConnection对象的getOutputStream()把参数写出
 *    6 获取服务器响应码，判断为200时候进行处理: 
 *        使用HttpURLConnection对象的getInputputStream()进行I/O操作
 *    7 关闭I/O流。
 */

public class TestPost {

	public static void main(String[] args) {
		BufferedReader br = null;
		OutputStream os = null;
		
		try {
			URL url  = new URL("http://localhost:8080/first/Login");		
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.setRequestMethod("POST");
			huc.setDoOutput(true);
			
			String params = "user=admin&pass=123456";
			//给Post传递参数
			os = huc.getOutputStream();
			os.write(params.getBytes());
			
			if(huc.getResponseCode()==HttpURLConnection.HTTP_OK){
				br = new BufferedReader(new InputStreamReader(huc.getInputStream()));
				String temp = null;
				while((temp=br.readLine())!=null){
					System.out.println(temp);
				}
			}
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ProtocolException e) {
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
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
        
	}

}
