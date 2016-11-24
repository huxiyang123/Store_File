package Review;
/*
 * 单例模式：
 * 	1 私有化private构造函数，外部不可实例化
 * 	2 创建一个变量，创建对象付给这个变量。使用static final修饰，final目的是引用不可变，
 * 		static修饰是因为static方法会调用这个变量。
 * 	3 创建一个static的方法，返回前面定义的变量，static是因为外部无法通过对象访问
 * 
 */
public class SingleMedol {
	//饱汉模式
	private  static final SingleMedol sm = new SingleMedol();
	private SingleMedol(){
		
	}
	public static SingleMedol getInstance(){
		return sm;
			
	}
}
