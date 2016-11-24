package study;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合Collection
 * 	特点：
 * 		1 容量动态变化
 * 		2 实时获取保存对象的数量
 * 注意：集合中只能保存对象
 * 集合和数组：
 * 		共同点：均能保存多个数
 * 		区别：
 * 		  1 数组一旦初始化后，大小不可变。而集合初始化后大小动态变化
 * 		  2 数组提供的方法只是获取他的容量，不易获取对象的数量；集合可以实时获取保存对象数量
 * 		  3 数组可以保存基本数据类型和引用数据类型；集合只能保存引用数据类型
 * 结构：
 *  一、Collection接口：
 *  	--List接口：有序的可以重复的
 *  	 --ArrayList实现类(掌握)
 *  	 --LinkedList实现类(掌握)
 *  	--Set接口：无序不重复
 *  	  --HashSet实现类(掌握)
 *  	--SortedSet接口
 *  	  --TreeSet实现类(掌握)
 *  二、Map接口
 *  	--HashMap实现类(掌握)
 *  	--HashTable
 *   	  --Porperties实现类(掌握)
 *   	--SortedHashMap接口：
 *   	  TreeMap实现类(掌握)
 *   三、Iterator迭代器：迭代获取Collection类型结合中数据的一个类。
 *   四、Collections工具类：Collection集合类的工具类，为Collection集合提供工具方法
 *   五、Comparator比较器和Cpmparable接口：Collection中保存元素能进行大小比较(掌握)
 *   1 Collection
 *   	1) add(E e):
 *   	2) add(Collection e): *   
 *   	3) contains(Object o)
 *   	4) isEmpty()集合中元素是否为空
 *   	5) remove(Object o):移除指定元素
 *   	6) clear（）：移除所有元素
 *   	7) size():集合中元素数量
 *   	8) toArray():集合中元素转换为数组
 *   2 List接口
 *   	1) add(int  index,E element)
 *   	2) get (int index)
 *   	3) indexOf(Object o) 参数对象在集合中第一次出现的索引
 *   	4)lastIndexOf(Object o)
 *   	5) set(int  index,E element)
 *   	6) subList()
 *   3 ArrayList ：除了实现父接口中所有的方法我，还实现了其他方法
 *    构造方法：ArrayList();默认容量为10的空集合
 *    特点：
 *    	1) 默认按照添加顺序保存元素
 *    	2) 元素可以重复
 *    	3)	
 *   ArrayList
 *   	1)查询速度特别快，底层使用数组，根据索引查询
 *   	2)插入和删除较慢，
 *   使用场景：
 *   	查询频次比较对，在中间位置插入或删除比较少的情况
 *   	3)
)
 */
public class TestCollection {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("hello");
		c1.add("world");
		System.out.println("是否为空     "+c1.isEmpty());
		System.out.println("元素数量    "+c1.size());
		
		Collection c2 = new ArrayList();
		c2.add("nishi");
		c1.addAll(c2);
		System.out.println("元素数量  "+c1.size());
		
		for(Object s:c1.toArray()){
			System.out.print(s);
		}
		
		System.out.println("是否包含world:  "+c1.contains("world"));
		boolean f = c1.remove("nishi");
		if(f){
			System.out.println("移除后："+c1);
		}
		else{
			System.out.println(c1);
		}
		
		c1.clear();     //清空所有元素
		System.out.println(c1);

			
	}

}
