package com.qf.lesson;
/*
 * 生产者线程：
 *   生产商品
 */
public class Producer extends Thread {
	//共享数据区
	private Shelf shelf;
	private static int no;
	public Producer(Shelf shelf) {
		this.shelf = shelf;
	}
	@Override
	public void run() {
		while(true){						
			shelf.addProduct();
		}	
	}
}
