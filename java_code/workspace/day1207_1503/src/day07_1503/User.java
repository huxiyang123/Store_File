package day07_1503;
/*
 * this �ؼ��ֵ�ʹ��
 *   1 �������Ժͷ�����������ʹ��this.����������thisָ���ǵ�ǰ��������á���static�����в���this
 *   2  ���췽�����ã�this��������������ִ�����Ͳ����Ĺ��췽���������ڹ��췽���ĵ�һ�С�
 */
public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this(name);     //ֱ�ӵ���User��������д����
	//	this.name = name;
		this.age = age;
	}
	public User(String name){
		this.name = name;
	}
	public User() {
		// TODO �Զ����ɵĹ��캯�����
	}
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
	public void doSome(){
		System.out.println(this.age+"  "+this.name);
	}
}

