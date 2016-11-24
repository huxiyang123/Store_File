package study;

import java.util.HashMap;
import java.util.Map;
/*
 * remove  containsKey  containsValue方法
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
        //根据key删除对应的key-value映射
        User uu = map.remove("zhangsan22");
        System.out.println(uu);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println("contains key: "+map.containsKey("zhangsan"));
        System.out.println("contains value: "+map.containsValue(u));
	}

}
