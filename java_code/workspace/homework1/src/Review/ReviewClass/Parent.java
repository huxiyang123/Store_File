package Review.ReviewClass;

public class Parent {
	private String name = "父亲";
	private static String FIRSTNAME = "张";
	static {
		System.out.println("父类姓氏是: " + FIRSTNAME);
		System.out.println("父类的静态代码块");
	}

	public Parent(String sName) {
		System.out.println("父类原先称呼: " + name);
		this.name = sName;
		System.out.println("父类新的称呼:  " + name);
	}

}