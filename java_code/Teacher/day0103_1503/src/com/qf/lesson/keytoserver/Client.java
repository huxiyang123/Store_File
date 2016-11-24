package com.qf.lesson.keytoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {			
			ds = new DatagramSocket();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
//			while ((str = br.readLine()) != null) {
//				DatagramPacket dp = new DatagramPacket(str.getBytes(), 0,
//						str.getBytes().length, InetAddress.getLocalHost(), 7777);
//				ds.send(dp);
//			}
			//或者使用下面代码
			while(true){
				String temp =br.readLine();
				DatagramPacket dp = new DatagramPacket(temp.getBytes(), 0,
						temp.getBytes().length, InetAddress.getLocalHost(), 7777);
				ds.send(dp);
				
				//接受服务端响应
				byte[] bs = new byte[1024];
				DatagramPacket dp2 = new DatagramPacket(bs, bs.length);
				ds.receive(dp2);
				System.out.println("server response: "+new String(dp2.getData(),0,dp2.getLength()));
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
		}
		finally{
			if(ds!=null){
				ds.close();
			}
		}
	}

}
