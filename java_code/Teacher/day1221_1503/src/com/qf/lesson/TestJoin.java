package com.qf.lesson;
/*
 * 测试线程的join方法：
 *   调用join方法的线程优先执行完毕
 */
public class TestJoin {

	public static void main(String[] args) {
		TicketSaler ts = new TicketSaler("售票点");
		ts.start();
		for(int i=0;i<100;i++){
			if(i==50){
				try {
					ts.join(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" is "+i);
		}

	}

}
