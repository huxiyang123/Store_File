package com.qf.lesson;

/*
 * 程序：使用特定语言编写的，实现特定功能的代码。是静态的
 * 进程：运行中的程序，操作系统必须分配内存，如代码区   数据区。动态的
 * 线程：进程中的一个程序执行分支或代码段。
 *  使用多线程原因:
 *     1 提升客户的体验。
 *     2 一个进程中的多个线程可以进行内存的共享
 *     3 
 * 注意：
 *    JVM调用main方法时，会自动创建一个main线程。   
 * 创建多线程方式：
 *    1 继承Thread类
     步骤：
   1）子类   extends Thread类
   2）覆盖run（）方法，编写功能代码
   3）创建子类的对象
   4）调用start()  
 构造方法：
   Thread():分配新的 Thread 对象。
   Thread(Runnable target)分配新的 Thread 对象。       
  方法：
   currentThread()：  返回对当前正在执行的线程对象的引用。     
   run():需要执行的代码。线程获得CPU执行权后，start()方法会自动调用。
   start()： 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。 
   getPriority()： 返回线程的优先级。
   getState()： 返回该线程的状态。
   interrupt()：中断线程。
   join():等待调用该方法的线程执行完毕后终止，然后当前线程继续执行。
   sleep(long millis):调用线程休眠指定的毫秒数
   yield(): 暂停当前正在执行的线程对象，并执行其他线程。
  2 实现Runnable接口：
        步骤:
     1 子类  implements Runnable
     2 子类覆盖run方法，编写功能代码
     3 创建子类对象
     4 创建Thread对象，步骤3的对象作为构造器参数传入
     5 调用Thread子类的start方法，start方法会自动调用步骤1中对象的run方法
    继承Thread和实现Runnable的区别：
   1 java是单继承，所以继承Thread类就无法继承其他类。但是Runnable可以实现多继承
   2 继承Thread的线程无法共用成员变量，必须实用static修饰为类变量后才可以共享；但实现Runnable接口可以共享成员变量
   3 Thread实现比较简单，Runnable接口稍复杂些
 线程的生命周期：
   1 创建：使用new创建线程对象
   2 就绪：使用start()使该线程开始准备执行run()方法。该状态的线程位于可运行线程池中，等待获取CPU的使用权。
   3 运行：获得CPU执行权，执行run()方法中的代码。可以使用yield()方法转换为就绪状态
   4 阻塞：因为某种原因放弃CPU执行权，暂停代码运行
      1 当前线程的sleep()方法或其他线程的join()被调用。sleep时间到了或者其他线程执行完毕自动切换到就绪。
      2 同步锁被占用，则当前线程被阻塞。同步锁一被释放，线程立刻处于就绪状态
      3 wait()方法被调用。 必须被通知才可以切换到就绪
   5 终止:
      1 程序执行完毕正常退出
      2 异常发生导致线程终止
  
 *      
 */
public class TestThread {

	public static void main(String[] args) {
		NumThread nt = new NumThread();
		nt.setName("子线程1");
		nt.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + ":  " + i);
		}

	}

}
