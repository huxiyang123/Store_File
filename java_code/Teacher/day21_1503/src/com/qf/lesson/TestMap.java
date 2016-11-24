package com.qf.lesson;

import java.util.HashMap;
import java.util.Map;

/*
 * Map:
 *   使用键-值对保存元素。 *  
 *   通常使用String类型对象作为key。使用自定义类作为key的话，则必须覆盖自定义类的hasCode()和equals()方法。
 *   
 * 方法：
 *   1 put(T key,V value):
 *     1)key不存在，则把key和对应的value存放在map集合中。
 *     2)key已存在，则使用新的value值替换旧的value值
 *   2 remove(T key):删除key对应的key-value映射。  *     
 *   3 containsKey(T key):是否包含指定的key
 *   4 containsValue(V value)：是否包含指定的value
 *   5 keySet():键对应的Set集合。
 *   6 values():值对应的Collection集合
 *   7 entrySet():返回Map.Entry对应的集合
 *   8 isEmpty():如果此映射未包含键-值映射关系，则返回 true。   
 *  取值方式：
 *    1 keySet()和get(T key)结合使用
 *    2 entrySet()和Map.Entry结合使用
 *  
 * 实现类：
 *   1 HashMap：
 *    构造方法：
 *     HashMap():默认容量16的空map集合。
 *     底层的key使用HashSet保存，不能重复；value使用Collection类型保存，可以重复。
 *   
 *   3 Properties：
 */
public class TestMap {

	public static void main(String[] args) {
		// 使用String做key
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("first", 1);
		map.put("second", 2);
		map.put("third", 3);
		map.put("forth", 2);
		map.put("first", 5);

//		System.out.println(map.size());
//		System.out.println(map);

		// 使用自定义类做Key
		Map<User, String> uMap = new HashMap<User, String>();
		uMap.put(new User("zhangsan", 18), "zhangsan");
		uMap.put(new User("lisi", 18), "lisi");
		uMap.put(new User("zhangsan", 18), "wangwu");
		System.out.println(uMap.size());
		System.out.println(uMap);
		
		
		
	}

}
