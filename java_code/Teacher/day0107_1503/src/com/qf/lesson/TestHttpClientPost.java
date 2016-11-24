package com.qf.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/*
 * HttpClient使用POST方式提交数据
 *   POST步骤：
 *     1 创建HttpClient对象
 *     2 创建HttpPost对象，构造方法中传入URL地址，URL地址后无需参数添加
 *     3 使用HttpPost对象的setEntity()方法，传入参数对象。
 *     4 使用HttpClient对象的execute()方法，把HttpPost对象作为实参传入，返回HttpResponse对象
 *     5 判断返回状态码，通常是HttpStatus.SC_OK的情况下，进行处理
 *     6 使用HttpResponse对象的getEntity()获得I/O流
 *     7 关闭I/O流和HttpResponse对象
 */
public class TestHttpClientPost {

	public static void main(String[] args) {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost("http://localhost:8080/first/Login");
		 CloseableHttpResponse response = null;
		 BufferedReader br = null;
		List<NameValuePair> list = new ArrayList<>();
        list.add(new BasicNameValuePair("user", "admin"));
        list.add(new BasicNameValuePair("pass", "123456"));
        try {
			post.setEntity(new UrlEncodedFormEntity(list));        
			
			response = client.execute(post);
			if(response.getStatusLine().getStatusCode()==HttpStatus.SC_OK){
				HttpEntity entity = response.getEntity();
//				// 获取Entity对象的输入流
//				br = new BufferedReader(new InputStreamReader(
//						entity.getContent()));
//				String str = null;
//				while ((str = br.readLine()) != null) {
//					System.out.println(str);
//				}
				System.out.println(EntityUtils.toString(entity));
				//确保response中的内容被完全使用，确保底层的连接能被安全重用。
				EntityUtils.consume(entity);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        finally{
        	if(response!=null){
        		try {
					response.close();
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
