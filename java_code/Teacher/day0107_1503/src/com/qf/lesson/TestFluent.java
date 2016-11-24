package com.qf.lesson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
/*
 * HttpClient使用简洁API处理Web服务器请求和响应
 */

public class TestFluent {

	public static void main(String[] args) {
		Content content = null;
		OutputStream os = null;
		try {
			content = Request.Get("http://localhost:8080/first/images/fish.jpg").execute().returnContent();
		    os = new FileOutputStream("3.jpg");
		    os.write(content.asBytes());
		
		} catch (ClientProtocolException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
       // System.out.println("get result: "+content.asString());
		
	}

}
