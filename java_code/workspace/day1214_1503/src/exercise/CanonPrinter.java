package exercise;

public class CanonPrinter implements Factory{

	@Override
	public void open() {
		System.out.println("CanonPrinter��ʼ����");
		
	}

	@Override
	public void end() {
		System.out.println("CanonPrinter��������");
		
	}

}
