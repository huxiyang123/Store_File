package day07_1503;

public class TestPerson {

	public static void main(String[] args) {
		Person p  = new Person("zhangsan",18);
        int age = 20;
        p.changeAge(age);
        System.out.println("a的结果是： "+age);
        
        System.out.println("========");
        
        
        Person p2 = new Person("lisi",45);
        System.out.println("方法调用前p的age是: "+p2.getAge());
        p.changePerson(p2);
        System.out.println("方法调用后p的age是: "+p2.getAge());
	}

}
