package day07_1503;

public class TestPerson {
	
	public static void main(String[] args) {
		Person p = new Person("zhangsan",18);
		int age = 29;
		p.changeAge(age);
		System.out.println("�޸ĺ��age�ǣ�"+age);
		System.out.println("-----------");
		System.out.println("��������ǰ��"+p.getAge());
		p.changePerson(p);
		System.out.println("�������ú�"+p.getAge());
		System.out.println("-------=======");
		Person p1 = new Person("����",10);
		System.out.println("��������ǰ��"+p1.getAge());
		p.changePerson(p1);
		System.out.println("�������ú�"+p1.getAge());
	}

}
