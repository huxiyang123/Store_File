package world;

public class TestPerson {

	public static void main(String[] args) {		
//		Person p1 = new Person();
//		p1.eat("饺子");
//        p1.run();
//        System.out.println("=======================");
//        Person p2 = new Person("张三");
//        p2.eat("户县软面");
//        p2.run();
//        System.out.println("=======================");
        Person p3 = new Person("李四",-180);
        p3.eat("油泼面");
        p3.run();
        System.out.println("===========");
        Person p4  = new Person();
        p4.setAge(80);
        p4.setName("封装");
        p4.run();
        System.out.println(p4.getName());
	}

}
