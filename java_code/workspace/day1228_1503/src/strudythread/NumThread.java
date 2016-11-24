package strudythread;

public class NumThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
		super.run();
	}
}
