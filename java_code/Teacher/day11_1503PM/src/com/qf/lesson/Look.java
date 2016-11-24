package com.qf.lesson;
/*
 * 顺序查找法：
 *    根据元素的自然顺序，逐一比较，然后找出对应的位置。
 */
public class Look {

	public static void main(String[] args) {
		int[] is = {3,8,2,9,24,1};
		for(int i=0;i<is.length;i++){
			if(is[i]==1){
				System.out.println("index is"+i);
			}
		}

	}

}
