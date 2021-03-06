package homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 1  使用TCP/IP协议从客户端发送一张图片给服务端，服务端保存后发送响应信息。
 */
public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		BufferedReader br = null;
		try {
			socket = new Socket("10.12.152.55",1133);
			bis = new BufferedInputStream(new FileInputStream("D:\\test\\chen.bmp"));
			bos = new BufferedOutputStream(socket.getOutputStream());
			byte[] by = new byte[1024];
			int len = 0;
			while((len=bis.read(by))!=-1){
				
				bos.write(by,0,len);
			}
			bos.flush();		
			socket.shutdownOutput();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = br.readLine();
			System.out.println("服务端回复："+str);
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				if(bos!=null)
					bos.close();
				if(bis!=null)
					bis.close();
				if(socket!=null)
					socket.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
