package study;
/*
 * 多线程之间的数据安全问题
 * 	多个线程对共享的数据处理出现问题导致结果不正确。
 * 	解决方案，使用线程的同步机制，Java使用synchronized关键字和对对象同步进行解决。
 * 	sychronized关键字，解决Java中线程同步的安全问题
 * 	     使用方式：
 * 		1 同步代码块:
 * 		  synchronized(){
 * 			需要同步的代码块
 * 		  }//对想可以任意new
 * 		2 同步方法：
 * 		 [修饰符] synchronized方法声明(){
 * 			需要同步的代码块
 * 		}
 * 		
 * 
 */
public class TestSynch {

	public static void main(String[] args) {
		TicketSaler ts = new TicketSaler();
		new Thread(ts,"第一售票点").start();
		new Thread(ts,"第二售票点").start();
		new Thread(ts,"第三售票点").start();
		new Thread(ts,"第四售票点").start();

	}

}
