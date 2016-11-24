package com.qf.lesson;
/*
 * 二分查找法：
 *   前提：对应数组已经排序。默认是正序
 *   步骤：
 *    1 获取起点和终点的索引位置。
 *    2 使用while判断起点和终点是否还在合理的范围内：起点索引<=终点索引
 *    3 在while中进行操作：
 *      1）获取中点位置索引：(起点索引+终点索引)/2
 *      2）如果中点索引处的值比查找值大，则在左侧查找。终点索引 = 中点索引-1;
 *      3）如果中点索引处的值比查找值小，则在右侧查找。起点索引 = 中点索引+1;
 *      4）如果中点索引处的值等于查找的值，则直接返回索引。
 *      5）如果while中条件均不满足，则返回-1
 */
public class LookInTwo {
   public static int getIndex(int[] s,int num){
	   int low = 0;
	   int upper = s.length-1;
	   while(low<=upper){
		   int middle = (low+upper)/2;
		   if(s[middle]>num){
			   upper = middle - 1;
		   }
		   else if(s[middle]<num){
			   low = middle+1;
		   }
		   else{
			  return middle; 
		   }
	   }
	   return -1;
   }
}
