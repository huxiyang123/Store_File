package world;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println("name"+p.name);
		p.name = "胡喜洋" ;
		System.out.println("name:"+p.name);
		Person p2 = new Person("李四");
		p2.eat("炒饭");
		p2.run('女');
		
		Person p3 = new Person("马武",26);
		p3.eat("面");
		p3.run('男');
	}
}
