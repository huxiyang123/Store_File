package Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/*
 * �����л�����:
 * 	ObjectOutputStream:���ڻָ���Щ��ǰ���л��Ķ���
 * 	���췽����
 * 	  ObjectInputStream(InputStream in)��������ָ�� InputStream ��ȡ�� ObjectInputStream��
 * 	������
 * 	  1 readObject()�� ObjectInputStream ��ȡ����	
 */
public class TestObjectIn {

	public static void main(String[] args) {
		//�����л�
		InputStream is = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream("2.obj");
			ois = new ObjectInputStream(is);
			User u = (User) ois.readObject();
			System.out.println(u);
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			try {
				ois.close();
				is.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		}
		

	}

}
 