package Exam;
/*
 * 3  ����һ���࣬���а���һ������������int���������ֵ����ӡ������
 */
public class Arry {
	public static void main(String[] args) {
		int a[] = {2,4,5,6,7,90,67,56,6666,789};	
		System.out.println(getMax(a));
	}
	public static int getMax(int a[]){
		int max=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		return max;
	}
}
