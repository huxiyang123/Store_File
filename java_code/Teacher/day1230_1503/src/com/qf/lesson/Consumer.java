package com.qf.lesson;
/*
 * 消费者线程
 */
public class Consumer extends Thread {
	// 共享数据区
	private Shelf shelf;

	public Consumer(Shelf shelf) {
		this.shelf = shelf;
	}

	@Override
	public void run() {
		while (true) {
           shelf.consumeProduct();
		}
	}
}
