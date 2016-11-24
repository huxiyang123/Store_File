package DeadLock;

public class TestDeadRunnable {

	public static void main(String[] args) {
		DeadRunnable  dr = new DeadRunnable();
		new Thread(dr,"第一个线程").start();
		new Thread(dr,"第二个线程").start();

	}

}
