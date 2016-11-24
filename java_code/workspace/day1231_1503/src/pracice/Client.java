package pracice;

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
 * �����ͻ��� ��ͼƬ��������
 * 	���裺
 * 	  1 �����ͻ���Socket����
 * 	  2 ʹ�û����ֽ���������ȡͼƬ
 * 	  3 ��ȡSocket������������ڶ�ͼƬ��ͬʱ�������I/O��д��
 * 	  4 �ر�Socket I/O����
 */
public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		BufferedReader br = null;
		try {
			socket = new Socket(InetAddress.getLocalHost(),9999);
			bis = new BufferedInputStream(new FileInputStream("D:\\test\\chen.bmp"));
			bos = new BufferedOutputStream(socket.getOutputStream());
			int len = 0;
			byte[] by = new byte[1024];
			while((len=bis.read(by))!=-1){
				bos.write(by,0,len);
			}
			bos.flush();
			socket.shutdownOutput();
			//������Ϣ
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
				System.out.println("��������"+br.readLine());
			
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				if(bos!=null)
					bos.close();
				if(bis!=null)
					bis.close();
				if(br!=null)
					br.close();
				if(socket!=null)
					socket.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
	}
}