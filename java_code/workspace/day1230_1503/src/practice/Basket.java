package practice;

import java.util.ArrayList;
import java.util.List;

/*
 * 共享数据区，放共享数据
 */
public class Basket {
	private Apple[] arr = new Apple[2];//List<Apple> appleList = new ArrayList<Apple>();
	private int no;
	public synchronized void put(){
		if(arr[0]==null){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			Apple apple = new Apple("红富士",++no);
			//appleList.add(apple);
			arr[0] = apple;
			System.out.println(Thread.currentThread().getName()+"添加苹果"+apple);
			notifyAll();
		}
		else{//共享数据区数据满了情况下生产者进入this锁对象的wait等待区
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	//消费者取共享区数据
	public synchronized void get(){
		if(arr[0]!=null){
			System.out.println(Thread.currentThread().getName()+"取出苹果"+arr[0]);
			arr[0]=null;
			notify();
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
