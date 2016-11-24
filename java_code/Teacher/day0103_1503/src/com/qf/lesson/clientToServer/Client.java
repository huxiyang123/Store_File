package com.qf.lesson.clientToServer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * 客户端发送信息，服务端显示：
 *   
 */
public class Client {

	public static void main(String[] args) {
		DatagramSocket ds = null;

		try {
			// 可以指定端口号，但是在本机测试时候，注意发送和客户端口不能一致。在不同的机器上测试，可以使用相同的端口
			ds = new DatagramSocket();
			//从文件中读取内容发送出去
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("1.txt"));
			byte[] bs = new byte[1024];
			int len = bis.read(bs, 0, bs.length);
			//发送字符串
			// byte[] bs = "nihao".getBytes();
			DatagramPacket dp = new DatagramPacket(bs, 0, len,
					InetAddress.getLocalHost(), 4444);
			ds.send(dp);
		} catch (SocketException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (ds != null) {
				ds.close();
			}
		}

	}

}
