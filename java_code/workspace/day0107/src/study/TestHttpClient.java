package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/*
 * ���ã���Ŀ����·����Ҫ��jar��
     1 commons-logging-1.2.jar
     2 fluent-hc-4.5.jar
     3 httpclient-4.5.jar
     4 httpcore-4.4.1.jar
   GET�������裺
     1 ����HttpClient����
     2 ����HttpGet������Ҫ�ڹ��췽���д���URL��ַ����Ҫ��������Ļ���ʹ��  ?����1=ֵ1&����2=ֵ2 ��ʽ������url��ַ����
     3 ���ò���1������HttpClient�����execute(HttpGet����)�����������������������Ӧ�ķ��أ�������HttpResponse
     4 ����HttpResponse�����getStatusLine().getStatusCode()��ȡ״̬�롣
     5 ͨ��ֻ���״̬��Ϊ200�Ľ��д�����HttpResponse�����getEntity()��������HttpEntity��
     6 HttpEntity�����getInputStream()������Ӧ����������������ش���
     7 �ر�HttpResponse�����I/O����
 */
public class TestHttpClient {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
//			HttpGet httpget = new HttpGet("http://10.12.152.65:8080/first/InfoServelt");
//			HttpGet httpget = new HttpGet("http://10.12.152.65:8080/first/Login?user=admin&&pass=123456");
			HttpGet httpget = new HttpGet("http://10.12.152.55:8080/first/Login?user=admin&&pass=123456");
			CloseableHttpResponse response = httpclient.execute(httpget);
			int code = response.getStatusLine().getStatusCode();
			if(code==200){
				HttpEntity entity = response.getEntity();
				br = new BufferedReader(new InputStreamReader(entity.getContent()));
				String str = null;
				while((str=br.readLine())!=null){
					System.out.println(str);
				}
			}
		} catch (ClientProtocolException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
	}

}