package day07_1503;

public class Person {
	private String name;
	private int age;
	static String country = "中国";
	
	static String language;
	static{
		language = "英语";
		System.out.println("先打印");
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
		this.name = name;		//等同于this(name);
		this.age = age;
		System.out.println("后打印");
	}

	public void changeAge(int age) {
		System.out.println("传入的age是："+age);
		age = 100;
		System.out.println("修改后的age是："+age);
		//this.age =100;
	}
	public void changePerson(Person p){
		System.out.println("p的age"+this.age);  //this 调用age中的值与p.getAge()一样
		//p.age = 2000;
		System.out.println("修改后的"+p.getAge());  //通过对象p.getAge()获取p中的age值
	}
}
