package com.qf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 正则表达式：一种格式化的字符串。用来进行匹配  查找等字符串操作
 *   使用步骤：
 *     1 使用Pattern类进行编译：将给定正则表达式编译为Pattern对象
 *      Pattern p = Pattern.compile(正则表达式字符串);
 *     2 传入需要匹配的目标字符串，使用Pattern对象的matcher(目标字符串)      
 *      Matcher m = p.matcher("目标字符串");//进行正则和目标串的匹配
 *     3 返回比较的结果：
 *       1）是否全部匹配：matches()尝试将整个区域与模式匹配。
 *       2）局部匹配：find() 尝试查找与该模式匹配的输入序列的下一个子序列。
 *   量词：
 *     *: *号前面的字母出现零次或多次
 *     ？: ?号前的字母出现一次或零次
 *     + :+号前的字母出现一次或多次
 *     {n}:符号前的字母恰好出现n次
 *     {n,}:至少 n 次
 *     {n,m}:至少 n 次，但是不超过 m 次
 * 字符类别：
 *    [abc]:和其中任何一个进行匹配，[]中的字符可以自行定义
 *    [^abc] 任何字符，除了 a、b 或 c
 *    [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
 * 预定义字符类：
 *    .:任何字符
 *    \d:等同于[0-9]
 *    \w:等同于[a-zA-Z_0-9] 
 *    
 */
public class TestReg {

	public static void main(String[] args) {
		//编译a*b为Pattern对象  
		Pattern p = Pattern.compile("ca*b");
		//进行正则和目标串的匹配
        Matcher  m  = p.matcher("caaaab");
        //返回匹配的结果
        boolean f = m.matches();
        System.out.println(f);
        
        Pattern p2 = Pattern.compile("ca?b");
        //进行正则和目标串的匹配
        Matcher  m2  = p2.matcher("caaaab");
        //返回匹配的结果
        boolean f2 = m2.matches();
        System.out.println(f2);
        
        Pattern p3 = Pattern.compile("ca+b");
        Matcher m3 = p3.matcher("cb");
        System.out.println(m3.matches());
        
        Pattern  p4 = Pattern.compile("ca{4}b");
        Matcher m4 = p4.matcher("caaaaab");
        System.out.println(m4.matches());
        
        Pattern  p5 = Pattern.compile("ca{4,}b");
        Matcher m5 = p5.matcher("caaaaab");
        System.out.println(m5.matches());
        
        Pattern p6 = Pattern.compile("ca{4,6}b");
        Matcher m6 = p6.matcher("caaaaaab");
        System.out.println(m6.matches());
	}

}
