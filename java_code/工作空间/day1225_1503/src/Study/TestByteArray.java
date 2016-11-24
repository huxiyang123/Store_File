package Study;


/*
 * �ڴ�����
 * 	1 ByteArrayInputStream������һ���ڲ����������û��������������ж�ȡ���ֽڡ�
 * 	���췽����
 * 	  ByteArrayInputStream(byte[] buf)������һ�� ByteArrayInputStream��ʹ�� buf ��Ϊ�仺�������顣
 * 	2 ByteArrayOutputStream��ʵ��һ������������е����ݱ�д��һ��byte�����С�
 * 	���췽����
 *    ByteArrayOutputStream() ����һ���µ� byte �����������
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


public class TestByteArray {

	public static void main(String[] args) {
		//����
		ByteArrayInputStream bais = new ByteArrayInputStream("hello\r\n world".getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int ch = 0;
		while((ch=bais.read())!=-1){
			//int result = ch-32;
			int result = Character.toUpperCase(ch);
			//��ת����Ľ�������������Ļ�������
			baos.write(result);
		}
		System.out.println(new String(baos.toString()));
	}

}
