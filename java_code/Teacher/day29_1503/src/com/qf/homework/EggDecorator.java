package com.qf.homework;

public class EggDecorator extends Decorator {
    
	public EggDecorator(Hamburge ham) {
		super(ham);		
	}

	@Override
	public void doBefore() {
		System.out.println("开始给汉堡制作鸡蛋饼");

	}

	@Override
	public void doAfter() {
		System.out.println("给汉堡添加鸡蛋饼完毕");

	}

}
