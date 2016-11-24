package day07_1503;

public class TestUser {

	public static void main(String[] args) {
		User u = new User();
		u.getName();
		u.setName("zhangsan");
        u.setAge(12);  
        
        u.doOther();
        
        //u.doSome();
		
//		User u2 = new User("lisi",23);
//		int a = 12;
//		
//		User u3 = u;
//		System.out.println(u3.getName()+" ; "+u3.getAge());
	}

}
