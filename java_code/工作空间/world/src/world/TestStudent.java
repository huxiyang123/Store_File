package world;


/*
 * ���췽����������Ķ���ķ���
 *    1 ������������ͬ
 *    2 �����÷���ֵ���ͺ����η�
 *    3 û�й��췽����ʱ��JVM���Զ�����һ���޲ι��췽��
 *    4 ���췽�����غ�JVM�������Զ���������������Ҫ�޲ι��췽��������ʾ����
 *    5 ͨ�������д�޲ι��췽��
 *    
 *  ���췽���ĵ�����
 *    ��Ա�����������ԣ��ĳ�ʼ��
 *  ���췽�����أ�overload��
 *    1 ͬһ������
 *    2 �޷���ֵ����
 *    3 
 *    4
 */
public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "��ϲ��";
		s.age = 25;
		s.sex = '��';
		s.eat();
		s.study();
		System.out.println("������"+s.name+"������"+s.age+"�Ա�"+s.sex);
		System.out.println();
		Student s1 = new Student("����");
		s1.name = "С��";
		s1.age = 23;
		s1.sex = 'Ů';
		
		s1.eat();
		s1.study();
		System.out.println("������"+s1.name+"������"+s1.age+"�Ա�"+s1.sex);
	}

}
