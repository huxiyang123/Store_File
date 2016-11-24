package homewowk11;

public class Computer1 {
	class Keyboard1 implements Factory1 {

		@Override
		public void start() {
			System.out.println("键盘开始生产，请等待！!");

		}

		@Override
		public void end() {
			System.out.println("键盘生产完成，请使用。。。。。");

		}

	}

	class Mouse1 implements Factory1 {

		@Override
		public void start() {
			System.out.println("鼠标开始生产，请等待！!");

		}

		@Override
		public void end() {
			System.out.println("鼠标生产完成，请使用。。。。。");

		}

	}

	class Box implements Factory1 {

		@Override
		public void start() {
			System.out.println("机箱开始生产，请等待！!");

		}

		@Override
		public void end() {
			System.out.println("机箱生产完成，请使用。。。。。");

		}
	}
}
