package DeadLock;

public class TestDeadRunnable {

	public static void main(String[] args) {
		DeadRunnable  dr = new DeadRunnable();
		new Thread(dr,"��һ���߳�").start();
		new Thread(dr,"�ڶ����߳�").start();

	}

}
