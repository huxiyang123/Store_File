package com.qf.lesson;
/*
 * 生产者消费者问题：又称为有界缓冲区（bounded-buffer）问题。
 *   两组线程(或进程)共享一块公共的数据区，其中的生产者线程把数据放入公共数据区；消费者线程从公共数据区中取数据。
 *  问题：
 *   1 生产者线程之间会有竞争关系，导致共享数据区出错。解决方法： 使用synchronized同步机制
 *   2 消费者线程之间也会有竞争关系，导致共享数据区出错。解决方法： 使用synchronized同步机制
 *   3 当共享数据区数据满了时候，需要通知生产者停止生产，等待通知。
 *     解决方法：使用wait让生产线程等待，同时通知(notify/notifyAll)消费线程就绪
 *   4 当共享数据区空了时候，需要通知消费者停止消费，等待通知。
 *     解决办法：使用wait让消费者等待 ，同时通知(notify/notifyAll)生产者线程就绪
 * 线程间的协作： 
 *   wait:当前线程在锁对象的等待区等待，直到被所对象的其他线程唤醒。 
 *   notify：从等待区中随机选择一个唤醒，进入就绪状态。可以竞争CPU的执行权。
 *   notifyAll:等待区中的所有线程均进入就绪状态，都开始竞争CPU时间段。
 * 备注：wait notify notifyAll必须在synchronized中使用
 */
public class TestProCon {

	public static void main(String[] args) {
		Shelf shelf = new Shelf();
		Producer p = new Producer(shelf);
		p.setName("生产者");
		p.start();
		Producer p2 = new Producer(shelf);
		p2.setName("生产者二");
		p2.start();
		
		Consumer c = new Consumer(shelf);
		c.setName("消费者");
        c.start();
        Consumer c2 = new Consumer(shelf);
		c2.setName("消费者二");
        c2.start();
        Consumer c3 = new Consumer(shelf);
		c3.setName("消费者三");
        c3.start();
	}

}
