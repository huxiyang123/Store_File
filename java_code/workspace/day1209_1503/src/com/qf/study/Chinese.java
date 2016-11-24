package com.qf.study;

public class Chinese extends Man {
	void say(){
		System.out.println("我是中国人！！！！！！");
	}
//	void shout(){   //不能覆盖父类中的final方法
//		
//	}

	@Override
	public void shout() {
		// TODO 自动生成的方法存根
		super.shout();
	}
	
}
