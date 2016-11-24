package employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.display(1000);
		Employee e1 = new Employee("张三",38);
		System.out.println("姓名  "+e1.name+" 年龄 "+e1.age);
		e1.display(2000);
	}
}
