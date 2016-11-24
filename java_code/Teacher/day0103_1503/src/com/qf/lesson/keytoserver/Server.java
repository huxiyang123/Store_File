package com.qf.lesson.keytoserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(7777);
			while (true) {
				byte[] bs = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bs, bs.length);
				ds.receive(dp);
				String temp = new String(dp.getData(), 0, dp.getLength());
				System.out.println("client say: " + temp);

				// 回复客户端信息：
				byte[] ss = "你的信息我已收到".getBytes();
				DatagramPacket result = new DatagramPacket(ss, 0, ss.length,
						dp.getAddress(), dp.getPort());
				ds.send(result);
			}
		} catch (SocketException e) {
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
