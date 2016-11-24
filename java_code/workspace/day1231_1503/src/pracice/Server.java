package pracice;

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
 * ���ܿͻ��˵��ļ�
 * 	���裺
 * 	 1 ����ServerSocket���󣬴���˿ڡ�
 * 	 2 ����ServerSocket��accept������ȡSocket����
 * 	 3 ʹ�û�����������ȡ�ͻ��˵��ļ���Ϣ��
 * 	 4 �����Ҫ���ͻ��˷�����Ϣ
 */
public class Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		BufferedWriter bw = null;
		try {
			ss = new ServerSocket(9999);
			socket = ss.accept(); 
			bis = new BufferedInputStream(socket.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream("e:\\����1.bmp"));
			int len = 0;
			byte[] byt = new byte[1024];
			while((len=bis.read(byt))!=-1){
				bos.write(byt,0,len);
				bos.flush();
			}
			
			//������Ϣ
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write("�����Ϣ�����յ���лл");
			bw.newLine();
			bw.flush();
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
				if(bw!=null)
					bw.close();
				if(socket!=null)
					socket.close();
				if(ss!=null)
					ss.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}

	}

}