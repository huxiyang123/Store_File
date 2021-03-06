package study;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class KeyClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		BufferedReader br = null;

		try {
			ds = new DatagramSocket();
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("请输入：");
			while(true){
				String str = br.readLine();
				DatagramPacket dp = new DatagramPacket(str.getBytes(),0,str.getBytes().length,InetAddress.getByName("10.12.152.55"),5555);
				ds.send(dp);
				byte[] bs = new byte[1024];
				
				//创建空的DatagramPacket准备接收发送的数据
				DatagramPacket dp2 = new DatagramPacket(bs,0,bs.length);
				//接收的数据放在DatagramPacket对象中
				ds.receive(dp2);
				String str1 = new String(dp2.getData(),0,dp2.getLength());
				System.out.println("来自"+dp2.getAddress()+"的回复"+str1);
			}
			
		} catch (SocketException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			if(ds!=null)
				ds.close();
		}

	}

}
