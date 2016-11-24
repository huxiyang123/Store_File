package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class PracticeClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		BufferedReader br = null;
		try {
			ds = new DatagramSocket();
			br = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			while((str=br.readLine())!=null){
				DatagramPacket dp = new DatagramPacket(str.getBytes(),0,str.getBytes().length,InetAddress.getLocalHost(),7777);
				ds.send(dp);
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
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if(ds!=null)
				ds.close();
		}

	}

}
