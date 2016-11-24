package studychangeIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestBufferedWrite {

	public static void main(String[] args) {
		Writer w= null;
		BufferedWriter bw =null; 
		try {
			w = new FileWriter("2.txt");
			bw = new BufferedWriter(w);
			bw.write("hello1\n");
			bw.newLine();
			bw.write("hello2");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
