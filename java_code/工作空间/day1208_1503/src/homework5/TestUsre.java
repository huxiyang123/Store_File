package homework5;

public class TestUsre {
	public static void main(String[] args) {
		User u = new User();
		User u1 = new User();
		if(u==u1){
			System.out.println("���������ַ��ͬ");
		}
		else{
			System.out.println("���������ַ����ͬ");
		}
		boolean b=u.equals(u1);
		System.out.println(b);

	}
}

