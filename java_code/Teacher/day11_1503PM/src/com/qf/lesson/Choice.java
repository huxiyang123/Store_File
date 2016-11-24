package com.qf.lesson;
/*
 * 选择排序：每一次循环选择最小的元素，记住索引位置，和当前外循环索引处元素进行一次交换。
 *    1 在未排序序列中找到最小元素，存放到排序序列的起始位置。
 *    2 再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列末尾。
 *    3 以此类推，直到所有元素均排序完毕。外循环次数是length-1,原因是最后的元素无需排序，肯定是最大的。
 */
public class Choice {
	public static int[] sort(int[] s) {
		int len = s.length;
		for (int i = 0; i < len-1; i++) {
			int k = i;// 定义临时变量记录当前数组中需要比较的开始位置
			System.out.println("外循环是第"+(i+1)+"次");
			for (int j = k+  1; j < len; j++) {
				if (s[j] < s[k]) {//必须是和k对应的元素进行比较，原因是k值会动态变化
					k = j;
				}				
			}
			//如果k值发生变化，说明有更小的元素，则和i处的元素进行交换
			if (k != i) {
				int temp = s[i];
				s[i] = s[k];
				s[k] = temp;
			}
			
			//测试代码开始
			for(int t:s){
				System.out.print(t+"  ");
			}
			System.out.println("");
			//测试代码结束
			
		}
		return s;
	}
}
