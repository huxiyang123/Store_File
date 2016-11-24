package com.qf.homework;

public class TestFactory {

	public static void main(String[] args) {
		Animal man = UserFactory.getInstance("man");
		Animal man2 = UserFactory.getInstance("man");
		Animal man3 = UserFactory.getInstance("man");
		System.out.println(man==man2);
	}

}
