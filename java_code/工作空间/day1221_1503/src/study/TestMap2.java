package study;

import java.util.HashMap;
import java.util.Map;
/*
 * remove  containsKey  containsValue����
 */
public class TestMap2 {

	public static void main(String[] args) {
		Map<String, User> map = new HashMap<String, User>();
		User u = new User("zhangsan",18);
        map.put("zhangsan", u);
        map.put("lisi", new User("lisi",19));
        map.put("zhangsan2", u);
        
        System.out.println(map.size());
        System.out.println(map);
        //����keyɾ����Ӧ��key-valueӳ��
        User uu = map.remove("zhangsan22");
        System.out.println(uu);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println("contains key: "+map.containsKey("zhangsan"));
        System.out.println("contains value: "+map.containsValue(u));
	}

}
