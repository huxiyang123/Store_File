package com.qf.lesson;

import java.util.Random;

/*
 * Random：伪随机数生成器。根据特定算法计算出来的随机数。通常使用Math.random()更方便
 *   
 */
public class TestRandom {

	public static void main(String[] args) {
		System.out.println(new Random(4).nextInt());

	}

}
