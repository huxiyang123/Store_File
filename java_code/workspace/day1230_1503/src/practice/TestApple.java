package practice;

public class TestApple {

	public static void main(String[] args) {
		Basket b = new Basket();
		Saler s = new Saler(b);
		new Thread(s,"生产者1").start();
		Customer c = new Customer(b);
		new Thread(c,"消费者1").start();
		new Thread(c,"消费者2").start();
		
	}

}
