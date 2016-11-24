package com.qf.lesson;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合Collection:
 *   特点：
 *     1 容量动态变化
 *     2 实时获取保存对象的数量
 * 注意： 集合中只能保存对象。
 * 集合和数组：
 *    共同点：均能保存多个数
                  区别：
        1 数组一旦初始化后大小不可变;而集合初始话后大小动态变化的
        2 数组提供的方法只是获取它的容量，不易获取对象的数量;集合可以实时获取保存对象数量。
        3 数组可以保存基本数据类型和引用数据类型;集合只能保存对象。  
  结构：
      一  Collection接口:
      --List接口:有序的可以重复的数据
        --ArrayList实现类（掌握）
        --LinkedList实现类（掌握）
      --Set接口:无序而且不能重复的数据
        --HashSet实现类（掌握）
      --SortedSet接口
        --TreeSet实现类（掌握）
      二   Map接口:键值对保存的数据  
    -- HashMap实现类（掌握）
    --HashTable
      --Properties实现类（掌握）
    --SortedHashMap接口：
      --TreeMap实现类    （掌握）
    三   Iterator迭代器：迭代获取Collection类型结合中数据的一个类 （掌握）
    四    Collections工具类：Collection集合的工具类，为Collection集合提供工具方法。 （掌握）
    五   Comparator比较器和Comparable接口：Collection中保存元素能进行大小比较。 （掌握）
 1 Collection接口：
   1）add(E e):添加对象
   2）add(Collection c):把参数集合中所有数据添加到当前集合中
   3）contains(Object o):集合中是否包含指定对象
   4）isEmpty():集合中元素是否为空
   5）size():集合中元素数量
   6）remove(Object o):移除指定元素
   7）clear():移除所有元素
   8）toArray():集合中元素转换为数组。
 2 List接口新增方法：
   1)add(int index,E element):指定位置插入参数元素
   2)get(int index):返回集合中指定位置的元素。
   3)indexOf(Object o):集合中参数对象的第一次出现位置索引
   4)lastIndexOf(Object o):集合中参数对象最后一次出现的位置
   5)set(int index,E element):使用参数元素替换指定位置的元素
   6)subList(int fromIndex,int endIndex):获取指定索引间的子List
 3 ArrayList：除了实现父接口中所有的方法外，还实现了其他方法。
       构造方法： 
     ArrayList():默认容量为10的空集合。
      特点：
     1 默认按照添加顺序保存元素。
     2 元素可以重复
     3 可以保存null
  ArrayList底层使用数组保存元素的。
    1 查询速度特别快。底层使用数组，根据索引查询很快
    2 插入和删除速度比较慢，原因是需要更新底层的索引。
  适用场景：
            查询频次比较多，在中间位置插入或删除比较少情况 。       
 */
public class TestCollection {
  public static void main(String[] args) {
	  Collection c = new ArrayList();	  
	  c.add("hello");
	  c.add("world");
	  System.out.println("是否为空: "+c.isEmpty());
	  System.out.println("元素数量"+c.size());
	  
	  Collection c2 = new ArrayList();
	  c2.add("ni");
	  c.addAll(c2);
	  System.out.println("元素数量"+c.size());
	  
	  for(Object s:c.toArray()){
		  String t = (String) s;
		  System.out.println(t);
	  }
	  
	 System.out.println("==========");
	  
	  System.out.println("是否包含world: "+c.contains("world"));
	  boolean f = c.remove("ni");
	  if(f){
		  System.out.println("移除ni成功");
	  }
	  else{
		  System.out.println("移除失败");
	  }
	  System.out.println(c.size());
	  c.clear();
	  System.out.println(c.size());
  }
}
