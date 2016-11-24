package DeadLock;

public class DeadRunnable implements Runnable {

	private Object a = new Object();
	private Object b = new Object();
	private boolean flag = true;
	
	@Override
	public void run() {
		if(flag){
			flag = false;
			synchronized(a){
				System.out.println(Thread.currentThread().getName()+"共享锁a");
				System.out.println(Thread.currentThread().getName()+"还想获取共享锁b");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				synchronized(b){
					System.out.println(Thread.currentThread().getName()+"获取共享锁b");
				}
			}
		}
		else{
			synchronized(b){
				System.out.println(Thread.currentThread().getName()+"  共享锁b");
				System.out.println(Thread.currentThread().getName()+" 还想获取共享锁a");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				synchronized(a){
					System.out.println(Thread.currentThread().getName()+"获取共享锁a");
				}
			}
		}
	}

}
