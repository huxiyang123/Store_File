package strudythread;

public class TestRunnable {

	public static void main(String[] args) {
		Num2Runnable nr = new Num2Runnable();
		Thread th  = new Thread(nr,"���߳�2������");
		th.start();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
