package com.qf.lesson;

public class TicketSaler2 implements Runnable {
	private int num = 100;

	@Override
	public void run() {
		while (true) {
			sale();
		}

	}
	//隐式使用this对象锁
	public synchronized void sale(){
		if (num > 0) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "卖出车票"
					+ num);
			num--;
		}
	}
}
