package homework6;
/*
  6.创建一个带有public,private,protected,
 	和默认访问权限字段以及方法成员的类. 
 	创建该类的一个对象,看看在试图调用所有类成员时,
 	会得到什么类型的编译信息,
 	请注意,处于同一个目录中的所有的类都是缺省包的一部分.
 */
public class User {
	String name;
	private int password;
	public void say(){
		System.out.println(name+"说：中国万岁！！！");
	}
	protected void fun(){
		System.out.println("钓鱼岛是中国的！");
	}
}
