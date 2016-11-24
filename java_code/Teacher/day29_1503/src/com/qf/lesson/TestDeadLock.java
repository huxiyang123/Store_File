package com.qf.lesson;
/*
 * 死锁：
 *   线程之间互相持有对方需要的锁且都不放弃，导致都无法执行自己的代码块。
 * 解决方案：
 *   增加共享锁的粒度
 * 
 */
public class TestDeadLock {

	public static void main(String[] args) {
		DeadLock  d = new DeadLock("第一个");
		d.start();
		
		DeadLock  l = new DeadLock("第二个");
		l.start();
	}

}
