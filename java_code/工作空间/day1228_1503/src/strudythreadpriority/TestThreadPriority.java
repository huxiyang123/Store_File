package strudythreadpriority;

import strudythread.TicketSaler;

/*
 * 线程的优先级;
 * 	线程
 */
public class TestThreadPriority {

	public static void main(String[] args) {
		TicketSaler ts1 = new TicketSaler("售票点1");
		ts1.setPriority(Thread.MAX_PRIORITY );
		ts1.start();

		TicketSaler ts2 = new TicketSaler("售票点2");
		ts2.setPriority(Thread.MIN_PRIORITY );
		ts2.start();
		TicketSaler ts3 = new TicketSaler("售票点3");
		ts3.setPriority(Thread.NORM_PRIORITY );
		ts3.start();
		
	}

}
