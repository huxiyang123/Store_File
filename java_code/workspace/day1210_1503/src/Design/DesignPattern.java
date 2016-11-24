package Design;
/*
 * ����ģʽ
 */
public class DesignPattern {
	private static DesignPattern dp;
	private DesignPattern(){
		System.out.println("����DesignPattern��˽�й��캯��");
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
