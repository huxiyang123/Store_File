package practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		//可以指定端口号，但是在本机测试时候，注意发送和客户客户端口不能一致 ，在不同的机器上测试，可以使用
		try {
			ds = new DatagramSocket();
			byte[] bs = "nihao ".getBytes();
			DatagramPacket dp = new DatagramPacket(bs,0,bs.length,InetAddress.getLocalHost(),4444);
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
		}
		finally{
			if(ds!=null)
				ds.close();
		}

	}

}
