package com.qf.inner;

public class TestInner {

	public static void main(String[] args) {
		Outer o = new Outer();					//一般方法调用
		o.setName("zhangsan");		
		System.out.println(o.getName());
		
		
		
		StaticOuter.Inner so = new StaticOuter.Inner(); //静态内部类的调用
		so.display();
		
	}

}
