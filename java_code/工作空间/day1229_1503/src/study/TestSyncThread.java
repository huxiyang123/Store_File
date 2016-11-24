package study;


public class TestSyncThread {

	public static void main(String[] args) {
		SalerThread st1 = new SalerThread("第一售票点");
		st1.start();
		SalerThread st2 = new SalerThread("第一售票点");
		st2.start();
		SalerThread st3 = new SalerThread("第一售票点");
		st3.start();
		SalerThread st4 = new SalerThread("第一售票点");
		st4.start();
	}

}
