package com.qf.lesson;

public class TestDameon {

	public static void main(String[] args) {
		TicketSaler  n1 = new TicketSaler("用户线程");		
        n1.start();
        
        NumThread  n2 = new NumThread();
        n2.setDaemon(true);
		n2.setName("守护线程");
        n2.start();
	}

}
