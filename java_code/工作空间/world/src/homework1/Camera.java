package homework1;

public class Camera implements USB {

	@Override
	public void start() {
		System.out.println("照相机加载中，请稍等！！！");
		
	}

	@Override
	public void end() {
		System.out.println("照相机加载完毕。。。。");
	}
	
}
