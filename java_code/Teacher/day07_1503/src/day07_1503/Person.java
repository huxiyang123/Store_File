package day07_1503;
/*
 * 方法的参数传递：
 *   1）基本数据的参数：传递的是变量的值，
 *   2）引用数据类型：传递的是引用。
 * 
 */
public class Person {
	private String name;
	private int age;
    private static String country = "中国";
    
    static String language;
	
    static {
    	language = "汉语";
    	System.out.println("最先调用我！！！！");
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
	
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		Person.country = country;
	}

	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age) {		
		this(name);
		this.age = age;
		System.out.println("构造方法被调用了！！！！");
	}
	
	public void changeAge(int age){
		System.out.println("传入的age是： "+age);
		age = 100;
		System.out.println("修改后的age是："+age);
		this.age = age;
	}
	
	public void changePerson(Person p){
		System.out.println("p的age是: "+p.getAge());
		p.age = 10000;
		System.out.println("修改后p的age是: "+p.getAge());
	}
	
	public void display(){
		changePerson(this);
		System.out.println("姓名："+name+";年龄:  "+age+";国籍： "+country);
	}

}
