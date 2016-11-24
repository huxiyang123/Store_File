package com.qf.lesson;
/*
 * extends模拟死锁：
 *    使用static修饰保证共享相同的锁，改变的是同一个flag标志位。    
 *    
 */
public class DeadLock extends Thread {
	private static Object a = new Object();
	private static Object b = new Object();
	private static boolean flag = true;

	public DeadLock(String name) {
		super(name);
	}

	@Override
	public void run() {
		if (flag) {
			flag = false;
			synchronized (a) {
				System.out
						.println(Thread.currentThread().getName() + "获得了共享锁a");
				System.out.println(Thread.currentThread().getName()
						+ "还想获取共享锁b");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				synchronized (b) {
					System.out.println(Thread.currentThread().getName()
							+ "获得共享锁b");
				}
			}
		} else {
			synchronized (b) {
				System.out
						.println(Thread.currentThread().getName() + "获得了共享锁b");
				System.out.println(Thread.currentThread().getName()
						+ "还想获取共享锁a");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				synchronized (a) {
					System.out.println(Thread.currentThread().getName()
							+ "获得共享锁a");
				}
			}
		}
	}

}
