package com.qf.study;
/*
 * Object��
 *   ��������������ࡣ����û��ʹ��extends�ؼ��ֵ��࣬Ĭ�ϼ̳�Object
 *    ������
 *      1 equals����ǰ�����봫������Ƿ���ȣ���ַ�Ƿ���ȣ�
 * ������abstract
 * 	  1 ���󷽷�      
 * 	
 * 	  protected 
 */
public class TestObject {
	public static void main(String[] args) {
		Mouse a = new Mouse();
		Mouse b = new Mouse();
		b.shout();
		a.age=23;
		a.name= "zhangsan";
		b.age=56;
		b.name="lisi";
		a.eat();
		boolean c = a.equals(b);
		System.out.println(c);
		boolean v = a==b;
		System.out.println(v+"==========");
		System.out.println(b.toString());//�����.toString����ʡ��
		System.out.println(b.hashCode());
		
	}
}
