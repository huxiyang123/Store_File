package com.qf.lesson;

import java.util.Random;

/*
 * String类的使用：
 *  1 length()：字符串的长度
 *  2 charAt(int index):返回指定索引处的 char 值
 *  3 compareTo(String otherStr):按字典顺序比较两个字符串。相同返回0，当前字符串比参数字符串返回小于0，否则返回大于0；
 *  4 concat(String str):连接参数字符串到当前字符串的尾部
 *  5 equals(Object str)：当前字符串和参数对象的字符序列是否相同。相同返回true,否则false;
 *  6 getBytes():使用默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
 *  7 hashCode():对象的hash码值
 *  8 indexOf(int ch):指定字符在字符串中第一次出现的位置。
 *  9 lastIndexOf(int ch):返回指定字符在此字符串中最后一次出现处的索引。
 *  10 replace(char old,char new):使用new字符替换字符串中所有old字符
 *  11 split(String reg):根据指定格式拆分字符串
 *  12 substring(int beginIndex):返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾。
 *  
 */
public class TestStr {

	public static void main(String[] args) {
		String str= "abc";
		int len = str.length();
		int len2 = "abc".length();
        System.out.println(len);
        System.out.println("char at index:"+str.charAt(2));
        
        int r = str.compareTo("ayd");
        System.out.println(r);
        
        System.out.println("ab".compareTo(str));
        
        System.out.println("cde".concat("fgh"));
        
        System.out.println("abc".equals(str));
        
        byte[] bs = "abc".getBytes();
        for(byte b:bs){
        	System.out.print(b+"  ");
        }
        
       int index =  "abcdabcd".indexOf('d');
       System.out.println(index);
       
       int lastIndex = "abcdabcd".lastIndexOf('d');
       System.out.println(lastIndex);
       
       String[] result = "a,b,c,d,e,f,g".split(",");
       for(String t:result){
    	   System.out.println(t);
       }
       
       System.out.println("abcdefgh".substring(4,6));
       
	}

}
