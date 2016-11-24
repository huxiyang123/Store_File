package com.qf.lesson.extend;
/*
 * ThreadLocal：该类提供了线程局部 (thread-local) 变量。
 *  特点：
 *    1 每个线程中都有一个自己的ThreadLocalMap类对象，可以将线程自己的对象保持到其中（调用set()方法），
 *    各管各的，线程可以正确的访问到自己的对象。  
 *    2 将一个共用的ThreadLocal静态实例作为key，将不同对象的引用保存到不同线程的ThreadLocalMap中，
 *    然后在线程执行的各处通过这个静态ThreadLocal实例的get()方法取得自己线程保存的那个对象，避免了将这个对象作为参数传递的麻烦。 
 *  和同步锁机制的区别：
 *    1 同步锁是多个线程共享同一份数据；而ThreadLocal则是为每个线程提供自己私有的局部数据。
 *    2 同步锁是时间换空间；而ThreadLocal是用空间换时间。
 */
public class TestThreadLocal {
	//通常使用ThreadLocal的实现，覆盖它的initialValue()；
	 static ThreadLocal<Integer> tl = new ThreadLocal<Integer>(){
			@Override
			protected Integer initialValue() {
				
				return 0;
			}
			
		};

	public static void main(String[] args) {		
        new Thread("thread1"){
        	public void run() {
        		for(int i=0;i<5;i++){
        			//从当前线程的本地变量中获取初始值tl.get()，然后增加1，
         		   tl.set(tl.get()+1);  
        		}
        		System.out.println(Thread.currentThread().getName()+"结果："+tl.get());
        		    		
        	};
        }.start(); 
        
        new Thread("thread2"){
        	public void run() {
        		for(int i=0;i<5;i++){
        			//从当前线程的本地变量中获取初始值tl.get()，然后增加1，
         		   tl.set(tl.get()+1);  
        		}
        		System.out.println(Thread.currentThread().getName()+"结果："+tl.get());   		
        	};
        }.start(); 
	}
	

}
