package com.qf.multi;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务端：接受多个客户端的连接，使用多线程技术
 */
public class Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			ss = new ServerSocket(6666);			
			//保证一直有新的线程处理获得的socket
			while(true){
				socket = ss.accept();
				new MyThread(socket).start();
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				socket.close();
				ss.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}

}
