package Decorator;

public class BeefDecorator extends Decorator {

	public BeefDecorator(Hamburger ham) {
		super(ham);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void doBefore() {
		System.out.println("��ʼ����������ţ�š���");
		
	}

	@Override
	public void doAfter() {
		System.out.println("���������ţ�ű���ɣ�����������");
		
	}
	
}
