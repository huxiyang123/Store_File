package world;

/*
 * java中类的创建
 * 语法：
 *   [修饰符] class 类名{
 *      [修饰符]属性；
 *      [修饰符]方法();
 *   }
 * 对象：
 *   类的实例化: new 类();
 *   通常： 类  对象名 = new 类(); 
 * 方法或属性的调用：
 *   对象名.属性 = 值;
 *   对象名.属性      //获取对应属性的值
 *   对象名.方法([实参]);
 */
public class Student {
	String name;
	int age;
	char sex;
	double high;

	void study(String name) {
		System.out.println(name + "喜欢学习");
	}

	void eat() {
		System.out.println(name + "喜欢吃！！");
	}
}
