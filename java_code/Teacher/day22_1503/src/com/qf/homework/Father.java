package com.qf.homework;
/*
 * 调用者实现类
 */
public class Father implements Manager {

	@Override
	public void sendMessage() {
		System.out.println("你已经到达，我知道了----父亲");
	}

}
