package study;

import java.util.Properties;

/*
 * System:ϵͳ��ص��ࣻ
 * 	System.currentTimeMillis();
 * 
 */
public class TestSystem {

	public static void main(String[] args) {
		long start= System.currentTimeMillis();
		int[] arr = {2,3,4,6,87,3,5};
		int[] array = new int[5];
		
		System.arraycopy(arr, 2, array, 0, 4);
		for(int b:array){
			System.out.print(b+" ");
		}
		for(int i=0;i<10000;i++){
			System.out.print("");
		}
		System.out.println();
		Properties props = System.getProperties();       //�������һ���ǻ�ȡϵͳ�м�������
		String str = props.getProperty("java.version");
		System.out.println(str);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
