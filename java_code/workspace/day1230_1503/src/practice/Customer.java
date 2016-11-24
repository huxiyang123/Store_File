package practice;

public class Customer implements Runnable {
	private Basket basket;
	public Customer(Basket basket) {
		super();
		this.basket = basket;
	}
	@Override
	public void run() {
		while(true){
			basket.get();
		}

	}

}
