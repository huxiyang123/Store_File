package study;


public class TestSyncThread {

	public static void main(String[] args) {
		SalerThread st1 = new SalerThread("��һ��Ʊ��");
		st1.start();
		SalerThread st2 = new SalerThread("��һ��Ʊ��");
		st2.start();
		SalerThread st3 = new SalerThread("��һ��Ʊ��");
		st3.start();
		SalerThread st4 = new SalerThread("��һ��Ʊ��");
		st4.start();
	}

}
