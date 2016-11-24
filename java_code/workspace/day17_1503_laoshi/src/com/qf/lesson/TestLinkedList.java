package com.qf.lesson;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList:使用双向链表结构实现的List
 *   构造方法：
 *     LinkedList():默认空列表。
 *   方法：扩展了List的方法
 *    1 addFirst(E e):指定元素插入集合的开头
 *    2 addLast(E e):指定元素放置在集合尾部
 *    3 getFirst():获取集合的第一个元素
 *    4 getLast():获取最后一个元素
 *    5  
 *    
 * 特点：
 *   1 适合于频繁的插入或删除操作，原因是操作后只是更新了引用。
 *   2 适合于栈和队列的实现。
 *     栈：FILO,先进后出的一种数据结构。
 *     队列：FIFO,先进先出的一种数据结构。
 *       
 */
public class TestLinkedList {

	public static void main(String[] args) {
	   LinkedList<String> ll = new LinkedList<String>();
	   ll.add("first");
	   ll.addFirst("second");
	   
	   ll.add("third");
	   ll.addLast("forth");
	   
	   Iterator<String> it = ll.iterator();
	   while(it.hasNext()){
		   String s = it.next();
		   System.out.println(s);
	   }
	   
	   System.out.println(ll.getFirst());
	   System.out.println(ll.getLast());

	}

}
