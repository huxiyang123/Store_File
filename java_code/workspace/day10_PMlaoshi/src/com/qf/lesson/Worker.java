package com.qf.lesson;
/*
 * 模拟被调用者
 */
public class Worker {
  private CallBack cb;
  public Worker(CallBack cb){
	  this.cb = cb;
  }	
  public void work(){
	  for(int i=0;i<50;i++){
		  System.out.println("工作进行中。。。。。。");
	  }
	  System.out.println("工作结束了！！！！！");
	  cb.notice();
  }
}
