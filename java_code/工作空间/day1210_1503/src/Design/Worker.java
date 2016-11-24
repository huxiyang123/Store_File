package Design;
/*
 * 模拟被调用者
 */
public class Worker {
	public void worker(CallBack cb){
		
	}
	public void work(){
		for(int i=0;i<50;i++){
			System.out.println("工作进行中。。。。。。。。");
		}
		cb.notice;
	}
}
