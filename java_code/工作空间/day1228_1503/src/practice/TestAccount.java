package practice;

public class TestAccount {

	public static void main(String[] args) {
		Account ac = new Account(100,"zhangsan ");
		person p =new person(ac);
		new Thread(p,"�˿�һ").start();
		new Thread(p,"�˿Ͷ�").start();
		new Thread(p,"�˿���").start();
		new Thread(p,"�˿���").start();
		

	}

}
