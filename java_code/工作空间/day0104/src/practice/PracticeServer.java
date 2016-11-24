package practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class PracticeServer {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		
		try {
			ds = new DatagramSocket(7777);
			byte[] by = new byte[1024];
			DatagramPacket dp = new DatagramPacket(by,0,by.length);
			ds.receive(dp);
			String st = new String(dp.getData(),0,dp.getLength());
			System.out.println("����˴�ӡ��"+st);
		} catch (SocketException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			if(ds!=null)
				ds.close();
		}
	}

}
