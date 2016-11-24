package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Tcp/Ip����˵ı��
 * 	���ܿͻ��˵ı�̡�
 * ���裺
 * 	1 �����ͻ���ServerSocket���󣬴���˿ں�
 * 	2 ʹ��accept()���������ͻ��̵����룬���Կ�����	Client�˵�Socket��һ�ݿ�����
 * 	3 ʹ��accept�������ܵ�Socket�����ж�Ӧ��I/O
 */
public class Server {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		ServerSocket ss = null;
		OutputStream os  = null;
		Socket s = null;
		try {
			ss = new ServerSocket(8888);
			s = ss.accept();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			while (true) {
				
				String temp = br.readLine();
				System.out.println("�ͻ�˵��"+temp);
				bw.write(s.getInetAddress().getHostName()+"������������յ�");
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (br != null)
					br.close();
				if (s != null)
					s.close();
				if (ss != null)
					ss.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
