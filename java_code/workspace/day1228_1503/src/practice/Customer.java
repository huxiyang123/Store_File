package practice;
/*
 * ģ���Ǯ�����п�
 */
public class Customer extends Thread {
	private static int number =0;
	
	

	public Customer(String name) {
		super(name);
	}



	@Override
	public void run() {
		this.number+=10000;
			System.out.println(Thread.currentThread().getName()+"����"+number);
	

	}

}
