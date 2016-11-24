package com.qf.lesson;

public class IndustryRobot extends FatherRobot implements Mover{
    @Override
    void operate() {
    	System.out.println("我是工业机器人，我设置一次程序就一直运行");
    }
    
    @Override
    void power() {
    	System.out.println("我是工业机器人，我边使用边充电!");
    }

	@Override
	public void move() {
		System.out.println("我是工业机器人，我使用轨道来回移动");
		
	}

	@Override
	public void say() {
		System.out.println("我没有自己的语言，只能说提前指定的内容");
		
	}

	
}
