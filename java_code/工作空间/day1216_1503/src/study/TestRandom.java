package study;

import java.util.Random;

/*
 * Random:α������������������ض��㷨����������������ͨ��ʹ��Math.random���������㡣
 */
public class TestRandom {
	public static void main(String[] args) {
		System.out.println(new Random().nextInt());
		//System.out.println(Random(4));
		System.out.println(new Random().nextInt(4));
	}

}
