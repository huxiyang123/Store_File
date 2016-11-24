package study;

public class TicketSaler extends Thread {
	private int num = 100;
	
	Object obj = new Object();
	@Override
	public void run() {
		while(true){
			//显示定义对象锁
			synchronized(obj){	
			if(num>0){
//				try {
//					Thread.currentThread().sleep(10);
//				} catch (InterruptedException e) {
//					// TODO 自动生成的 catch 块
//					e.printStackTrace();
//				}
				System.out.println(Thread.currentThread().getName()+"卖出车票："+num--);
			}}
		}

	}
}

