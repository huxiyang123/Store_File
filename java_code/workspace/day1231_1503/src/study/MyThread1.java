package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyThread1 extends Thread {
	private Socket socket;
	private BufferedReader br = null;

	public MyThread1(Socket socket) {

		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			System.out.println(socket.getInetAddress().getHostAddress()
					+ "������Ϣ��" + br);

			// bw.write("�����Ϣ�����յ���лл"+socket.getInetAddress().getHostName()+bw);
			// bw.newLine();
			// bw.flush();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		while (true) {
		}

	}
}