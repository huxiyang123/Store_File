package homework;
/*
 * 2 ��������ѧ�ź�������Studnet�ࡣ
  ģ��೤ѡ�٣���ʼ��һ��������Student����Ȼ��ͨ�����̸���ѡ��ѧ���ı�Ž���ͶƱ��Ʊ����Ҫ��ǰָ����
 */
public class Student {
	private String name;
	private int number;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number Ҫ���õ� number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "������  "+name +"   ѧ�ţ�  "+number;
	}
	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}	
}
