package homework;
/*
 * 2.����һ��HashSet��������������м���������ȫһ����String����
 * �������д˳��򣬹۲��Ƿ��д��󡣴�ӡ�������е�HashSet�����е�String����
 * �۲�����
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet2 {

	public static void main(String[] args) {
		Set<String> st = new HashSet<String>();
		st.add("����");
		st.add("����");
		
		//System.out.println(st);
		//������ӡ
		Iterator<String> it = st.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}//������ظ�
	}
}
