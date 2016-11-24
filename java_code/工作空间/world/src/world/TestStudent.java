package world;


/*
 * 构造方法：生成类的对象的方法
 *    1 方法与类名相同
 *    2 不适用返回值类型和修饰符
 *    3 没有构造方法的时候，JVM会自动创建一个无参构造方法
 *    4 构造方法重载后，JVM不会再自动创建。如若仍需要无参构造方法必须显示出来
 *    5 通常建议编写无参构造方法
 *    
 *  构造方法的的作用
 *    成员变量（或属性）的初始化
 *  构造方法重载（overload）
 *    1 同一个类中
 *    2 无返回值类型
 *    3 
 *    4
 */
public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "胡喜洋";
		s.age = 25;
		s.sex = '男';
		s.eat();
		s.study();
		System.out.println("名字是"+s.name+"年龄是"+s.age+"性别"+s.sex);
		System.out.println();
		Student s1 = new Student("张三");
		s1.name = "小明";
		s1.age = 23;
		s1.sex = '女';
		
		s1.eat();
		s1.study();
		System.out.println("名字是"+s1.name+"年龄是"+s1.age+"性别"+s1.sex);
	}

}
