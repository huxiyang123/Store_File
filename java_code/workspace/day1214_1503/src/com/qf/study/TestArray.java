package com.qf.study;
/*
 * 数组：用来存储一组相同类型数量的数据结构。
 * 特点：
 * 	1   是引用类型变量。
 *  2 数组一旦被定义，大小是固定不不变的。
 *  3 数组元素是可变的
 *  4 数组的下标（或索引）是从0开始的，到他的长度-1为止；
 * 语法：
 *  数据类型[];
 * 初始化方式：
 *  1 静态初始化：定义数组的同时进行初始化。
 * 	  数据类型[]  数组名称 = new 数据类型[]{};
 *   或数据类型[] 数组名称 = {};  
 *  2 动态初始化：
 *   (1) 数据类型[] 数组名称 = new 数据类型[数组大小];
 *   (2) 赋值：数组名称[索引] = 值；
 * 数组取值：
 *   数组名称[索引]  
 * 数组长度：和具体放置的数据没关系，只是初始化空间的大小
 *   数组名称.length
 * 循环取值：
 *    for(索引的初始化；索引变量<数组长度；索引递增){
 *    	使用数组名[索引]对数组中的数据进行处理
 *    }
 * forEach循环：从0索引位置开始，到（数组长度-1）
 *    for(数据类型 变量:数组名（集合）){   
 *    	对变量进行操作
 *    }
 */
public class TestArray {
	public static void main(String[] args) {
		int[] ages;
		ages = new int[4];
		int age = 18;
		for(int i= 0;i<ages.length;i++){
			ages[i] = age++;
		}
		//forEach循环,遍历数组，打印
		for(int j:ages){
			System.out.println(j);
		}
		User[] users= new User[4];
		for(int i=0;i<users.length;i++){
			User u = new User();
			u.setName("users"+i);
			u.setAge(age+i);
			users[i]=u;
			System.out.println(u);
		}
		System.out.println("===========");
		//for循环遍历打印
		for(int i=0;i<users.length;i++){
			System.out.println(users[i]);
		}
		
		
		
		
		/*
		//静态初始化
		int[] ages = new int[]{20,34,25};
		String[] names ={"张三","李四","王五"};
		//动态初始化一
		double [] prices = new double[4];
		prices[0] = 1.3;
		prices[1] = 2.3;
		prices[2] = 3.2;
		prices[3] = 5.3;
		
		//动态初始化一
		User[] users = new User[3];
		User u1 = new User();
		u1.setName("刘永基");
		u1.setAge(18);
		User u2 = new User();
		u2.setName("范卯");
		u2.setAge(20);
		User u3 = new User();
		u3.setName("崔立");
		u3.setAge(26);
		users[0] = u1;
		users[1] = u2 ;
		users[2] = u3;
		
		//动态初始化二
		int[] num;
		num = new int[4];
		//数组取值
		System.out.println(ages[2]);
		User u4 = users[2];
		System.out.println("第三个人的详细信息"+u4);  //自动调用toString();
		//使用循环去数组元素
		for(int i=0;i<prices.length;i++){
			System.out.println(prices[i]);
		
		}
		*/
		
		
	}
}
