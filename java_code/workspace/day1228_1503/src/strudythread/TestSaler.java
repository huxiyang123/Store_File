package strudythread;

public class TestSaler {

	public static void main(String[] args) {
		TicketSaler  ts1 = new TicketSaler("��һ��Ʊ��");
		ts1.start();
		TicketSaler  ts2 = new TicketSaler("�ڶ���Ʊ��");
		ts2.start();
		TicketSaler  ts3 = new TicketSaler("������Ʊ��");
		ts3.start();
		TicketSaler  ts4 = new TicketSaler("������Ʊ��");
		ts4.start();
	}

}
