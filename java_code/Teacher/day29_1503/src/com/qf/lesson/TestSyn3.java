package com.qf.lesson;

public class TestSyn3 {

	public static void main(String[] args) {
		new SalerThread2("第一个").start(); 
		new SalerThread2("第二个").start(); 
		new SalerThread2("第三个").start(); 
		new SalerThread2("第四个").start(); 
	}

}
