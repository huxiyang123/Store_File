package study;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar日期类：日历相关类对日期进行相关操作，是替换Date类的
 * 	获取对象：
 * 		1 Calendar.getInstance():根据时区和语言环境返回Calendar日期对象。
 * 		2 new GregorianCalendar();产生一个 GregorianCalendar对象
 * 方法:
 * 		1 add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * 		2 get(int field)：
 * 		3 getTimeInMillis():获取当前时间的毫秒数
 * 		4 set(int field，int value)：给指定字段设置
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 3);
		System.out.println(c.getTime().toString());
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		System.out.println(c.getTimeInMillis());
		
		c.set(Calendar.YEAR, 2018);
		System.out.println(c.getTime());
		
		Date past = new Date(1045011219982L);
		c.setTime(past);	//设置为新的日期
		int year1 = c.get(Calendar.YEAR);
		System.out.println(year1);
		
	}
}
