package study;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * keySet values Map.Entry
 */
public class TestMap3 {

	public static void main(String[] args) {
		Map<String, User> map = new HashMap<String, User>();
		User u = new User("zhangsan",18);
        map.put("zhangsan", u);
        map.put("lisi", new User("lisi",19));
        map.put("zhangsan2", u);
        
        Set<String> kSet = map.keySet();
        Iterator<String> it = kSet.iterator();
         while(it.hasNext()){
        	 String key = it.next();
        	 System.out.print(key+"====");
        	 System.out.println(map.get(key));
         }
         
        Collection<User> cs =  map.values();
        Iterator<User> iu = cs.iterator();
//        while(iu.hasNext()){
//        	System.out.println(iu.next());
//        }
        
        

	}

}
