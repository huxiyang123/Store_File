package strudythreadpriority;

import strudythread.TicketSaler;

public class TestJoin {

	public static void main(String[] args) {
		TicketSaler ts = new TicketSaler("售票点");
		ts.start();
		for(int i=0;i<100;i++){
			if(i==20){
				try {
					ts.join();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"is"+i);
		}

	}

}
