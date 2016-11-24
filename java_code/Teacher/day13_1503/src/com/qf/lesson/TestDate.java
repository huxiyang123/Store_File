package com.qf.lesson;

import java.util.Date;



/*
 * Date日期类：
 *    代表日期的类。以 年  月 日  小时  分  秒  毫秒表示
 *   构造方法：
 *     1 new Date():当前日期的Date对象。默认以格林威治时间表示
 *     2 after(Date other):当前日期是否在参数日期之后
 *     3 getTime():返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 *     4 
 */
public class TestDate {

	public static void main(String[] args) {
		Date now = new Date();
		//System.out.println(now.toLocaleString());
		//获取
        long n = System.currentTimeMillis()- 24*60*60*1000;
        Date past = new Date(n);
        
        boolean f1 =now.after(past);
        System.out.println(f1);
	}

}
