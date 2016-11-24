package homewowk14_17;
/*
 * 3  使用单例模式创建一个类Person，分析方法或变量中使用特定修饰符的原因
 */
public class SingleModel14 {
	private SingleModel14(){		//构造方法私有化，防止外界创建对象
	
	}
	//私有的变量sm，仅供本类中使用；static方便于public方法使用。
	private static SingleModel14 sm = new SingleModel14();	
	//创建共有的方法以便于外界访问，并给调用者返回本类对象sm，以便能调用奔雷的其他成员
	public static SingleModel14 method(){
		
		return sm;
	}
	public void say(){
		System.out.println("单例模式调用方法：类名.共有方法名（）.其他成员变量或方法");
	}
}
class TestPerson{
	public static void main(String[] args) {
		SingleModel14.method().say();	//单例模式调用方法：类名.共有方法名（）.其他成员变量或方法
	}
}
