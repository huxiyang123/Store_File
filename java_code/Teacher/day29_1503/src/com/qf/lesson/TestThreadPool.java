package com.qf.lesson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * JDK提供的线程池技术：
 *    使用步骤：
 *      1 创建实现Runnable接口或继承Thread类的子类
 *      2 初始化线程池
 *      3 通过线程池分配的线程调用步骤1子类中的run()方法
 *      4 根据需要关闭线程池
 *        
 */
public class TestThreadPool {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
        for(int i=0;i<4;i++){
        	es.execute(new TicketSaler());
        }
        es.shutdownNow();
	}

}
