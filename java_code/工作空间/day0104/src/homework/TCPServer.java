package homework;

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
 *  1 ʹ��TCP/IPЭ��ӿͻ��˷���һ��ͼƬ������ˣ�����˱��������Ӧ��Ϣ��
 */
public class TCPServer {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(1133);
			socket = ss.accept();
			bis = new BufferedInputStream(socket.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream("2.bmp"));
			byte[] by = new byte[1024];
			int len = 0;
			while((len=bis.read(by))!=-1){
				bos.write(by,0,len);
				bos.flush();
			}
			//������Ϣ
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write("���ͳɹ�");
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
				if(bw!=null)
					bw.close();
				if(bos!=null)
					bos.close();
				if(bis!=null)
					bis.close();
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
