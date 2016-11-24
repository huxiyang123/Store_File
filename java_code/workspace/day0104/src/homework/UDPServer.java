package homework;
/*
 * 2  ʹ��UDPЭ���д���Գ���������Ϣ��Client/Server����
 * ����κ�һ������bye��exit�ַ������򱾴�ͨ�Ž���
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		BufferedWriter bw = null;
		BufferedReader br = null;

		try {
			ds = new DatagramSocket(1122);
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			byte[] by = new byte[1024];
			DatagramPacket dp = new DatagramPacket(by, 0, by.length);
			while (true) {
				ds.receive(dp);
				String str = new String(dp.getData(), 0, dp.getLength());
				if (str.equals("bye") || str.equals("exit")) {
					System.out.println("������Server��");
					break;
				}
				
					System.out.println("��Server���յ���");
					bw.write(str);
					bw.newLine();
					bw.flush();
					
				

				System.out.println("(�����)�����룺");
				br = new BufferedReader(new InputStreamReader(System.in));
				String st = br.readLine();
				DatagramPacket dp2 = new DatagramPacket(st.getBytes(), 0,
						st.getBytes().length, dp.getAddress(), dp.getPort());
				ds.send(dp2);
			}

		} catch (SocketException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			if (ds != null)
				ds.close();
		}

	}
}