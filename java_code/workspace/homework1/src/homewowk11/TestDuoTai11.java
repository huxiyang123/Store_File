package homewowk11;
/*
 *   1 ʹ��java��̬����ģ��ʵ�����¹��ܣ�
  ���ԣ�����ʹ��U���豸���������豸����������
  USB�豸���������꣬���̣�U�̡�����
   ʾ�����룺
   �����ࣺComputer��
     ����������U���豸������
	public void plugIn(....){	}
   �ӿڣ�USB��start(),end(),
 */
public class TestDuoTai11 {
	public static void main(String[] args) {
		Computer c = new Computer();
		
		c.plugIn(new Keyboard());
		
		c.plugIn(new Camera());
		
		c.plugIn(new Mouse());
		
	}	
}
class Computer{
	public void plugIn(USB u){
		u.start();
		u.end();
	}
}
//�����
class Mouse implements USB{

	@Override
	public void start() {
		System.out.println("�������У����Ժ� !");
		
	}

	@Override
	public void end() {
		System.out.println("��������ϣ����Կ�ʼ��������������");
		
	}
	
}
//������
class Keyboard implements USB{

	@Override
	public void start() {
		System.out.println("���̼����У����Ժ� !");
		
	}

	@Override
	public void end() {
		System.out.println("���̼�����ϣ����Կ�ʼ��������������");
		
	}
	
}
//�������
class Camera implements USB{

	@Override
	public void start() {
		System.out.println("����������У����Ժ� !");
		
	}

	@Override
	public void end() {
		System.out.println("�����������ϣ����Կ�ʼ��������������");
		
	}
	
}

interface USB{
	void start();
	void end();
}