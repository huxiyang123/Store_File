package study;

import java.io.BufferedWriter;

import java.io.IOException;

import java.io.OutputStreamWriter;

import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	public static void main(String[] args) {
		Socket socket = null;			
		BufferedWriter bw = null;	
		//BufferedReader br = null;
		
			try {
				socket = new Socket("10.12.152.65",6666);
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				bw.write("nihao  sfsjfslf  ");
				bw.newLine();
				bw.flush();
				
			
			
				
			} catch (UnknownHostException e) {
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
					if(socket!=null)
						socket.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
	}
}