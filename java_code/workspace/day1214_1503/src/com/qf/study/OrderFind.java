package com.qf.study;

public class OrderFind {
	public static void main(String[] args) {
		int[] a = new int[]{23,43,12,13,21,2};
		int num = 12;//����num
		for(int i=0;i<a.length;i++){
			if(a[i]==num)
				System.out.println("��"+(i+1)+"��");
		}
	}
}
