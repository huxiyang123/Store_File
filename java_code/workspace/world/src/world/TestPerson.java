package world;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println("name"+p.name);
		p.name = "��ϲ��" ;
		System.out.println("name:"+p.name);
		Person p2 = new Person("����");
		p2.eat("����");
		p2.run('Ů');
		
		Person p3 = new Person("����",26);
		p3.eat("��");
		p3.run('��');
	}
}
