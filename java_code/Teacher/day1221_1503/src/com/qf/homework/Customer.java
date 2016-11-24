package com.qf.homework;

/*
 * 模拟存钱的客户
 */
public class Customer extends Thread {
	// 使用同一个账户
	private static int account;
	

	public Customer(String name) {
		super(name);
	}

	@Override
	public void run() {
		account += 1000;
		try {
			Thread.currentThread().sleep(5);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "存入1000，账户余额是:"
				+ account);
	}
}
