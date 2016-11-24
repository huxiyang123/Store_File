package com.qf.lesson;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar日期类：日历相关类，对日期进行相关操作，是替换Date类的。
 *   获取对象：
 *     1 getInstance():根据时区和语言环境返Calendar日期对象。
 *     2 new GregorianCalendar():产生GregorianCalendar对象。
 *   方法：
 *     1 add(int field, int amount)：根据字段，添加当前日期值
 *     2 get(int field)：根据给定字段，获取当前日期值。 *     
 *     3 getTime():返回Date对象。
 *     4 getTimeInMillis()：获取指定日期的毫秒数
 *     5 set(int field,int value):给指定字段设置值

 */
public class TestCalendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 3);
		System.out.println(c.getTime().toString());

		int year = c.get(Calendar.DATE);
		System.out.println(year);
		
		long ms = c.getTimeInMillis();
		System.out.println(ms);
		
		c.set(Calendar.YEAR, 2014);
		System.out.println(c.getTime().toString());
		
		Date past = new Date(1040011165730L);
		c.setTime(past);//设置为新的日期
		int y = c.get(Calendar.YEAR);
		System.out.println(y);
	}

}
