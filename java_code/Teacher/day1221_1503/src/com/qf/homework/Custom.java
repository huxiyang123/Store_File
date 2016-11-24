package com.qf.homework;

/*
 * 使用Runnable模拟顾客存款
 */
public class Custom implements Runnable {
	private Account account;

	public Custom(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		double s = account.getSaving();
		s += 1000;
		account.setSaving(s);
		System.out.println(Thread.currentThread().getName() + "存入账户："
				+ account.getName() + ";余额: " + account.getSaving());

	}

}
