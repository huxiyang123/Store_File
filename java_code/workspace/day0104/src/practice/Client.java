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
		//����ָ���˿ںţ������ڱ�������ʱ��ע�ⷢ�ͺͿͻ��ͻ��˿ڲ���һ�� ���ڲ�ͬ�Ļ����ϲ��ԣ�����ʹ��
		try {
			ds = new DatagramSocket();
			byte[] bs = "nihao ".getBytes();
			DatagramPacket dp = new DatagramPacket(bs,0,bs.length,InetAddress.getLocalHost(),4444);
			ds.send(dp);
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
			if(ds!=null)
				ds.close();
		}

	}

}
