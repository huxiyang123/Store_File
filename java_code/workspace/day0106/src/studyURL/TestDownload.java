package studyURL;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
public class TestDownload {

	public static void main(String[] args) { 
		InputStream is = null;
		OutputStream os = null;
		try {
			URL url = new URL("http://localhost:8080/first/image/tu.jpg");
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			huc.setRequestMethod("GET");
			if(huc.getResponseCode()==HttpURLConnection.HTTP_OK){
				is = huc.getInputStream();
				os = new FileOutputStream("1.jpg");
				byte[] bs = new byte[1024];
				int len = 0;
				while((len=is.read(bs))!=-1){
					os.write(bs,0,len);
				}
			}
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				if(os!=null)
					os.close();
				if(is!=null)
					is.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}