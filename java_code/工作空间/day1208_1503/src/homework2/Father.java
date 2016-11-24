package homework2;
/*
 * 2.创建具有继承结构的两个类,在子类中使用super调用
 * 父类中的非构造函数的成员函数（可以使用第一个题的类）。
 */
public class Father {
	int age;
	String name ;
	char sex;
	void say(){
		System.out.println("子类中 super 调用"+name+age);
	}
}
