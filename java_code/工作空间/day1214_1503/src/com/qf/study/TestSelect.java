package com.qf.study;

public class TestSelect {
	public static void main(String[] args) {
		int[] x = new int[]{23,43,12,13,21,2};
		for(int s:select(x)){
			System.out.print(s+" ");
		}
	}
	public static int[] select(int[] a){
		for(int i=0;i<a.length;i++){
			int k=i;
			for(int j=k+1;j<a.length;j++){
				if(a[j]>a[k]){				//选择排序，从小到达
					k = j;
				}
			}
			if(k!=i){
				swap(a,k,i);
			}
		}
		return a;
	}
	public static void swap(int x[],int j,int i){
		int temp =x[j];
		x[j]= x[i];
		x[i] =temp;
	}
}
