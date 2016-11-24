package com.qf.homework;

public class TestSaveMoney {

	public static void main(String[] args) {
		Account a = new Account("路人甲",0);
	    Custom c = new Custom(a);
	    new Thread(c,"顾客一").start();
	    new Thread(c,"顾客二").start();
	    new Thread(c,"顾客三").start();
	    new Thread(c,"顾客四").start();
	}

}
