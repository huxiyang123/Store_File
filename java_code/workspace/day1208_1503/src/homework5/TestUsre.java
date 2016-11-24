package homework5;

public class TestUsre {
	public static void main(String[] args) {
		User u = new User();
		User u1 = new User();
		if(u==u1){
			System.out.println("两个对象地址相同");
		}
		else{
			System.out.println("两个对象地址不相同");
		}
		boolean b=u.equals(u1);
		System.out.println(b);

	}
}

