package study;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkList：使用双向链表结构
 * 	构造方法：
 * 		LinkList()：默认空列表
 * 	方法：扩展list的方法，因为list里面没有。所以见对象不能用list
 * 		1 addFirst(E  e):插入指定列表的开头
 * 		2 addLast(E e)
 * 		3 getFirst()
 * 		4 getLast()
 * 特点：
 * 		1 适合与频繁的插入或删除操作，原因是操作后只是更新了引用。
 * 		2 适合于和队列
 * 			栈   FILO  ,先进后出；
 * 			队列  FIFO   先进先出的一种数据结构
 */
public class TestLinkList {
	public static void main(String[] args) {
		LinkedList<String>  ll = new LinkedList<String>(); 
		ll.add("first");
		ll.addFirst("second");
		ll.add("thid");
		ll.addLast("fouth");
		ll.addFirst("second");
		
		Iterator<String>  it= ll.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		System.out.println(ll.getFirst()+"  "+ll.getLast());
	}
}	
