package study;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * �ͻ���ʹ��UDPЭ�鷢�����ݵ������
 * 	���裺
 * 		1 �����޲ι��췽����DatagramSocket�Ķ���
 * 		2 ����DatagramPacket���󣬱���������� ���շ�
 */
public class Client {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramSocket ds2 = null;
		
		try {
			ds = new DatagramSocket();
			byte[] buf = "hello Ԫ�����֣�".getBytes();
			//���ù�
			DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("10.12.152.55"),3333);
			ds.send(dp);
			//�ͻ��˽��ܷ������Ӧ��Ϣ
			//�����µ�Socket����Ϊ������Ҫ�˿ڣ������ڷ���ʱ��Socket���Ӷ˿ں�
			ds2 = new DatagramSocket(3333);
			byte[] bs = new byte[1024];
			//�����յ�DatagramPacket׼�����շ��͵�����
			DatagramPacket dp2 = new DatagramPacket(bs,0,bs.length);
			//���յ����ݷ���DatagramPacket������
			ds2.receive(dp2);
			String str = new String(dp2.getData(),0,dp2.getLength());
			System.out.println("����"+dp2.getAddress()+"�Ļظ�"+str);
			
		} catch (SocketException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				if(ds!=null)
					ds.close();
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}