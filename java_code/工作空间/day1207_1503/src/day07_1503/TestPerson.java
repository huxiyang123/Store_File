package day07_1503;

public class TestPerson {
	
	public static void main(String[] args) {
		Person p = new Person("zhangsan",18);
		int age = 29;
		p.changeAge(age);
		System.out.println("修改后的age是："+age);
		System.out.println("-----------");
		System.out.println("方法调用前的"+p.getAge());
		p.changePerson(p);
		System.out.println("方法调用后"+p.getAge());
		System.out.println("-------=======");
		Person p1 = new Person("李四",10);
		System.out.println("方法调用前的"+p1.getAge());
		p.changePerson(p1);
		System.out.println("方法调用后"+p1.getAge());
	}

}
