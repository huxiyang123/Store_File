package day07_1503;

public class Person {
	private String name;
	private int age;
	static String country = "�й�";
	
	static String language;
	static{
		language = "Ӣ��";
		System.out.println("�ȴ�ӡ");
	}
	
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Person.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;  
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		//super();
		this.name = name;		//��ͬ��this(name);
		this.age = age;
		System.out.println("���ӡ");
	}

	public void changeAge(int age) {
		System.out.println("�����age�ǣ�"+age);
		age = 100;
		System.out.println("�޸ĺ��age�ǣ�"+age);
		//this.age =100;
	}
	public void changePerson(Person p){
		System.out.println("p��age"+this.age);  //this ����age�е�ֵ��p.getAge()һ��
		//p.age = 2000;
		System.out.println("�޸ĺ��"+p.getAge());  //ͨ������p.getAge()��ȡp�е�ageֵ
	}
}
