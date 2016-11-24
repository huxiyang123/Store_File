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
 * 配置：项目构建路径需要的jar包
     1 commons-logging-1.2.jar
     2 fluent-hc-4.5.jar
     3 httpclient-4.5.jar
     4 httpcore-4.4.1.jar
   GET方法步骤：
     1 创建HttpClient对象
     2 创建HttpGet对象，需要在构造方法中传入URL地址，需要传入参数的话则使用  ?参数1=值1&参数2=值2 方式添加在url地址后面
     3 调用步骤1创建的HttpClient对象的execute(HttpGet对象)请求服务器，服务器会有相应的返回，类型是HttpResponse
     4 根据HttpResponse对象的getStatusLine().getStatusCode()获取状态码。
     5 通常只会对状态码为200的进行处理，HttpResponse对象的getEntity()方法返回HttpEntity。
     6 HttpEntity对象的getInputStream()返回响应的输入流，进行相关处理
     7 关闭HttpResponse对象和I/O流。
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}

}
