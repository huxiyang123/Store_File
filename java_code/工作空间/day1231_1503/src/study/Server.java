package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Tcp/Ip服务端的编程
 * 	接受客户端的编程。
 * 步骤：
 * 	1 创建客户端ServerSocket对象，传入端口号
 * 	2 使用accept()方法监听客户短的输入，可以看做是	Client端的Socket的一份拷贝。
 * 	3 使用accept方法接受的Socket对想中对应的I/O
 */
public class Server {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		ServerSocket ss = null;
		OutputStream os  = null;
		Socket s = null;
		try {
			ss = new ServerSocket(8888);
			s = ss.accept();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			while (true) {
				
				String temp = br.readLine();
				System.out.println("客户说："+temp);
				bw.write(s.getInetAddress().getHostName()+"你的心意我已收到");
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (br != null)
					br.close();
				if (s != null)
					s.close();
				if (ss != null)
					ss.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
