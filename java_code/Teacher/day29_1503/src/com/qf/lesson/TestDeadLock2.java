package com.qf.lesson;

public class TestDeadLock2 {

	public static void main(String[] args) {
		DeadLock2 dl = new DeadLock2();
		new Thread(dl,"First").start();
		new Thread(dl,"Second").start();		
	}

}
