package exercise;

public class CanonPrinter implements Factory{

	@Override
	public void open() {
		System.out.println("CanonPrinter开始生产");
		
	}

	@Override
	public void end() {
		System.out.println("CanonPrinter生产结束");
		
	}

}
