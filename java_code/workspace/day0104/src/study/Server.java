package study;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * UDP:User Datagram Protocol 用户数据报协议
 * 	特色：
 * 		1 相关的发送方，发送内容封装到一个DatagramPacket数据报中
 * 		2 大小有限制，不能超过64k
 *  	3 不需要连接，所以是不可能的
 *  	4 发送结束无需释放资源，所以速度很快
 * 	DatagramSocket:表示用来发送和接收数据报包的套接字
 * 	 构造方法：
 * 		DatagramSocket():
 * 	 方法：
 * 		receive(DatagramPacket p)从此套接字接收数据报包。
 * 		send(DatagramPacket p) 从此套接字发送数据报包。
 * 	DatagramPacket:数据报包
 * 
 */
public class Server {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			//接收客户端信息
			ds = new DatagramSocket(3333);
			//创建用于保存接收到的数据
			byte[] bs = new byte[1024];
			//初始化DatagramPacket对象
			DatagramPacket dp = new DatagramPacket(bs,0,bs.length);
			//使用DatagramSocket接受发送方的信息
			ds.receive(dp);
			
			String str = new String(dp.getData(),0,dp.getLength());
			System.out.println("来自"+dp.getAddress()+"的问候"+str);
			
			//添加响应信息
			byte[] by = "我是服务端，你的信息我已收到".getBytes();
			DatagramPacket dp2 = new DatagramPacket(by,0,by.length,dp.getAddress(),3333);
			ds.send(dp2);
		} catch (SocketException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			if(ds!=null)
				ds.close();
		}

	}

}
