package world;

/*
 * 测试Student的类
 * 
 */
public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "崔力";
		s.age = 20;
		s.sex = '男';
		System.out.println("名字是： " + s.name + "年龄是：" + s.age + "性别：" + s.sex);
		s.eat();
		//s.study();

		Student s2 = new Student();
		s2.name = "刘永基";
		s2.age = 21;
		s2.sex = '男';
		System.out
				.println("名字是： " + s2.name + "年龄是：" + s2.age + "性别：" + s2.sex);
		s2.eat();
		//s2.study();
	}

}
