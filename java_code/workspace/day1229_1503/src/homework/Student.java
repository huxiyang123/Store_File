package homework;
/*
 * 1  编写Student类，包含name age属性
   在集合中保存多个Student对象，
   使用多个线程从集合中获取学生，打印出每个学生的信息。
 */
public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return  name + "," + age + "岁";
	}
}
