package com.qf.lesson;

public class TicketSaler implements Runnable {
	private int num = 100;
	// 显式定义对象锁
	Object s = new Object();

	@Override
	public void run() {
		while (true) {
			//同步代码块，解决多线程的安全问题。保证以下代码的原子性
			synchronized (this) {
				if (num > 0) {
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "卖出车票" + num);
					num--;
				}
			}
			// else{
			// break;
			// }
		}

	}
}
