package Design;
/*
 * 饱汉模式
 */
public class DesignPattern {
	private static DesignPattern dp;
	private DesignPattern(){
		System.out.println("我是DesignPattern的私有构造函数");
	}
	public static DesignPattern getInstance(){
		if (null==dp){
			dp = new DesignPattern();
		}
		return dp;
	}
	void play(){
		System.out.println(" DesignPattern");
	}
}
