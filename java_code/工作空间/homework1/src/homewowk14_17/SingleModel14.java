package homewowk14_17;
/*
 * 3  ʹ�õ���ģʽ����һ����Person�����������������ʹ���ض����η���ԭ��
 */
public class SingleModel14 {
	private SingleModel14(){		//���췽��˽�л�����ֹ��紴������
	
	}
	//˽�еı���sm������������ʹ�ã�static������public����ʹ�á�
	private static SingleModel14 sm = new SingleModel14();	
	//�������еķ����Ա��������ʣ����������߷��ر������sm���Ա��ܵ��ñ��׵�������Ա
	public static SingleModel14 method(){
		
		return sm;
	}
	public void say(){
		System.out.println("����ģʽ���÷���������.���з���������.������Ա�����򷽷�");
	}
}
class TestPerson{
	public static void main(String[] args) {
		SingleModel14.method().say();	//����ģʽ���÷���������.���з���������.������Ա�����򷽷�
	}
}
