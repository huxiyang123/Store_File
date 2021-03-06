package studyInterface;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/*
 * 图片下载的工具类
 */
public class HttpUtils {
	public static void download(String path,Callback back){
		//开始执行下载
		new Thread(){
			@Override
			public void run() {
				try {
					URL url = new URL(path);
					HttpURLConnection huc = (HttpURLConnection)url.openConnection();
					huc.setRequestMethod("GET");
					int code = huc.getResponseCode();
					if(code==HttpURLConnection.HTTP_OK){
						Thread.sleep(3000);
						//开始回调通知者
						back.send(huc.getInputStream());
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