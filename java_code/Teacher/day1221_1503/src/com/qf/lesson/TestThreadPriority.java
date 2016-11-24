package com.qf.lesson;
/*
 * 线程的优先级：
 *   线程获得CPU时间片段（执行权）的可能性。优先级越大，获取的可能性越高
 *  分类：
 *    1 最高优先级：MAX_PRIORITY
 *    2 普通优先级:NORM_PRIORITY
 *    3 最低优先级:MIN_PRIORITY
 *  
 */
public class TestThreadPriority {

	public static void main(String[] args) {
		
        
        TicketSaler ts2 = new TicketSaler("售票点2");
        ts2.setPriority(Thread.NORM_PRIORITY);
        ts2.start();
        
        TicketSaler ts3 = new TicketSaler("售票点3");
        ts3.setPriority(Thread.MAX_PRIORITY);
        ts3.start();
        
        TicketSaler ts1 = new TicketSaler("售票点1");
        ts1.setPriority(Thread.MIN_PRIORITY);
        ts1.start();
	}

}
