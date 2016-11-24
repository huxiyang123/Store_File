package homework;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/*
 * POST���裺
      1 ����HttpClient����
      2 ����HttpPost���󣬹��췽���д���URL��ַ��URL��ַ�������������
      3 ʹ��HttpPost�����setEntity()�����������������
      4 ʹ��HttpClient�����execute()��������HttpPost������Ϊʵ�δ��룬
      	����HttpResponse����
      5 �жϷ���״̬�룬ͨ����HttpStatus.SC_OK������£����д���
      6 ʹ��HttpResponse�����getEntity()���I/O��
      7 �ر�I/O����HttpResponse����
 */
public class TestHttpClientPost {

	public static void main(String[] args) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost("http://localhost:8080/2016-first-homework/MyLoginServlet");
		
		List<NameValuePair> list = new ArrayList<>();
		list.add(new BasicNameValuePair("user","admin"));
		list.add(new BasicNameValuePair("pass","1234"));
		try {
			httppost.setEntity(new UrlEncodedFormEntity(list));
			
			HttpResponse  response = httpclient.execute(httppost);
			if(response.getStatusLine().getStatusCode()==HttpStatus.SC_OK){
				HttpEntity entity = response.getEntity();
				System.out.println(EntityUtils.toString(entity));
				EntityUtils.consume(entity);
				
			}
		} catch (UnsupportedEncodingException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}