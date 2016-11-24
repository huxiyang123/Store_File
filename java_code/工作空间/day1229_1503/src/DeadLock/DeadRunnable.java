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
				System.out.println(Thread.currentThread().getName()+"������a");
				System.out.println(Thread.currentThread().getName()+"�����ȡ������b");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				synchronized(b){
					System.out.println(Thread.currentThread().getName()+"��ȡ������b");
				}
			}
		}
		else{
			synchronized(b){
				System.out.println(Thread.currentThread().getName()+"  ������b");
				System.out.println(Thread.currentThread().getName()+" �����ȡ������a");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				synchronized(a){
					System.out.println(Thread.currentThread().getName()+"��ȡ������a");
				}
			}
		}
	}

}
