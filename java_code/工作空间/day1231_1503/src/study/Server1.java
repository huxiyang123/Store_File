package study;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
	
			try {
				ss = new ServerSocket(6666);
				//保证一直有新的线程处理Socket
				while(true){
					socket = ss.accept(); 
					new MyThread1(socket).start();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			finally{
				try {
					if(ss!=null)
						ss.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
					
			}
	}
}
