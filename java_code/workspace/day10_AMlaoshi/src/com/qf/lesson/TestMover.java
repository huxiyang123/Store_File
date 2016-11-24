package com.qf.lesson;

public class TestMover {

	public static void main(String[] args) {
		Chinese  c = new Chinese();
		Util.useCommon(c);
		
		IndustryRobot i = new IndustryRobot();
		Util.useCommon(i);
		
		System.out.println("======");

		ManRobot m = new ManRobot();
		Util.useCommon2(i);
		Util.useCommon2(m);
		
	}

}
