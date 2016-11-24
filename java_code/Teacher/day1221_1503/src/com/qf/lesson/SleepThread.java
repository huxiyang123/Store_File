package com.qf.lesson;
/*
 * 处于sleep状态的线程退出
 */
public class SleepThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("我真的退出了！！！");
			e.printStackTrace();
		}
	}
}
