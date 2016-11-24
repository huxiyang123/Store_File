package com.qf.lesson;
/*
 * 多线程间的数据安全：
 *   多个线程对共享数据处理出现问题，导致结果不正确
 *  解决方案：使用线程的同步机制，java使用synchronized关键字和对象同步锁进行解决
 *  synchronized关键字：解决java中线程间的共享数据安全问题
 *    使用方式：
 *      1 同步代码块：
 *         synchronized(对象){
 *           需要同步的代码块。
 *         }
 *  备注：对象可以是任何new出来的引用数据类型。 
 *      2 同步方法：
 *       [修饰符]  synchronized 方法声明(){
 *         需要同步的代码块。
 *       } 
 * 备注： 同步方法会隐式使用this对象锁。
 *     在implements Runnable中没有问题，在extends Thread中有问题,可以在synchronized添加static修饰符，隐式使用类对象锁。
 */
public class TestSync {

	public static void main(String[] args) {
		TicketSaler ts = new TicketSaler();
		new Thread(ts,"售票点一").start();
		new Thread(ts,"售票点二").start();
		new Thread(ts,"售票点三").start();
		new Thread(ts,"售票点四").start();
		new Thread(ts,"售票点五").start();
		
	}

}
