package homework2;
/*工厂模式：
 * （1）  创建一个public static的，返回类型为子类的父类型方法，同时设置一个String类型参数。
        （2）  方法中，根据类型的不同，返回子类的new产生的对象。
 */
public class Computer {
	
	public class Keyboard implements Factory {
		
		@Override
		public void start() {
			System.out.println("键盘开始生产......");
			
		}
		@Override
		public void end() {
			System.out.println("键盘生产完成。。。。。。" );
			
		}	
	}
	public class Mouse implements Factory{

		@Override
		public void start() {
			System.out.println("鼠标开始生产......");
			
		}
		@Override
		public void end() {
			System.out.println("鼠标生产完成。。。。。。。");
			
		}	
	}
	public class Box implements Factory{

		@Override
		public void start() {
			System.out.println("机箱开始生产......");
			
		}
		@Override
		public void end() {
			System.out.println("机箱生产结束。。。。。。");
			
		}
	}
}
