package com.qf.study;

public class Choose {
	public static void main(String[] args) {
		int[] arr = {23,45,21,65,34};
		for(int m:choose(arr)){
			System.out.print(m+" ");
		}
	}
	public static int[] choose(int[] a) {
		for(int i=a.length-1;i>0;i--){
			int k=i;
			for(int j=k-1;j>=0;j--){
				if(a[j]<a[k])			//选择排序从大到小
					k=j;
			}
			if(k!=i){
				int temp = a[k];
				a[k]= a[i];
				a[i] =temp;
			}
		}
		return a;
	}
}
