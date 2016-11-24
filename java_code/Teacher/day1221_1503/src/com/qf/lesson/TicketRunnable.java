package com.qf.lesson;
/*
 * 使用实现Runnable模拟售票
 */
public class TicketRunnable implements Runnable {
	//车票数量
    private int num = 100;
	@Override
	public void run() {
		while(num>0){
			System.out.println(Thread.currentThread().getName() + "卖出车票"
					+ num--);
		}

	}

}
