package com.qf.lesson;
/*
 * 实现多线程的子类
 */
public class NumThread extends Thread {
	
	@Override
	public void run() {
		 for(int i=0;i<1000;i++){
			   System.out.println(Thread.currentThread().getName()+"8888: "+i);
		   }
	}
}
