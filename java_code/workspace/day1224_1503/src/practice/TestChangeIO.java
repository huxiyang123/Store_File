package practice;
/*
 * * ʹ��ת������ʵ���ڿ���̨������ʾ������
 * 	���裺1����System.in��ȡ�����ֽ���
 * 		2ʹ��InputStreamReaderת����ת���ֽ���Ϊ�ַ���
 * 		3��ȡ����Ľ��
 * 		4����System.out��ȡ����ֽ���
 * 		5ʹ��OutputStreamWriterת���ַ�Ϊ�ֽ����е�����
 * 		6����ת������write()����
 * 		7�ر���
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestChangeIO {

	public static void main(String[] args) {
		//����������
				//InputStream is = System.in;
				OutputStream os = System.out;
				InputStreamReader isr = new InputStreamReader(System.in);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				System.out.println("�����룺");
				try {
					int len = 0;
					char[] c = new char[1024];
					
					while((len = isr.read(c))!=-1){
						String str = new String(c,0,len);
					
						 osw.write(str);
						 osw.flush();
					}			
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				finally{
					try {				
					
							osw.close();
							os.close();
//							isr.close();
//							System.in.close();
							
			
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
	}

}
