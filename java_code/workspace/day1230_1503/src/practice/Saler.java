package practice;
/*
 * �������߳�
 */
public class Saler implements Runnable {
	private Basket basket;
	
	public Saler(Basket basket) {		
		this.basket = basket;
	}

	@Override
	public void run() {
		while(true){
			basket.put();
		}
	}

}
