package com.qf.study;

public class TestInsert {
	public static void main(String[] args) {
		int[] x = new int[]{23,43,12,13,21,2};
		for(int s:insert(x)){
			System.out.print(s+" ");
		}
	}
	public static int[] insert(int[] a){
		for(int i=1;i<a.length;i++){
			for(int j=i;j>0;j--){
				if(a[j]<a[j-1]){
					int temp =a[j];
					a[j]= a[j-1];
					a[j-1] =temp;
				}
				else{
					break;
				}
			}
		}
		return a;
	}
}
