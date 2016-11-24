package homework3;
/*
 * 3.创建具有继承结构的两个类，父类中有一个拥有
 *   1个参数的构造函数，在子类中的无参数构造函数中
 *   使用super调用父类中的构造函数，
 *   并指出两个构造函数运行的先后顺序。
 *   
 *   注：子类在调用父类的构造函数时，先调用父类的构造方法，
 *   之后才是子类的构造函数。
 */
public class Father {
	int age;
	public Father(int age) {
		this.age = age;
		System.out.println("年龄" + age);
	}
}
