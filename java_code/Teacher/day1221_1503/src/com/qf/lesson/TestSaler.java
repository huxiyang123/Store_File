package com.qf.lesson;

public class TestSaler {

	public static void main(String[] args) {
		TicketSaler ts1 = new TicketSaler("第一售票点");
		TicketSaler ts2 = new TicketSaler("第二售票点");
		TicketSaler ts3 = new TicketSaler("第三售票点");
		TicketSaler ts4 = new TicketSaler("第四售票点");
		ts1.start();		
		ts2.start();		
		ts3.start();		
		ts4.start();
		}

}
