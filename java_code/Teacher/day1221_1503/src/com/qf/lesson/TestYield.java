package com.qf.lesson;
/*
 * 测试线程的yield方法：
 *   调用yield方法的线程暂停，其他线程执行。
 */
public class TestYield {

	public static void main(String[] args) {

		TicketSaler ts = new TicketSaler("售票点");
		ts.start();
		for(int i=0;i<100;i++){
			if(i==50){				
					Thread.currentThread().yield();				
			}
			System.out.println(Thread.currentThread().getName()+" is "+i);
		}

	

	}

}
