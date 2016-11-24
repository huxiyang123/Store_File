package com.qf.study;
/*
 * 冒泡排序法：
 * 		1 相邻元素比较大小，较大的元素放在后面
 * 		2 外循环每次找出最大的元素 
 */
public class TestBubble {
	public static void main(String[] args) {
		int[] arr = {23,45,21,65};
		for(int m:sort(arr)){
			System.out.print(m+" ");
		}
	}
	//bubble排序
	public static int[] sort(int x[]){
		System.out.print("排序前：");
		for(int i=0;i<x.length;i++){    //循环打印排序前
			System.out.print(x[i]+" ");
			
		}
		System.out.println();
		//比较大小
		for(int i=0;i<x.length-1;i++){
			System.out.println("第"+(i+1)+"次外循环");
			for(int j=0;j<x.length-i-1;j++){
				System.out.print("第"+(j+1)+"次内循环:");
				if(x[j]>x[j+1]){
					swap(x,j,j+1);     //交换位置
				}
				//打印每一次内循环的结果
				for(int m:x){
					System.out.print(m+" ");
				}
				System.out.println();
			}
			
		}
		return x;
	}
	//交换函数
	public static void swap(int x[],int j,int i){
		int temp =x[j];
		x[j]= x[i];
		x[i] =temp;
	}
 }
