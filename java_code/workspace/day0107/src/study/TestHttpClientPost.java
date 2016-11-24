package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
/*
 * HttpClient ʹ��post������ύ����
 * 	 ���裺
 *  	1 ����HttpClient���󣬹��췽���д���URL��ַ��URL��ַ���������Ӳ���
 *  	2 
 *  	3 ʹ��HttpClient���� ��
 */
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class TestHttpClientPost {

	public static void main(String[] args) {
		BufferedReader br = null;
		CloseableHttpResponse response = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost("http://10.12.152.65:8080/first/Login?user=admin&&pass=123456");
		
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("user","admin"));
		list.add(new BasicNameValuePair("pass","123456"));
		
		try {
			post.setEntity(new UrlEncodedFormEntity(list));
			
			response = httpclient.execute(post);
			if(response.getStatusLine().getStatusCode()==HttpStatus.SC_OK){
				HttpEntity entity = response.getEntity();
//ע�Ͳ����������EntityUtils.toString(entity);EntityUtils.consume(entity);
//����һ��������ֻ���ڲ���ʱʹ�������У�ͨ��ʹ��while������
//				br = new BufferedReader(new InputStreamReader(entity.getContent()));
//				String str = null;
//				while((str=br.readLine())!=null){
//					System.out.println(str);
//				}
				System.out.println(EntityUtils.toString(entity));
				EntityUtils.consume(entity);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				if(response!=null)
					response.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
	}

}