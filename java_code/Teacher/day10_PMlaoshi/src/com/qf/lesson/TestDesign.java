package com.qf.lesson;

public class TestDesign {

	public static void main(String[] args) {
		Design d = Design.getInstance();
		d.display();
        Design d2 = Design.getInstance();
        d2.display();
        System.out.println(d==d2);
        
        DesignPattern  dp = DesignPattern.getInstance();
        dp.play();
        DesignPattern  dp2 = DesignPattern.getInstance();
        dp2.play();
        System.out.println(dp==dp2);
	}

}
