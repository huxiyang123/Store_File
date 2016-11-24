package com.qf.lesson;
/*
 * StringBuffer：字符串缓冲类。长度可变的，会随着字符串增加而动态增加。线程安全的可变字符序列，效率低。
 *   原因：
 *     因为String是不可变的，添加新的字符串会产生新的对象，耗费内存。
 *   构造方法：
 *     StringBuffer():初始化大小为16个字符的字符串缓冲区
 *   方法：
 *    1 append(String str):添加参数的字符串格式到字符缓冲区的尾部。
 *    2 capacity():缓冲区的容量 
 *    3 insert(int offset,String str):从索引0位置开始，偏移offset个位置后插入参数的字符串表示
 *    4 length():缓冲区长度(或字符数)
 *    5 toString():返回缓冲区的字符串格式。
 */
public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" world");
        
        sb.insert(4, "china");       
        
        System.out.println(sb.length());
        
        System.out.println(sb.toString());
	}

}
