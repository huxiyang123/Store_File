package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Tcp/Ip的客户端
 * 客户端给服务端没发送信息，服务端接收后显示出来
 * 步骤：
 * 	1 创建客户端Socket对象，传入对应的InetAddress和port参数，相当于和服务器建立连接。
 * 	2 根据需要调用套接字（Socket）
 */
public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		BufferedReader br2 = null;
		
		try {
		
			socket = new Socket("10.12.152.55",8888);
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(System.in));
			br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("请输入：");
			while(true){
				
				String temp =br.readLine();
				bw.write(temp);
				//告诉服务端，本次输入结束
				bw.newLine();
				//socket.shutdownOutput();//只写一次用
				bw.flush();
				
				System.out.println(br2.readLine());
			}
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			
			try {
				if(socket!=null)
					socket.close();
				if(br!=null)
					br.close();
				if(bw!=null)
					bw.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	}
}
