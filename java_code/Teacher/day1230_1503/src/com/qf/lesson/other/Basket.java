package com.qf.lesson.other;

import java.util.ArrayList;
import java.util.List;

/*
 * 共享数据区
 */
public class Basket {
   private List<Apple>  appleList = new ArrayList<Apple>();
   private int no;
   //放苹果
   public synchronized void put(){
	   try {
		Thread.currentThread().sleep(500);
	} catch (InterruptedException e1) {
		// TODO 自动生成的 catch 块
		e1.printStackTrace();
	}
	   if(appleList.size()==0){
		   Apple apple = new Apple("红富士",++no);
		   appleList.add(apple);
		   System.out.println(Thread.currentThread().getName()+"添加苹果: "+apple);
		   notifyAll();
	   }
	   else{//共享数据区数据满了情况下，生产者进入this锁对象的wait等待区
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	   }
   }
   //消费者取数据
   public synchronized  void get(){
	   try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
	   if(appleList.size()>0){
		   System.out.println(Thread.currentThread().getName()+"取出苹果: "+appleList.remove(0));
		   notifyAll();
	   }
	   else{
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	   }
   }
}
