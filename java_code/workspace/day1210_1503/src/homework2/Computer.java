package homework2;
/*����ģʽ��
 * ��1��  ����һ��public static�ģ���������Ϊ����ĸ����ͷ�����ͬʱ����һ��String���Ͳ�����
        ��2��  �����У��������͵Ĳ�ͬ�����������new�����Ķ���
 */
public class Computer {
	
	public class Keyboard implements Factory {
		
		@Override
		public void start() {
			System.out.println("���̿�ʼ����......");
			
		}
		@Override
		public void end() {
			System.out.println("����������ɡ�����������" );
			
		}	
	}
	public class Mouse implements Factory{

		@Override
		public void start() {
			System.out.println("��꿪ʼ����......");
			
		}
		@Override
		public void end() {
			System.out.println("���������ɡ�������������");
			
		}	
	}
	public class Box implements Factory{

		@Override
		public void start() {
			System.out.println("���俪ʼ����......");
			
		}
		@Override
		public void end() {
			System.out.println("������������������������");
			
		}
	}
}
