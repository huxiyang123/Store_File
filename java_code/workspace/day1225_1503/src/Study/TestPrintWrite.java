package Study;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/*
 * PrintWrite:打印流的使用。
 * 	构造方法：
 * 	方法：
 * close():关闭流
 */
public class TestPrintWrite {

	public static void main(String[] args) {
		PrintWriter pw1=null;	
		pw1 = new PrintWriter(System.out);
		pw1.write("HELLO WORLD");
		//pw.flush();
		pw1.close();		
		
		
		PrintWriter pw=null;	
		try {		
			pw = new PrintWriter(new FileWriter("3.txt"));
			pw.write("HELLO WORLD");
			//pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}		
		
	}

}
