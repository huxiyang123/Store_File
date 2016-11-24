package day07_1503;
/*
 * this关键字的使用
 *  1）调用属性和方法：本类中使用this.属性或this.方法();this指的是当前对象的引用。非static方法中才使用this
 *  2）构造方法调用:this(参数);调用对应类型参数的构造方法。必须在构造方法的第一行。
 */
public class User {
	private String name;
	private int age;	
	

	public User(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public User(String name){
		this.name = name;
	}

	public User() {
		// TODO 自动生成的构造函数存根
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void doSome(){
		
		System.out.println(this.age+this.name);
		System.out.println(age+name);
	}
	
	public void doOther(){
		this.doSome();
		doSome();
	}

}
