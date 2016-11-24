package Decorator;

public class EggDecorator extends Decorator {

	public EggDecorator(Hamburger ham) {
		super(ham);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void doAfter() {
		System.out.println("给汉堡添加鸡蛋饼完成！！！！");
		
	}

	@Override
	public void doBefore() {
		System.out.println("开始给汉堡制作鸡蛋饼。。");
		
	}
}
