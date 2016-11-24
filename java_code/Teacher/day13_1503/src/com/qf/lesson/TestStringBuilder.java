package com.qf.lesson;
/*
 * StringBuilder:线程不安全的可变字符序列。长度可变，但是线程不安全，效率高。使用较多
 *   构造方法：
 *     StringBuilder():创建默认容量大小16个字符的字符缓冲区
 *   方法：
 *    1 append(String str):添加参数的字符串格式到字符缓冲区的尾部。
 *    2 capacity():缓冲区的容量 
 *    3 insert(int offset,String str):从索引0位置开始，偏移offset个位置后插入参数的字符串表示
 *    4 length():缓冲区长度(或字符数)
 *    5 toString():返回缓冲区的字符串格式。
 */
public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.insert(5,"world");
		sb.append("china");
		System.out.println(sb.length());
		System.out.println(sb.toString());
		
		System.out.println(sb.delete(10, 15).toString());
		System.out.println(sb.length());
	}

}
