package exercise;

public class HPPrinter implements Factory {

	@Override
	public void open() {
		System.out.println("���տ�ʼ����");
		
	}

	@Override
	public void end() {
		System.out.println("������������");
		
	}

}
