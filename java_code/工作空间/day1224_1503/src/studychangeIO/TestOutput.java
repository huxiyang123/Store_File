package studychangeIO;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * ���ת������outputStreamWriter
 * 	  
 */
public class TestOutput {

	public static void main(String[] args) {
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		try {
			osw.write("i come from OutputStreamWriter");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			try {
				osw.close();
				os.close();
				
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
