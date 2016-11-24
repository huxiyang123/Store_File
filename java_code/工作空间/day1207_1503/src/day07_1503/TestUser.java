package day07_1503;

public class TestUser {
	public static void main(String[] args) {
		User u = new User();
		u.setAge(24);
		u.setName("zhangsan ");
		
		User u1 = new User("lisi",24);
		System.out.println(u1.getAge()+u1.getName());
		

		User u2 = u;
		System.out.println(u2.getAge()+u2.getName());
		u.doSome();
		
	}
}
