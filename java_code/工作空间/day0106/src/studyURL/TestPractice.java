package studyURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
/*
 * C/S------给post传递参数
 * 
 *  * Post方式请求Web服务器数据
 * 		步骤：1创建URL对象，传入URL地址，不需要在url后添加参数。
 * 			2建立连接，返回HttpURLConnection对象
 * 			3设置请求方法POST
 * 			4对POST方法必须设置setDoOutput()为true，因为参数需要通过OutputStream写出
 * 			5使用HttpURLConnection对象的getOutputStream()把参数写出
 * 			6获取服务器响应码，判断为200(HTTP_OK)时进行处理：
 * 			     使用HttpURLConnection对象的getInputStream()进行I/O操作
 * 			7关闭I/O流
 */
public class TestPractice {

	public static void main(String[] args) {
		BufferedReader br = null;
		OutputStream os = null;
		try {
			URL url = new URL("http://10.12.152.65:8080/first/Login");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.setRequestMethod("POST");
			huc.setDoOutput(true);
			
			String params = "user=admin&&pass=123456";
			
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
			try {
				if(br!=null)
					br.close();
				if(os!=null)
					os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}		
	}
}
