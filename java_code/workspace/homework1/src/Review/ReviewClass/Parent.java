package Review.ReviewClass;

public class Parent {
	private String name = "����";
	private static String FIRSTNAME = "��";
	static {
		System.out.println("����������: " + FIRSTNAME);
		System.out.println("����ľ�̬�����");
	}

	public Parent(String sName) {
		System.out.println("����ԭ�ȳƺ�: " + name);
		this.name = sName;
		System.out.println("�����µĳƺ�:  " + name);
	}

}