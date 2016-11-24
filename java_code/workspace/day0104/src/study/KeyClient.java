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
			
			System.out.println("�����룺");
			while(true){
				String str = br.readLine();
				DatagramPacket dp = new DatagramPacket(str.getBytes(),0,str.getBytes().length,InetAddress.getByName("10.12.152.55"),5555);
				ds.send(dp);
				byte[] bs = new byte[1024];
				
				//�����յ�DatagramPacket׼�����շ��͵�����
				DatagramPacket dp2 = new DatagramPacket(bs,0,bs.length);
				//���յ����ݷ���DatagramPacket������
				ds.receive(dp2);
				String str1 = new String(dp2.getData(),0,dp2.getLength());
				System.out.println("����"+dp2.getAddress()+"�Ļظ�"+str1);
			}
			
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