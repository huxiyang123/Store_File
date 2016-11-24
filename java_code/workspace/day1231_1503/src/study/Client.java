package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Tcp/Ip�Ŀͻ���
 * �ͻ��˸������û������Ϣ������˽��պ���ʾ����
 * ���裺
 * 	1 �����ͻ���Socket���󣬴����Ӧ��InetAddress��port�������൱�ںͷ������������ӡ�
 * 	2 ������Ҫ�����׽��֣�Socket��
 */
public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		BufferedReader br2 = null;
		
		try {
		
			socket = new Socket("10.12.152.55",8888);
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(System.in));
			br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("�����룺");
			while(true){
				
				String temp =br.readLine();
				bw.write(temp);
				//���߷���ˣ������������
				bw.newLine();
				//socket.shutdownOutput();//ֻдһ����
				bw.flush();
				
				System.out.println(br2.readLine());
			}
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			
			try {
				if(socket!=null)
					socket.close();
				if(br!=null)
					br.close();
				if(bw!=null)
					bw.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		}
	}
}