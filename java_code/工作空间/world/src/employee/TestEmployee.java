package employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.display(1000);
		Employee e1 = new Employee("����",38);
		System.out.println("����  "+e1.name+" ���� "+e1.age);
		e1.display(2000);
	}
}
