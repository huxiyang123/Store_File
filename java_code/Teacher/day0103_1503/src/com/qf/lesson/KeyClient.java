package com.qf.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class KeyClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(7777);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			while (true) {
				//发送给服务端信息
				String s = br.readLine();
				DatagramPacket dp = new DatagramPacket(s.getBytes(), 0,
						s.getBytes().length, InetAddress.getLocalHost(), 5555);
				ds.send(dp);
				
				//接受服务端响应信息
				byte[] bs = new byte[1024];
				DatagramPacket dp2 = new DatagramPacket(bs, 0, bs.length);
				ds.receive(dp2);
				String str = new String(dp2.getData(), 0, dp2.getLength());
				System.out.println("服务端：" + str);
			}
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
