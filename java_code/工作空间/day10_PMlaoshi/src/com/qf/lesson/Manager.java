package com.qf.lesson;

public class Manager implements CallBack {
	String tip = "我是经理";
	@Override
	public void notice() {
		System.out.println(tip+"；你的消息我已收到");
	}
	public void start(){
		System.out.println(tip+"；开始干活了，工作结束记得通知我！！！！");
	}
}
