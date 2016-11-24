package com.qf.lesson;

public class DeadLock2 implements Runnable {
    private Object a = new Object();
    private Object b = new Object();
    private boolean flag = true;
	@Override
	public void run(){
		if(flag){
			flag = false;
			synchronized (a) {
				System.out.println(Thread.currentThread().getName()+"获得了锁a");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"还想获取锁b");
				synchronized (b) {
					System.out.println(Thread.currentThread().getName()+"获得了锁b");
				}
			}
		}
		else{
			synchronized (b) {
				System.out.println(Thread.currentThread().getName()+"获得了锁b");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"还想获取锁a");
				synchronized (a) {
					System.out.println(Thread.currentThread().getName()+"获得了锁a");
				}
			}
		}

	}

}
