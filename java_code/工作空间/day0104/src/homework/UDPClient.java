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
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			ds = new DatagramSocket();
			br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				
				System.out.println("（客户端）请输入：");
				String str = br.readLine();
				DatagramPacket dp = new DatagramPacket(str.getBytes(), 0,
						str.getBytes().length,
						InetAddress.getByName("10.12.152.55"), 1122);
				ds.send(dp);

				byte[] bs = new byte[1024];
				DatagramPacket dp2 = new DatagramPacket(bs, bs.length);
				ds.receive(dp2);
				bw = new BufferedWriter(new OutputStreamWriter(System.out));
				String str2 = new String(dp2.getData(), 0, dp2.getLength());
				//System.out.println("---------"+str2);
				if (str2.equals("bye") || str2.equals("exit")) {

					System.out.println("本次结束（Client）");
					break;
				}
				else{
					
					bw.write(str2);
					bw.newLine();
					bw.flush();
				}
			}
		} catch (SocketException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (br != null)
					br.close();

			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if (ds != null)
				ds.close();

		}

	}

}
