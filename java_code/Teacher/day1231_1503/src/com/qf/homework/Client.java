package com.qf.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 拷贝客户端图片到服务端
 *  步骤：
 *    1 创建客户端Socket对象
 *    2 使用缓冲字节流读取图片
 *    3 获取socket的输出流对象，在读图片的同时往服务端I/O中写出
 *    4 关闭Socket I/O对象
 */
public class Client {

	public static void main(String[] args) {
		Socket s = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		BufferedReader br = null;
		try {
			s = new Socket(InetAddress.getLocalHost(), 9999);
			bis = new BufferedInputStream(new FileInputStream("kaola.jpg"));
			bos = new BufferedOutputStream(s.getOutputStream());
			int len = 0;
			byte[] bs = new byte[1024];
			while ((len = bis.read(bs)) != -1) {
				bos.write(bs, 0, len);
			}
			
            bos.flush();
			s.shutdownOutput();
			// 接受响应
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("服务器： " + br.readLine());

		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (s != null) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}

	}

}
