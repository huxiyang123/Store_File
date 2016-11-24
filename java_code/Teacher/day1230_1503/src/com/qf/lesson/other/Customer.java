package com.qf.lesson.other;

public class Customer implements Runnable {
	private Basket basket;
    public Customer(Basket basket) {
		this.basket = basket;
	}
	@Override
	public void run() {
		while(true){
			basket.get();
		}

	}

}
