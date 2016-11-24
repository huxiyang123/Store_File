package study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set类的使用：方法完全继承自Collection接口，没有扩展
 *   保存的元素是无序而且不重复的。
 * 实现类：
 *   1 HashSet:
 *     元素无序而且不重复.
 *   原理：
 *     1 先计算元素的hashCode值，然后看散列表中是否有该值，没有的话，直接存放，保存结束。如果有的话，则进行下一步。
 *     2 然后调用元素对象的equals方法，和散列表中对应位置的所有元素进行比较。返回true则保存失败，否则保存该元素。
 *   取值时先根据hashCode值获取对应的位置，然后在该位置循环找到对应的元素。
 *   保存到HashSet中的对象对应的类必须实现hashCode和equals()方法以便比较对象是否相等。
 *     包装类和String类已经覆盖了hashCode和equals方法。
 *     自定义类如果需要添加至HashSet中，则必须覆盖hashCode和equals方法：
 *       
 *   构造器：
 *     new HashSet():初始容量为16的集合。
 *   方法：
 *     add(E element):添加元素
 *     iterator()：返回迭代器，便于迭代使用  
 *   特点：
 *   	1 不保存元素的加入顺序
 *    	1 增、删、取  效率很高，基于HashCode值和equals方法进行。
 *   2 TreeSet:
 *     可排序。
 */
public class TestSet {
	public static void main(String[] args) {
		Set<Integer>  s = new HashSet<Integer>();
		s.add(new Integer(1));
		s.add(2);
		s.add(3);
		s.add( 2);
		System.out.println(s.size());
		
		Iterator<Integer>  it = s.iterator();
		while(it.hasNext()){
			int i = it.next();
			System.out.println(i);
		}
		
		Set<String>  s1 = new HashSet<String>();
		s1.add("zhang卯1");
		s1.add("崔丽");
		s1.add("范卯");
		s1.add("刘永吉");
		s1.add("崔丽");
		s1.add("zhang卯1");
		s1.add("刘永吉2");
		s1.add("崔丽");
		s1.add("崔丽3");
		System.out.println(s1.size());
		
		Iterator<String>  it1 = s1.iterator();
		while(it1.hasNext()){
			String i = it1.next();
			System.out.println(i);
		}
		
	}
}
