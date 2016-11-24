package homework3;
/*
 * 3  使用单例模式创建一个类Person，分析方法或变量中使用特定修饰符的原因
 */
public class Person {
	private Person(){}			//构造函数私有化，防止外界访问
	private static Person instance = new Person(); //对象static，以便公有函数使用
	public static Person method(){			//提供对外访问的公有函数
		return instance;
	}
	void say(){
		System.out.println("单例模式方法！！");
	}
}	
class TestPerson{
	public static void main(String[] args) {
		Person.method().say();
	}
}

