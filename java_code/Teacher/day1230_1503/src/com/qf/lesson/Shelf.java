package com.qf.lesson;

import java.util.ArrayList;
import java.util.List;

/*
 * 共享数据区
 *  存放产品
 */
public class Shelf {
   private List<Product> pList = new ArrayList<Product>();
   private static  int no;
   /*
    * 添加商品:
    *   1 判断共享区是否有位置可以放置数据，有的话放入数据，然后通知消费线程进入就绪
    *   2 共享区满了则访问该方法的线程进入等待区，等待被唤醒
    */
     
   public synchronized void addProduct(){
	   try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
	   if(pList.size()<10){
		   Product p = new Product("product",++no);
		   pList.add(p);
		   System.out.println(Thread.currentThread().getName()+"生产了产品："+p);
		   notifyAll();//notifyAll();
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
   /*
    * 消费产品：
    *  1 判断共享区是否有数据，有则获取一个。同时通知生产线程进入就绪状态
    *  2 共享数据区为空，则访问当前方法的线程进入等待区，等待被notify
    */
   public synchronized void consumeProduct(){
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO 自动生成的 catch 块
		e1.printStackTrace();
	}
	   if(pList.size()>0){
		   System.out.println(Thread.currentThread().getName()+"消费了产品："+pList.remove(0));
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
