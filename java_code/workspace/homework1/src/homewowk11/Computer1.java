package homewowk11;

public class Computer1 {
	class Keyboard1 implements Factory1 {

		@Override
		public void start() {
			System.out.println("���̿�ʼ��������ȴ���!");

		}

		@Override
		public void end() {
			System.out.println("����������ɣ���ʹ�á���������");

		}

	}

	class Mouse1 implements Factory1 {

		@Override
		public void start() {
			System.out.println("��꿪ʼ��������ȴ���!");

		}

		@Override
		public void end() {
			System.out.println("���������ɣ���ʹ�á���������");

		}

	}

	class Box implements Factory1 {

		@Override
		public void start() {
			System.out.println("���俪ʼ��������ȴ���!");

		}

		@Override
		public void end() {
			System.out.println("����������ɣ���ʹ�á���������");

		}
	}
}
