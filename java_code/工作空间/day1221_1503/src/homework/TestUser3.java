package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 3.����һ��User�࣬����name���Ա�sex������Ա������
 * ��һ��HashSet�����м���������ȫһ����User����
 * Ȼ�����HashSet�����е�User���󣬲�����ЩUser����ĳ�Ա������ӡ����Ļ�ϡ�
 */
public class TestUser3 {

	public static void main(String[] args) {
		Set<User> set3 = new HashSet<User>();
		set3.add(new User("����","��"));
		set3.add(new User("����","��"));//ͨ��hashCode��equals�����ȽϺ�ȷ��Ϊͬһ������
		Iterator<User> it3 = set3.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
	}
}

