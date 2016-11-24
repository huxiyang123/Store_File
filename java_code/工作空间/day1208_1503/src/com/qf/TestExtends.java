package com.qf;

public class TestExtends {
	public static void main(String[] args) {
		Child c = new Child();
		c.name  = "ÕÅÈı";
		c.age = 23;
		c.eat();
		c.study();
		c.say();
		Grandchild f = new Grandchild();
		f.eat();
		f.study();
	
	}
}
