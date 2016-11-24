package com.qf.lesson;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * UDP:User Datagram Protocol 用户数据报协议
 *  
 *   特点：
 *     1 相关的发送方 接收方  发送内容封装到一个DatagramPacket数据报中
 *     2 大小有限制，不能超过64K
 *     3 不需要连接，所以是不可靠的
 *     4 发送结束无需释放资源，所以速度很快
 *  DatagramSocket:表示用来发送和接收数据报包的套接字。
 *    构造器：
 *      DatagramSocket()： 创建数据报套接字。
 *    方法：
 *      close()：  关闭此数据报套接字。
        getInetAddress()： 返回此套接字连接（即发送方地址）的地址。  
        getPort()： 返回此套接字的端口。
        receive(DatagramPacket p)： 从此套接字接收数据报包。
        send(DatagramPacket p)：  从此套接字发送数据报包。
    DatagramPacket：数据报包 
                  数据报包用来实现无连接包投递服务。每条报文仅根据该包中包含的信息从一台机器路由到另一台机器。
                构造方法 ：
        DatagramPacket(byte[] buf, int length)：和DatagramSocket的receive(...)配合使用 
                           构造 DatagramPacket，用来接收长度为 length 的数据包。  
        DatagramPacket(byte[] buf, int length, InetAddress address, int port)： 
                          和DatagramSocket的send(...)配合使用
                           构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
                 方法：
        getAddress()： 返回某台机器的 IP 地址，此数据报将要发往该机器或者是从该机器接收到的。
        getData()： 返回数据缓冲区。即数据报包中的数据
        getLength()：返回将要发送或接收到的数据的长度。
        getPort()：返回某台远程主机的端口号，此数据报将要发往该主机或者是从该主机接收到的。 
          接受方：
             步骤：
      1 创建DatagramSocket对象，构造方法中必须制定端口号，而且端口号必须和发送方发送的数据报包中的端口一致
      2 创建一个DatagramPacket包用来准备接受发送的数据包信息
      3 调用DatagramSocket对象的receive()方法，需要传入步骤2初始化的DatagramPacket包对象
      4 处理DatagramPacket包对象接受的信息
      5 关闭DatagramSocket对象
 */
public class Server {

	public static void main(String[] args) {
		
		DatagramSocket ds= null;
		try {
			ds = new DatagramSocket(3333);
			//创建用于保存接受到的数据
			byte[] bs = new byte[1024];
			//初始化DatagramPacket对象
			DatagramPacket dp = new DatagramPacket(bs,0,bs.length);
			//使用DatagramSocket接受发送方的信息
			ds.receive(dp);
			String str = new String(dp.getData(),0,dp.getLength());
			System.out.println("来自"+dp.getAddress()+"的问候："+str);
			
			//添加响应信息
			byte[] by = "你的信息我已经收到".getBytes();
			//必须使用dp.getAddress()和dp.getPort()来获取发送客户端的地址
			DatagramPacket p = new DatagramPacket(by,0,by.length,dp.getAddress(),dp.getPort());
			System.out.println("port:  "+dp.getPort());
			ds.send(p);
		} catch (SocketException e) {
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
