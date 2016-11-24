package com.qf.lesson;
/*
 * 数组：用来存储一组相同类型数据的数据结构。
 * 原因：
 *   1 可以保存一组相同类型的数据。
 *   2 面向对象方式访问元素
   特点：
    1 是引用数据类型。 
    2 数组一旦被定义，大小是固定不变的。
    3 数组元素是可变的
    4 数组的下标(或索引)是从0开始的，到(长度-1)为止
  语法：
      数据类型 [];
 初始化方式：
   1）静态初始化：定义数组的同时进行初始化。
           数据类型[] 数组名称  =  new 数据类型[]{};
           或 数据类型[] 数组名称  = {};
   2）动态初始化：
              （1）数据类型[] 数组名称 = new 数据类型[数组大小];
             或者：数据类型[] 数组名称；
                        数组名称 = new 数据类型[数组大小];
      (2)赋值：数组名称[索引] = 值;
 数组取值：
        数组名称[索引]
数组长度：和具体放置的数据没有关系，只是数组的初始化空间大小.
      数组名称.length  //是数组的属性关键字
 循环取值：
    for(索引的初始化;索引变量<数组长度;索引递增){
                     使用  数组名[索引]对数组中数据进行处理。
    }
 forEach循环:从0索引位置开始，到(数组长度-1)处为止自动循环，每次把当前索引位置的数据赋给前面声明的变量。
    for(数据类型  变量:数组名(或集合)){
                   对变量进行操作
    }

 */
public class TestArray {

	public static void main(String[] args) {
		//静态初始化
		int[] ages = new int[]{20,21,22};
		String[] names = {"刘永基","范卯","崔力"};
        //动态初始化
		double [] prices = new double[4];
		prices[0] = 1.0;
		prices[1] = 3.5;
		prices[2] = 2.5;
		prices[3]= 5.9;
		
		User[] users = new User[3];
		User u1 = new User();
		u1.setName("刘永基");
		u1.setAge(18);
		
		User u2 = new User();
		u2.setName("范卯");
		u2.setAge(19);
		
		User u3 = new User();
		u3.setName("崔力");
		u3.setAge(20);
		
		users[0] = u1;
		users[1] = u2;
		users[2] = u3;
		
		//动态初始化方法2
		int [] nums;
		nums = new int[4];
		
		//数组取值
//		System.out.println("第3个age是："+ages[2]);
//		System.out.println("第二个人名字："+names[1]);
//		System.out.println("第四个价格是:"+prices[3]);
//		User u4 = users[2];
//		System.out.println("第三个人详细信息："+u4);
		
		//使用for循环获取数组元素
		int len = users.length;
		for(int i = 0;i<len;i++){
			System.out.println(users[i]);
		}
		
		int len2 = prices.length;
		for(int j=0;j<len2;j++){
			System.out.println(prices[j]);
		}
		
		User[] users2 = new User[5];
		for(int i = 0;i<users2.length;i++){
			System.out.println(users2[i]);
		}
	}

}
