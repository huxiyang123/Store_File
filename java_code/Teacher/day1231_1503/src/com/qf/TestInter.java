package com.qf;

import java.net.InetAddress;

/*
 * TCP/IP协议：Transmission  Control Protocol/Internet Protocol
 *   特点：
 *     1 使用前必须建立TCP连接，建立数据传输通道。
 *     2 传输数据前，采用三次握手，是可靠的传输。
 *     3 两种应用程序进程：
 *        客户端：主动发起请求的一方
 *        服务端：等待接受通信请求的一方
 *     4 通信中可以接受大数据量。
 *     5 完毕必须释放所有连接及资源。
 * IP地址：唯一标识网络中每一台计算机的一个标识号。
 *   其中127.0.0.1代表本机地址。
 *  InetAddress:此类表示互联网协议 (IP) 地址。 
 *    getByName(""): 在给定主机名的情况下确定主机的 IP 地址。
 *    getHostAddress():返回 IP 地址字符串（以文本表现形式）。
 *    getHostName()： 获取此 IP 地址的主机名。
 *    getLocalHost()： 返回本地主机。
 * 端口号：
 *   标识正在计算机上运行的进程。0-1024被预占，1024-65535可以选择使用.
 * 套接字(Socket)：包含IP地址和端口信息
 *   客户端Socket：实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。
 *     构造方法：
 *       Socket(InetAddress address, int port)： 创建一个流套接字并将其连接到指定 IP 地址的指定端口号。
 *       Socket(String host, int port) ： 创建一个流套接字并将其连接到指定主机上的指定端口号。
 *     方法：
 *       getInputStream()： 返回此套接字的输入流。
 *       getOutputStream()： 返回此套接字的输出流。
 *       shutdownOutput()：  当前输出流结束。
 *       close()： 关闭此套接字。
 *   服务端Socket:服务器套接字等待请求通过网络传入。它基于该请求执行某些操作，然后可能向请求者返回结果。
 *      ServerSocket:实现服务器套接字。
 *      构造器：
 *       ServerSocket(int port):创建绑定到特定端口的服务器套接字。
 *      方法：
 *       accept()： 侦听并接受到此套接字的连接。      
 *       close()： 关闭此套接字。
 *   备注：ServcerSocket通过accept方法返回的Socket进行I/O处理。
 */
public class TestInter {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
