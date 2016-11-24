package com.qf.lesson;
/*
 * 排序：
 *   对数组或集合中的元素从小到大(或从大到小)进行排列。
 *   算法：
 *    1 冒泡排序：
 *       1 内循环中，相邻元素比较大小，较大的元素放在后面。
 *       2 外循环每次找出最大的元素，放在右侧
 *       3 外循环次数是length-1
 *       4 内循环次数依次递减length-i+1
 *    2
 *    3
 */
public class Bubble {
    public static int[] sort(int[] s){
    	int len = s.length;
    	for(int i= 1;i<len;i++){
    		System.out.println("第"+i+"次外循环：");
    		for(int j = 1;j<len-i+1;j++){
    			System.out.println("  内循环:第"+j+"次");
    			if(s[j]<s[j-1]){
    				int temp = s[j];
    				s[j]= s[j-1];
    				s[j-1] = temp;
    			}
    			/*
    			测试每次内循环时候，数组的实时值
    			for (int t : s) {
    				System.out.print(t+" ");
    			}
    			System.out.println("");
    		    */
    		}
    	}    	
    	return s;
    }
}
