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
 * C/S------��post���ݲ���
 * 
 *  * Post��ʽ����Web����������
 * 		���裺1����URL���󣬴���URL��ַ������Ҫ��url����Ӳ�����
 * 			2�������ӣ�����HttpURLConnection����
 * 			3�������󷽷�POST
 * 			4��POST������������setDoOutput()Ϊtrue����Ϊ������Ҫͨ��OutputStreamд��
 * 			5ʹ��HttpURLConnection�����getOutputStream()�Ѳ���д��
 * 			6��ȡ��������Ӧ�룬�ж�Ϊ200(HTTP_OK)ʱ���д���
 * 			     ʹ��HttpURLConnection�����getInputStream()����I/O����
 * 			7�ر�I/O��
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ProtocolException e) {
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
				if(os!=null)
					os.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}		
	}
}
