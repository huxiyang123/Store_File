package study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * Map.Entry:
 */
public class TestEntry {

	public static void main(String[] args) {
		Map<String, User> map = new HashMap<String, User>();
		User u = new User("zhangsan",18);
        map.put("zhangsan", u);
        map.put("lisi", new User("lisi",19));
        map.put("zhangsan2", u);

        Set<Entry<String,User>> entrys = map.entrySet();
        Iterator<Entry<String,User>> ie = entrys.iterator();
        while(ie.hasNext()){
        	Entry<String,User> entry= ie.next();
        	System.out.print(entry.getKey()+"=====");
        	System.out.println(entry.getValue());
        }
	}

}

