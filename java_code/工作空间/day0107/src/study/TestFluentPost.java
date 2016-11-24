package study;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

public class TestFluentPost {

	public static void main(String[] args) {
		Content content = null;
		try {
			content = Request.Post("http://localhost:8080/first/Login").bodyForm(Form.form().add("user", "admin").add("pass", "123456").build()).execute().returnContent();
			System.out.println(content.asString());
		} catch (ClientProtocolException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
