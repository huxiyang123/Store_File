package com.qf.lesson;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * 客户端使用UDP协议发送数据到服务端，服务端发送回响应
 *   步骤：
 *     1 创建无参构造方法的DatagramSocket对象
 *     2 创建DatagramPacket对象，必须包含内容  接收方的InetAddress信息   接受方的端口  
 *     3 调用DatagramSocket对象的send方法，把DatagramPacket对象作为参数
 *     4 关闭DatagramSocket对象
 */
public class Client {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramSocket ds2 = null;
		try {
			//客户端没有添加端口，则默认会从可用的端口中随机选择的一个。
			//服务端发送响应必须使用dp.getAddress()dp.getPort()。
			ds = new DatagramSocket();
			byte[] buf = "hello world".getBytes();
			DatagramPacket dp = new DatagramPacket(buf, buf.length,
					InetAddress.getLocalHost(), 3333);
			ds.send(dp);
//			
//			//客户端接收服务端的响应信息
//		
			byte[] bs = new byte[1024];
			//创建空的DatagramPacket准备接受发送的数据
			DatagramPacket dp2 = new DatagramPacket(bs,0,bs.length);
			//接受的数据放在DatagramPacket对象中
			ds.receive(dp2);
			String temp  = new String(dp2.getData(),0,dp2.getLength(),"utf-8");
			System.out.println(temp);
			
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
		   if(ds!=null){
			   ds.close();
		   }
		}
	}

}
