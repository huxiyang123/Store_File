package studyInterface;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/*
 * ͼƬ���صĹ�����
 */
public class HttpUtils {
	public static void download(String path,Callback back){
		//��ʼִ������
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
						//��ʼ�ص�֪ͨ��
						back.send(huc.getInputStream());
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