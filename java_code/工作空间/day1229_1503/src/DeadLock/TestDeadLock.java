package DeadLock;
/*
 * 死锁：
 * 	线程之间只有对方需要的锁且都不放弃，导致都无法执行自己的代码块。
 * 解决方法：
 * 	增加共享锁的粒度、
 */
public class TestDeadLock {

	public static void main(String[] args) {
		DeadLock dl = new DeadLock("第一个");
		dl.start();
		DeadLock dlk = new DeadLock("第二个");
		dlk.start();
	}

}
