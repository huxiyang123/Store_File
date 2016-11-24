package com.qf.lesson;

public class TestSaler2 {

	public static void main(String[] args) {
		TicketRunnable tr = new TicketRunnable();
		new Thread(tr, "第一售票点").start();
		new Thread(tr, "第二售票点").start();
		new Thread(tr, "第三售票点").start();
		new Thread(tr, "第四售票点").start();
	}

}
