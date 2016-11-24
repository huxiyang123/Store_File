package com.qf.study;

public class OrderFind {
	public static void main(String[] args) {
		int[] a = new int[]{23,43,12,13,21,2};
		int num = 12;//²éÕÒnum
		for(int i=0;i<a.length;i++){
			if(a[i]==num)
				System.out.println("µÚ"+(i+1)+"¸ö");
		}
	}
}
