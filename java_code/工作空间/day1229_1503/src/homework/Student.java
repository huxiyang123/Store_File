package homework;
/*
 * 1  ��дStudent�࣬����name age����
   �ڼ����б�����Student����
   ʹ�ö���̴߳Ӽ����л�ȡѧ������ӡ��ÿ��ѧ������Ϣ��
 */
public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return  name + "," + age + "��";
	}
}
