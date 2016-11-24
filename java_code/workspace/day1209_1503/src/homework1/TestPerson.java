package homework1;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.age = 34;
		p.name = "уехЩ";
		String receive = p.toString();
		System.out.println(receive);
	}

}
