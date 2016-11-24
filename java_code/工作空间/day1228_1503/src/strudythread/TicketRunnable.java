package strudythread;

public class TicketRunnable implements Runnable {
	private int num = 10;
	@Override
	public void run() {
		while(num>0){
			System.out.println(Thread.currentThread().getName()+"Âô³ö³µÆ±"+num--);
		}	
	}

}
