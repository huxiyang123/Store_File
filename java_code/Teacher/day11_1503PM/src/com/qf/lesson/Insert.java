package com.qf.lesson;
/*
 * 插入排序：每次循环把当前未排序数组中第一个元素放到前面已排序数组的合适位置。
 *  特点：
 *    1 从第一个元素开始，该元素可以认为已经被排序。所以外循环从1开始。
 *    2 取出下一个元素，在已经排序的元素序列中从后向前扫描。
 *    3 如果取出的元素比已经排序的元素序列最后的还大，则直接放在最后。
 *    4 如果取出的元素比已经排序的元素序列最后的还小，则需要和已排序元素序列中所有元素进行比较。找到位置后交换。
 *    5 将新元素插入到该位置中。重复步骤2。
 */
public class Insert {
  public static int[] sort(int[] s){
	  for(int i=1;i<s.length;i++){//默认第一个元素是最小的，所以循环从1开始
		  System.out.println("外循环次数"+i);
		 for(int j = i;j>0;j--){
			 if(s[j]<s[j-1]){
				int temp = s[j]; 
				s[j]= s[j-1];
				s[j-1] = temp;
				
			 }
			 else{
				 //测试代码开始
				 for(int k:s){
					 System.out.print(k+"  ");
				 }
				 System.out.println("");
				 //测试代码结束
				break;//如果前面排序的最大值还大，则使用原始位置。不进行比较。 
			 }
			 //测试代码开始
			 for(int k:s){
				 System.out.print(k+"  ");
			 }
			 System.out.println("");
			 //测试代码结束
		 } 
		 
		 
	  }
	  return s;
  }
}
