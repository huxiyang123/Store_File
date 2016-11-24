package com.qf.lesson;

public class TestSleepThread {

	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		st.start();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" i="+i);
		}
        st.interrupt();
	}

}
