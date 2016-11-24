package study;
/*
 * StingBuilder:与StringBuffer相同。
 * 构造方法：StringBuiler（）字符串大小为16个字符串的缓存区
 * 	方法： 
 * 		1 append（String atr）：
 * 		2 capacity();
 * 		3 insert(int str1,String str2)
 * 		4 length（）：缓冲区的长度
 */
public class TestStingBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" world");
		sb.insert(5, "  China");	//将  China相隔5 位后插入sb内存中
	
		System.out.println(sb);//此处省略.toString()。
		System.out.println(sb.delete(9, 13));	//10为到12位的都删除
	}

}
