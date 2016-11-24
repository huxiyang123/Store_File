package study;
/*
 * StringBuffer：字符串缓冲类。长度可变
 * 	原因：因为String是不可变的，添加新的字符串会产生新的对象，好费内存
 * 	构造方法：StringBuffer（）字符串大小为16个字符串的缓存区
 * 	方法： 
 * 		1 append（String atr）：
 * 		2 capacity();
 * 		3 insert(int str1,String str2)
 * 		4 length（）：缓冲区的长度
 */
public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" world");
		
		int i = 19;
		String str = String.valueOf(i); 	//将int型的i转换为String类型
		System.out.println(sb.insert(5, str));
	
		sb.insert(5, "  China");	//将  China相隔5 位后插入sb内存中
	
		System.out.println(sb);//此处省略.toString()。
		System.out.println(sb.length());
	}
}
