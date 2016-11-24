package com.qf;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		try {
			//根据域名返回IP地址信息
			InetAddress ia = InetAddress.getByName("ZHAOJUNSIR-PC");
			//返回IP地址
			System.out.println(ia.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			//获取本机InetAddress
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("ip: "+local.getHostAddress()+";name: "+local.getHostName());
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
