package com.qf.lesson;

/*
 * 使用synchronized解决多线程的共享数据安全问题
 */
public class SalerThread extends Thread {
	// static修饰的共享变量
	private static int num = 100;
	//使用static对象保证对象锁的唯一性
    private static Object o = new Object();
	public SalerThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		while(true){		
			synchronized (o) {
				if (num > 0) {
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "卖出车票" + num);
					num--;
				}
			}
		}
	}

}
