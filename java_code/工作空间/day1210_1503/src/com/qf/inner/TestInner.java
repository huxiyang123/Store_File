package com.qf.inner;

public class TestInner {

	public static void main(String[] args) {
		Outer o = new Outer();					//һ�㷽������
		o.setName("zhangsan");		
		System.out.println(o.getName());
		
		
		
		StaticOuter.Inner so = new StaticOuter.Inner(); //��̬�ڲ���ĵ���
		so.display();
		
	}

}
