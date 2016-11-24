package com.qf.lesson;
/*
 * 包装类：基本数据类型的面向对象的一种表示方式。
 *   可以通过调用包装类的MAX_VALUE属性和MIN_VALUE来获取该类型表示的数据范围。
 *   1 整数：
 *     byte--->java.lang.Byte
 *     short-->java.lang.Short
 *     int---->java.lang.Integer
 *     long--->java.lang.Long
 *   2 浮点类型：
 *     float-->java.lang.Float
 *     double->java.lang.Double
 *     isNaN():包装类的对象是一个非数字 (NaN) 值，则返回 true，否则返回 false。
 *   3 字符类型：
 *     char--->java.lang.Character
 *   4 布尔类型：
 *     boolean->java.lang.Boolean
 * 自动装箱：基本数据类型的值可以直接赋给对应包装类的变量。JVM在编译时自动把基本数据类型转换为包装类的对象。   
 * 自动拆箱：包装类的对象可以直接赋给基本数据类型的变量。JVM在编译时自动把包装类的对象转换为基本数据类型的值。   
 *       
 *     
 */
public class Test {

	public static void main(String[] args) {
		// 基本数据类型转换为包装类
		Integer i = new Integer(12);
		int r = i.intValue();
		
        System.out.println(r);
        
        Double  d = new Double(0.021);
        boolean flag = d.isNaN();
        double s = d.doubleValue();
        
        Double e = new Double("123");
        boolean f = e.isNaN();
        System.out.println(f);
        
        Character c = new Character('a');
        char t = c.charValue();
        System.out.println(t);
        
        Boolean b = new Boolean(true);
        boolean fl = b.booleanValue();
        System.out.println(fl);
        
        Boolean a = new  Boolean("abc");
        System.out.println(a.booleanValue());
        
        Integer x = 12;//Integer x = new Integer(12);
        Boolean z = true;
        System.out.println(x.intValue());
        
        
        int g = new Integer(10);//int g =new Integer(10).intValue(); 
	}

}
