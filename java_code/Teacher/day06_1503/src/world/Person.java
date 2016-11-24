package world;

/*
 * 自定义Person类:
 *  封装：让类的成员变量private私有化，然后提public共有的访问方法。
 *  目的：
 *     1  提高安全性。
 *     2  适应改变。强内聚,弱耦合
 */
public class Person {
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 性别
	private String sex;

	
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// 无参构造方法，没有其他构造方法时，无参可以省略
	Person() {
		// 成员变量的初始化
	}

	Person(String sName) {
		name = sName;
	}

	Person(String sName, int sAge) {
		name = sName;// 局部变量的是赋给全局变量
		if (sAge < 0 || sAge > 150) {
			System.out.println("非法年龄");
		} else {
			age = sAge;// 局部变量的是赋给全局变量
		}
	}

	void eat(String fName) {
		System.out.println(name + "喜欢吃：" + fName);
	}

	void run() {
		System.out.println(name + "年龄是：" + age + "；跑的快!!!!");
	}

}
