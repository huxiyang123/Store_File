package Study;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*
 * ��������ʹ��I/O��ʽ������ȡ�������Ϣ
 * 		���л���ʹ��ObjectOutputStream��������������ͻ����Ļ��ơ�
 * 		�����л���ʹ��ObjectInputStream��ȡ�����������ͻ����Ļ��ơ�
 * �ܱ����л��Ķ��󣬶�Ӧ�����ͱ���Java.io.Serializable�ӿڡ�
 * 	1 ObjectOutputStream:
 * 	  ���췽����
 * 		ObjectOutputStream(OutputStream out)������д��ָ�� OutputStream �� ObjectOutputStream��
 * 	  ������
 * 		writeObject(Object obj)
 * 			
 */
public class TestObjectOut {

	public static void main(String[] args) {
		//���л���������------��I/O��----���־û����ļ�
		User u = new User("����",19);		
		OutputStream os=null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream("2.obj");
			
			 oos = new ObjectOutputStream(os);
			 
			 oos.writeObject(u);//���˴�д��������ʱ���ڷ������е�˳��Ҫ��֮�����

		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				oos.close();
				os.close();
				
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		}
	}

}
