package practice;




import java.io.IOException;

import java.net.MalformedURLException;
import java.net.ProtocolException;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import studyInterface.Callback;

/*
 * 图片下载的工具类
 */
public class HttpUtilsClient {
	public static void download(String path,Callback1 test){
		//开始执行下载
		new Thread(){
			@Override
			public void run() {
				
				CloseableHttpClient httpclient = HttpClients.createDefault();
				try {
					HttpGet httpget = new HttpGet(path);
					HttpResponse response = httpclient.execute(httpget);
					
					int code = response.getStatusLine().getStatusCode();
					if(code==HttpStatus.SC_OK){
						HttpEntity entity = response.getEntity();
						Thread.sleep(3000);
						//开始回调通知者
						test.send(entity.getContent());
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
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
		
			}
		}.start();

	}
}