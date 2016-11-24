package com.qf.lesson;

public class TestSync2 {

	public static void main(String[] args) {
		TicketSaler2 ts = new TicketSaler2();
		new Thread(ts,"售票点一").start();
		new Thread(ts,"售票点二").start();
		new Thread(ts,"售票点三").start();
		new Thread(ts,"售票点四").start();
		new Thread(ts,"售票点五").start();

	}

}
