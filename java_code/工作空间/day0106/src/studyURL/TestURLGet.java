package studyURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
/*
 *1 URL:Uniform  Resource Locator统一资源定位符
    格式：协议://hostname:port/文件夹/资源名称。
    例如：http://www.sina.com:8088/news/newslist.html
   构造方法：
    URL(String spec)： 根据 String 表示形式创建 URL 对象。
   方法：
    openConnection()： 返回一个 URLConnection 对象，它表示到 URL 所引用的远程对象的连接。
   HttpURLConnection: 使用 HTTP 协议的 URLConnection。
    属性：HTTP_OK：  HTTP 状态码 200：OK。
    方法：
       getInputStream()：返回从此打开的连接读取的输入流。
       getResponseCode()：从 HTTP 响应消息获取状态码。
       setRequestMethod(String method)：设置 URL 请求的方法， 
         GET POST HEAD OPTIONS PUT DELETE TRACE 以上方法之一是合法的
        setDoOutput(boolean dooutput)：将此 URLConnection 的 doOutput 字段的值设置为指定的值。
                              如果使用 URL 连接进行输出，则将 DoOutput 标志设置为 true；如果不打算使用，则设置为 false。默认值为 false。 
  GET请求步骤： 
       1 创建URL对象，在构造方法中传入URL地址.GET方式的话必须把参数放置在URL地址后面: ?参数名=参数值&&参数2=参数值
       2 使用url对象的openConnection()获得连接，
       (因为使用Http协议，所以把返回的URLConnection强转为HttpURLConnection，后者进行了方法的扩展)
       3 设置连接的请求方式。（如果是POST请求的话，必须设置setDoOutput()为true）
       4 获取响应状态码
       5 根据状态码进行处理：通常只对HttpURLConnection.HTTP_OK进行处理。
         如果是200话，则代表一切正常，可以使用getInputStream()获取输入流。
       6 关闭I/O流。 
 *   
 */
public class TestURLGet {

	public static void main(String[] args) throws MalformedURLException {
		//get璇锋眰
		
		BufferedReader br = null;
		try {
			System.out.println("please input name:");
			Scanner s = new Scanner(System.in);
			String name = s.next();
			
	//		URL url = new URL("http://10.12.152.65:8080/first/Login?user="+name+"&&pass=123456");
			URL url = new URL("http://localhost:8080/first/Login?user="+name+"&&pass=12345");
			
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			huc.setRequestMethod("GET");
			int code = huc.getResponseCode();
			if(code==HttpURLConnection.HTTP_OK){
				br = new BufferedReader(new InputStreamReader(huc.getInputStream()));
				String temp = null;
				while((temp=br.readLine())!=null){
					System.out.println(temp);
				}
			}
		} catch (ProtocolException e) {
			// TODO 閿熺殕璁规嫹閿熸枻鎷烽敓缂寸鎷? catch 閿熸枻鎷?
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 閿熺殕璁规嫹閿熸枻鎷烽敓缂寸鎷? catch 閿熸枻鎷?
			e.printStackTrace();
		}
		finally{
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				// TODO 閿熺殕璁规嫹閿熸枻鎷烽敓缂寸鎷? catch 閿熸枻鎷?
				e.printStackTrace();
			}
			
				
		}
	}

}
