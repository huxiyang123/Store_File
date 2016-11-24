package com.qf.homework;

public class BeefDecorator extends Decorator {

	public BeefDecorator(Hamburge ham) {
		super(ham);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void doBefore() {
		System.out.println("给汉堡制作牛肉饼");

	}

	@Override
	public void doAfter() {
		System.out.println("添加牛肉饼完毕");

	}

}
