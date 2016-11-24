package practice;

public class TestAccount {

	public static void main(String[] args) {
		Account ac = new Account(100,"zhangsan ");
		person p =new person(ac);
		new Thread(p,"顾客一").start();
		new Thread(p,"顾客二").start();
		new Thread(p,"顾客三").start();
		new Thread(p,"顾客四").start();
		

	}

}
