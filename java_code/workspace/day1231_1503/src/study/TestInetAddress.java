package study;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		try {
			//QF-20150623XSV本机的名称
			InetAddress ia = InetAddress.getByName("QF-20150623XSV");
		//返回getNyName（name）name对应的Ip地址
			System.out.println(ia.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
//		try {
//			//获取本机的Ip和名称		
//			InetAddress local = InetAddress.getLocalHost();
//			System.out.println(local.getHostAddress()+local.getHostName());
//		} catch (UnknownHostException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}

	}

}
