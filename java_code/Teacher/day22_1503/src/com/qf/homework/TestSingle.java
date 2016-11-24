package com.qf.homework;

public class TestSingle {

	public static void main(String[] args) {
		User u = User.getInstance();
		User u2 = User.getInstance();
        System.out.println(u==u2);
	}

}
