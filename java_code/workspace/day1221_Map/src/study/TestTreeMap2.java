package study;

import java.util.Map;
import java.util.TreeMap;
/*
 * ���Ķ�������
 */
public class TestTreeMap2 {

	public static void main(String[] args) {
		  //User��������       
        Map<User,String> uMap = new TreeMap<>(new CustomComparator());
        uMap.put(new User("zhangsan",20), "china");
        uMap.put(new User("lisi",10), "china");
        uMap.put(new User("wanmazi",28), "china");
        uMap.put(new User("zhangsan",18), "un");
        System.out.println(uMap.size());
        System.out.println(uMap);


	}

}
