package homework;
/*
 * 创建两个线程A,B;分别让A，B打印奇、偶数。
 */
public class TestThreadNum {

	public static void main(String[] args) {
		ThreadNum tn = new ThreadNum();
		new Thread(tn,"彭丽媛").start();
		new Thread(tn,"习大大").start();

	}

}
