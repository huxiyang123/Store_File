package com.qf.lesson;

public class TestSort {

	public static void main(String[] args) {
		int[] ts = { 15, 23, 8, 10, 7 };
		//int[] ts2 = Bubble.sort(ts);
		//int[] ts2 = Choice.sort(ts);
		int[] ts2 = Insert.sort(ts);
		for (int t : ts2) {
			System.out.println(t);
		}
	}

}
