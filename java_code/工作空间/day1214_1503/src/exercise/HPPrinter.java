package exercise;

public class HPPrinter implements Factory {

	@Override
	public void open() {
		System.out.println("惠普开始生产");
		
	}

	@Override
	public void end() {
		System.out.println("惠普生产结束");
		
	}

}
