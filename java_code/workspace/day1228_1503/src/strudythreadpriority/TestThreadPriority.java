package strudythreadpriority;

import strudythread.TicketSaler;

/*
 * �̵߳����ȼ�;
 * 	�߳�
 */
public class TestThreadPriority {

	public static void main(String[] args) {
		TicketSaler ts1 = new TicketSaler("��Ʊ��1");
		ts1.setPriority(Thread.MAX_PRIORITY );
		ts1.start();

		TicketSaler ts2 = new TicketSaler("��Ʊ��2");
		ts2.setPriority(Thread.MIN_PRIORITY );
		ts2.start();
		TicketSaler ts3 = new TicketSaler("��Ʊ��3");
		ts3.setPriority(Thread.NORM_PRIORITY );
		ts3.start();
		
	}

}
