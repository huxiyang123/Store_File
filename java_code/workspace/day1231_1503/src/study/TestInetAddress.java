package study;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		try {
			//QF-20150623XSV����������
			InetAddress ia = InetAddress.getByName("QF-20150623XSV");
		//����getNyName��name��name��Ӧ��Ip��ַ
			System.out.println(ia.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
//		try {
//			//��ȡ������Ip������		
//			InetAddress local = InetAddress.getLocalHost();
//			System.out.println(local.getHostAddress()+local.getHostName());
//		} catch (UnknownHostException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		}

	}

}