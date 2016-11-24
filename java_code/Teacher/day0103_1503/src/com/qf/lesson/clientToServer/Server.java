package com.qf.lesson.clientToServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		
		try {
			ds = new DatagramSocket(4444);
			byte[] bs = new byte[1024];
			DatagramPacket pd = new DatagramPacket(bs,0,bs.length);
			ds.receive(pd);
			String temp = new String(pd.getData(),0,pd.getLength());
			System.out.println("Client: "+temp);
		} catch (SocketException e) {
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
