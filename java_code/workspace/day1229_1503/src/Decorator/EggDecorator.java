package Decorator;

public class EggDecorator extends Decorator {

	public EggDecorator(Hamburger ham) {
		super(ham);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void doAfter() {
		System.out.println("��������Ӽ�������ɣ�������");
		
	}

	@Override
	public void doBefore() {
		System.out.println("��ʼ��������������������");
		
	}
}
