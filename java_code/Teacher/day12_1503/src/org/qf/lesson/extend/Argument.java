package org.qf.lesson.extend;
/*
 * 可变参数：
 *   适用场景： 方法重载中，参数类型相同，而参数个数不相同
 *   语法：数据类型... 形参名
 *   使用：
 *       可以把形参当做数组看待，使用for或forEach迭代使用.
 *       除了可变参数外，还有其他参数，可变参数必须是最后一个。
 *   优点：
 *     减少代码编写。
 * 命令行参数：main方法传递的参数
 *  dos窗口：参数使用空格分开
 *  eclispe:run Configuration: 参数使用空格分开 
 */
public class Argument {

	public static void main(String[] args) {
//		Argument a = new Argument();
//		a.play("name");
//		System.out.println("=========");
//		a.play("name", "passwor");
//		System.out.println("=========");
//		a.play("na", "pa", "type");
//		System.out.println("=========");
//        a.play("aa","bb","cc","dd","ff","ee");
		for(String s:args){
			System.out.println(s);
		}
	}

//	public void play(String name) {
//
//	}
//
//	public void play(String name, String password) {
//
//	}
//
//	public void play(String name, String password, String type) {
//
//	}
	//JDK1.7以后
	public void play(String... names){
		for(String n:names){
			System.out.println(n);
		}
	}

}
