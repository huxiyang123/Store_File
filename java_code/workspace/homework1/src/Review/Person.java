package Review;

public class Person {
	private String name;
	private int age;
	
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
	private Person(){		//构造方法私有化，防止外界创建对象
	
	}
	//私有的变量sm，仅供本类中使用；static方便于public方法使用。
	private static Person sm = new Person();	
	//创建共有的方法以便于外界访问，并给调用者返回本类对象sm，以便能调用奔雷的其他成员
	public static Person method(){
		
		return sm;
	}
	public void say(){
		System.out.println("名字"+this.name+"年龄"+this.age);
		System.out.println("单例模式调用方法：类名.共有方法名（）.其他成员变量或方法");
	}
}
class TestPerson{
	public static void main(String[] args) {
		Person.method().say();	//单例模式调用方法：类名.共有方法名（）.其他成员变量或方法
		Person.method().setAge(20);
		Person.method().setName("张三");
		
	}
}
