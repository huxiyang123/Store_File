package strudythread;
/*
 * 使用继承模拟售票
 */
public class TicketSaler extends Thread {
	//车票数量，使用static修饰，保证四个售票点共用这一个类变量
	private  static int num =100;
	
	public TicketSaler(String name) {
		super(name);
	}

	

	@Override
	public void run() {
		while(num>0){
			System.out.println(Thread.currentThread().getName()+"卖出车票"+num--);
		}
	}
}
