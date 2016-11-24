package practice;
/*
 * 模拟存钱的银行卡
 */
public class Customer extends Thread {
	private static int number =0;
	
	

	public Customer(String name) {
		super(name);
	}



	@Override
	public void run() {
		this.number+=10000;
			System.out.println(Thread.currentThread().getName()+"总数"+number);
	

	}

}
