package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
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
     2 ����HttpGet������Ҫ�ڹ��췽���д���URL��ַ��
     	��Ҫ��������Ļ���ʹ��  ?����1=ֵ1&����2=ֵ2 ��ʽ������url��ַ����
     3 ���ò���1������HttpClient�����execute(HttpGet����)�����������
     	������������Ӧ�ķ��أ�������HttpResponse
     4 ����HttpResponse�����getStatusLine().getStatusCode()��ȡ״̬�롣
     5 ͨ��ֻ���״̬��Ϊ200(HttpStatus.SC_OK)�Ľ��д�����HttpResponse�����
     	getEntity()��������HttpEntity��
     6 HttpEntity�����getInputStream()������Ӧ����������������ش���
     7 �ر�HttpResponse�����I/O����
 */
public class TestHttpClientGet {

	public static void main(String[] args) {
		BufferedReader br = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet("http://localhost:8080/2016-first-homework/MyLoginServlet?user=admin&&pass=1234");
			HttpResponse response = httpclient.execute(httpget);
			
			int code = response.getStatusLine().getStatusCode();
			if(code==HttpStatus.SC_OK){
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