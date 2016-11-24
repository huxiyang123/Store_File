package com.qf.lesson;

import java.util.LinkedList;

/*
 * 使用LinkedList实现Stack,使用泛型以便适合各种情况
 */
public class MyStack<T> {
	private LinkedList<T> list = new LinkedList<T>();

	// 每次添加到集合的头部
	public void add(T t) {
		list.addFirst(t);
	}
	//每次从顶部获取并移除
	public T get(){
		return list.pollFirst();
	}

}
