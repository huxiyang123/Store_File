package com.qf.lesson;
/*
 * 线程终止：
 *   1 设置标志位让线程不满足条件退出run方法而终止。
 *   2 处于sleep状态或wait状态的线程，使用interrupt()抛出异常，导致线程终止
 *   3 抛出异常方式强制终止
 */
public class TestThreadStop {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.setName("测试线程");
        mt.start();
		
		for(int i=0;i<1000;i++){
			if(i==500){
				mt.setFlag(false);
			}
			else
			System.out.println(Thread.currentThread().getName()+"打印:  "+i);
		}
	}

}
//正常退出
class MyThread extends Thread{
	boolean flag = true;
	@Override
	public void run() {
		while(flag){			
			System.out.println(Thread.currentThread().getName()+"执行中.....");
		}
	}
	//设置循环标志位
	public void setFlag(boolean flag){
		this.flag = flag;
	}
}
