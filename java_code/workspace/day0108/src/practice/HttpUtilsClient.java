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
 * ͼƬ���صĹ�����
 */
public class HttpUtilsClient {
	public static void download(String path,Callback1 test){
		//��ʼִ������
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
						//��ʼ�ص�֪ͨ��
						test.send(entity.getContent());
					}
				} catch (MalformedURLException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				} catch (ProtocolException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
		
			}
		}.start();

	}
}