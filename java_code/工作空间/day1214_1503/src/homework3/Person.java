package homework3;
/*
 * 3  ʹ�õ���ģʽ����һ����Person�����������������ʹ���ض����η���ԭ��
 */
public class Person {
	private Person(){}			//���캯��˽�л�����ֹ������
	private static Person instance = new Person(); //����static���Ա㹫�к���ʹ��
	public static Person method(){			//�ṩ������ʵĹ��к���
		return instance;
	}
	void say(){
		System.out.println("����ģʽ��������");
	}
}	
class TestPerson{
	public static void main(String[] args) {
		Person.method().say();
	}
}

