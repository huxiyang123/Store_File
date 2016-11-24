package study;
/*
 * 二维数组：
 *    	Java中没有多维数组的概念，可以看做一位数组中的元素是一维数组；
 * 	声明：
 *    	数据类型[][] 二维数组名称
 *  初始化方式：
 *  	1 静态初始化：数据类型[][] 二维数组名称 = new  数据类型[][]{{一维数组},{一维数组}......{一维数组}};
 *      			或者：数据类型[][] 二维数组名称 ={{一维数组},{一维数组}......{一维数组}}；
 *      2 动态初始化：数据类型[][] 二维数组名称 = new  数据类型[二维数组长度][];
 *      			二维数组名称[二维数组索引] = new  数据类型[当前一维数组长度]；
 *      			或者包含的一维数长度固定：
 *       			数据类型[][] 二维数组名称 = new  数据类型[当前一维数组长度]；
 *    	赋值：
 *    		二维数组名称[一维数组在二维数组中的索引][一位数组的索引] = 值；
 */
public class TwoArray {
	public static void main(String[] args) {
		//静态初始化
		String[] name1 = {"夏文浩","李    龙","王赛东"};
		String[] name2 = {"胡喜洋","尚航鹰","张海明","张    喆"};
		String[][] name3  ={name1,name2};
		//动态初始化
		int[][] ages = new int[2][];
		ages[0] = new int[3];
		ages[1] = new int[4];
		ages[0][0] = 16;
		ages[0][1] = 18;
		ages[0][2] = 17;
		
		ages[1][0] = 20;
		ages[1][1] = 22;
		ages[1][2] = 24;
		ages[1][3] = 21;
		for(int i=0;i<ages.length;i++){
			for(int j=0;j<ages[i].length;j++){
				System.out.print(name3[i][j]+":"+ages[i][j]+"  ");
			}
			System.out.println();
		}
		for(int[] a:ages){
			
		}
		//三维数组
		int[][][] num = new int[2][3][2];
		num[0][0][0] = 1;
		num[0][0][1] = 2;
		num[0][1][0] = 3;
		num[0][1][1] = 4;
		num[0][2][0] = 5;
		num[0][2][1] = 6;
		
		num[1][0][0] = 7;
		num[1][0][1] = 8;
		num[1][1][0] = 9;
		num[1][1][1] = 10;
		num[1][2][0] = 11;
		num[1][2][1] = 12;
		for(int x=0;x<num.length;x++){
			for(int y=0;y<num[x].length;y++){
				for(int z=0;z<num[x][y].length;z++){
					System.out.print(num[x][y][z]+"  ");
				}
				System.out.println("=====");
			}
			System.out.println("ssssssdsss");
		}
	}
}
