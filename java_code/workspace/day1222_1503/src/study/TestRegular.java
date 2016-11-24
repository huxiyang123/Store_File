package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 正则表达式：一种格式化的字符串，用来进行匹配，查找等字符串操作。
 * 	使用步骤：
 *   	1 使用Pattern类进行编译，将给定正则表达式编译为Pattern对象。
 *   	 Pattern p = Pattern.compile（正则表达式字符串）
 *   	2 传入需要的匹配的目标字符串，使用Pattern对象的matcher（目标字符串）
 *   	3 返回比较的结果：
 *   		1）是否全部匹配，matches()尝试将整个区
 *   量词：1 X?-?前的字符出现一次或一次也没有
 *  	 2 X*-*号前面的字符出现零次或多次
 *  	 3 X+---+前面的字符一次或多次
 *  	 4 X{n}-正好出现n次
 *  	 5 X{n，}-至少出现n次。
 *  	 6 X{n,m}-至少n次，至多m次
 *   
 */
public class TestRegular {

	public static void main(String[] args) {
		//编译a*b为Pattern对象
		Pattern p = Pattern.compile("a*b");//*号前面的字符出现零次或多次
		//进行正则和目标字符串的匹配
		Matcher m = p.matcher("aaaab");
		//返回匹配的结果
		boolean b = m.matches();
		System.out.println(b);
		
		//编译a？b为Pattern对象
		Pattern p1 = Pattern.compile("a?b");//?前的字符出现一次或一次也没有
		Matcher m1 = p1.matcher("ab");
		//返回匹配的结果
		boolean b1 = m1.matches();
		System.out.println(b1);
	}

}
