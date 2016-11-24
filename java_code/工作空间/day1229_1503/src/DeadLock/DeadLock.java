package DeadLock;

public class DeadLock extends Thread {
	private static Object a = new Object();
	private static Object b = new Object();
	private static boolean flag = true;
	public DeadLock(String name){
		super(name);
	}
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
