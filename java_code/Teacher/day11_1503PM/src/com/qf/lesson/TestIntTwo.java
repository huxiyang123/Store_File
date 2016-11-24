package com.qf.lesson;

public class TestIntTwo {

	public static void main(String[] args) {
		int[] s = { 1, 5, 8, 9, 12, 14, 15, 19, 20,21 };
		int index = LookInTwo.getIndex(s, 19);
		if (index == -1) {
			System.out.println("不存在赛！");
		} else {
			System.out.println("19的位置是：" + index);
		}
	}

}
