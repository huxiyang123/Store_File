package com.qf.lesson;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat: 语言环境相关的方式来解析或格式化日期的实现类。
 *   它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化。 
 *   构造方法：
 *     new SimpelDateFormat(String pattern):根据指定模式串创建对象
 *   方法：
 *     1 format(Date date):指定的日期格式化为匹配模式的字符串。Date---->String   
 *     2 parse(String str):把指定的字符串解析为Date对象.String--->Date
 *  
 */
public class TestDateFormat {

	public static void main(String[] args) {
		Date now = new Date();
		//转换
		DateFormat  df = new SimpleDateFormat("yyyy年MM月dd日   HH小时mm分ss秒SS毫秒");
        System.out.println(df.format(now));
        
        //解析
        String past = "2014年12月16日   18小时07分27秒630毫秒";
        try {
			Date d = df.parse(past);
			System.out.println(d.after(now));
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
