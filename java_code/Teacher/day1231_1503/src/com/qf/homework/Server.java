package com.qf.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 接受客户端文件
 *  步骤：
 *  1 创建ServerSocket对象，传入端口
 *  2 根据ServerSocket的accept()方法获取Socket对象
 *  3 使用缓冲输入流读取客户端文件信息,写入目标文件对应的输出流中
 *  //4 如果需要给客户端返回信息的话，使用步骤2的Socket对象的缓冲输出流对象写入响应信息
 *  5 关闭ServerSocket  Socket  I/O对象
 */
public class Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		BufferedWriter bw   = null;
		try {
			ss = new ServerSocket(9999);
			s = ss.accept();
			bis = new BufferedInputStream(s.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream("test.jpg"));
			int len = 0;
			byte[] bs = new byte[1024];
			while((len=bis.read(bs))!=-1){
				bos.write(bs, 0, len);
			}
			
			//返回响应信息			
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write("你发送的图片我已收到，谢谢！！！");
			bw.newLine();
			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        finally{
        	if(bw!=null){
        		try {
					bw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
        	}
        	if(bos!=null){
        		try {
					bos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
        	}
        	if(bis!=null){
        		try {
					bis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
        	}
        	if(s!=null){
        		try {
					s.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
        	}
        	if(ss!=null){
        		try {
					ss.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
        	}
        }
	}

}
