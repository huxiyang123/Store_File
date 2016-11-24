package org.qf.lesson;
/*
 * 二维数组：
 *    java中没有多为数组的概念，可以看做一维数组中的元素是一维数组
 *  声明：
 *    数据类型[][] 二维数组名称;
 *  初始化方式：
 *    1 静态初始化：数据类型[][] 二维数组名称 = new 数据类型[][]{{一维数组},{一维数组}...{一维数组}};
 *              或者：数据类型[][] 二维数组名称 = {{一维数组},{一维数组}...{一维数组}};
 *    2 动态初始化：数据类型[][] 二维数组名称 = new 数据类型[二维数组的长度][];
 *               二维数组名称[二维数组索引] = new   数据类型[当前一维数组长度];
 *               或者如果包含的一维数组长度固定：
 *                数据类型[][] 二维数组名称 = new 数据类型[二维数组的长度][一维数组长度]; 
 *   赋值：
 *      二维数组名称[一维数组在二维数组中的索引][一维数组索引]  = 值;  
 *   取值：
 *      二维数组名称[一维数组在二维数组中的索引][一维数组索引]  
 *   
 *  for循环：
 *     for(初始化索引;索引<二维数组的长度;索引递增){
 *        for(初始化一维数组索引;索引<二维数组名[二维数组当前索引];一维数组索引递增){
 *            获取一维数组元素： 二维数组名[二维数组当前索引][一维数组当前索引];
 *        }
 *     }
 *  forEach循环：
 *     for(数据类型[] 一维数组变量：二维数组名){
 *       for(数据类型  变量：一维数组变量){
 *          对变量的处理;        
 *       }
 *     }
 */
public class TwoDimension {
   public static void main(String[] args) {
	 //静态初始化：
	   String[] names1 = {"刘永基","范卯","崔力"};
	   String[]  names2 = {"孙冠军","马栋","刘欢","李旭昶"};
	   String[][] names = new String[][]{names1,names2};
	   //String[][] names = {names1,names2};
	 //动态初始化：
	   int[][] ages = new int[2][];
	   ages[0] = new int[3];
	   ages[1] = new int[4];
	 //如果age数目相同，则 ：int[][] ages = new int[2][3];
	   ages[0][0] = 18;
	   ages[0][1] = 19;
	   ages[0][2] = 17;
	   
	   ages[1][0] = 20;
	   ages[1][1] = 21;
	   ages[1][2] = 22;
	   ages[1][3] = 23;
	   
	   
	   System.out.println(names[1][3]);
	   
//       for(int i=0;i<ages.length;i++){
////    	   int[] as = ages[i];
////    	   String[] ns = names[i];
////    	   for(int j=0;j<as.length;j++){
////    		   System.out.println("名字是： "+ns[j]+"；年龄是:"+as[j]);
////    	   }
//    	   for(int j = 0 ;j<ages[i].length;j++){
//    		  System.out.println("名字是： "+names[i][j]+"；年龄是:"+ages[i][j]); 
//    	   }
//       }
	   
	   for(int[] as:ages){
		   for(int a:as){
			   System.out.println(a);
		   }
	   }
	   
}
}
