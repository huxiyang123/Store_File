package study;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

public class TestFluent {

	public static void main(String[] args) {
		Content content = null;
		OutputStream os = null;
		try {
			content = Request.Get("http://10.12.152.65:8080/first/images/fish.jpg").execute().returnContent();
			os = new FileOutputStream("2.JPG");
			os.write(content.asBytes());
		} catch (ClientProtocolException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				if(os!=null)
					os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	}

}
