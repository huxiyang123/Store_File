package Study;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/*
 * PrintWrite:��ӡ����ʹ�á�
 * 	���췽����
 * 	������
 * close():�ر���
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}		
		
	}

}
