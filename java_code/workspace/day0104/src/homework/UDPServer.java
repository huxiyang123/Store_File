package homework;
/*
 * 2  使用UDP协议编写可以持续发送信息的Client/Server程序。
 * 如果任何一方输入bye或exit字符串，则本次通信结束
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
					System.out.println("结束（Server）");
					break;
				}
				
					System.out.println("（Server）收到：");
					bw.write(str);
					bw.newLine();
					bw.flush();
					
				

				System.out.println("(服务端)请输入：");
				br = new BufferedReader(new InputStreamReader(System.in));
				String st = br.readLine();
				DatagramPacket dp2 = new DatagramPacket(st.getBytes(), 0,
						st.getBytes().length, dp.getAddress(), dp.getPort());
				ds.send(dp2);
			}

		} catch (SocketException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if (ds != null)
				ds.close();
		}

	}
}
