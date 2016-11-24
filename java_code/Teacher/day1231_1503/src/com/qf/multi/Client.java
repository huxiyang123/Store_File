package com.qf.multi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 访问服务端
 */
public class Client {

	public static void main(String[] args) {
		Socket s = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			s = new Socket("localhost", 6666);
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write("我来自客户端");
			bw.newLine();
			bw.flush();
			
			
			//接受服务端响应信息
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println(br.readLine());
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
				s.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
