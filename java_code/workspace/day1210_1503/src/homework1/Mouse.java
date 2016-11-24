package homework1;

public class Mouse implements USB{

	@Override
	public void start() {
		System.out.println("鼠标加载中，请稍等！！！");
		
	}

	@Override
	public void end() {
		System.out.println("鼠标加载完毕。。。。");
	}

}
