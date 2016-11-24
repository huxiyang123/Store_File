package com.qf;
/*
 * 枚举：enum
 *   对象数量个数有限。
 *  1 必须在类开始进行枚举对象声明
 *  2 枚举对象必须和构造方法匹配
 *  3 枚举的构造方法是private
 *  4 可以定义方法
 *方法：
 *  values():返回枚举对象的数组。 
 *  valueOf(枚举对象的字符串表示)：对应的枚举对象
 */
public class TestEnum {

	public static void main(String[] args) {
		Season s = Season.SUMMER;
		switch(s){
		case SPRING:
			System.out.println("春暖花开");
			break;
		case SUMMER:
			 System.out.println("生如夏花");
			 break;
		case AUTUMN:
			 System.out.println("秋高气爽");
			 break;
		case WINTER:
			 System.out.println("银装素裹");
			 break;
	    default:
	    	 System.out.println("不知道");
		}
		
		s.display();
        System.out.println("=====");
		Season[] ss = Season.values();
		for(Season t:ss){
			t.display();
		}
		System.out.println("*****************");
		Season t = Season.valueOf("SPRING");
		t.display();		
		
	}

}
