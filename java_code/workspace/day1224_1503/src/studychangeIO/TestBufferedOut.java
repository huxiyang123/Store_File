package studychangeIO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestBufferedOut {

	public static void main(String[] args) {
		OutputStream os = null;
		BufferedOutputStream bos = null;
		try {
			os = new FileOutputStream("2.txt",true);
			bos = new BufferedOutputStream(os);
			bos.write(97);
			bos.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	
	}

}
