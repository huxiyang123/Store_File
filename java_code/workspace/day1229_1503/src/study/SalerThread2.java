package study;

public class SalerThread2 extends Thread {
	private static int num = 100;

	private static final Object obj = new Object();// ��֤�˶����Ψһ����

	public SalerThread2(String name) {
		super(name);
	}

	public void run() {
		while (true) {
			sale();
			
			}

	}
	public synchronized void sale(){
		if (num > 0) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ "������Ʊ��" + num--);
		}
	}
}
