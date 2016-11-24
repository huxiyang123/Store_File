package strudythread;

public class Num2Runnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}

	}

}
