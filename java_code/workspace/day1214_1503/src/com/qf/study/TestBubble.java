package com.qf.study;
/*
 * ð�����򷨣�
 * 		1 ����Ԫ�رȽϴ�С���ϴ��Ԫ�ط��ں���
 * 		2 ��ѭ��ÿ���ҳ�����Ԫ�� 
 */
public class TestBubble {
	public static void main(String[] args) {
		int[] arr = {23,45,21,65};
		for(int m:sort(arr)){
			System.out.print(m+" ");
		}
	}
	//bubble����
	public static int[] sort(int x[]){
		System.out.print("����ǰ��");
		for(int i=0;i<x.length;i++){    //ѭ����ӡ����ǰ
			System.out.print(x[i]+" ");
			
		}
		System.out.println();
		//�Ƚϴ�С
		for(int i=0;i<x.length-1;i++){
			System.out.println("��"+(i+1)+"����ѭ��");
			for(int j=0;j<x.length-i-1;j++){
				System.out.print("��"+(j+1)+"����ѭ��:");
				if(x[j]>x[j+1]){
					swap(x,j,j+1);     //����λ��
				}
				//��ӡÿһ����ѭ���Ľ��
				for(int m:x){
					System.out.print(m+" ");
				}
				System.out.println();
			}
			
		}
		return x;
	}
	//��������
	public static void swap(int x[],int j,int i){
		int temp =x[j];
		x[j]= x[i];
		x[i] =temp;
	}
 }
