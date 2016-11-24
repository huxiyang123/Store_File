package com.qf.homework;
/*
 * 被调用者
 */
public class Son {
	private Manager f;

	public Son(Manager f) {
		this.f = f;
	}

	public void walkLong() {
		for (int i = 0; i < 100; i++) {
			System.out.println("在路上");
		}
		System.out.println("我已到达");
		f.sendMessage();
	}
}
