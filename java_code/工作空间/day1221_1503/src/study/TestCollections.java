package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections工具类：
 *   操作Collection集合的工具类，提供了一些静态方法实现了基于集合的一些常用算法 。
 *   方法：
 *    1 sort(List<T> list):根据元素的自然顺序 对指定列表按升序进行排序。
 *    2 sort(List<T> list, Comparator<? super T> c): 
                         根据指定比较器产生的顺序对指定列表进行排序。
 *    3 reverse(List<?> list):反转指定列表中元素的顺序。
 *    4 copy(List<? super T> dest, List<? extends T> src): 
                        将所有元素从一个列表复制到另一个列表。目标列表的元素个数必须大于等于源列表
 */
public class TestCollections {

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User("bc", 17));
		list.add(new User("bd", 18));
		list.add(new User("aa", 19));
		list.add(new User("ab", 16));
		
//		System.out.println(list);
//		
//		//Collections.sort(list);
//		Collections.sort(list, new CustomComparator());
//		
//		System.out.println(list);
//		
//		Collections.reverse(list);
//		System.out.println(list);
		System.out.println(list.size());
		List<User> newList = new ArrayList<>();
		newList.add(null);
		newList.add(null);
		newList.add(null);
		newList.add(null);
		System.out.println(newList.size());
		System.out.println("size:  "+newList.size());
		Collections.copy(newList, list);
		System.out.println(newList);
	}

}
