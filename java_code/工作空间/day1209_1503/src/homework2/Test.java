package homework2;

public class Test {
	public static void main(String[] args) {
		A a = new C();
		a.doSome();
		a.say();
		B b = (B)a;
		b.eat();
		b.run();
		C c = (C)b;    
		c.doSome();    //û�и�дA���еķ��������ܵ���
		c.eat();
		c.run();
		c.say();
	}
}
