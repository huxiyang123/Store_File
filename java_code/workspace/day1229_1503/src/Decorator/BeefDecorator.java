package Decorator;

public class BeefDecorator extends Decorator {

	public BeefDecorator(Hamburger ham) {
		super(ham);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void doBefore() {
		System.out.println("开始给汉堡制作牛排。。");
		
	}

	@Override
	public void doAfter() {
		System.out.println("给汉堡添加牛排饼完成！！！！！！");
		
	}
	
}
