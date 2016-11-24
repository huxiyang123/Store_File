package com.qf.lesson;

/*
 * 使用synchronized方法解决多线程的共享数据安全问题
 */
public class SalerThread2 extends Thread {
	// static修饰的共享变量
	private static int num = 100;
	
	public SalerThread2(String name) {
		super(name);
	}
	@Override
	public void run() {
		while(true){		
			sale();			
		}
	}

	//隐含使用类对象锁 ：SalerThread2.class 
	public static synchronized void sale(){			
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
