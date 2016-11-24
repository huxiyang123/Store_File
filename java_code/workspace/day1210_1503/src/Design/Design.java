package Design;
/*
 * 模式：代码编写中有一些好的方法或实现
 *   分类：其中的两种
 *    1 单例模式：实现该模式的类只能有一个对象
 *     步骤：
 *       1) 构造方法私有化，目的是防止在外部创建对象。
 *       2) 创建私有的类变量，把创建的对象赋给该变量
 *       3) 创建公有的static返回类型为类类型的方法，返回步骤2)创建的类变量。(只有static类型的方法可以通过类名方法)
 *       4) 步骤2)的类变量类型修改为static(以便static方法使用)
 *     根据创建对象的时机不同，分为饿汉模式和饱汉模式。
 *       1) 饿汉模式：创建引用类型变量的同事进行对象的创建。
 *       2) 饱汉模式：调用的时候进行判断，对象存在则直接返回，否则才开始对象的创建。   
 */ 
//饿汉模式
public class Design {
	private static Design instance = new Design();
	private Design(){
		System.out.println("我是Design的私有构造方法！");
	}
	
	public static Design getInstance(){
		return instance;
	}
	void display(){
		System.out.println("Design");
	}
}
