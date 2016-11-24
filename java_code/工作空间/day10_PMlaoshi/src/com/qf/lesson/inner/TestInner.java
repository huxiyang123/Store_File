package com.qf.lesson.inner;

public class TestInner {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.setName("zhangsan");
        System.out.println(o.getName());
        
        Outer.Inner i = o.new Inner();
        i.display();
        
        System.out.println("=================");
        
        StaticOuter.Inner i2 = new StaticOuter.Inner();
        i2.display();
	}

}
