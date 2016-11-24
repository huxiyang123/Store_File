package study;

public class Test {
/*
 * 包装类：基本数据类型的面向对象的一种表示方式。
 * 	通过调用包装类的MAX_VALUE属性和MIN_VALUE可以获取该类型表示的数据范围。
 * 	1  整数：
 *		byte---java.lang.Byte
 *    	short---java.lang.Short
 *    	int---java.lang.Integer
 *    	long---java.lang.Long
 *  2  浮点型：
 * 		---java.lang.Float
 *  	double---java.lang.Double
 *  	isNaN():包装类的对象是一个非数字（NaN）值，则返回true，否则返回false。
 *  3  字符型
 *  	char---java.lang.Char
 *  4  布尔类型
 *  	booleang---java.lang.Boolean
 *  	自动装箱：基本数据类型的值可以直接付给对应包装类的变量。jvm在编译时自动把基本数据类型转换为包装类的对象。
 *  	自动拆箱：包装类的对象可以直接赋给基本数据类型的变量。
 */
	public static void main(String[] args) {
		//基本数据类型转换为包装类
		Integer i = new Integer(-23);
		int r  = i.intValue();
		System.out.println(r);
		
		Double d = new Double(0.34);
		boolean b = d.isNaN();
		
		
		System.out.println(b);
		
		Double d1 = d.doubleValue();
		System.out.println(d1+"    v[[[[[[[[[[");
		
		Double d2 = new Double("12345");
		boolean b1 = d2.isNaN();
		System.out.println(b1);
		
		Character c = new Character('a');
		char t = c.charValue();
		System.out.println(t);
		
		Boolean m = new Boolean(true);
		boolean b2 = m.booleanValue();
		System.out.println(b2);
		
		Boolean n = new Boolean("sdf");
		boolean b3 = n.booleanValue();
		System.out.println(b3);
		
		
		
		
		
	}
}
