package day07_1503;
/*
 * this 关键字的使用
 *   1 调用属性和方法：本类中使用this.方法（）；this指的是当前对象的引用。非static方法中才有this
 *   2  构造方法调用：this（参数）；调用执行类型参数的构造方法。必须在构造方法的第一行。
 */
public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this(name);     //直接调用User函数，简写方法
	//	this.name = name;
		this.age = age;
	}
	public User(String name){
		this.name = name;
	}
	public User() {
		// TODO 自动生成的构造函数存根
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
	public void doSome(){
		System.out.println(this.age+"  "+this.name);
	}
}

