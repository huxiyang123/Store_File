package world;
/*
 * 类中定义的类变量(全局变量)，没有显式赋值的话，会有默认值：
 *  1 整数类型的默认为0
 *  2 小数类型的默认为0.0
 *  3 char类型的为''空格
 *  4 引用类型的默认为null
 * 类中定义的局部变量：方法中定义的变量。使用前必须初始化。
 * 备注： 方法中定义的变量优先级更高。   
 * 构造方法： 
 *    生成类的对象的方法。
 *    特点：
 *     1  方法名和类同名
 *     2  不使用返回类型修饰符
 *     3  没有构造方法时候，JVM会自动创建一个无参构造方法
 *     4  构造方法重载后，JVM不会再创建无参构造方法，如果需要无参构造方法必须显式定义出来。
 *     5  通常建议编写无参构造方法
 *  构造方法作用：
 *     通常进行成员变量(或属性)的初始化。
 *  构造方法的重载：overloading
 *     1 同一个类中，方法名和类名相同，
 *     2 无返回类型，
 *     3 形参的数据类型  参数个数  参数顺序不相同
 *     4 和形参的名字无关
 */
public class TestStudent2 {

	public static void main(String[] args) {
		Student s = new Student();
//		s.name = "类变量";//类变量
//		s.study("局部变量");
//		s.eat();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
        System.out.println(s.high);
        System.out.println("=====================");
        Student s2 = new Student("张三");
        s2.eat();
        
        Student s3 = new Student("李四",28);
        s3.eat();
	}

}
