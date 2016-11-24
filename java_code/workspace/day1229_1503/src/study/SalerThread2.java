package study;

public class SalerThread2 extends Thread {
	private static int num = 100;

	private static final Object obj = new Object();// 保证了对象的唯一，与

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
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ "卖出车票：" + num--);
		}
	}
}
