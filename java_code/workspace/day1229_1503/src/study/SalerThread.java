package study;

public class SalerThread extends Thread {
	private static int num = 100;

	private static final Object obj = new Object();// ��֤�˶����Ψһ����

	public SalerThread(String name) {
		super(name);
	}

	public void run() {
		while (true) {
			// ��ʾ���������
			synchronized (obj) {
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
				else{
					break;
				}
			}
		}

	}
}
