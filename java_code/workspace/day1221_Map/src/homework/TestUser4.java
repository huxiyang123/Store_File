package homework;


import java.util.HashMap;
import java.util.HashSet;


import java.util.Map;
import java.util.Set;

/*
 * 4 ������������Ա�ͬ��User�����HashSet���ϡ�
 * ʹ��HashMapͳ������Ů��������
 */
public class TestUser4 {

	public static void main(String[] args) {
		Set<User> set4 = new HashSet<User>();
		set4.add(new User("����","��"));
		set4.add(new User("����","Ů"));
		set4.add(new User("��ʤ","��"));
		set4.add(new User("��ǿ","��"));
		set4.add(new User("����","Ů"));
		set4.add(new User("����","Ů"));
		set4.add(new User("����","Ů"));
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		int i=1;
		for(User u:set4){
			if(map.containsKey(u.getSex())){
				map.put("��", ++i);
				
			}else{
				map.put("��", i);
			}
			System.out.println(u);
		}
		System.out.println("�У�"+i+"Ů��"+(set4.size()-i));
	
	}

}
