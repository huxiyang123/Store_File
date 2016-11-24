package com.qf.lesson;
/*
 * String类：
 *   String的内容是字符串的字面值。
 *   特点：
 *   1 是final类，不能被继承。
 *   2 一旦被创建，字符串的字面值不可改变。
 *   3 字符串字面值是一个String对象，被存放在字符串常量池的内存区，而且不能重复。
 *   4 创建字符串对象时，首先会去常量池中查找，是否有重复的字面值对象，没有的情况下才会创建新的。
 * 字符串缓冲池(常量池):
 *    Java运行时会维护一个String Pool（String池）， 也叫“字符串缓冲区”。
 *    String池用来存放运行时中产生的各种字符串，并且池中的字符串的内容不重复。
 *    而一般对象不存在这个缓冲池，并且创建的对象仅仅存在于方法的堆区。
 * 原理：
 *   1：当使用任何方式来创建一个字符串对象s时，Java运行时（运行中JVM）会拿着这个s在String池中找是否存在内容相同的字符串对象，
 *   如果不存在，则在池中创建一个字符串s，否则，不在池中添加。
 *   2 Java中，只要使用new关键字来创建对象，则一定会（在堆区）创建一个新的对象。并且让引用指向堆中的对象
 *   3 使用直接指定或者使用纯字符串串联来创建String对象，则仅仅会检查维护String池中的字符串，
 *    池中没有就在池中创建一个，有则罢了！但绝不会在堆区再去创建该String对象
 *   4 使用包含变量的表达式来创建String对象，则不仅会检查维护String池，
 *       而且还会在堆区创建一个String对象。最后指向堆内存中的对象
 */
public class TestString {

	public static void main(String[] args) {
		String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1==s2);
        System.out.println("s1和s2内容相等：  "+s1.equals(s2));
        String s3 = "ab"+"c";
        System.out.println("======");
        System.out.println(s2==s3);
        String s4 = s3+5;
        String s5 = new String(s3+5);
        System.out.println(s4==s5);
        
	}

}
