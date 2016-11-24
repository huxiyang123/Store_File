package com.qf.multi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyThread extends Thread {
	private Socket socket;

	private BufferedReader br = null;
	private BufferedWriter bw = null;

	public MyThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			System.out.println(socket.getInetAddress().getHostAddress()
					+ "发送信息：" + br.readLine());

			// 回复客户端的信息:
			bw = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			bw.write("hello!" + socket.getInetAddress().getHostName()
					+ "；I hava receiver your heart!!!！！");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (br != null) {
					br.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}
}
