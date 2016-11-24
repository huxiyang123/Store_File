package homework;

public class ThreadNum implements Runnable {
	private int num = 1;

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				notifyAll();
				if (num < 101) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + num);
				} else {
					break;
				}
				num++;
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
		}
	}
}
