package strudythread;

public class TestSalerRun {

	public static void main(String[] args) {
		TicketRunnable tr = new TicketRunnable();
		new Thread(tr,"��һ��Ʊ��").start();
		new Thread(tr,"�ڶ���Ʊ��").start();
		new Thread(tr,"������Ʊ��").start();
		new Thread(tr,"������Ʊ��").start();

	}

}
