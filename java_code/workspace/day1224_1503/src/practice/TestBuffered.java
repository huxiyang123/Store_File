package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;


public class TestBuffered {

	public static void main(String[] args) {
		InputStream is = System.in ;
		OutputStream os = System.out;
		
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		byte[] by = new byte[1024];
		int len = 0;
		try {
			while((len=bis.read(by))!=-1){
				bos.write(by,0,len);
				bos.flush();
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
