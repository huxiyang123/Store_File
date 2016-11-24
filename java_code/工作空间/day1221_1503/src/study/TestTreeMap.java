package study;

import java.util.Map;
/*
 * TreeMap:
 *   底层使用红黑二叉树结构对key进行排序。所以key对应的类必须实现Comparable接口。
 *   排序方法：
 *   1 自然排序：key对应的类实现了Comparable接口，对象之间提供了排序算法，能进行排序。
 *   2 定制排序:提供Comparator比较器实现类，在compare()中对需要排序的对象进行强制排序。
 * 构造方法：定制排序优先级高于自然排序
 *   1 TreeMap():使用键的自然顺序构造一个新的、空的树映射。
 *   2 TreeMap(Comparator<? super K> comparator):
 *     构造一个新的、空的树映射，该映射根据给定比较器进行排序。
 * 注意：如果key已经存在，使用put（）方法添加相同的key时候，是一次覆盖操作，会使用新的value覆盖旧的value值。
 *  
 * 
 */
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		//String默认实现了Comarable接口
		Map<String,User> map = new TreeMap<>();
        map.put("china", new User("王石",40));
        map.put("china", new User("松本静宏",26));
        map.put("american", new User("约翰",30));
        map.put("france", new User("拿破仑",100));
        
        System.out.println(map.size());
        System.out.println(map);
        //User自然排序       
        Map<User,String> uMap = new TreeMap<>();
        uMap.put(new User("zhangsan",20), "china");
        uMap.put(new User("lisi",10), "china");
        uMap.put(new User("wanmazi",28), "china");
        uMap.put(new User("zhangsan",18), "un");
        System.out.println(uMap.size());
        System.out.println(uMap);
	}
}
