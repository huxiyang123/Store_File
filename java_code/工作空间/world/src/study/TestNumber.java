package study;
/*
 * 生产者(Producer)与消费者(Consumer)的问题也称作有界缓冲区（bounded-buffer）问题。
 * 		是指两组线程(或进程)共享一个公共的数据区，其中一组是生产者，用于将数据放入缓冲区；
 * 		另外一组是消费者，用于从缓冲区中取出数据。
 *   问题：
 *   	1 生产者线程之间有竞争关系，导致共享数据出错，解决方法，使用synchronized同步机制。
 *   	2 消费者线程之间有竞争关系，导致共享数据出错，解决方法，使用synchronized同步机制。
 *   	3 当共享数据区数据满了时候，需要通知生产者停止生产，等待通知。
 *   	    解决方法，使用wait让生产线程等待，同时通知(notify/notifyAll)消费线程就绪。
 *   	4 当共享数据区空了时候，需要通知消费者停止消费，等待通知，解决方法，使用wait让生产线程等待。 

 */
public class TestNumber {

	public static void main(String[] args) {
		BreakUp bu =  new BreakUp();
		OddNumber on = new OddNumber(bu);
		on.setName("奇数");
		on.start();
		
		EvenNumber en = new EvenNumber(bu);
		en.setName("偶数");
		en.start();

	}

}
