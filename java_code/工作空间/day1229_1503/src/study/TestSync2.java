package study;

public class TestSync2 {

	public static void main(String[] args) {
		SalerThread2 ts = new SalerThread2("zhangsan");
		new Thread(ts,"第一售票点").start();
		new Thread(ts,"第二售票点").start();
		new Thread(ts,"第三售票点").start();
		new Thread(ts,"第四售票点").start();

	}

}
