package strudythread;
/*
 * 程序：使用特定语言编写的，实现特点功能的代码，是静态的。
 * 进程：运行中的程序，操作系统必须分配内存，如代码区、数据区。动态的。
 * 线程：进程的一个程序执行分支或代码段。
 * 	使用多线程原因：
 * 		1 提升户的体验。
 * 		2 一个进程中的多个线程可以进行内存(即进程中的数据等资源)的共享
 * 注意：
 * 	  JVM调用main方法是，会自动创建一个main线程。
 * 创建多线程的方式：
 * 	  1 继承Thread类，
 * 		1）extends  Thread类
 * 		2）子类覆盖run（）方法,编写功能代码
 * 		3）创建子类的对象
 * 		4) 调用start（）方法
 * 构造方法：
 * 	Thread（）
 * 方法：
 * 	currentThread（）：返回正在执行的线程的引用。
 * 	run（）：是该线程开始执行。线程获得CPU执行权后，start()会自动调用
 * 	start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
 *2 实现Runnable接口：
 *	步骤：
 *		1 子类implements Runnable
 *		2 子类覆盖run方法，编写功能代码
 *	  	3 创建子类对象
 *		4 创建Thread对象，步骤3 的对象作为构造器参数传入
 *		5调用Thread子类的start方法，start方法会自动调用步骤1中对象的吞方法
 *继承Thread和实现Runnable的区别：
 *	1 Java是单继承，所以继承Thread类九无法继承其他类。但是Runnable可以实现多继承
 *	2 继承Thread线程无法共用成员变量，必须使用static修饰为类变量才可以共享，但实现Runnable接口可以共享成员变量
 *	3 Thread实现比较简单，Runnable接口稍复杂些。
 */
public class TestThread {

	public static void main(String[] args) {
		NumThread nt = new NumThread();
		nt.setName("子线程1 :  ");
		nt.start();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
