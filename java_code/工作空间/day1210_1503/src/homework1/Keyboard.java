package homework1;

public class Keyboard implements USB {

	@Override
	public void start() {
		System.out.println("键盘加载中，请稍等！！！");
		
	}

	@Override
	public void end() {
		System.out.println("键盘加载完毕。。。。");
	}

}
