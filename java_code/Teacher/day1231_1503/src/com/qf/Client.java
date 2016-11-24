package com.qf;

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
 * TCP/IP的客户端:
 *  客户端给服务端发送信息，服务端接受后显示出来
 *  步骤：
 *    1 创建客户端Socket对象，传入对应的InetAddress和port参数。相当于和服务端建立连接
 *    2 根据需要调用Socket对象的I/O操作方法。向服务端写出数据或接受服务端传递的数据。
 *    3 关闭底层的I/O流和Socket对象
 */
public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter os = null;
		BufferedReader is = null;
		BufferedReader is2 = null;
		try {
			socket = new Socket(InetAddress.getLocalHost(), 8888);
			os = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			is = new BufferedReader(new InputStreamReader(System.in));

			// 从服务端接受返回信息
			is2 = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			System.out.println("请输入:");
			while (true) {

				String temp = is.readLine();
				os.write(temp);
				// 告诉服务端：本次输出结束
				os.newLine();
				// socket.shutdownOutput();
				os.flush();

				System.out.println(is2.readLine());
			}

		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}

	}

}
