package study;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * UDP:User Datagram Protocol �û����ݱ�Э��
 * 	��ɫ��
 * 		1 ��صķ��ͷ����������ݷ�װ��һ��DatagramPacket���ݱ���
 * 		2 ��С�����ƣ����ܳ���64k
 *  	3 ����Ҫ���ӣ������ǲ����ܵ�
 *  	4 ���ͽ��������ͷ���Դ�������ٶȺܿ�
 * 	DatagramSocket:��ʾ�������ͺͽ������ݱ������׽���
 * 	 ���췽����
 * 		DatagramSocket():
 * 	 ������
 * 		receive(DatagramPacket p)�Ӵ��׽��ֽ������ݱ�����
 * 		send(DatagramPacket p) �Ӵ��׽��ַ������ݱ�����
 * 	DatagramPacket:���ݱ���
 * 
 */
public class Server {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			//���տͻ�����Ϣ
			ds = new DatagramSocket(3333);
			//�������ڱ�����յ�������
			byte[] bs = new byte[1024];
			//��ʼ��DatagramPacket����
			DatagramPacket dp = new DatagramPacket(bs,0,bs.length);
			//ʹ��DatagramSocket���ܷ��ͷ�����Ϣ
			ds.receive(dp);
			
			String str = new String(dp.getData(),0,dp.getLength());
			System.out.println("����"+dp.getAddress()+"���ʺ�"+str);
			
			//�����Ӧ��Ϣ
			byte[] by = "���Ƿ���ˣ������Ϣ�����յ�".getBytes();
			DatagramPacket dp2 = new DatagramPacket(by,0,by.length,dp.getAddress(),3333);
			ds.send(dp2);
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
