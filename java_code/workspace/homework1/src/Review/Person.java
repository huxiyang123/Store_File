package Review;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	private Person(){		//���췽��˽�л�����ֹ��紴������
	
	}
	//˽�еı���sm������������ʹ�ã�static������public����ʹ�á�
	private static Person sm = new Person();	
	//�������еķ����Ա��������ʣ����������߷��ر������sm���Ա��ܵ��ñ��׵�������Ա
	public static Person method(){
		
		return sm;
	}
	public void say(){
		System.out.println("����"+this.name+"����"+this.age);
		System.out.println("����ģʽ���÷���������.���з���������.������Ա�����򷽷�");
	}
}
class TestPerson{
	public static void main(String[] args) {
		Person.method().say();	//����ģʽ���÷���������.���з���������.������Ա�����򷽷�
		Person.method().setAge(20);
		Person.method().setName("����");
		
	}
}
