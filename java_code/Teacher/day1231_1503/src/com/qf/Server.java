package com.qf;

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
 * TCP/IP服务端编程：
 *   接受客户端的输入，显示出来
 *  步骤：
 *   1 创建SeverSocket对象，传入端口号
 *   2 使用accept()方法监听客户端的输入，返回Socket对象，可以看做是Client端的Socket的一份拷贝
 *   3 使用accept方法接受的Socket对象中对应的I/O操作
 *   4 关闭ServerSocket  Socket　　I/O流。
 *   
 *  
 */
public class Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		BufferedWriter os = null;
		BufferedReader is = null;
		try {
			ss = new ServerSocket(8888);
			s = ss.accept();
			is = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// 返回信息给客户端
			os = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			while (true) {

				// 从客户端读取信息
				String str = is.readLine();
				System.out.println("客户端说： " + str);

				os.write(s.getInetAddress().getHostName() + ":你的心意我已收到");
				os.newLine();
				os.flush();
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				// os.close();
				is.close();
				s.close();
				ss.close();

			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
