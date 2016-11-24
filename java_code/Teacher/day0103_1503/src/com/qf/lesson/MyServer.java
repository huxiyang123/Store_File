package com.qf.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MyServer {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(5555);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			while (true) {
				//接受客户端信息
				byte[] bs = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bs, 0, bs.length);
				ds.receive(dp);
				String str = new String(dp.getData(), 0, dp.getLength());
				System.out.println("客户端：" + str);
                //发送给客户端的响应信息
				String s = br.readLine();
				DatagramPacket dp2 = new DatagramPacket(s.getBytes(), 0,
						s.getBytes().length, dp.getAddress(), dp.getPort());
				ds.send(dp2);
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
