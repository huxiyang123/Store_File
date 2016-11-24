package strudythread;

public class TestSaler {

	public static void main(String[] args) {
		TicketSaler  ts1 = new TicketSaler("第一售票点");
		ts1.start();
		TicketSaler  ts2 = new TicketSaler("第二售票点");
		ts2.start();
		TicketSaler  ts3 = new TicketSaler("第三售票点");
		ts3.start();
		TicketSaler  ts4 = new TicketSaler("第四售票点");
		ts4.start();
	}

}
