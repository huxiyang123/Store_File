package com.qf.lesson;

public class TestRunnable {

	public static void main(String[] args) {
		Num2Runnable nr = new Num2Runnable();
		Thread t = new Thread(nr,"子线程2");
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ":  " + i);
		}

	}

}
