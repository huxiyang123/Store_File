package com.qf.lesson;

public class TestSyncThread {

	public static void main(String[] args) {
		SalerThread st1 = new SalerThread("售票点一");
		st1.start();
		
		SalerThread st2 = new SalerThread("售票点二");
		st2.start();
		
		SalerThread st3 = new SalerThread("售票点三");
		st3.start();
	
		SalerThread st4 = new SalerThread("售票点四");
		st4.start();

	}

}
