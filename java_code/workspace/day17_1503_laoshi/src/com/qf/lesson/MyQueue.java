package com.qf.lesson;

import java.util.LinkedList;
/*
 * LinkedList模拟Queue队列效果
 */
public class MyQueue<A> {
   private LinkedList<A> list = new LinkedList<A>();
   //添加队尾
   public void add(A a){
	   list.addLast(a);
   }
   //从队首获取并移除对象
   public A get(){
	  return  list.pollFirst();
   }
}
