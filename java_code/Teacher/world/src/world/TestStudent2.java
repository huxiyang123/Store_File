package world;
/*
 * 类中定义的类变量(全局变量)，没有显式赋值的话，会有默认值：
 *  1 整数类型的默认为0
 *  2 小数类型的默认为0.0
 *  3 char类型的为''空格
 *  4 引用类型的默认为null
 * 类中定义的局部变量：方法中定义的变量。使用前必须初始化。
 * 备注： 方法中定义的变量优先级更高。   
 */
public class TestStudent2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "类变量";//类变量
		s.study("局部变量");
		s.eat();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
        System.out.println(s.high);
	}

}
