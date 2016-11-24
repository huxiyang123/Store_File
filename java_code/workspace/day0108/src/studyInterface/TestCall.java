package studyInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestCall implements Callback {
	public static void main(String[] args) {
		System.out.println("main method begining");
		TestCall test = new TestCall();
		String path = ("http://10.12.152.55:8080//first/image/11.mp3");
		HttpUtils.download(path, test);
		}

	@Override
	public void send(InputStream is) {
		System.out.println(Thread.currentThread().getName()+"is running.");
		OutputStream os = null;
		try {
			os = new FileOutputStream("4.mp3");
			byte [] bs = new byte [1024];
			int len = 0;
			while((len=is.read(bs))!=-1){
				os.write(bs,0,len);
			}
			System.out.println("the downloading is over.");
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			try {
				if(os!=null)
					os.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}