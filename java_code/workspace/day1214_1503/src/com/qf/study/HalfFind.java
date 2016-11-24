package com.qf.study;
//¶ş·Ö²éÕÒ
public class HalfFind {
	public static void main(String[] args) {
		int[] a = new int[]{43,23,21,12,13,2};
		
		int x = a.length-1,b=0,c = 13;
		for(int i=0;i<x;i++){
			int mid = (b+x)/2;
			if(c==a[mid]){
				System.out.println(mid);
				break;
			}
			else if(c>a[mid]){
				x=mid-1;
			}
			else{
				b=mid+1;
			}
		}
	}
}
