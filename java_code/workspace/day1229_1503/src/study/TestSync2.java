package study;

public class TestSync2 {

	public static void main(String[] args) {
		SalerThread2 ts = new SalerThread2("zhangsan");
		new Thread(ts,"��һ��Ʊ��").start();
		new Thread(ts,"�ڶ���Ʊ��").start();
		new Thread(ts,"������Ʊ��").start();
		new Thread(ts,"������Ʊ��").start();

	}

}
